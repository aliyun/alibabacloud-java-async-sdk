// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListServiceInstanceDeployDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstanceDeployDetailsResponseBody</p>
 */
public class ListServiceInstanceDeployDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeployDetails")
    private java.util.List<DeployDetails> deployDetails;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceInstanceDeployDetailsResponseBody(Builder builder) {
        this.deployDetails = builder.deployDetails;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstanceDeployDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployDetails
     */
    public java.util.List<DeployDetails> getDeployDetails() {
        return this.deployDetails;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DeployDetails> deployDetails; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServiceInstanceDeployDetailsResponseBody model) {
            this.deployDetails = model.deployDetails;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the service instance deployment.</p>
         */
        public Builder deployDetails(java.util.List<DeployDetails> deployDetails) {
            this.deployDetails = deployDetails;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0036D82E-0624-5B37-B797-C460F4B02026</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceInstanceDeployDetailsResponseBody build() {
            return new ListServiceInstanceDeployDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstanceDeployDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstanceDeployDetailsResponseBody</p>
     */
    public static class DeployDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Cycle")
        private String cycle;

        @com.aliyun.core.annotation.NameInMap("DeploySucceeded")
        private String deploySucceeded;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorDetail")
        private String errorDetail;

        @com.aliyun.core.annotation.NameInMap("ErrorType")
        private String errorType;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
        private String serviceInstanceId;

        @com.aliyun.core.annotation.NameInMap("ServiceNameChn")
        private String serviceNameChn;

        @com.aliyun.core.annotation.NameInMap("ServiceNameEng")
        private String serviceNameEng;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("ServiceVersion")
        private String serviceVersion;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private DeployDetails(Builder builder) {
            this.count = builder.count;
            this.createTime = builder.createTime;
            this.cycle = builder.cycle;
            this.deploySucceeded = builder.deploySucceeded;
            this.errorCode = builder.errorCode;
            this.errorDetail = builder.errorDetail;
            this.errorType = builder.errorType;
            this.serviceId = builder.serviceId;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.serviceNameChn = builder.serviceNameChn;
            this.serviceNameEng = builder.serviceNameEng;
            this.serviceType = builder.serviceType;
            this.serviceVersion = builder.serviceVersion;
            this.timestamp = builder.timestamp;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployDetails create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cycle
         */
        public String getCycle() {
            return this.cycle;
        }

        /**
         * @return deploySucceeded
         */
        public String getDeploySucceeded() {
            return this.deploySucceeded;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorDetail
         */
        public String getErrorDetail() {
            return this.errorDetail;
        }

        /**
         * @return errorType
         */
        public String getErrorType() {
            return this.errorType;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceInstanceId
         */
        public String getServiceInstanceId() {
            return this.serviceInstanceId;
        }

        /**
         * @return serviceNameChn
         */
        public String getServiceNameChn() {
            return this.serviceNameChn;
        }

        /**
         * @return serviceNameEng
         */
        public String getServiceNameEng() {
            return this.serviceNameEng;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return serviceVersion
         */
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String count; 
            private String createTime; 
            private String cycle; 
            private String deploySucceeded; 
            private String errorCode; 
            private String errorDetail; 
            private String errorType; 
            private String serviceId; 
            private String serviceInstanceId; 
            private String serviceNameChn; 
            private String serviceNameEng; 
            private String serviceType; 
            private String serviceVersion; 
            private String timestamp; 
            private String userId; 

            private Builder() {
            } 

            private Builder(DeployDetails model) {
                this.count = model.count;
                this.createTime = model.createTime;
                this.cycle = model.cycle;
                this.deploySucceeded = model.deploySucceeded;
                this.errorCode = model.errorCode;
                this.errorDetail = model.errorDetail;
                this.errorType = model.errorType;
                this.serviceId = model.serviceId;
                this.serviceInstanceId = model.serviceInstanceId;
                this.serviceNameChn = model.serviceNameChn;
                this.serviceNameEng = model.serviceNameEng;
                this.serviceType = model.serviceType;
                this.serviceVersion = model.serviceVersion;
                this.timestamp = model.timestamp;
                this.userId = model.userId;
            } 

            /**
             * <p>The total number of entries that meet the specified conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The time when the service instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-10T01:58:20Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The period over which data is aggregated.</p>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder cycle(String cycle) {
                this.cycle = cycle;
                return this;
            }

            /**
             * <p>The indicates whether the deployment was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder deploySucceeded(String deploySucceeded) {
                this.deploySucceeded = deploySucceeded;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>StackValidationFailed</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error description.</p>
             * 
             * <strong>example:</strong>
             * <p>{code: StackValidationFailed, message: &quot;Failed to continue create ROS stack 89e724e2-84e6-4517-a372-30a545ab4145: Resource [LinuxInstanceRunCommand]: i-wz91nfbh1fxtmfb0try4 are not running. Command invocation only support running instances. ErrorCode: StackValidationFailed&quot;, requestId: null}</p>
             */
            public Builder errorDetail(String errorDetail) {
                this.errorDetail = errorDetail;
                return this;
            }

            /**
             * <p>The type of error that caused the deployment to fail.</p>
             * 
             * <strong>example:</strong>
             * <p>ValidationError</p>
             */
            public Builder errorType(String errorType) {
                this.errorType = errorType;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>service-c751ed91f2074af39779</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>si-273e8cee11d349e1803c</p>
             */
            public Builder serviceInstanceId(String serviceInstanceId) {
                this.serviceInstanceId = serviceInstanceId;
                return this;
            }

            /**
             * <p>The name of the service in Chinese.</p>
             * 
             * <strong>example:</strong>
             * <p>测试服务(Test Service)</p>
             */
            public Builder serviceNameChn(String serviceNameChn) {
                this.serviceNameChn = serviceNameChn;
                return this;
            }

            /**
             * <p>The name of the service in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Service</p>
             */
            public Builder serviceNameEng(String serviceNameEng) {
                this.serviceNameEng = serviceNameEng;
                return this;
            }

            /**
             * <p>The type of service. </p>
             * <p>Possible values:</p>
             * <ul>
             * <li>private: Deployed under the user&quot;s account.</li>
             * <li>managed: Hosted under the service provider&quot;s account.</li>
             * <li>operation: Managed operation service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The service version.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder serviceVersion(String serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            /**
             * <p>The timestamp when the response is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1723946641994</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The aliuid of user.</p>
             * 
             * <strong>example:</strong>
             * <p>1591457835436382</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DeployDetails build() {
                return new DeployDetails(this);
            } 

        } 

    }
}
