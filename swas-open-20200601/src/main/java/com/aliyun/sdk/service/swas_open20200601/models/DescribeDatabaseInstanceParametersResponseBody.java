// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabaseInstanceParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseInstanceParametersResponseBody</p>
 */
public class DescribeDatabaseInstanceParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigParameters")
    private java.util.List < ConfigParameters> configParameters;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningParameters")
    private java.util.List < RunningParameters> runningParameters;

    private DescribeDatabaseInstanceParametersResponseBody(Builder builder) {
        this.configParameters = builder.configParameters;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.requestId = builder.requestId;
        this.runningParameters = builder.runningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstanceParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return configParameters
     */
    public java.util.List < ConfigParameters> getConfigParameters() {
        return this.configParameters;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runningParameters
     */
    public java.util.List < RunningParameters> getRunningParameters() {
        return this.runningParameters;
    }

    public static final class Builder {
        private java.util.List < ConfigParameters> configParameters; 
        private String engine; 
        private String engineVersion; 
        private String requestId; 
        private java.util.List < RunningParameters> runningParameters; 

        /**
         * The range of ParameterValue.
         * <p>
         * 
         * > The value of CheckingCode varies based on the value of ParameterName.
         */
        public Builder configParameters(java.util.List < ConfigParameters> configParameters) {
            this.configParameters = configParameters;
            return this;
        }

        /**
         * The database engine that the instance runs. The value must be MySQL.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * The version of the database engine. Valid values:
         * <p>
         * 
         * *   5.7: MySQL 5.7.
         * *   8.0: MySQL 8.0.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The range of ParameterValue.
         * <p>
         * 
         * > The value of CheckingCode varies based on the value of ParameterName.
         */
        public Builder runningParameters(java.util.List < RunningParameters> runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }

        public DescribeDatabaseInstanceParametersResponseBody build() {
            return new DescribeDatabaseInstanceParametersResponseBody(this);
        } 

    } 

    public static class ConfigParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("ForceModify")
        private String forceModify;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private ConfigParameters(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.forceModify = builder.forceModify;
            this.forceRestart = builder.forceRestart;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigParameters create() {
            return builder().build();
        }

        /**
         * @return checkingCode
         */
        public String getCheckingCode() {
            return this.checkingCode;
        }

        /**
         * @return forceModify
         */
        public String getForceModify() {
            return this.forceModify;
        }

        /**
         * @return forceRestart
         */
        public String getForceRestart() {
            return this.forceRestart;
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
            private String checkingCode; 
            private String forceModify; 
            private String forceRestart; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * The check code that indicates the valid values of the parameter.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * Does it support modifying parameter values. Possible values:
             * <p>
             * 
             * - true:Support modifying parameter values.
             * 
             * - false:Modifying parameter values is not supported.
             */
            public Builder forceModify(String forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * Specifies whether to forcibly restart the instance after parameters are modified. Valid values:
             * <p>
             * 
             * *   true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.
             * *   false: does not forcibly restart the instance.
             * 
             * Default value: false.
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public ConfigParameters build() {
                return new ConfigParameters(this);
            } 

        } 

    }
    public static class RunningParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("ForceModify")
        private String forceModify;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private RunningParameters(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.forceModify = builder.forceModify;
            this.forceRestart = builder.forceRestart;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningParameters create() {
            return builder().build();
        }

        /**
         * @return checkingCode
         */
        public String getCheckingCode() {
            return this.checkingCode;
        }

        /**
         * @return forceModify
         */
        public String getForceModify() {
            return this.forceModify;
        }

        /**
         * @return forceRestart
         */
        public String getForceRestart() {
            return this.forceRestart;
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
            private String checkingCode; 
            private String forceModify; 
            private String forceRestart; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * The check code that indicates the valid values of the parameter.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * Does it support modifying parameter values. Possible values:
             * <p>
             * 
             * - true:Support modifying parameter values.
             * 
             * - false:Modifying parameter values is not supported.
             */
            public Builder forceModify(String forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * Specifies whether to forcibly restart the instance after parameters are modified. Valid values:
             * <p>
             * 
             * *   true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.
             * *   false: does not forcibly restart the instance.
             * 
             * Default value: false.
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
}
