// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypesResponseBody</p>
 */
public class ListResourceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceTypeSummaries")
    private java.util.List < ResourceTypeSummaries> resourceTypeSummaries;

    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private java.util.List < String > resourceTypes;

    private ListResourceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceTypeSummaries = builder.resourceTypeSummaries;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceTypeSummaries
     */
    public java.util.List < ResourceTypeSummaries> getResourceTypeSummaries() {
        return this.resourceTypeSummaries;
    }

    /**
     * @return resourceTypes
     */
    public java.util.List < String > getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceTypeSummaries> resourceTypeSummaries; 
        private java.util.List < String > resourceTypes; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EA00860C-ECAF-5253-A1F9-8198695A7157</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource type summaries.</p>
         */
        public Builder resourceTypeSummaries(java.util.List < ResourceTypeSummaries> resourceTypeSummaries) {
            this.resourceTypeSummaries = resourceTypeSummaries;
            return this;
        }

        /**
         * <p>The array of resource types.</p>
         */
        public Builder resourceTypes(java.util.List < String > resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public ListResourceTypesResponseBody build() {
            return new ListResourceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceTypesResponseBody</p>
     */
    public static class ResourceTypeSummaries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DefaultVersionId")
        private String defaultVersionId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("LatestVersionId")
        private String latestVersionId;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TotalVersionCount")
        private Integer totalVersionCount;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private ResourceTypeSummaries(Builder builder) {
            this.createTime = builder.createTime;
            this.defaultVersionId = builder.defaultVersionId;
            this.description = builder.description;
            this.entityType = builder.entityType;
            this.latestVersionId = builder.latestVersionId;
            this.provider = builder.provider;
            this.resourceType = builder.resourceType;
            this.totalVersionCount = builder.totalVersionCount;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTypeSummaries create() {
            return builder().build();
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
         * @return latestVersionId
         */
        public String getLatestVersionId() {
            return this.latestVersionId;
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
            private String createTime; 
            private String defaultVersionId; 
            private String description; 
            private String entityType; 
            private String latestVersionId; 
            private String provider; 
            private String resourceType; 
            private Integer totalVersionCount; 
            private String updateTime; 

            /**
             * <p>The creation time. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-24T08:25:21</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the default version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder defaultVersionId(String defaultVersionId) {
                this.defaultVersionId = defaultVersionId;
                return this;
            }

            /**
             * <p>The description of the resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>It is a demo.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The entity type. Valid values:</p>
             * <ul>
             * <li>Resource: regular resources.</li>
             * <li>DataSource: DataSource resources.</li>
             * <li>Module: modules.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Module</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The ID of the latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>v10</p>
             */
            public Builder latestVersionId(String latestVersionId) {
                this.latestVersionId = latestVersionId;
                return this;
            }

            /**
             * <p>The provider of the resource type. Valid values:</p>
             * <ul>
             * <li>ROS: The resource type is provided by ROS.</li>
             * <li>Self: The resource type is provided by you.</li>
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
             * <p>The number of versions.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalVersionCount(Integer totalVersionCount) {
                this.totalVersionCount = totalVersionCount;
                return this;
            }

            /**
             * <p>The update time. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-24T08:25:21</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResourceTypeSummaries build() {
                return new ResourceTypeSummaries(this);
            } 

        } 

    }
}
