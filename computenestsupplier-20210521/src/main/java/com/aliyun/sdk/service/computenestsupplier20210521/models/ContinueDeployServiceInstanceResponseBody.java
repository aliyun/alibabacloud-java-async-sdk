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
         * <p>The dry run result.</p>
         */
        public Builder dryRunResult(DryRunResult dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>82DF27ED-E538-5AC0-A11C-39334A873189</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        public ContinueDeployServiceInstanceResponseBody build() {
            return new ContinueDeployServiceInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ContinueDeployServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ContinueDeployServiceInstanceResponseBody</p>
     */
    public static class DryRunResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParametersAllowedToBeModified")
        private java.util.List<String> parametersAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyAllowedToBeModified")
        private java.util.List<String> parametersConditionallyAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersNotAllowedToBeModified")
        private java.util.List<String> parametersNotAllowedToBeModified;

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
        public java.util.List<String> getParametersAllowedToBeModified() {
            return this.parametersAllowedToBeModified;
        }

        /**
         * @return parametersConditionallyAllowedToBeModified
         */
        public java.util.List<String> getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        /**
         * @return parametersNotAllowedToBeModified
         */
        public java.util.List<String> getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

        public static final class Builder {
            private java.util.List<String> parametersAllowedToBeModified; 
            private java.util.List<String> parametersConditionallyAllowedToBeModified; 
            private java.util.List<String> parametersNotAllowedToBeModified; 

            /**
             * <p>The parameters that can be modified. The operation that is performed to modify the parameters does not cause a validation error.</p>
             * <blockquote>
             * <p> This parameter is returned only if DryRun is set to true.</p>
             * </blockquote>
             */
            public Builder parametersAllowedToBeModified(java.util.List<String> parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters that can be modified under specific conditions. The new values of the parameters determine whether the operation that is performed to modify the parameters causes a validation error.</p>
             * <blockquote>
             * <p> This parameter is returned only if DryRun is set to true.</p>
             * </blockquote>
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List<String> parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters that cannot be modified. The operation that is performed to modify the parameters causes a validation error.</p>
             * <blockquote>
             * <p> This parameter is returned only if DryRun is set to true.</p>
             * </blockquote>
             */
            public Builder parametersNotAllowedToBeModified(java.util.List<String> parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            public DryRunResult build() {
                return new DryRunResult(this);
            } 

        } 

    }
}
