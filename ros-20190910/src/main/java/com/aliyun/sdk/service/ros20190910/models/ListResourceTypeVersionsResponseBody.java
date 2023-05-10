// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypeVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypeVersionsResponseBody</p>
 */
public class ListResourceTypeVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceTypeVersions")
    private java.util.List < ResourceTypeVersions> resourceTypeVersions;

    private ListResourceTypeVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceTypeVersions = builder.resourceTypeVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypeVersionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypeVersions
     */
    public java.util.List < ResourceTypeVersions> getResourceTypeVersions() {
        return this.resourceTypeVersions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceTypeVersions> resourceTypeVersions; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceTypeVersions.
         */
        public Builder resourceTypeVersions(java.util.List < ResourceTypeVersions> resourceTypeVersions) {
            this.resourceTypeVersions = resourceTypeVersions;
            return this;
        }

        public ListResourceTypeVersionsResponseBody build() {
            return new ListResourceTypeVersionsResponseBody(this);
        } 

    } 

    public static class ResourceTypeVersions extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("IsDefaultVersion")
        private Boolean isDefaultVersion;

        @NameInMap("Provider")
        private String provider;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VersionId")
        private String versionId;

        private ResourceTypeVersions(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.entityType = builder.entityType;
            this.isDefaultVersion = builder.isDefaultVersion;
            this.provider = builder.provider;
            this.resourceType = builder.resourceType;
            this.updateTime = builder.updateTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypeVersions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String entityType; 
            private Boolean isDefaultVersion; 
            private String provider; 
            private String resourceType; 
            private String updateTime; 
            private String versionId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public ResourceTypeVersions build() {
                return new ResourceTypeVersions(this);
            } 

        } 

    }
}
