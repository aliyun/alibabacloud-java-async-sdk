// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceTypeResponseBody</p>
 */
public class GetResourceTypeResponseBody extends TeaModel {
    @NameInMap("Attributes")
    private java.util.Map < String, ? > attributes;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DefaultVersionId")
    private String defaultVersionId;

    @NameInMap("Description")
    private String description;

    @NameInMap("EntityType")
    private String entityType;

    @NameInMap("IsDefaultVersion")
    private Boolean isDefaultVersion;

    @NameInMap("LatestVersionId")
    private String latestVersionId;

    @NameInMap("Properties")
    private java.util.Map < String, ? > properties;

    @NameInMap("Provider")
    private String provider;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("SupportDriftDetection")
    private Boolean supportDriftDetection;

    @NameInMap("SupportScratchDetection")
    private Boolean supportScratchDetection;

    @NameInMap("TemplateBody")
    private String templateBody;

    @NameInMap("TotalVersionCount")
    private Integer totalVersionCount;

    @NameInMap("UpdateTime")
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
         * The properties of the resource.
         */
        public Builder attributes(java.util.Map < String, ? > attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DefaultVersionId.
         */
        public Builder defaultVersionId(String defaultVersionId) {
            this.defaultVersionId = defaultVersionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * IsDefaultVersion.
         */
        public Builder isDefaultVersion(Boolean isDefaultVersion) {
            this.isDefaultVersion = isDefaultVersion;
            return this;
        }

        /**
         * LatestVersionId.
         */
        public Builder latestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }

        /**
         * Indicates whether the resource supports scratch detection. Default value: false. Valid values:
         * <p>
         * 
         * *   true: Scratch detection is supported.
         * *   false: Scratch detection is not supported.
         */
        public Builder properties(java.util.Map < String, ? > properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * The type of the resource.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the resource supports drift detection. Default value: false. Valid values:
         * <p>
         * 
         * *   true: Drift detection is supported.
         * *   false: Drift detection is not supported.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The entity type. Valid values:
         * <p>
         * 
         * *   Resource: resources other than DataSource resources. For more information, see [Resources](~~28863~~).
         * *   DataSource: DataSource resources.
         */
        public Builder supportDriftDetection(Boolean supportDriftDetection) {
            this.supportDriftDetection = supportDriftDetection;
            return this;
        }

        /**
         * SupportScratchDetection.
         */
        public Builder supportScratchDetection(Boolean supportScratchDetection) {
            this.supportScratchDetection = supportScratchDetection;
            return this;
        }

        /**
         * TemplateBody.
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * TotalVersionCount.
         */
        public Builder totalVersionCount(Integer totalVersionCount) {
            this.totalVersionCount = totalVersionCount;
            return this;
        }

        /**
         * UpdateTime.
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
