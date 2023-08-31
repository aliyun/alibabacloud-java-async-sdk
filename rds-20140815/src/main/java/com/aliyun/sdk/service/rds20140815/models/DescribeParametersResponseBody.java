// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    @NameInMap("ParamGroupInfo")
    private ParamGroupInfo paramGroupInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunningParameters")
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

        /**
         * The list of parameters that are being synchronized.
         * <p>
         * 
         * > After you modify and submit the parameters, you must wait for the parameters to be synchronized to the instance. After the synchronization, you can delete the parameters from the list.
         */
        public Builder configParameters(ConfigParameters configParameters) {
            this.configParameters = configParameters;
            return this;
        }

        /**
         * The type of the database engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * The version of the database engine.
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The information about the parameter template.
         */
        public Builder paramGroupInfo(ParamGroupInfo paramGroupInfo) {
            this.paramGroupInfo = paramGroupInfo;
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
         * The list of parameters that are in use.
         */
        public Builder runningParameters(RunningParameters runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }

        public DescribeParametersResponseBody build() {
            return new DescribeParametersResponseBody(this);
        } 

    } 

    public static class DBInstanceParameter extends TeaModel {
        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValue")
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

            public DBInstanceParameter build() {
                return new DBInstanceParameter(this);
            } 

        } 

    }
    public static class ConfigParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        private java.util.List < DBInstanceParameter> DBInstanceParameter;

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
        public java.util.List < DBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

        public static final class Builder {
            private java.util.List < DBInstanceParameter> DBInstanceParameter; 

            /**
             * DBInstanceParameter.
             */
            public Builder DBInstanceParameter(java.util.List < DBInstanceParameter> DBInstanceParameter) {
                this.DBInstanceParameter = DBInstanceParameter;
                return this;
            }

            public ConfigParameters build() {
                return new ConfigParameters(this);
            } 

        } 

    }
    public static class ParamGroupInfo extends TeaModel {
        @NameInMap("ParamGroupId")
        private String paramGroupId;

        @NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @NameInMap("ParameterGroupType")
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

            /**
             * The ID of the parameter template.
             */
            public Builder paramGroupId(String paramGroupId) {
                this.paramGroupId = paramGroupId;
                return this;
            }

            /**
             * The description of the parameter template.
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * The name of the parameter template.
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * The type of the parameter template.
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
    public static class RunningParametersDBInstanceParameter extends TeaModel {
        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValue")
        private String parameterValue;

        private RunningParametersDBInstanceParameter(Builder builder) {
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningParametersDBInstanceParameter create() {
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

            public RunningParametersDBInstanceParameter build() {
                return new RunningParametersDBInstanceParameter(this);
            } 

        } 

    }
    public static class RunningParameters extends TeaModel {
        @NameInMap("DBInstanceParameter")
        private java.util.List < RunningParametersDBInstanceParameter> DBInstanceParameter;

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
        public java.util.List < RunningParametersDBInstanceParameter> getDBInstanceParameter() {
            return this.DBInstanceParameter;
        }

        public static final class Builder {
            private java.util.List < RunningParametersDBInstanceParameter> DBInstanceParameter; 

            /**
             * DBInstanceParameter.
             */
            public Builder DBInstanceParameter(java.util.List < RunningParametersDBInstanceParameter> DBInstanceParameter) {
                this.DBInstanceParameter = DBInstanceParameter;
                return this;
            }

            public RunningParameters build() {
                return new RunningParameters(this);
            } 

        } 

    }
}
