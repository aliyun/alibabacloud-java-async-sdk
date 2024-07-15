// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceUsagesResponseBody</p>
 */
public class ListServiceUsagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceUsages")
    private java.util.List < ServiceUsages> serviceUsages;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceUsagesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceUsages = builder.serviceUsages;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceUsagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceUsages
     */
    public java.util.List < ServiceUsages> getServiceUsages() {
        return this.serviceUsages;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ServiceUsages> serviceUsages; 
        private Integer totalCount; 

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The service applications.
         */
        public Builder serviceUsages(java.util.List < ServiceUsages> serviceUsages) {
            this.serviceUsages = serviceUsages;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceUsagesResponseBody build() {
            return new ListServiceUsagesResponseBody(this);
        } 

    } 

    public static class ServiceUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserAliUid")
        private Long userAliUid;

        @com.aliyun.core.annotation.NameInMap("UserInformation")
        private java.util.Map < String, String > userInformation;

        private ServiceUsages(Builder builder) {
            this.comments = builder.comments;
            this.createTime = builder.createTime;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.updateTime = builder.updateTime;
            this.userAliUid = builder.userAliUid;
            this.userInformation = builder.userInformation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceUsages create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userAliUid
         */
        public Long getUserAliUid() {
            return this.userAliUid;
        }

        /**
         * @return userInformation
         */
        public java.util.Map < String, String > getUserInformation() {
            return this.userInformation;
        }

        public static final class Builder {
            private String comments; 
            private String createTime; 
            private String serviceId; 
            private String serviceName; 
            private String status; 
            private String supplierName; 
            private String updateTime; 
            private Long userAliUid; 
            private java.util.Map < String, String > userInformation; 

            /**
             * The comment on the approval.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The service ID.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The service name.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The status of the service application. Valid values:
             * <p>
             * 
             * *   Submitted: The application is submitted or is to be approved.
             * *   Approved: The application is approved.
             * *   Rejected: The application is rejected.
             * *   Canceled: The application is canceled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the service provider.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * The time when the application was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder userAliUid(Long userAliUid) {
                this.userAliUid = userAliUid;
                return this;
            }

            /**
             * The user information.
             */
            public Builder userInformation(java.util.Map < String, String > userInformation) {
                this.userInformation = userInformation;
                return this;
            }

            public ServiceUsages build() {
                return new ServiceUsages(this);
            } 

        } 

    }
}
