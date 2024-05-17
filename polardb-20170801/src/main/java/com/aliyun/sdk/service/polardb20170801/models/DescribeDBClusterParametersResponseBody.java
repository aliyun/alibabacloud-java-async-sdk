// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The database engine that the cluster runs. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **PostgreSQL**
         * *   **Oracle**
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * The version of the database engine. 
         * <p>
         * 
         * - Valid values for the MySQL database engine:    - **5.6**
         *   - **5.7**
         *   - **8.0**
         * - Valid value for the PostgreSQL database engine:    - **11**
         *   - **14**
         * - Valid value for the Oracle database engine: **11**
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * The cluster engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * The number of parameters.
         */
        public Builder parameterNumbers(String parameterNumbers) {
            this.parameterNumbers = parameterNumbers;
            return this;
        }

        /**
         * A comparison between the current parameters of the PolarDB cluster and the parameters of the source RDS instance before migration.
         */
        public Builder parameters(Parameters parameters) {
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

        /**
         * The parameters that are in use.
         */
        public Builder runningParameters(RunningParameters runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }

        public DescribeDBClusterParametersResponseBody build() {
            return new DescribeDBClusterParametersResponseBody(this);
        } 

    } 

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

            /**
             * Indicates whether the source parameters and current parameters have the same value.
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
             * The description of the parameter of the current cluster.
             */
            public Builder distParameterDescription(String distParameterDescription) {
                this.distParameterDescription = distParameterDescription;
                return this;
            }

            /**
             * The name of the parameter of the current cluster.
             */
            public Builder distParameterName(String distParameterName) {
                this.distParameterName = distParameterName;
                return this;
            }

            /**
             * The valid values of the parameter of the current cluster.
             */
            public Builder distParameterOptional(String distParameterOptional) {
                this.distParameterOptional = distParameterOptional;
                return this;
            }

            /**
             * The value of the parameter of the current cluster.
             */
            public Builder distParameterValue(String distParameterValue) {
                this.distParameterValue = distParameterValue;
                return this;
            }

            /**
             * The description of the parameter of the source instance.
             */
            public Builder rdsParameterDescription(String rdsParameterDescription) {
                this.rdsParameterDescription = rdsParameterDescription;
                return this;
            }

            /**
             * The name of the parameter of the source instance.
             */
            public Builder rdsParameterName(String rdsParameterName) {
                this.rdsParameterName = rdsParameterName;
                return this;
            }

            /**
             * The valid values of the parameter of the source instance.
             */
            public Builder rdsParameterOptional(String rdsParameterOptional) {
                this.rdsParameterOptional = rdsParameterOptional;
                return this;
            }

            /**
             * The value of the parameter of the source instance.
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
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List < ParametersParameters> parameters;

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
        public java.util.List < ParametersParameters> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private java.util.List < ParametersParameters> parameters; 

            /**
             * A comparison between the current parameters of the PolarDB cluster and the parameters of the source RDS instance before migration.
             */
            public Builder parameters(java.util.List < ParametersParameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
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

            /**
             * The valid values of the parameter.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * The data type of the parameter value. Valid values:
             * <p>
             * 
             * *   **INT**
             * *   **STRING**
             * *   **B**
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * The default value of the parameter.
             */
            public Builder defaultParameterValue(String defaultParameterValue) {
                this.defaultParameterValue = defaultParameterValue;
                return this;
            }

            /**
             * A divisor of the parameter. For a parameter of the integer or byte type, the valid values must be a multiple of Factor unless you set Factor to 0.
             */
            public Builder factor(String factor) {
                this.factor = factor;
                return this;
            }

            /**
             * Indicates whether a cluster restart is required to allow the parameter modification to take effect. Valid values:
             * <p>
             * 
             * *   **false**
             * *   **true**
             */
            public Builder forceRestart(Boolean forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * Indicates whether the parameter can be modified. Valid values:
             * <p>
             * 
             * *   **false**
             * *   **true**
             */
            public Builder isModifiable(Boolean isModifiable) {
                this.isModifiable = isModifiable;
                return this;
            }

            /**
             * Indicates whether the parameter is a global parameter. Valid values:
             * <p>
             * 
             * *   **0**: yes. The modified parameter value is synchronized to other nodes.
             * *   **1**: no. You can customize the nodes to which the modified parameter value can be synchronized.
             */
            public Builder isNodeAvailable(String isNodeAvailable) {
                this.isNodeAvailable = isNodeAvailable;
                return this;
            }

            /**
             * The dependencies of the parameter.
             */
            public Builder paramRelyRule(String paramRelyRule) {
                this.paramRelyRule = paramRelyRule;
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
             * The status of the parameter. Valid values:
             * <p>
             * 
             * *   **Normal**
             * *   **Modifying**
             */
            public Builder parameterStatus(String parameterStatus) {
                this.parameterStatus = parameterStatus;
                return this;
            }

            /**
             * The value of the parameter.
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
    public static class RunningParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Parameter")
        private java.util.List < Parameter> parameter;

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

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
}
