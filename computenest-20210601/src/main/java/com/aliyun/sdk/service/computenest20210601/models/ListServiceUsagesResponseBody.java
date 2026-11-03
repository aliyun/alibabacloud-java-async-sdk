// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
    private java.util.List<ServiceUsages> serviceUsages;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ServiceUsages> getServiceUsages() {
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
        private java.util.List<ServiceUsages> serviceUsages; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServiceUsagesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.serviceUsages = model.serviceUsages;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on each page. The maximum value is 100. The default value is 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It is returned when the results are not complete. To retrieve the next page of results, include this token in the NextToken parameter of the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAYChudnQUoBH+mGWFpb6oP0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18AD0960-A9FE-1AC8-ADF8-22131Fxxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service usage details.</p>
         */
        public Builder serviceUsages(java.util.List<ServiceUsages> serviceUsages) {
            this.serviceUsages = serviceUsages;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceUsagesResponseBody build() {
            return new ListServiceUsagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceUsagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceUsagesResponseBody</p>
     */
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
        private java.util.Map<String, String> userInformation;

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
        public java.util.Map<String, String> getUserInformation() {
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
            private java.util.Map<String, String> userInformation; 

            private Builder() {
            } 

            private Builder(ServiceUsages model) {
                this.comments = model.comments;
                this.createTime = model.createTime;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.supplierName = model.supplierName;
                this.updateTime = model.updateTime;
                this.userAliUid = model.userAliUid;
                this.userInformation = model.userInformation;
            } 

            /**
             * <p>The remarks of the approval.</p>
             * 
             * <strong>example:</strong>
             * <p>Review approved.</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The time when the request was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-25T02:02:02Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>service-c9f36ec6d19b4exxxxxx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployment link permission request</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The service status. Valid values:</p>
             * <ul>
             * <li><p>Submitted: The request is submitted and pending approval.</p>
             * </li>
             * <li><p>Approved: The request is approved.</p>
             * </li>
             * <li><p>Rejected: The request is rejected.</p>
             * </li>
             * <li><p>Canceled: The request is canceled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Submitted</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the supplier.</p>
             * 
             * <strong>example:</strong>
             * <p>Acceptance test</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * <p>The time when the request was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-25T02:02:02Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>127383705958xxxx</p>
             */
            public Builder userAliUid(Long userAliUid) {
                this.userAliUid = userAliUid;
                return this;
            }

            /**
             * <p>The user information.</p>
             */
            public Builder userInformation(java.util.Map<String, String> userInformation) {
                this.userInformation = userInformation;
                return this;
            }

            public ServiceUsages build() {
                return new ServiceUsages(this);
            } 

        } 

    }
}
