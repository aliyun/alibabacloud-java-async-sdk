// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersResponseBody</p>
 */
public class DescribeParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParametersResponseBody(Builder builder) {
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Parameters> parameters; 
        private String requestId; 

        /**
         * The queried configuration parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParametersResponseBody build() {
            return new DescribeParametersResponseBody(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentValue")
        private String currentValue;

        @com.aliyun.core.annotation.NameInMap("ForceRestartInstance")
        private String forceRestartInstance;

        @com.aliyun.core.annotation.NameInMap("IsChangeableConfig")
        private String isChangeableConfig;

        @com.aliyun.core.annotation.NameInMap("OptionalRange")
        private String optionalRange;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.currentValue = builder.currentValue;
            this.forceRestartInstance = builder.forceRestartInstance;
            this.isChangeableConfig = builder.isChangeableConfig;
            this.optionalRange = builder.optionalRange;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return currentValue
         */
        public String getCurrentValue() {
            return this.currentValue;
        }

        /**
         * @return forceRestartInstance
         */
        public String getForceRestartInstance() {
            return this.forceRestartInstance;
        }

        /**
         * @return isChangeableConfig
         */
        public String getIsChangeableConfig() {
            return this.isChangeableConfig;
        }

        /**
         * @return optionalRange
         */
        public String getOptionalRange() {
            return this.optionalRange;
        }

        /**
         * @return parameterDescription
         */
        public String getParameterDescription() {
            return this.parameterDescription;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String currentValue; 
            private String forceRestartInstance; 
            private String isChangeableConfig; 
            private String optionalRange; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * The current value of the configuration parameter.
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * Indicates whether a restart is required for parameter modifications to take effect. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder forceRestartInstance(String forceRestartInstance) {
                this.forceRestartInstance = forceRestartInstance;
                return this;
            }

            /**
             * Indicates whether the configuration parameter can be modified. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isChangeableConfig(String isChangeableConfig) {
                this.isChangeableConfig = isChangeableConfig;
                return this;
            }

            /**
             * The valid values of the configuration parameter.
             */
            public Builder optionalRange(String optionalRange) {
                this.optionalRange = optionalRange;
                return this;
            }

            /**
             * The description of the configuration parameter.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the configuration parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The default value of the configuration parameter.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
