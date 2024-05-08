// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueDeployServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ContinueDeployServiceInstanceResponseBody</p>
 */
public class ContinueDeployServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRunResult")
    private DryRunResult dryRunResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    private ContinueDeployServiceInstanceResponseBody(Builder builder) {
        this.dryRunResult = builder.dryRunResult;
        this.requestId = builder.requestId;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinueDeployServiceInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dryRunResult
     */
    public DryRunResult getDryRunResult() {
        return this.dryRunResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder {
        private DryRunResult dryRunResult; 
        private String requestId; 
        private String serviceInstanceId; 

        /**
         * DryRunResult.
         */
        public Builder dryRunResult(DryRunResult dryRunResult) {
            this.dryRunResult = dryRunResult;
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
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        public ContinueDeployServiceInstanceResponseBody build() {
            return new ContinueDeployServiceInstanceResponseBody(this);
        } 

    } 

    public static class DryRunResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParametersAllowedToBeModified")
        private java.util.List < String > parametersAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyAllowedToBeModified")
        private java.util.List < String > parametersConditionallyAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersNotAllowedToBeModified")
        private java.util.List < String > parametersNotAllowedToBeModified;

        private DryRunResult(Builder builder) {
            this.parametersAllowedToBeModified = builder.parametersAllowedToBeModified;
            this.parametersConditionallyAllowedToBeModified = builder.parametersConditionallyAllowedToBeModified;
            this.parametersNotAllowedToBeModified = builder.parametersNotAllowedToBeModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DryRunResult create() {
            return builder().build();
        }

        /**
         * @return parametersAllowedToBeModified
         */
        public java.util.List < String > getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        /**
         * @return parametersConditionallyAllowedToBeModified
         */
        public java.util.List < String > getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        /**
         * @return parametersNotAllowedToBeModified
         */
        public java.util.List < String > getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

        public static final class Builder {
            private java.util.List < String > parametersAllowedToBeModified; 
            private java.util.List < String > parametersConditionallyAllowedToBeModified; 
            private java.util.List < String > parametersNotAllowedToBeModified; 

            /**
             * ParametersAllowedToBeModified.
             */
            public Builder parametersAllowedToBeModified(java.util.List < String > parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * ParametersConditionallyAllowedToBeModified.
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List < String > parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * ParametersNotAllowedToBeModified.
             */
            public Builder parametersNotAllowedToBeModified(java.util.List < String > parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            public DryRunResult build() {
                return new DryRunResult(this);
            } 

        } 

    }
}
