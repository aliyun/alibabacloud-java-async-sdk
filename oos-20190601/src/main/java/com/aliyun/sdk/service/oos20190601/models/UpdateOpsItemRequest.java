// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOpsItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateOpsItemRequest</p>
 */
public class UpdateOpsItemRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DedupString")
    private String dedupString;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("OpsItemId")
    private String opsItemId;

    @Query
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Resources")
    private String resources;

    @Query
    @NameInMap("Severity")
    private String severity;

    @Query
    @NameInMap("Solutions")
    private String solutions;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @Query
    @NameInMap("Title")
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
         * The category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The string to be deduplicated.
         */
        public Builder dedupString(String dedupString) {
            this.putQueryParameter("DedupString", dedupString);
            this.dedupString = dedupString;
            return this;
        }

        /**
         * The description of the O\&M item.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the O\&M item.
         */
        public Builder opsItemId(String opsItemId) {
            this.putQueryParameter("OpsItemId", opsItemId);
            this.opsItemId = opsItemId;
            return this;
        }

        /**
         * The priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The Alibaba Resource Names (ARNs) of the associated resources.
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * The severity level.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * The solutions.
         */
        public Builder solutions(String solutions) {
            this.putQueryParameter("Solutions", solutions);
            this.solutions = solutions;
            return this;
        }

        /**
         * The source business.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * The title of the O\&M item.
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
