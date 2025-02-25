// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceStatusResponseBody</p>
 */
public class GetServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
    private ServiceStatus serviceStatus;

    private GetServiceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceStatus = builder.serviceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceStatus
     */
    public ServiceStatus getServiceStatus() {
        return this.serviceStatus;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceStatus serviceStatus; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ADADC31D-90EE-5459-99B0-D83DF07769A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status information of CloudSSO.</p>
         */
        public Builder serviceStatus(ServiceStatus serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        public GetServiceStatusResponseBody build() {
            return new GetServiceStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceStatusResponseBody</p>
     */
    public static class ServiceStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("PrerequisiteCheckResult")
        private String prerequisiteCheckResult;

        @com.aliyun.core.annotation.NameInMap("RegionsInUse")
        private java.util.List < String > regionsInUse;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ServiceStatus(Builder builder) {
            this.accountId = builder.accountId;
            this.prerequisiteCheckResult = builder.prerequisiteCheckResult;
            this.regionsInUse = builder.regionsInUse;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceStatus create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return prerequisiteCheckResult
         */
        public String getPrerequisiteCheckResult() {
            return this.prerequisiteCheckResult;
        }

        /**
         * @return regionsInUse
         */
        public java.util.List < String > getRegionsInUse() {
            return this.regionsInUse;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountId; 
            private String prerequisiteCheckResult; 
            private java.util.List < String > regionsInUse; 
            private String status; 

            /**
             * <p>The ID of your Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>Indicates whether you have permissions to enable CloudSSO. Valid values:</p>
             * <ul>
             * <li>Success: You have permissions to enable CloudSSO.</li>
             * <li>Failed: You do not have permissions to enable CloudSSO.</li>
             * </ul>
             * <blockquote>
             * <p> The value of this parameter is returned only if the value of <code>Status</code> is <code>Disabled</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder prerequisiteCheckResult(String prerequisiteCheckResult) {
                this.prerequisiteCheckResult = prerequisiteCheckResult;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             */
            public Builder regionsInUse(java.util.List < String > regionsInUse) {
                this.regionsInUse = regionsInUse;
                return this;
            }

            /**
             * <p>Indicates whether CloudSSO is enabled. Valid values:</p>
             * <ul>
             * <li>Enabled</li>
             * <li>Disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ServiceStatus build() {
                return new ServiceStatus(this);
            } 

        } 

    }
}
