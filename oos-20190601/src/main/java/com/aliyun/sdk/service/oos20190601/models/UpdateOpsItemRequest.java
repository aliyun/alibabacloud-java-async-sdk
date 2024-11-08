// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateOpsItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateOpsItemRequest</p>
 */
public class UpdateOpsItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedupString")
    private String dedupString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsItemId")
    private String opsItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private String resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Solutions")
    private String solutions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private UpdateOpsItemRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.dedupString = builder.dedupString;
        this.description = builder.description;
        this.opsItemId = builder.opsItemId;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resources = builder.resources;
        this.severity = builder.severity;
        this.solutions = builder.solutions;
        this.source = builder.source;
        this.status = builder.status;
        this.tags = builder.tags;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOpsItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedupString
     */
    public String getDedupString() {
        return this.dedupString;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return opsItemId
     */
    public String getOpsItemId() {
        return this.opsItemId;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return solutions
     */
    public String getSolutions() {
        return this.solutions;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateOpsItemRequest, Builder> {
        private String category; 
        private String clientToken; 
        private String dedupString; 
        private String description; 
        private String opsItemId; 
        private Integer priority; 
        private String regionId; 
        private String resourceGroupId; 
        private String resources; 
        private String severity; 
        private String solutions; 
        private String source; 
        private String status; 
        private java.util.Map < String, ? > tags; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOpsItemRequest request) {
            super(request);
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.dedupString = request.dedupString;
            this.description = request.description;
            this.opsItemId = request.opsItemId;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resources = request.resources;
            this.severity = request.severity;
            this.solutions = request.solutions;
            this.source = request.source;
            this.status = request.status;
            this.tags = request.tags;
            this.title = request.title;
        } 

        /**
         * <p>The category.</p>
         * 
         * <strong>example:</strong>
         * <p>Security</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DASKJJLKADS-AHKLJHJSAKL-AJK</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The string to be deduplicated.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs_instance_SystemMaintenance.Reboot</p>
         */
        public Builder dedupString(String dedupString) {
            this.putQueryParameter("DedupString", dedupString);
            this.dedupString = dedupString;
            return this;
        }

        /**
         * <p>The description of the O&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>test-update</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the O&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>oi-e2264dcf040c472598e9</p>
         */
        public Builder opsItemId(String opsItemId) {
            this.putQueryParameter("OpsItemId", opsItemId);
            this.opsItemId = opsItemId;
            return this;
        }

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The Alibaba Resource Names (ARNs) of the associated resources.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;arn:acs:ecs:cn-heyuan:1139354755361920:instance/i-f8z928h7aqotd3o65032&quot;]</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The severity level.</p>
         * 
         * <strong>example:</strong>
         * <p>Medium</p>
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * <p>The solutions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\n \&quot;priority\&quot;:3,\n \&quot;type\&quot;:\&quot;url\&quot;,\n \&quot;url\&quot;:\&quot;<a href="https://example.com%5C%5C%22,%5Cn">https://example.com\\&quot;,\n</a> \&quot;description\&quot;:\&quot;Specify a cross-zone high availability cluster. \&quot;\n}]</p>
         */
        public Builder solutions(String solutions) {
            this.putQueryParameter("Solutions", solutions);
            this.solutions = solutions;
            return this;
        }

        /**
         * <p>The source business.</p>
         * 
         * <strong>example:</strong>
         * <p>/aliyun/ecs</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;k1&quot;: &quot;v1&quot;,
         *       &quot;k2&quot;: &quot;v2&quot;
         * }</p>
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The title of the O&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateOpsItemRequest build() {
            return new UpdateOpsItemRequest(this);
        } 

    } 

}
