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
