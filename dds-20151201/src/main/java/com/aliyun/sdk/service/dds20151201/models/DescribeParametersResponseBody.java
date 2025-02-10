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
         * <p>The parameter settings in the configuration template.</p>
         */
        public Builder configParameters(ConfigParameters configParameters) {
            this.configParameters = configParameters;
            return this;
        }

        /**
         * <p>The database engine of the instance. Default value: <strong>mongodb</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>mongodb</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version of the instance.</p>
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
         * <p>The settings of the parameters that have taken effect.</p>
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

            /**
             * <p>The valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[0-65536]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>Indicates whether a restart is required for parameter modifications to take effect. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: A restart is not required. Modifications take effect immediately.</li>
             * <li><strong>true</strong>: A restart is required for parameter modifications to take effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder forceRestart(Boolean forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * <p>Indicates whether the parameter value can be modified. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: The parameter value cannot be modified.</li>
             * <li><strong>true</strong>: The parameter value can be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modifiableStatus(Boolean modifiableStatus) {
                this.modifiableStatus = modifiableStatus;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>The threshold in milliseconds at which the database profiler considers a query slow, default is 100.</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>operationProfiling.slowOpThresholdMs</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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

            /**
             * <p>实例的角色类型，取值说明：</p>
             * <ul>
             * <li><strong>db</strong>：shard角色。</li>
             * <li><strong>cs</strong>：config server角色。</li>
             * <li><strong>mongos</strong>：mongos角色。</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>db</p>
             */
            public Builder characterType(String characterType) {
                this.characterType = characterType;
                return this;
            }

            /**
             * <p>The valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[33554432-268435456]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>Indicates whether a restart is required for parameter modifications to take effect. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: A restart is not required. Modifications take effect immediately.</li>
             * <li><strong>true</strong>: A restart is required for parameter modifications to take effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * <p>Indicates whether the parameter value can be modified. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: The parameter value cannot be modified.</li>
             * <li><strong>true</strong>: The parameter value can be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder modifiableStatus(String modifiableStatus) {
                this.modifiableStatus = modifiableStatus;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>The maximum memory bytes that sort stage may use, default is 33554432(i.e. 32MB)</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>setParameter.internalQueryExecMaxBlockingSortBytes</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>33554432</p>
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
