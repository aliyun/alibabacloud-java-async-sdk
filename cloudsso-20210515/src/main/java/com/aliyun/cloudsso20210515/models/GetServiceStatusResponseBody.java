// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ServiceStatus.</p>
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
             * <p>AccountId.</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>PrerequisiteCheckResult.</p>
             */
            public Builder prerequisiteCheckResult(String prerequisiteCheckResult) {
                this.prerequisiteCheckResult = prerequisiteCheckResult;
                return this;
            }

            /**
             * <p>RegionsInUse.</p>
             */
            public Builder regionsInUse(java.util.List < String > regionsInUse) {
                this.regionsInUse = regionsInUse;
                return this;
            }

            /**
             * <p>Status.</p>
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
