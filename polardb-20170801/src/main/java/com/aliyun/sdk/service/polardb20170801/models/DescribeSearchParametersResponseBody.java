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
 * {@link DescribeSearchParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSearchParametersResponseBody</p>
 */
public class DescribeSearchParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningParameters")
    private RunningParameters runningParameters;

    private DescribeSearchParametersResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.DBVersion = builder.DBVersion;
        this.engine = builder.engine;
        this.requestId = builder.requestId;
        this.runningParameters = builder.runningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSearchParametersResponseBody create() {
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

    /**
     * @return runningParameters
     */
    public RunningParameters getRunningParameters() {
        return this.runningParameters;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String DBVersion; 
        private String engine; 
        private String requestId; 
        private RunningParameters runningParameters; 

        private Builder() {
        } 

        private Builder(DescribeSearchParametersResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.DBVersion = model.DBVersion;
            this.engine = model.engine;
            this.requestId = model.requestId;
            this.runningParameters = model.runningParameters;
        } 

        /**
         * <p>The ID of the PolarDB primary cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zex82f527he****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The Search engine version, which is not the MySQL version of the primary cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The type of the Search engine.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_search</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e3a24663-eee5-4009-b635-2e9e8d052e74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The visible parameters and their modification statuses.</p>
         */
        public Builder runningParameters(RunningParameters runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }

        public DescribeSearchParametersResponseBody build() {
            return new DescribeSearchParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSearchParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSearchParametersResponseBody</p>
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
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterStatus = model.parameterStatus;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The value rule of the template, which can be a numeric range, an enumeration, or a regular expression. This rule must be interpreted in combination with the DataType field.</p>
             * 
             * <strong>example:</strong>
             * <p>[true\|false]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>The data type of the parameter value. Valid values: INT, DOUBLE, B/BYTE, MEMORY, PERCENT, TIME, BOOLEAN, and STRING. The MEMORY type supports percentages or capacities with units.</p>
             * 
             * <strong>example:</strong>
             * <p>BOOLEAN</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The default value of the current active template, which is independent of the value modified by the user.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultParameterValue(String defaultParameterValue) {
                this.defaultParameterValue = defaultParameterValue;
                return this;
            }

            /**
             * <p>The divisibility factor. If the value is not zero, the numeric value parsed based on the templatetype must be a multiple of this factor.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder factor(String factor) {
                this.factor = factor;
                return this;
            }

            /**
             * <p>Specifies whether a restart is required for the modification to take effect. The value is true for static parameters and false for dynamic parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceRestart(Boolean forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * <p>Specifies whether the user is allowed to modify the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isModifiable(Boolean isModifiable) {
                this.isModifiable = isModifiable;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Parameter description</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>prometheus.indices</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The modification status of the parameter. A value of Normal indicates that no modifications are pending. A value of Modifying indicates that the modification task is not completed.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder parameterStatus(String parameterStatus) {
                this.parameterStatus = parameterStatus;
                return this;
            }

            /**
             * <p>The configuration value on the control plane. If a modification is in progress, the value to be applied is displayed. This value is not read from the kernel in real time.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
     * {@link DescribeSearchParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSearchParametersResponseBody</p>
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
             * <p>The list of parameters.</p>
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
