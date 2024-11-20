// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceTypeRegistrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypeRegistrationsResponseBody</p>
 */
public class ListResourceTypeRegistrationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("Registrations")
    private java.util.List < Registrations> registrations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListResourceTypeRegistrationsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.registrations = builder.registrations;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypeRegistrationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return registrations
     */
    public java.util.List < Registrations> getRegistrations() {
        return this.registrations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private java.util.List < Registrations> registrations; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The registration records of the resource.</p>
         */
        public Builder registrations(java.util.List < Registrations> registrations) {
            this.registrations = registrations;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of registration records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceTypeRegistrationsResponseBody build() {
            return new ListResourceTypeRegistrationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceTypeRegistrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceTypeRegistrationsResponseBody</p>
     */
    public static class Registrations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("RegistrationId")
        private String registrationId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private String versionId;

        private Registrations(Builder builder) {
            this.createTime = builder.createTime;
            this.entityType = builder.entityType;
            this.registrationId = builder.registrationId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Registrations create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return registrationId
         */
        public String getRegistrationId() {
            return this.registrationId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String createTime; 
            private String entityType; 
            private String registrationId; 
            private String resourceType; 
            private String status; 
            private String statusReason; 
            private String versionId; 

            /**
             * <p>The creation time. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-02T07:28:35</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * <p>The ID of the registration record.</p>
             * 
             * <strong>example:</strong>
             * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
             */
            public Builder registrationId(String registrationId) {
                this.registrationId = registrationId;
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
             * <p>The registration state. Valid values:</p>
             * <ul>
             * <li>IN_PROGRESS: The registration is in progress.</li>
             * <li>COMPLETE: The registration is successful.</li>
             * <li>FAILED: The registration failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason for the state.</p>
             * 
             * <strong>example:</strong>
             * <p>Module is created successfully</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
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

            public Registrations build() {
                return new Registrations(this);
            } 

        } 

    }
}
