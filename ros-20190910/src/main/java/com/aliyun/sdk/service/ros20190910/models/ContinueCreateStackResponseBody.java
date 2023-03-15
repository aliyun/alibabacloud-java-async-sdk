// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueCreateStackResponseBody} extends {@link TeaModel}
 *
 * <p>ContinueCreateStackResponseBody</p>
 */
public class ContinueCreateStackResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    private DryRunResult dryRunResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackId")
    private String stackId;

    private ContinueCreateStackResponseBody(Builder builder) {
        this.dryRunResult = builder.dryRunResult;
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinueCreateStackResponseBody create() {
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
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder {
        private DryRunResult dryRunResult; 
        private String requestId; 
        private String stackId; 

        /**
         * The validation result.
         */
        public Builder dryRunResult(DryRunResult dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the stack.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public ContinueCreateStackResponseBody build() {
            return new ContinueCreateStackResponseBody(this);
        } 

    } 

    public static class DryRunResult extends TeaModel {
        @NameInMap("ParametersAllowedToBeModified")
        private java.util.List < String > parametersAllowedToBeModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        private java.util.List < String > parametersConditionallyAllowedToBeModified;

        @NameInMap("ParametersNotAllowedToBeModified")
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
             * The parameters that can be modified. The operation that is performed to modify the parameters does not cause a validation error.
             * <p>
             * 
             * >  This parameter is returned only if the DryRun parameter is set to `true`. The value of the ParametersAllowedToBeModified parameter varies based on the values of the Mode, Template\*, RecreatingResources.N, and RecreatingOptions.N parameters.
             */
            public Builder parametersAllowedToBeModified(java.util.List < String > parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * The parameters that can be modified under specific conditions.
             * <p>
             * 
             * The new values of the parameters determine whether the operation that is performed to modify the parameters causes a validation error.
             * 
             * >  This parameter is returned only if the DryRun parameter is set to `true`. The value of the ParametersConditionallyAllowedToBeModified parameter varies based on the values of the Mode, Template\*, RecreatingResources.N, and RecreatingOptions.N parameters.
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List < String > parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * The parameters that cannot be modified. The operation that is performed to modify the parameters causes a validation error.
             * <p>
             * 
             * >  This parameter is returned only if the DryRun parameter is set to `true`. The value of the ParametersNotAllowedToBeModified parameter varies based on the values of the Mode, Template\*, RecreatingResources.N, and RecreatingOptions.N parameters.
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
