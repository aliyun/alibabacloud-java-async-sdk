// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.templateName = builder.templateName;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String content; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.Map<String, ?> tags; 
        private String templateName; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest request) {
            super(request);
            this.content = request.content;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.templateName = request.templateName;
            this.versionName = request.versionName;
        } 

        /**
         * <p>The content of the template. The content must be in the JSON or YAML format, and its maximum size is 64 KB.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;, &quot;Description&quot;: { &quot;en&quot;: &quot;Bulky starts the ECS instances&quot;, &quot;name-en&quot;: &quot;Bulky Start Instances&quot;, }, &quot;Parameters&quot;: { &quot;regionId&quot;: { &quot;Type&quot;: &quot;String&quot;, &quot;Label&quot;: { &quot;en&quot;: &quot;RegionId&quot;, }, &quot;AssociationProperty&quot;: &quot;RegionId&quot;, &quot;Default&quot;: &quot;{{ ACS::RegionId }}&quot; }, &quot;targets&quot;: { &quot;Type&quot;: &quot;Json&quot;, &quot;Label&quot;: { &quot;en&quot;: &quot;TargetInstance&quot;, }, &quot;AssociationProperty&quot;: &quot;Targets&quot;, &quot;AssociationPropertyMetadata&quot;: { &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;RegionId&quot;: &quot;regionId&quot; } }, &quot;rateControl&quot;: { &quot;Label&quot;: { &quot;en&quot;: &quot;RateControl&quot;, }, &quot;Type&quot;: &quot;Json&quot;, &quot;AssociationProperty&quot;: &quot;RateControl&quot;, &quot;Default&quot;: { &quot;Mode&quot;: &quot;Concurrency&quot;, &quot;MaxErrors&quot;: 0, &quot;Concurrency&quot;: 10 } }, &quot;OOSAssumeRole&quot;: { &quot;Label&quot;: { &quot;en&quot;: &quot;OOSAssumeRole&quot;, }, &quot;Type&quot;: &quot;String&quot;, &quot;Default&quot;: &quot;OOSServiceRole&quot; } }, &quot;RamRole&quot;: &quot;{{ OOSAssumeRole }}&quot;, &quot;Tasks&quot;: [ { &quot;Name&quot;: &quot;getInstance&quot;, &quot;Description&quot;: { &quot;en&quot;: &quot;Views the ECS instances&quot;, }, &quot;Action&quot;: &quot;ACS::SelectTargets&quot;, &quot;Properties&quot;: { &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;RegionId&quot;: &quot;{{ regionId }}&quot;, &quot;Filters&quot;: [ &quot;{{ targets }}&quot; ] }, &quot;Outputs&quot;: { &quot;instanceIds&quot;: { &quot;Type&quot;: &quot;List&quot;, &quot;ValueSelector&quot;: &quot;Instances.Instance[].InstanceId&quot; } } }, { &quot;Name&quot;: &quot;startInstance&quot;, &quot;Action&quot;: &quot;ACS::ECS::StartInstance&quot;, &quot;Description&quot;: { &quot;en&quot;: &quot;Starts the ECS instances&quot;, }, &quot;Properties&quot;: { &quot;regionId&quot;: &quot;{{ regionId }}&quot;, &quot;instanceId&quot;: &quot;{{ ACS::TaskLoopItem }}&quot; }, &quot;Loop&quot;: { &quot;RateControl&quot;: &quot;{{ rateControl }}&quot;, &quot;Items&quot;: &quot;{{ getInstance.instanceIds }}&quot; } } ], &quot;Outputs&quot;: { &quot;instanceIds&quot;: { &quot;Type&quot;: &quot;List&quot;, &quot;Value&quot;: &quot;{{ getInstance.instanceIds }}&quot; } } }</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
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
         * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;k2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The name of the template. The name can be up to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (_). The name cannot start with ALIYUN, ACS, ALIBABA, or ALICLOUD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The name of the template version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
