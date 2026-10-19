// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersResponseBody</p>
 */
public class DescribeParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigParameters")
    private ConfigParameters configParameters;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningParameters")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeParametersResponseBody model) {
            this.configParameters = model.configParameters;
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.requestId = model.requestId;
            this.runningParameters = model.runningParameters;
        } 

        /**
         * ConfigParameters.
         */
        public Builder configParameters(ConfigParameters configParameters) {
            this.configParameters = configParameters;
            return this;
        }

        /**
         * <p>The database engine. Default value: <strong>mongodb</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>mongodb</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3ADD0C7D-2D2A-4F15-88FF-E7AC9B9FDCC8</p>
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

    /**
     * 
     * {@link DescribeParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersResponseBody</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private Boolean forceRestart;

        @com.aliyun.core.annotation.NameInMap("ModifiableStatus")
        private Boolean modifiableStatus;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
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

            private Builder() {
            } 

            private Builder(Parameter model) {
                this.checkingCode = model.checkingCode;
                this.forceRestart = model.forceRestart;
                this.modifiableStatus = model.modifiableStatus;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

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
    /**
     * 
     * {@link DescribeParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersResponseBody</p>
     */
    public static class ConfigParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameter")
        private java.util.List<Parameter> parameter;

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
        public java.util.List<Parameter> getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private java.util.List<Parameter> parameter; 

            private Builder() {
            } 

            private Builder(ConfigParameters model) {
                this.parameter = model.parameter;
            } 

            /**
             * Parameter.
             */
            public Builder parameter(java.util.List<Parameter> parameter) {
                this.parameter = parameter;
                return this;
            }

            public ConfigParameters build() {
                return new ConfigParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersResponseBody</p>
     */
    public static class RunningParametersParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharacterType")
        private String characterType;

        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("ModifiableStatus")
        private String modifiableStatus;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private RunningParametersParameter(Builder builder) {
            this.characterType = builder.characterType;
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
         * @return characterType
         */
        public String getCharacterType() {
            return this.characterType;
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
            private String characterType; 
            private String checkingCode; 
            private String forceRestart; 
            private String modifiableStatus; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(RunningParametersParameter model) {
                this.characterType = model.characterType;
                this.checkingCode = model.checkingCode;
                this.forceRestart = model.forceRestart;
                this.modifiableStatus = model.modifiableStatus;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * CharacterType.
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

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
    /**
     * 
     * {@link DescribeParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersResponseBody</p>
     */
    public static class RunningParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameter")
        private java.util.List<RunningParametersParameter> parameter;

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
        public java.util.List<RunningParametersParameter> getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private java.util.List<RunningParametersParameter> parameter; 

            private Builder() {
            } 

            private Builder(RunningParameters model) {
                this.parameter = model.parameter;
            } 

            /**
             * Parameter.
             */
            public Builder parameter(java.util.List<RunningParametersParameter> parameter) {
                this.parameter = parameter;
                return this;
            }

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
}
