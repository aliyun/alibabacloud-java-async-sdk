// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link UpdateStackResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStackResponseBody</p>
 */
public class UpdateStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRunResult")
    private DryRunResult dryRunResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateStackResponseBody model) {
            this.dryRunResult = model.dryRunResult;
            this.requestId = model.requestId;
            this.stackId = model.stackId;
        } 

        /**
         * <p>The dry run result. This parameter is returned only if DryRun is set to true.</p>
         */
        public Builder dryRunResult(DryRunResult dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        public UpdateStackResponseBody build() {
            return new UpdateStackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateStackResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateStackResponseBody</p>
     */
    public static class DryRunResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParametersAllowedToBeModified")
        private java.util.List<String> parametersAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersCauseInterruptionIfModified")
        private java.util.List<String> parametersCauseInterruptionIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersCauseReplacementIfModified")
        private java.util.List<String> parametersCauseReplacementIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyAllowedToBeModified")
        private java.util.List<String> parametersConditionallyAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyCauseInterruptionIfModified")
        private java.util.List<String> parametersConditionallyCauseInterruptionIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersConditionallyCauseReplacementIfModified")
        private java.util.List<String> parametersConditionallyCauseReplacementIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersNotAllowedToBeModified")
        private java.util.List<String> parametersNotAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersUncertainlyAllowedToBeModified")
        private java.util.List<String> parametersUncertainlyAllowedToBeModified;

        @com.aliyun.core.annotation.NameInMap("ParametersUncertainlyCauseInterruptionIfModified")
        private java.util.List<String> parametersUncertainlyCauseInterruptionIfModified;

        @com.aliyun.core.annotation.NameInMap("ParametersUncertainlyCauseReplacementIfModified")
        private java.util.List<String> parametersUncertainlyCauseReplacementIfModified;

        private DryRunResult(Builder builder) {
            this.parametersAllowedToBeModified = builder.parametersAllowedToBeModified;
            this.parametersCauseInterruptionIfModified = builder.parametersCauseInterruptionIfModified;
            this.parametersCauseReplacementIfModified = builder.parametersCauseReplacementIfModified;
            this.parametersConditionallyAllowedToBeModified = builder.parametersConditionallyAllowedToBeModified;
            this.parametersConditionallyCauseInterruptionIfModified = builder.parametersConditionallyCauseInterruptionIfModified;
            this.parametersConditionallyCauseReplacementIfModified = builder.parametersConditionallyCauseReplacementIfModified;
            this.parametersNotAllowedToBeModified = builder.parametersNotAllowedToBeModified;
            this.parametersUncertainlyAllowedToBeModified = builder.parametersUncertainlyAllowedToBeModified;
            this.parametersUncertainlyCauseInterruptionIfModified = builder.parametersUncertainlyCauseInterruptionIfModified;
            this.parametersUncertainlyCauseReplacementIfModified = builder.parametersUncertainlyCauseReplacementIfModified;
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
         * @return parametersCauseInterruptionIfModified
         */
        public java.util.List<String> getParametersCauseInterruptionIfModified() {
            return this.parametersCauseInterruptionIfModified;
        }

        /**
         * @return parametersCauseReplacementIfModified
         */
        public java.util.List<String> getParametersCauseReplacementIfModified() {
            return this.parametersCauseReplacementIfModified;
        }

        /**
         * @return parametersConditionallyAllowedToBeModified
         */
        public java.util.List<String> getParametersConditionallyAllowedToBeModified() {
            return this.parametersConditionallyAllowedToBeModified;
        }

        /**
         * @return parametersConditionallyCauseInterruptionIfModified
         */
        public java.util.List<String> getParametersConditionallyCauseInterruptionIfModified() {
            return this.parametersConditionallyCauseInterruptionIfModified;
        }

        /**
         * @return parametersConditionallyCauseReplacementIfModified
         */
        public java.util.List<String> getParametersConditionallyCauseReplacementIfModified() {
            return this.parametersConditionallyCauseReplacementIfModified;
        }

        /**
         * @return parametersNotAllowedToBeModified
         */
        public java.util.List<String> getParametersNotAllowedToBeModified() {
            return this.parametersNotAllowedToBeModified;
        }

        /**
         * @return parametersUncertainlyAllowedToBeModified
         */
        public java.util.List<String> getParametersUncertainlyAllowedToBeModified() {
            return this.parametersUncertainlyAllowedToBeModified;
        }

        /**
         * @return parametersUncertainlyCauseInterruptionIfModified
         */
        public java.util.List<String> getParametersUncertainlyCauseInterruptionIfModified() {
            return this.parametersUncertainlyCauseInterruptionIfModified;
        }

        /**
         * @return parametersUncertainlyCauseReplacementIfModified
         */
        public java.util.List<String> getParametersUncertainlyCauseReplacementIfModified() {
            return this.parametersUncertainlyCauseReplacementIfModified;
        }

        public static final class Builder {
            private java.util.List<String> parametersAllowedToBeModified; 
            private java.util.List<String> parametersCauseInterruptionIfModified; 
            private java.util.List<String> parametersCauseReplacementIfModified; 
            private java.util.List<String> parametersConditionallyAllowedToBeModified; 
            private java.util.List<String> parametersConditionallyCauseInterruptionIfModified; 
            private java.util.List<String> parametersConditionallyCauseReplacementIfModified; 
            private java.util.List<String> parametersNotAllowedToBeModified; 
            private java.util.List<String> parametersUncertainlyAllowedToBeModified; 
            private java.util.List<String> parametersUncertainlyCauseInterruptionIfModified; 
            private java.util.List<String> parametersUncertainlyCauseReplacementIfModified; 

            private Builder() {
            } 

            private Builder(DryRunResult model) {
                this.parametersAllowedToBeModified = model.parametersAllowedToBeModified;
                this.parametersCauseInterruptionIfModified = model.parametersCauseInterruptionIfModified;
                this.parametersCauseReplacementIfModified = model.parametersCauseReplacementIfModified;
                this.parametersConditionallyAllowedToBeModified = model.parametersConditionallyAllowedToBeModified;
                this.parametersConditionallyCauseInterruptionIfModified = model.parametersConditionallyCauseInterruptionIfModified;
                this.parametersConditionallyCauseReplacementIfModified = model.parametersConditionallyCauseReplacementIfModified;
                this.parametersNotAllowedToBeModified = model.parametersNotAllowedToBeModified;
                this.parametersUncertainlyAllowedToBeModified = model.parametersUncertainlyAllowedToBeModified;
                this.parametersUncertainlyCauseInterruptionIfModified = model.parametersUncertainlyCauseInterruptionIfModified;
                this.parametersUncertainlyCauseReplacementIfModified = model.parametersUncertainlyCauseReplacementIfModified;
            } 

            /**
             * <p>The parameters that can be modified. If you change only values of the parameters in a stack template and use the template to update the stack, no validation errors are caused.</p>
             */
            public Builder parametersAllowedToBeModified(java.util.List<String> parametersAllowedToBeModified) {
                this.parametersAllowedToBeModified = parametersAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters whose changes cause service interruptions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for a small number of resource types.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersCauseInterruptionIfModified(java.util.List<String> parametersCauseInterruptionIfModified) {
                this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
                return this;
            }

            /**
             * <p>The parameters whose changes trigger replacement updates for resources.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter can be returned only if ReplacementOption is set to Enabled.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersCauseReplacementIfModified(java.util.List<String> parametersCauseReplacementIfModified) {
                this.parametersCauseReplacementIfModified = parametersCauseReplacementIfModified;
                return this;
            }

            /**
             * <p>The parameters that can be modified under specific conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the new values of the parameters determine whether validation errors are caused.</p>
             */
            public Builder parametersConditionallyAllowedToBeModified(java.util.List<String> parametersConditionallyAllowedToBeModified) {
                this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters whose changes cause service interruptions under specific conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for a small number of resource types.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersConditionallyCauseInterruptionIfModified(java.util.List<String> parametersConditionallyCauseInterruptionIfModified) {
                this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
                return this;
            }

            /**
             * <p>The parameters whose changes trigger replacement updates for resources under specific conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter can be returned only if ReplacementOption is set to Enabled.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersConditionallyCauseReplacementIfModified(java.util.List<String> parametersConditionallyCauseReplacementIfModified) {
                this.parametersConditionallyCauseReplacementIfModified = parametersConditionallyCauseReplacementIfModified;
                return this;
            }

            /**
             * <p>The parameters that cannot be modified. If you change only values of the parameters in a stack template and use the template to update the stack, validation errors are caused.</p>
             */
            public Builder parametersNotAllowedToBeModified(java.util.List<String> parametersNotAllowedToBeModified) {
                this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters that can be modified under uncertain conditions. If you change only values of the parameters in a stack template and use the template to update the stack, the actual running environment determines whether validation errors are caused.</p>
             */
            public Builder parametersUncertainlyAllowedToBeModified(java.util.List<String> parametersUncertainlyAllowedToBeModified) {
                this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
                return this;
            }

            /**
             * <p>The parameters whose changes cause service interruptions under uncertain conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for a small number of resource types.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersUncertainlyCauseInterruptionIfModified(java.util.List<String> parametersUncertainlyCauseInterruptionIfModified) {
                this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
                return this;
            }

            /**
             * <p>The parameters whose changes trigger replacement updates for resources under uncertain conditions.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter can be returned only if ReplacementOption is set to Enabled.</li>
             * <li>This parameter is valid only for updates on ROS stacks.</li>
             * </ul>
             * </blockquote>
             */
            public Builder parametersUncertainlyCauseReplacementIfModified(java.util.List<String> parametersUncertainlyCauseReplacementIfModified) {
                this.parametersUncertainlyCauseReplacementIfModified = parametersUncertainlyCauseReplacementIfModified;
                return this;
            }

            public DryRunResult build() {
                return new DryRunResult(this);
            } 

        } 

    }
}
