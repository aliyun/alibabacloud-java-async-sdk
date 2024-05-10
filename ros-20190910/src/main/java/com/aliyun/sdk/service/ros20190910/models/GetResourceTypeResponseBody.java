// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypeResponseBody</p>
 */
public class GetResourceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private java.util.Map < String, ? > attributes;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DefaultVersionId")
    private String defaultVersionId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.NameInMap("IsDefaultVersion")
    private Boolean isDefaultVersion;

    @com.aliyun.core.annotation.NameInMap("LatestVersionId")
    private String latestVersionId;

    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map < String, ? > properties;

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("SupportDriftDetection")
    private Boolean supportDriftDetection;

    @com.aliyun.core.annotation.NameInMap("SupportScratchDetection")
    private Boolean supportScratchDetection;

    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.NameInMap("TotalVersionCount")
    private Integer totalVersionCount;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetResourceTypeResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.createTime = builder.createTime;
        this.defaultVersionId = builder.defaultVersionId;
        this.description = builder.description;
        this.entityType = builder.entityType;
        this.isDefaultVersion = builder.isDefaultVersion;
        this.latestVersionId = builder.latestVersionId;
        this.properties = builder.properties;
        this.provider = builder.provider;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.supportDriftDetection = builder.supportDriftDetection;
        this.supportScratchDetection = builder.supportScratchDetection;
        this.templateBody = builder.templateBody;
        this.totalVersionCount = builder.totalVersionCount;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public java.util.Map < String, ? > getAttributes() {
        return this.attributes;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return defaultVersionId
     */
    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return isDefaultVersion
     */
    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * @return latestVersionId
     */
    public String getLatestVersionId() {
        return this.latestVersionId;
    }

    /**
     * @return properties
     */
    public java.util.Map < String, ? > getProperties() {
        return this.properties;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return supportDriftDetection
     */
    public Boolean getSupportDriftDetection() {
        return this.supportDriftDetection;
    }

    /**
     * @return supportScratchDetection
     */
    public Boolean getSupportScratchDetection() {
        return this.supportScratchDetection;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return totalVersionCount
     */
    public Integer getTotalVersionCount() {
        return this.totalVersionCount;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.Map < String, ? > attributes; 
        private String createTime; 
        private String defaultVersionId; 
        private String description; 
        private String entityType; 
        private Boolean isDefaultVersion; 
        private String latestVersionId; 
        private java.util.Map < String, ? > properties; 
        private String provider; 
        private String requestId; 
        private String resourceType; 
        private Boolean supportDriftDetection; 
        private Boolean supportScratchDetection; 
        private String templateBody; 
        private Integer totalVersionCount; 
        private String updateTime; 

        /**
         * The type of the resource.
         */
        public Builder attributes(java.util.Map < String, ? > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * The creation time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The default version ID.
         * <p>
         * 
         * > This parameter is returned only if the resource type is queried.
         */
        public Builder defaultVersionId(String defaultVersionId) {
            this.defaultVersionId = defaultVersionId;
            return this;
        }

        /**
         * The description of the resource type.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The entity type. Valid values:
         * <p>
         * 
         * *   Resource: regular resource. For more information, see [Resources](~~28863~~).
         * *   DataSource: DataSource resource. For more information, see [DataSource resources](~~404753~~).
         * *   module: module.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * Indicates whether the version is the default version. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * > This parameter is returned only if a specific version of the resource type is queried.
         */
        public Builder isDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }

        /**
         * The latest version ID.
         * <p>
         * 
         * > This parameter is returned only if the resource type is queried.
         */
        public Builder latestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }

        /**
         * Indicates whether the resource supports drift detection. Default value: false. Valid values:
         * <p>
         * 
         * *   true: Drift detection is supported.
         * *   false: Drift detection is not supported.
         */
        public Builder properties(java.util.Map < String, ? > properties) {
            this.properties = properties;
            return this;
        }

        /**
         * The provider of the resource type. Valid values:
         * <p>
         * 
         * *   ROS: The resource type is provided by Resource Orchestration Service (ROS).
         * *   Self: The resource type is provided by you.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * The attributes of the resource.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The properties of the resource.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Indicates whether the resource supports scratch detection. Default value: false. Valid values:
         * <p>
         * 
         * *   true: Scratch detection is supported.
         * *   false: Scratch detection is not supported.
         */
        public Builder supportDriftDetection(Boolean supportDriftDetection) {
            this.supportDriftDetection = supportDriftDetection;
            return this;
        }

        /**
         * The entity type. Valid values:
         * <p>
         * 
         * *   Resource: resources other than DataSource resources. For more information, see [Resources](~~28863~~).
         * *   DataSource: DataSource resources.
         */
        public Builder supportScratchDetection(Boolean supportScratchDetection) {
            this.supportScratchDetection = supportScratchDetection;
            return this;
        }

        /**
         * The template content in the module.
         * <p>
         * 
         * > This parameter is returned only if a specific version of the resource type is queried.
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The total number of versions.
         * <p>
         * 
         * > This parameter is returned only if the resource type is queried.
         */
        public Builder totalVersionCount(Integer totalVersionCount) {
            this.totalVersionCount = totalVersionCount;
            return this;
        }

        /**
         * The update time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetResourceTypeResponseBody build() {
            return new GetResourceTypeResponseBody(this);
        } 

    } 

}
