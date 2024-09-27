// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The queried configuration parameters.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>62506167-D284-562A-B7C2-0A**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParametersResponseBody build() {
            return new DescribeParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersResponseBody</p>
     */
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
             * <p>The current value of the configuration parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10800000</p>
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * <p>Indicates whether a restart is required for parameter modifications to take effect. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceRestartInstance(String forceRestartInstance) {
                this.forceRestartInstance = forceRestartInstance;
                return this;
            }

            /**
             * <p>Indicates whether the configuration parameter can be modified. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isChangeableConfig(String isChangeableConfig) {
                this.isChangeableConfig = isChangeableConfig;
                return this;
            }

            /**
             * <p>The valid values of the configuration parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[0-2147483647]</p>
             */
            public Builder optionalRange(String optionalRange) {
                this.optionalRange = optionalRange;
                return this;
            }

            /**
             * <p>The description of the configuration parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Sets the maximum allowed duration of any statement, A value of 0 turns off the timeout.</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the configuration parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>statement_timeout</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The default value of the configuration parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>10800000</p>
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
