// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersResponseBody</p>
 */
public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("ConfigParameters")
    private ConfigParameters configParameters;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("EngineVersion")
    private String engineVersion;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunningParameters")
    private RunningParameters runningParameters;

    private DescribeParametersResponseBody(Builder builder) {
        this.configParameters = builder.configParameters;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.requestId = builder.requestId;
        this.runningParameters = builder.runningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return configParameters
     */
    public ConfigParameters getConfigParameters() {
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
    public RunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public static final class Builder {
        private ConfigParameters configParameters; 
        private String engine; 
        private String engineVersion; 
        private String requestId; 
        private RunningParameters runningParameters; 

        /**
         * ConfigParameters.
         */
        public Builder configParameters(ConfigParameters configParameters) {
            this.configParameters = configParameters;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
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
         * RunningParameters.
         */
        public Builder runningParameters(RunningParameters runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }

        public DescribeParametersResponseBody build() {
            return new DescribeParametersResponseBody(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("CheckingCode")
        private String checkingCode;

        @NameInMap("ForceRestart")
        private Boolean forceRestart;

        @NameInMap("ModifiableStatus")
        private Boolean modifiableStatus;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValue")
        private String parameterValue;

        private Parameter(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.forceRestart = builder.forceRestart;
            this.modifiableStatus = builder.modifiableStatus;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return checkingCode
         */
        public String getCheckingCode() {
            return this.checkingCode;
        }

        /**
         * @return forceRestart
         */
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        /**
         * @return modifiableStatus
         */
        public Boolean getModifiableStatus() {
            return this.modifiableStatus;
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
            private Boolean forceRestart; 
            private Boolean modifiableStatus; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * CheckingCode.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * ForceRestart.
             */
            public Builder forceRestart(Boolean forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * ModifiableStatus.
             */
            public Builder modifiableStatus(Boolean modifiableStatus) {
                this.modifiableStatus = modifiableStatus;
                return this;
            }

            /**
             * ParameterDescription.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
    public static class ConfigParameters extends TeaModel {
        @NameInMap("Parameter")
        private java.util.List < Parameter> parameter;

        private ConfigParameters(Builder builder) {
            this.parameter = builder.parameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigParameters create() {
            return builder().build();
        }

        /**
         * @return parameter
         */
        public java.util.List < Parameter> getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private java.util.List < Parameter> parameter; 

            /**
             * Parameter.
             */
            public Builder parameter(java.util.List < Parameter> parameter) {
                this.parameter = parameter;
                return this;
            }

            public ConfigParameters build() {
                return new ConfigParameters(this);
            } 

        } 

    }
    public static class RunningParametersParameter extends TeaModel {
        @NameInMap("CheckingCode")
        private String checkingCode;

        @NameInMap("ForceRestart")
        private String forceRestart;

        @NameInMap("ModifiableStatus")
        private String modifiableStatus;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValue")
        private String parameterValue;

        private RunningParametersParameter(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.forceRestart = builder.forceRestart;
            this.modifiableStatus = builder.modifiableStatus;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningParametersParameter create() {
            return builder().build();
        }

        /**
         * @return checkingCode
         */
        public String getCheckingCode() {
            return this.checkingCode;
        }

        /**
         * @return forceRestart
         */
        public String getForceRestart() {
            return this.forceRestart;
        }

        /**
         * @return modifiableStatus
         */
        public String getModifiableStatus() {
            return this.modifiableStatus;
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
            private String forceRestart; 
            private String modifiableStatus; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * CheckingCode.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * ForceRestart.
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * ModifiableStatus.
             */
            public Builder modifiableStatus(String modifiableStatus) {
                this.modifiableStatus = modifiableStatus;
                return this;
            }

            /**
             * ParameterDescription.
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public RunningParametersParameter build() {
                return new RunningParametersParameter(this);
            } 

        } 

    }
    public static class RunningParameters extends TeaModel {
        @NameInMap("Parameter")
        private java.util.List < RunningParametersParameter> parameter;

        private RunningParameters(Builder builder) {
            this.parameter = builder.parameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningParameters create() {
            return builder().build();
        }

        /**
         * @return parameter
         */
        public java.util.List < RunningParametersParameter> getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private java.util.List < RunningParametersParameter> parameter; 

            /**
             * Parameter.
             */
            public Builder parameter(java.util.List < RunningParametersParameter> parameter) {
                this.parameter = parameter;
                return this;
            }

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
}
