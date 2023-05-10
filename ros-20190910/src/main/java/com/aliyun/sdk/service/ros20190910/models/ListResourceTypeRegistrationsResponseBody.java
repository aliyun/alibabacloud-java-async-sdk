// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypeRegistrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceTypeRegistrationsResponseBody</p>
 */
public class ListResourceTypeRegistrationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("Registrations")
    private java.util.List < Registrations> registrations;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * Registrations.
         */
        public Builder registrations(java.util.List < Registrations> registrations) {
            this.registrations = registrations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListResourceTypeRegistrationsResponseBody build() {
            return new ListResourceTypeRegistrationsResponseBody(this);
        } 

    } 

    public static class Registrations extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("RegistrationId")
        private String registrationId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        @NameInMap("VersionId")
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * RegistrationId.
             */
            public Builder registrationId(String registrationId) {
                this.registrationId = registrationId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusReason.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * VersionId.
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
