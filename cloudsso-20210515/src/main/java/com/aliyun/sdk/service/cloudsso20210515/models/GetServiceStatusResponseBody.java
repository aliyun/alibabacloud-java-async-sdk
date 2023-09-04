// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceStatusResponseBody</p>
 */
public class GetServiceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceStatus")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status information of CloudSSO.
         */
        public Builder serviceStatus(ServiceStatus serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        public GetServiceStatusResponseBody build() {
            return new GetServiceStatusResponseBody(this);
        } 

    } 

    public static class ServiceStatus extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("PrerequisiteCheckResult")
        private String prerequisiteCheckResult;

        @NameInMap("RegionsInUse")
        private java.util.List < String > regionsInUse;

        @NameInMap("Status")
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
             * The ID of your Alibaba Cloud account.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * Indicates whether you have permissions to enable CloudSSO. Valid values:
             * <p>
             * 
             * *   Success: You have permissions to enable CloudSSO.
             * *   Failed: You do not have permissions to enable CloudSSO.
             * 
             * >  The value of this parameter is returned only if the value of `Status` is `Disabled`.
             */
            public Builder prerequisiteCheckResult(String prerequisiteCheckResult) {
                this.prerequisiteCheckResult = prerequisiteCheckResult;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionsInUse(java.util.List < String > regionsInUse) {
                this.regionsInUse = regionsInUse;
                return this;
            }

            /**
             * Indicates whether CloudSSO is enabled. Valid values:
             * <p>
             * 
             * *   Enabled
             * *   Disabled
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
