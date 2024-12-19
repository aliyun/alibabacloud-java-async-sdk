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

        /**
         * <p>The IDs of the nodes.</p>
         */
        public Builder DBNodeIds(java.util.List<DBNodeIds> DBNodeIds) {
            this.DBNodeIds = DBNodeIds;
            return this;
        }

        /**
         * <p>The type of the database engine. Set the value to <strong>MySQL</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The version of the MySQL database engine. Valid values:</p>
         * <ul>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>8.0</strong></li>
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
             * <p>Indicates whether a cluster restart is required to allow the parameter modification to take effect. Valid values:</p>
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
             * <li><strong>0</strong>: yes. The modified parameter value is synchronized to other nodes.</li>
             * <li><strong>1</strong>: no. You can customize the nodes to which the modified parameter value can be synchronized to.</li>
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
             * <li><strong>normal</strong></li>
             * <li><strong>modifying</strong></li>
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

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp1r4qe3s534*****</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The parameters of the current node.</p>
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
