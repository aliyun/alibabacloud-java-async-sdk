// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceTypeVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypeVersionsResponseBody</p>
 */
public class ListResourceTypeVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceTypeVersions")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The versions of the resource types.</p>
         */
        public Builder resourceTypeVersions(java.util.List < ResourceTypeVersions> resourceTypeVersions) {
            this.resourceTypeVersions = resourceTypeVersions;
            return this;
        }

        public ListResourceTypeVersionsResponseBody build() {
            return new ListResourceTypeVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceTypeVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceTypeVersionsResponseBody</p>
     */
    public static class ResourceTypeVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("IsDefaultVersion")
        private Boolean isDefaultVersion;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VersionId")
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
             * <p>The time when the version was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-24T08:25:21</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>It is a demo.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The entity type. Only Module may be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Module</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>Indicates whether the version is the default version. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefaultVersion(Boolean isDefaultVersion) {
                this.isDefaultVersion = isDefaultVersion;
                return this;
            }

            /**
             * <p>The provider of the resource type. Valid values:</p>
             * <ul>
             * <li>ROS: ROS</li>
             * <li>Self: yourself</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ROS</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The time when the version was updated. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-24T08:25:21</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
