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
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database engine that the clusters runs. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Oracle</strong></li>
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
         * <p>The version of the database engine. </p>
         * <ul>
         * <li>Valid values for the MySQL database engine:   <ul>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>8.0</strong></li>
         * </ul>
         * </li>
         * <li>Valid value for the PostgreSQL database engine:    <ul>
         * <li><strong>11</strong></li>
         * <li><strong>14</strong></li>
         * </ul>
         * </li>
         * <li>Valid value for the Oracle database engine:  <strong>11</strong></li>
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
         * <p>The cluster engine.</p>
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
         * <p>A comparison of parameters between the source RDS instance and the destination PolarDB cluster.</p>
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The parameters of the PolarDB cluster.</p>
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

            /**
             * <p>Indicates whether the source and current parameters have the same value.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isEqual(String isEqual) {
                this.isEqual = isEqual;
                return this;
            }

            /**
             * <p>Indicate whether the parameter is a primary parameter of the destination cluster. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The parameter is a primary parameter of the destination cluster.</li>
             * <li><strong>0</strong>: The parameter is not a primary parameter of the destination cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isInstancePolarDBKey(String isInstancePolarDBKey) {
                this.isInstancePolarDBKey = isInstancePolarDBKey;
                return this;
            }

            /**
             * <p>Indicate whether the parameter is a primary parameter of the source instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The parameter is a primary parameter of the source instance.</li>
             * <li><strong>0</strong>: The parameter is not a primary parameter of the source instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isInstanceRdsKey(String isInstanceRdsKey) {
                this.isInstanceRdsKey = isInstanceRdsKey;
                return this;
            }

            /**
             * <p>Indicate whether the parameter is a primary parameter of the destination cluster. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The parameter is a primary parameter of the destination cluster.</li>
             * <li><strong>0</strong>: The parameter is not a primary parameter of the destination cluster.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isPolarDBKey(String isPolarDBKey) {
                this.isPolarDBKey = isPolarDBKey;
                return this;
            }

            /**
             * <p>Indicate whether the parameter is a primary parameter of the source instance. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The parameter is a primary parameter of the source instance.</li>
             * <li><strong>0</strong>: The parameter is not a primary parameter of the source instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isRdsKey(String isRdsKey) {
                this.isRdsKey = isRdsKey;
                return this;
            }

            /**
             * <p>The description of the parameter of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>The server&quot;s default character set.</p>
             */
            public Builder distParameterDescription(String distParameterDescription) {
                this.distParameterDescription = distParameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>character_set_server</p>
             */
            public Builder distParameterName(String distParameterName) {
                this.distParameterName = distParameterName;
                return this;
            }

            /**
             * <p>The valid values of the parameter of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>utf8</li>
             * <li>gbk</li>
             * </ul>
             */
            public Builder distParameterOptional(String distParameterOptional) {
                this.distParameterOptional = distParameterOptional;
                return this;
            }

            /**
             * <p>The value of the parameter of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
             */
            public Builder distParameterValue(String distParameterValue) {
                this.distParameterValue = distParameterValue;
                return this;
            }

            /**
             * <p>The description of the parameter of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>The server&quot;s default character set.</p>
             */
            public Builder rdsParameterDescription(String rdsParameterDescription) {
                this.rdsParameterDescription = rdsParameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>character_set_server</p>
             */
            public Builder rdsParameterName(String rdsParameterName) {
                this.rdsParameterName = rdsParameterName;
                return this;
            }

            /**
             * <p>The valid values of the parameter of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>utf8</li>
             * <li>gbk</li>
             * </ul>
             */
            public Builder rdsParameterOptional(String rdsParameterOptional) {
                this.rdsParameterOptional = rdsParameterOptional;
                return this;
            }

            /**
             * <p>The value of the parameter of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
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

            /**
             * <p>A comparison of parameters between the source RDS instance and the destination PolarDB cluster.</p>
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

            /**
             * <p>The valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[utf8|latin1|gbk|utf8mb4]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>The data type of the parameter value. Valid values:</p>
             * <ul>
             * <li><strong>INT</strong></li>
             * <li><strong>STRING</strong></li>
             * <li><strong>B</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INT</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
             */
            public Builder defaultParameterValue(String defaultParameterValue) {
                this.defaultParameterValue = defaultParameterValue;
                return this;
            }

            /**
             * <p>A divisor of the parameter. For a parameter of the integer or byte type, the valid values must be a multiple of Factor unless you set Factor to 0.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder factor(String factor) {
                this.factor = factor;
                return this;
            }

            /**
             * <p>Indicates whether a cluster restart is required for the parameter modification to take effect. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
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
             * <p>Indicates whether the parameter can be modified. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isModifiable(Boolean isModifiable) {
                this.isModifiable = isModifiable;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is a global parameter. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The parameter is a global parameter. The modified parameter value is synchronized to other nodes.</li>
             * <li><strong>1</strong>: The parameter is not a global parameter. You can specify the nodes to which the modified parameter value can be synchronized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isNodeAvailable(String isNodeAvailable) {
                this.isNodeAvailable = isNodeAvailable;
                return this;
            }

            /**
             * <p>The dependencies of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
             */
            public Builder paramRelyRule(String paramRelyRule) {
                this.paramRelyRule = paramRelyRule;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>The server&quot;s default character set.</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>character_set_server</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The status of the parameter. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder parameterStatus(String parameterStatus) {
                this.parameterStatus = parameterStatus;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
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
