// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @com.aliyun.core.annotation.NameInMap("ParamGroupInfo")
    private ParamGroupInfo paramGroupInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningParameters")
    private RunningParameters runningParameters;

    private DescribeParametersResponseBody(Builder builder) {
        this.configParameters = builder.configParameters;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.paramGroupInfo = builder.paramGroupInfo;
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
     * @return paramGroupInfo
     */
    public ParamGroupInfo getParamGroupInfo() {
        return this.paramGroupInfo;
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
        private ParamGroupInfo paramGroupInfo; 
        private String requestId; 
        private RunningParameters runningParameters; 

        private Builder() {
        } 

        private Builder(DescribeParametersResponseBody model) {
            this.configParameters = model.configParameters;
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.paramGroupInfo = model.paramGroupInfo;
            this.requestId = model.requestId;
            this.runningParameters = model.runningParameters;
        } 

        /**
         * <p>The list of parameters that are being synchronized.</p>
         * <blockquote>
         * <p>After you modify and submit the parameters, you must wait for the parameters to be synchronized to the instance. After the synchronization, you can delete the parameters from the list.</p>
         * </blockquote>
         */
        public Builder configParameters(ConfigParameters configParameters) {
            this.configParameters = configParameters;
            return this;
        }

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The version of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>5.5</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The information about the parameter template.</p>
         */
        public Builder paramGroupInfo(ParamGroupInfo paramGroupInfo) {
            this.paramGroupInfo = paramGroupInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The parameters that are in use.</p>
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
    public static class DBInstanceParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private DBInstanceParameter(Builder builder) {
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceParameter create() {
            return builder().build();
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
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(DBInstanceParameter model) {
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>This parameter sets the default fill factor value at the server scope. A fill factor is provided to optimize index data storage and performance.</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>fill factor</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public DBInstanceParameter build() {
                return new DBInstanceParameter(this);
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
        @com.aliyun.core.annotation.NameInMap("DBInstanceParameter")
        private java.util.List<DBInstanceParameter> DBInstanceParameter;

        private ConfigParameters(Builder builder) {
            this.DBInstanceParameter = builder.DBInstanceParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigParameters create() {
            return builder().build();
        }

        /**
         * @return DBInstanceParameter
         */
        public java.util.List<DBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

        public static final class Builder {
            private java.util.List<DBInstanceParameter> DBInstanceParameter; 

            private Builder() {
            } 

            private Builder(ConfigParameters model) {
                this.DBInstanceParameter = model.DBInstanceParameter;
            } 

            /**
             * DBInstanceParameter.
             */
            public Builder DBInstanceParameter(java.util.List<DBInstanceParameter> DBInstanceParameter) {
                this.DBInstanceParameter = DBInstanceParameter;
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
    public static class ParamGroupInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamGroupId")
        private String paramGroupId;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupType")
        private String parameterGroupType;

        private ParamGroupInfo(Builder builder) {
            this.paramGroupId = builder.paramGroupId;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupName = builder.parameterGroupName;
            this.parameterGroupType = builder.parameterGroupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamGroupInfo create() {
            return builder().build();
        }

        /**
         * @return paramGroupId
         */
        public String getParamGroupId() {
            return this.paramGroupId;
        }

        /**
         * @return parameterGroupDesc
         */
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        /**
         * @return parameterGroupName
         */
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        /**
         * @return parameterGroupType
         */
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

        public static final class Builder {
            private String paramGroupId; 
            private String parameterGroupDesc; 
            private String parameterGroupName; 
            private String parameterGroupType; 

            private Builder() {
            } 

            private Builder(ParamGroupInfo model) {
                this.paramGroupId = model.paramGroupId;
                this.parameterGroupDesc = model.parameterGroupDesc;
                this.parameterGroupName = model.parameterGroupName;
                this.parameterGroupType = model.parameterGroupType;
            } 

            /**
             * <p>The ID of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>rpg-sys-01040401010200</p>
             */
            public Builder paramGroupId(String paramGroupId) {
                this.paramGroupId = paramGroupId;
                return this;
            }

            /**
             * <p>The description of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>sync_binlog=1000, innodb_flush_log_at_trx_commit=2, async</p>
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * <p>The name of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_innodb_8.0_basic_normal_high</p>
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * <p>The type of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterGroupType(String parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            public ParamGroupInfo build() {
                return new ParamGroupInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersResponseBody</p>
     */
    public static class RunningParametersDBInstanceParameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterDefaultValue")
        private String parameterDefaultValue;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        @com.aliyun.core.annotation.NameInMap("ParameterValueRange")
        private String parameterValueRange;

        private RunningParametersDBInstanceParameter(Builder builder) {
            this.parameterDefaultValue = builder.parameterDefaultValue;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
            this.parameterValueRange = builder.parameterValueRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningParametersDBInstanceParameter create() {
            return builder().build();
        }

        /**
         * @return parameterDefaultValue
         */
        public String getParameterDefaultValue() {
            return this.parameterDefaultValue;
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

        /**
         * @return parameterValueRange
         */
        public String getParameterValueRange() {
            return this.parameterValueRange;
        }

        public static final class Builder {
            private String parameterDefaultValue; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 
            private String parameterValueRange; 

            private Builder() {
            } 

            private Builder(RunningParametersDBInstanceParameter model) {
                this.parameterDefaultValue = model.parameterDefaultValue;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
                this.parameterValueRange = model.parameterValueRange;
            } 

            /**
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder parameterDefaultValue(String parameterDefaultValue) {
                this.parameterDefaultValue = parameterDefaultValue;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>This parameter sets the default fill factor value at the server scope. A fill factor is provided to optimize index data storage and performance.</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>fill factor</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            /**
             * <p>The valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1~100</p>
             */
            public Builder parameterValueRange(String parameterValueRange) {
                this.parameterValueRange = parameterValueRange;
                return this;
            }

            public RunningParametersDBInstanceParameter build() {
                return new RunningParametersDBInstanceParameter(this);
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
        @com.aliyun.core.annotation.NameInMap("DBInstanceParameter")
        private java.util.List<RunningParametersDBInstanceParameter> DBInstanceParameter;

        private RunningParameters(Builder builder) {
            this.DBInstanceParameter = builder.DBInstanceParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningParameters create() {
            return builder().build();
        }

        /**
         * @return DBInstanceParameter
         */
        public java.util.List<RunningParametersDBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

        public static final class Builder {
            private java.util.List<RunningParametersDBInstanceParameter> DBInstanceParameter; 

            private Builder() {
            } 

            private Builder(RunningParameters model) {
                this.DBInstanceParameter = model.DBInstanceParameter;
            } 

            /**
             * DBInstanceParameter.
             */
            public Builder DBInstanceParameter(java.util.List<RunningParametersDBInstanceParameter> DBInstanceParameter) {
                this.DBInstanceParameter = DBInstanceParameter;
                return this;
            }

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
}
