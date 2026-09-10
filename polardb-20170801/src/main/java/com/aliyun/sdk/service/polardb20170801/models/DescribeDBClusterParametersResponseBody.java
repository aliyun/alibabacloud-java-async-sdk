// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClusterParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterParametersResponseBody</p>
 */
public class DescribeDBClusterParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("ParameterNumbers")
    private String parameterNumbers;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningParameters")
    private RunningParameters runningParameters;

    private DescribeDBClusterParametersResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.engine = builder.engine;
        this.parameterNumbers = builder.parameterNumbers;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
        this.runningParameters = builder.runningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterParametersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return parameterNumbers
     */
    public String getParameterNumbers() {
        return this.parameterNumbers;
    }

    /**
     * @return parameters
     */
    public Parameters getParameters() {
        return this.parameters;
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
        private String DBClusterId; 
        private String DBType; 
        private String DBVersion; 
        private String engine; 
        private String parameterNumbers; 
        private Parameters parameters; 
        private String requestId; 
        private RunningParameters runningParameters; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterParametersResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.engine = model.engine;
            this.parameterNumbers = model.parameterNumbers;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
            this.runningParameters = model.runningParameters;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database type. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The database engine version.
         * Valid values for MySQL:</p>
         * <ul>
         * <li><p><strong>5.6</strong></p>
         * </li>
         * <li><p><strong>5.7</strong></p>
         * </li>
         * <li><p><strong>8.0</strong></p>
         * </li>
         * </ul>
         * <p>Valid values for PostgreSQL:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * </ul>
         * <p>Valid values for Oracle:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The engine.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The number of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder parameterNumbers(String parameterNumbers) {
            this.parameterNumbers = parameterNumbers;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
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

        public DescribeDBClusterParametersResponseBody build() {
            return new DescribeDBClusterParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterParametersResponseBody</p>
     */
    public static class ParametersParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsEqual")
        private String isEqual;

        @com.aliyun.core.annotation.NameInMap("IsInstancePolarDBKey")
        private String isInstancePolarDBKey;

        @com.aliyun.core.annotation.NameInMap("IsInstanceRdsKey")
        private String isInstanceRdsKey;

        @com.aliyun.core.annotation.NameInMap("IsPolarDBKey")
        private String isPolarDBKey;

        @com.aliyun.core.annotation.NameInMap("IsRdsKey")
        private String isRdsKey;

        @com.aliyun.core.annotation.NameInMap("distParameterDescription")
        private String distParameterDescription;

        @com.aliyun.core.annotation.NameInMap("distParameterName")
        private String distParameterName;

        @com.aliyun.core.annotation.NameInMap("distParameterOptional")
        private String distParameterOptional;

        @com.aliyun.core.annotation.NameInMap("distParameterValue")
        private String distParameterValue;

        @com.aliyun.core.annotation.NameInMap("rdsParameterDescription")
        private String rdsParameterDescription;

        @com.aliyun.core.annotation.NameInMap("rdsParameterName")
        private String rdsParameterName;

        @com.aliyun.core.annotation.NameInMap("rdsParameterOptional")
        private String rdsParameterOptional;

        @com.aliyun.core.annotation.NameInMap("rdsParameterValue")
        private String rdsParameterValue;

        private ParametersParameters(Builder builder) {
            this.isEqual = builder.isEqual;
            this.isInstancePolarDBKey = builder.isInstancePolarDBKey;
            this.isInstanceRdsKey = builder.isInstanceRdsKey;
            this.isPolarDBKey = builder.isPolarDBKey;
            this.isRdsKey = builder.isRdsKey;
            this.distParameterDescription = builder.distParameterDescription;
            this.distParameterName = builder.distParameterName;
            this.distParameterOptional = builder.distParameterOptional;
            this.distParameterValue = builder.distParameterValue;
            this.rdsParameterDescription = builder.rdsParameterDescription;
            this.rdsParameterName = builder.rdsParameterName;
            this.rdsParameterOptional = builder.rdsParameterOptional;
            this.rdsParameterValue = builder.rdsParameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParametersParameters create() {
            return builder().build();
        }

        /**
         * @return isEqual
         */
        public String getIsEqual() {
            return this.isEqual;
        }

        /**
         * @return isInstancePolarDBKey
         */
        public String getIsInstancePolarDBKey() {
            return this.isInstancePolarDBKey;
        }

        /**
         * @return isInstanceRdsKey
         */
        public String getIsInstanceRdsKey() {
            return this.isInstanceRdsKey;
        }

        /**
         * @return isPolarDBKey
         */
        public String getIsPolarDBKey() {
            return this.isPolarDBKey;
        }

        /**
         * @return isRdsKey
         */
        public String getIsRdsKey() {
            return this.isRdsKey;
        }

        /**
         * @return distParameterDescription
         */
        public String getDistParameterDescription() {
            return this.distParameterDescription;
        }

        /**
         * @return distParameterName
         */
        public String getDistParameterName() {
            return this.distParameterName;
        }

        /**
         * @return distParameterOptional
         */
        public String getDistParameterOptional() {
            return this.distParameterOptional;
        }

        /**
         * @return distParameterValue
         */
        public String getDistParameterValue() {
            return this.distParameterValue;
        }

        /**
         * @return rdsParameterDescription
         */
        public String getRdsParameterDescription() {
            return this.rdsParameterDescription;
        }

        /**
         * @return rdsParameterName
         */
        public String getRdsParameterName() {
            return this.rdsParameterName;
        }

        /**
         * @return rdsParameterOptional
         */
        public String getRdsParameterOptional() {
            return this.rdsParameterOptional;
        }

        /**
         * @return rdsParameterValue
         */
        public String getRdsParameterValue() {
            return this.rdsParameterValue;
        }

        public static final class Builder {
            private String isEqual; 
            private String isInstancePolarDBKey; 
            private String isInstanceRdsKey; 
            private String isPolarDBKey; 
            private String isRdsKey; 
            private String distParameterDescription; 
            private String distParameterName; 
            private String distParameterOptional; 
            private String distParameterValue; 
            private String rdsParameterDescription; 
            private String rdsParameterName; 
            private String rdsParameterOptional; 
            private String rdsParameterValue; 

            private Builder() {
            } 

            private Builder(ParametersParameters model) {
                this.isEqual = model.isEqual;
                this.isInstancePolarDBKey = model.isInstancePolarDBKey;
                this.isInstanceRdsKey = model.isInstanceRdsKey;
                this.isPolarDBKey = model.isPolarDBKey;
                this.isRdsKey = model.isRdsKey;
                this.distParameterDescription = model.distParameterDescription;
                this.distParameterName = model.distParameterName;
                this.distParameterOptional = model.distParameterOptional;
                this.distParameterValue = model.distParameterValue;
                this.rdsParameterDescription = model.rdsParameterDescription;
                this.rdsParameterName = model.rdsParameterName;
                this.rdsParameterOptional = model.rdsParameterOptional;
                this.rdsParameterValue = model.rdsParameterValue;
            } 

            /**
             * IsEqual.
             */
            public Builder isEqual(String isEqual) {
                this.isEqual = isEqual;
                return this;
            }

            /**
             * IsInstancePolarDBKey.
             */
            public Builder isInstancePolarDBKey(String isInstancePolarDBKey) {
                this.isInstancePolarDBKey = isInstancePolarDBKey;
                return this;
            }

            /**
             * IsInstanceRdsKey.
             */
            public Builder isInstanceRdsKey(String isInstanceRdsKey) {
                this.isInstanceRdsKey = isInstanceRdsKey;
                return this;
            }

            /**
             * IsPolarDBKey.
             */
            public Builder isPolarDBKey(String isPolarDBKey) {
                this.isPolarDBKey = isPolarDBKey;
                return this;
            }

            /**
             * IsRdsKey.
             */
            public Builder isRdsKey(String isRdsKey) {
                this.isRdsKey = isRdsKey;
                return this;
            }

            /**
             * distParameterDescription.
             */
            public Builder distParameterDescription(String distParameterDescription) {
                this.distParameterDescription = distParameterDescription;
                return this;
            }

            /**
             * distParameterName.
             */
            public Builder distParameterName(String distParameterName) {
                this.distParameterName = distParameterName;
                return this;
            }

            /**
             * distParameterOptional.
             */
            public Builder distParameterOptional(String distParameterOptional) {
                this.distParameterOptional = distParameterOptional;
                return this;
            }

            /**
             * distParameterValue.
             */
            public Builder distParameterValue(String distParameterValue) {
                this.distParameterValue = distParameterValue;
                return this;
            }

            /**
             * rdsParameterDescription.
             */
            public Builder rdsParameterDescription(String rdsParameterDescription) {
                this.rdsParameterDescription = rdsParameterDescription;
                return this;
            }

            /**
             * rdsParameterName.
             */
            public Builder rdsParameterName(String rdsParameterName) {
                this.rdsParameterName = rdsParameterName;
                return this;
            }

            /**
             * rdsParameterOptional.
             */
            public Builder rdsParameterOptional(String rdsParameterOptional) {
                this.rdsParameterOptional = rdsParameterOptional;
                return this;
            }

            /**
             * rdsParameterValue.
             */
            public Builder rdsParameterValue(String rdsParameterValue) {
                this.rdsParameterValue = rdsParameterValue;
                return this;
            }

            public ParametersParameters build() {
                return new ParametersParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterParametersResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<ParametersParameters> parameters;

        private Parameters(Builder builder) {
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameters
         */
        public java.util.List<ParametersParameters> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private java.util.List<ParametersParameters> parameters; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameters = model.parameters;
            } 

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<ParametersParameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterParametersResponseBody</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DefaultParameterValue")
        private String defaultParameterValue;

        @com.aliyun.core.annotation.NameInMap("Factor")
        private String factor;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private Boolean forceRestart;

        @com.aliyun.core.annotation.NameInMap("IsModifiable")
        private Boolean isModifiable;

        @com.aliyun.core.annotation.NameInMap("IsNodeAvailable")
        private String isNodeAvailable;

        @com.aliyun.core.annotation.NameInMap("ParamRelyRule")
        private String paramRelyRule;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterStatus")
        private String parameterStatus;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameter(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.dataType = builder.dataType;
            this.defaultParameterValue = builder.defaultParameterValue;
            this.factor = builder.factor;
            this.forceRestart = builder.forceRestart;
            this.isModifiable = builder.isModifiable;
            this.isNodeAvailable = builder.isNodeAvailable;
            this.paramRelyRule = builder.paramRelyRule;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterStatus = builder.parameterStatus;
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
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return defaultParameterValue
         */
        public String getDefaultParameterValue() {
            return this.defaultParameterValue;
        }

        /**
         * @return factor
         */
        public String getFactor() {
            return this.factor;
        }

        /**
         * @return forceRestart
         */
        public Boolean getForceRestart() {
            return this.forceRestart;
        }

        /**
         * @return isModifiable
         */
        public Boolean getIsModifiable() {
            return this.isModifiable;
        }

        /**
         * @return isNodeAvailable
         */
        public String getIsNodeAvailable() {
            return this.isNodeAvailable;
        }

        /**
         * @return paramRelyRule
         */
        public String getParamRelyRule() {
            return this.paramRelyRule;
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
         * @return parameterStatus
         */
        public String getParameterStatus() {
            return this.parameterStatus;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String checkingCode; 
            private String dataType; 
            private String defaultParameterValue; 
            private String factor; 
            private Boolean forceRestart; 
            private Boolean isModifiable; 
            private String isNodeAvailable; 
            private String paramRelyRule; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterStatus; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(Parameter model) {
                this.checkingCode = model.checkingCode;
                this.dataType = model.dataType;
                this.defaultParameterValue = model.defaultParameterValue;
                this.factor = model.factor;
                this.forceRestart = model.forceRestart;
                this.isModifiable = model.isModifiable;
                this.isNodeAvailable = model.isNodeAvailable;
                this.paramRelyRule = model.paramRelyRule;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterStatus = model.parameterStatus;
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
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DefaultParameterValue.
             */
            public Builder defaultParameterValue(String defaultParameterValue) {
                this.defaultParameterValue = defaultParameterValue;
                return this;
            }

            /**
             * Factor.
             */
            public Builder factor(String factor) {
                this.factor = factor;
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
             * IsModifiable.
             */
            public Builder isModifiable(Boolean isModifiable) {
                this.isModifiable = isModifiable;
                return this;
            }

            /**
             * IsNodeAvailable.
             */
            public Builder isNodeAvailable(String isNodeAvailable) {
                this.isNodeAvailable = isNodeAvailable;
                return this;
            }

            /**
             * ParamRelyRule.
             */
            public Builder paramRelyRule(String paramRelyRule) {
                this.paramRelyRule = paramRelyRule;
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
             * ParameterStatus.
             */
            public Builder parameterStatus(String parameterStatus) {
                this.parameterStatus = parameterStatus;
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
     * {@link DescribeDBClusterParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterParametersResponseBody</p>
     */
    public static class RunningParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameter")
        private java.util.List<Parameter> parameter;

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
        public java.util.List<Parameter> getParameter() {
            return this.parameter;
        }

        public static final class Builder {
            private java.util.List<Parameter> parameter; 

            private Builder() {
            } 

            private Builder(RunningParameters model) {
                this.parameter = model.parameter;
            } 

            /**
             * Parameter.
             */
            public Builder parameter(java.util.List<Parameter> parameter) {
                this.parameter = parameter;
                return this;
            }

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
}
