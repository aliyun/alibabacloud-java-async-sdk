// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStackResponseBody</p>
 */
public class UpdateStackResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    private DryRunResult dryRunResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackId")
    private String stackId;

    private UpdateStackResponseBody(Builder builder) {
        this.dryRunResult = builder.dryRunResult;
        this.requestId = builder.requestId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackResponseBody create() {
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
         * The validation result. This parameter is returned only if the DryRun parameter is set to true.
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

        public UpdateStackResponseBody build() {
            return new UpdateStackResponseBody(this);
        } 

    } 

    public static class DryRunResult extends TeaModel {
        @NameInMap("ParametersAllowedToBeModified")
        private java.util.List < String > parametersAllowedToBeModified;

        @NameInMap("ParametersCauseInterruptionIfModified")
        private java.util.List < String > parametersCauseInterruptionIfModified;

        @NameInMap("ParametersConditionallyAllowedToBeModified")
        private java.util.List < String > parametersConditionallyAllowedToBeModified;

        @NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        private java.util.List < String > parametersConditionallyCauseInterruptionIfModified;

        @NameInMap("ParametersNotAllowedToBeModified")
        private java.util.List < String > parametersNotAllowedToBeModified;

        @NameInMap("ParametersUncertainlyAllowedToBeModified")
        private java.util.List < String > parametersUncertainlyAllowedToBeModified;

        @NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        private java.util.List < String > parametersUncertainlyCauseInterruptionIfModified;

        private DryRunResult(Builder builder) {
            this.parametersAllowedToBeModified = builder.parametersAllowedToBeModified;
            this.parametersCauseInterruptionIfModified = builder.parametersCauseInterruptionIfModified;
            this.parametersConditionallyAllowedToBeModified = builder.parametersConditionallyAllowedToBeModified;
            this.parametersConditionallyCauseInterruptionIfModified = builder.parametersConditionallyCauseInterruptionIfModified;
            this.parametersNotAllowedToBeModified = builder.parametersNotAllowedToBeModified;
            this.parametersUncertainlyAllowedToBeModified = builder.parametersUncertainlyAllowedToBeModified;
            this.parametersUncertainlyCauseInterruptionIfModified = builder.parametersUncertainlyCauseInterruptionIfModified;
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
         * @return parametersCauseInterruptionIfModified
         */
        public java.util.List < String > getParametersCauseInterruptionIfModified() {
            return this.parametersCauseInterruptionIfModified;
        }

        /**
         * @return parametersConditionallyAllowedToBeModified
         */
        public java.util.List < String > getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        /**
         * @return parametersConditionallyCauseInterruptionIfModified
         */
        public java.util.List < String > getParametersConditionallyCauseInterruptionIfModified() {
            return this.parametersConditionallyCauseInterruptionIfModified;
        }

        /**
         * @return parametersNotAllowedToBeModified
         */
        public java.util.List < String > getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

        /**
         * @return parametersUncertainlyAllowedToBeModified
         */
        public java.util.List < String > getParametersUncertainlyAllowedToBeModified() {
            return this.parametersUncertainlyAllowedToBeModified;
        }

        /**
         * @return parametersUncertainlyCauseInterruptionIfModified
         */
        public java.util.List < String > getParametersUncertainlyCauseInterruptionIfModified() {
            return this.parametersUncertainlyCauseInterruptionIfModified;
        }

        public static final class Builder {
            private java.util.List < String > parametersAllowedToBeModified; 
            private java.util.List < String > parametersCauseInterruptionIfModified; 
            private java.util.List < String > parametersConditionallyAllowedToBeModified; 
            private java.util.List < String > parametersConditionallyCauseInterruptionIfModified; 
            private java.util.List < String > parametersNotAllowedToBeModified; 
            private java.util.List < String > parametersUncertainlyAllowedToBeModified; 
            private java.util.List < String > parametersUncertainlyCauseInterruptionIfModified; 

            /**
             * The parameters that can be modified. If you change only values of the parameters in a stack template and use the template to update the stack, no validation errors are caused.
             */
            public Builder parametersAllowedToBeModified(java.util.List < String > parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions. If you change only values of the parameters in a stack template and use the template to update the stack, service interruptions are caused.
             * <p>
             * 
             * > 
             * *   This parameter is supported only for a small number of resource types.
             * *   This parameter is valid only for changes that are made on ROS stacks.
             */
            public Builder parametersCauseInterruptionIfModified(java.util.List < String > parametersCauseInterruptionIfModified) {
                this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
                return this;
            }

            /**
             * The parameters that can be modified under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values of the parameters determine whether validation errors are caused.
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List < String > parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values and the update type determine whether service interruptions are caused.
             * <p>
             * 
             * > 
             * *   This parameter is supported only for a small number of resource types.
             * *   This parameter is valid only for changes that are made on ROS stacks.
             */
            public Builder parametersConditionallyCauseInterruptionIfModified(java.util.List < String > parametersConditionallyCauseInterruptionIfModified) {
                this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
                return this;
            }

            /**
             * The parameters that cannot be modified. If you change only values of the parameters in a stack template and use the template to update the stack, validation errors are caused.
             */
            public Builder parametersNotAllowedToBeModified(java.util.List < String > parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            /**
             * The parameters that can be modified under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether validation errors are caused.
             */
            public Builder parametersUncertainlyAllowedToBeModified(java.util.List < String > parametersUncertainlyAllowedToBeModified) {
                this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
                return this;
            }

            /**
             * The parameters whose changes cause service interruptions under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether service interruptions are caused.
             * <p>
             * 
             * > 
             * *   This parameter is supported only for a small number of resource types.
             * *   This parameter is valid only for changes that are made on ROS stacks.
             */
            public Builder parametersUncertainlyCauseInterruptionIfModified(java.util.List < String > parametersUncertainlyCauseInterruptionIfModified) {
                this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
                return this;
            }

            public DryRunResult build() {
                return new DryRunResult(this);
            } 

        } 

    }
}
