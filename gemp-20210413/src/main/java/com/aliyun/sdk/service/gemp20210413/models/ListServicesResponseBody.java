// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServicesResponseBody</p>
 */
public class ListServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListServicesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServicesResponseBody build() {
            return new ListServicesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("escalationPlanId")
        private Long escalationPlanId;

        @com.aliyun.core.annotation.NameInMap("escalationPlanName")
        private String escalationPlanName;

        @com.aliyun.core.annotation.NameInMap("isValid")
        private Integer isValid;

        @com.aliyun.core.annotation.NameInMap("serviceDescription")
        private String serviceDescription;

        @com.aliyun.core.annotation.NameInMap("serviceGroupIdList")
        private java.util.List < Long > serviceGroupIdList;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.escalationPlanId = builder.escalationPlanId;
            this.escalationPlanName = builder.escalationPlanName;
            this.isValid = builder.isValid;
            this.serviceDescription = builder.serviceDescription;
            this.serviceGroupIdList = builder.serviceGroupIdList;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return escalationPlanId
         */
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

        /**
         * @return escalationPlanName
         */
        public String getEscalationPlanName() {
            return this.escalationPlanName;
        }

        /**
         * @return isValid
         */
        public Integer getIsValid() {
            return this.isValid;
        }

        /**
         * @return serviceDescription
         */
        public String getServiceDescription() {
            return this.serviceDescription;
        }

        /**
         * @return serviceGroupIdList
         */
        public java.util.List < Long > getServiceGroupIdList() {
            return this.serviceGroupIdList;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long escalationPlanId; 
            private String escalationPlanName; 
            private Integer isValid; 
            private String serviceDescription; 
            private java.util.List < Long > serviceGroupIdList; 
            private Long serviceId; 
            private String serviceName; 
            private String updateTime; 

            /**
             * escalationPlanId.
             */
            public Builder escalationPlanId(Long escalationPlanId) {
                this.escalationPlanId = escalationPlanId;
                return this;
            }

            /**
             * escalationPlanName.
             */
            public Builder escalationPlanName(String escalationPlanName) {
                this.escalationPlanName = escalationPlanName;
                return this;
            }

            /**
             * isValid.
             */
            public Builder isValid(Integer isValid) {
                this.isValid = isValid;
                return this;
            }

            /**
             * serviceDescription.
             */
            public Builder serviceDescription(String serviceDescription) {
                this.serviceDescription = serviceDescription;
                return this;
            }

            /**
             * serviceGroupIdList.
             */
            public Builder serviceGroupIdList(java.util.List < Long > serviceGroupIdList) {
                this.serviceGroupIdList = serviceGroupIdList;
                return this;
            }

            /**
             * serviceId.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
