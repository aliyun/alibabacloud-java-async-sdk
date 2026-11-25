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
 * {@link DescribeDBNodesParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBNodesParametersResponseBody</p>
 */
public class DescribeDBNodesParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBNodeIds")
    private java.util.List<DBNodeIds> DBNodeIds;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBNodesParametersResponseBody(Builder builder) {
        this.DBNodeIds = builder.DBNodeIds;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.engine = builder.engine;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBNodesParametersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBNodeIds
     */
    public java.util.List<DBNodeIds> getDBNodeIds() {
        return this.DBNodeIds;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DBNodeIds> DBNodeIds; 
        private String DBType; 
        private String DBVersion; 
        private String engine; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBNodesParametersResponseBody model) {
            this.DBNodeIds = model.DBNodeIds;
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.engine = model.engine;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of node IDs.</p>
         */
        public Builder DBNodeIds(java.util.List<DBNodeIds> DBNodeIds) {
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * <p>The database type. The value is fixed as <strong>MySQL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The MySQL version. Valid values:</p>
         * <ul>
         * <li><p><strong>5.6</strong></p>
         * </li>
         * <li><p><strong>5.7</strong></p>
         * </li>
         * <li><p><strong>8.0</strong></p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBNodesParametersResponseBody build() {
            return new DescribeDBNodesParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBNodesParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBNodesParametersResponseBody</p>
     */
    public static class RunningParameters extends TeaModel {
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

        private RunningParameters(Builder builder) {
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

            private Builder(RunningParameters model) {
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
             * <p>The value range of the parameter.</p>
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
             * <li><p><strong>INT</strong>: integer</p>
             * </li>
             * <li><p><strong>STRING</strong>: string</p>
             * </li>
             * <li><p><strong>B</strong>: byte</p>
             * </li>
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
             * <p>The divisibility factor. For parameters of the integer and byte types, the parameter value must not only fall within the valid range but also be a multiple of the factor (which cannot be 0).</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder factor(String factor) {
                this.factor = factor;
                return this;
            }

            /**
             * <p>Specifies whether a restart is required for the parameter to take effect. Valid values:</p>
             * <ul>
             * <li><p><strong>false</strong>: no</p>
             * </li>
             * <li><p><strong>true</strong>: yes</p>
             * </li>
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
             * <p>Specifies whether the parameter is modifiable. Valid values:</p>
             * <ul>
             * <li><p><strong>false</strong>: not modifiable</p>
             * </li>
             * <li><p><strong>true</strong>: modifiable</p>
             * </li>
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
             * <p>Specifies whether the parameter is a global parameter. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: The parameter is a global parameter. Parameter modifications have a default application to other nodes and cannot be canceled.</p>
             * </li>
             * <li><p><strong>1</strong>: The parameter is not a global parameter. You can specify the nodes to which modifications to this parameter are applied.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isNodeAvailable(String isNodeAvailable) {
                this.isNodeAvailable = isNodeAvailable;
                return this;
            }

            /**
             * <p>The parameter dependency.</p>
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
             * <li><p><strong>normal</strong>: normal</p>
             * </li>
             * <li><p><strong>modifying</strong>: modifying</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
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

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBNodesParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBNodesParametersResponseBody</p>
     */
    public static class DBNodeIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("RunningParameters")
        private java.util.List<RunningParameters> runningParameters;

        private DBNodeIds(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.runningParameters = builder.runningParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodeIds create() {
            return builder().build();
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return runningParameters
         */
        public java.util.List<RunningParameters> getRunningParameters() {
            return this.runningParameters;
        }

        public static final class Builder {
            private String DBNodeId; 
            private java.util.List<RunningParameters> runningParameters; 

            private Builder() {
            } 

            private Builder(DBNodeIds model) {
                this.DBNodeId = model.DBNodeId;
                this.runningParameters = model.runningParameters;
            } 

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp1r4qe3s534*****</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The list of running parameters for the current node.</p>
             */
            public Builder runningParameters(java.util.List<RunningParameters> runningParameters) {
                this.runningParameters = runningParameters;
                return this;
            }

            public DBNodeIds build() {
                return new DBNodeIds(this);
            } 

        } 

    }
}
