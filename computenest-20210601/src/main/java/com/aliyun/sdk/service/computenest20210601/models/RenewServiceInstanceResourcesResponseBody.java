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
 * {@link RenewServiceInstanceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>RenewServiceInstanceResourcesResponseBody</p>
 */
public class RenewServiceInstanceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailureDetails")
    private java.util.List<FailureDetails> failureDetails;

    @com.aliyun.core.annotation.NameInMap("RenewalResult")
    private RenewalResult renewalResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RenewServiceInstanceResourcesResponseBody(Builder builder) {
        this.failureDetails = builder.failureDetails;
        this.renewalResult = builder.renewalResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewServiceInstanceResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return failureDetails
     */
    public java.util.List<FailureDetails> getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * @return renewalResult
     */
    public RenewalResult getRenewalResult() {
        return this.renewalResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FailureDetails> failureDetails; 
        private RenewalResult renewalResult; 
        private String requestId; 

        /**
         * <p>Details of failed renewals.</p>
         */
        public Builder failureDetails(java.util.List<FailureDetails> failureDetails) {
            this.failureDetails = failureDetails;
            return this;
        }

        /**
         * <p>Renewal result.</p>
         */
        public Builder renewalResult(RenewalResult renewalResult) {
            this.renewalResult = renewalResult;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13FE89A5-C036-56BF-A0FF-A31C59819FD7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenewServiceInstanceResourcesResponseBody build() {
            return new RenewServiceInstanceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RenewServiceInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>RenewServiceInstanceResourcesResponseBody</p>
     */
    public static class FailureDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ResourceArn")
        private String resourceArn;

        private FailureDetails(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.resourceArn = builder.resourceArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailureDetails create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String resourceArn; 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidPeriod</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Error message</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Resource ARN (Aliyun Resource Name).</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ecs:cn-hongkong:1488317743351199:instance/i-j6c6f3lbky38o8rpeqw2</p>
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            public FailureDetails build() {
                return new FailureDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link RenewServiceInstanceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>RenewServiceInstanceResourcesResponseBody</p>
     */
    public static class RenewalResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failed")
        private Integer failed;

        @com.aliyun.core.annotation.NameInMap("Succeeded")
        private Integer succeeded;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private RenewalResult(Builder builder) {
            this.failed = builder.failed;
            this.succeeded = builder.succeeded;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RenewalResult create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return succeeded
         */
        public Integer getSucceeded() {
            return this.succeeded;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer failed; 
            private Integer succeeded; 
            private Integer totalCount; 

            /**
             * <p>Number of failed renewals.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>Number of successfully renewed resources.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder succeeded(Integer succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            /**
             * <p>Number of renewed resources.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public RenewalResult build() {
                return new RenewalResult(this);
            } 

        } 

    }
}
