// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDatabaseInstanceParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseInstanceParametersResponseBody</p>
 */
public class DescribeDatabaseInstanceParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigParameters")
    private java.util.List < ConfigParameters> configParameters;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunningParameters")
    private java.util.List < RunningParameters> runningParameters;

    private DescribeDatabaseInstanceParametersResponseBody(Builder builder) {
        this.configParameters = builder.configParameters;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.requestId = builder.requestId;
        this.runningParameters = builder.runningParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseInstanceParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return configParameters
     */
    public java.util.List < ConfigParameters> getConfigParameters() {
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
    public java.util.List < RunningParameters> getRunningParameters() {
        return this.runningParameters;
    }

    public static final class Builder {
        private java.util.List < ConfigParameters> configParameters; 
        private String engine; 
        private String engineVersion; 
        private String requestId; 
        private java.util.List < RunningParameters> runningParameters; 

        /**
         * <p>The range of ParameterValue.</p>
         * <blockquote>
         * <p>The value of CheckingCode varies based on the value of ParameterName.</p>
         * </blockquote>
         */
        public Builder configParameters(java.util.List < ConfigParameters> configParameters) {
            this.configParameters = configParameters;
            return this;
        }

        /**
         * <p>The database engine that the instance runs. The value must be MySQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The version of the database engine. Valid values:</p>
         * <ul>
         * <li>5.7: MySQL 5.7.</li>
         * <li>8.0: MySQL 8.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5.5</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The range of ParameterValue.</p>
         * <blockquote>
         * <p>The value of CheckingCode varies based on the value of ParameterName.</p>
         * </blockquote>
         */
        public Builder runningParameters(java.util.List < RunningParameters> runningParameters) {
            this.runningParameters = runningParameters;
            return this;
        }

        public DescribeDatabaseInstanceParametersResponseBody build() {
            return new DescribeDatabaseInstanceParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatabaseInstanceParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabaseInstanceParametersResponseBody</p>
     */
    public static class ConfigParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("ForceModify")
        private String forceModify;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private ConfigParameters(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.forceModify = builder.forceModify;
            this.forceRestart = builder.forceRestart;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigParameters create() {
            return builder().build();
        }

        /**
         * @return checkingCode
         */
        public String getCheckingCode() {
            return this.checkingCode;
        }

        /**
         * @return forceModify
         */
        public String getForceModify() {
            return this.forceModify;
        }

        /**
         * @return forceRestart
         */
        public String getForceRestart() {
            return this.forceRestart;
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
            private String forceModify; 
            private String forceRestart; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * <p>The check code that indicates the valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[1-65535]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>Does it support modifying parameter values. Possible values:</p>
             * <ul>
             * <li><p>true:Support modifying parameter values.</p>
             * </li>
             * <li><p>false:Modifying parameter values is not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder forceModify(String forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly restart the instance after parameters are modified. Valid values:</p>
             * <ul>
             * <li>true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.</li>
             * <li>false: does not forcibly restart the instance.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Auto-increment columns are incremented by this</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_increment_increment</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public ConfigParameters build() {
                return new ConfigParameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDatabaseInstanceParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatabaseInstanceParametersResponseBody</p>
     */
    public static class RunningParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("ForceModify")
        private String forceModify;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private RunningParameters(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.forceModify = builder.forceModify;
            this.forceRestart = builder.forceRestart;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
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
         * @return forceModify
         */
        public String getForceModify() {
            return this.forceModify;
        }

        /**
         * @return forceRestart
         */
        public String getForceRestart() {
            return this.forceRestart;
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
            private String forceModify; 
            private String forceRestart; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * <p>The check code that indicates the valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[ON|OFF]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>Does it support modifying parameter values. Possible values:</p>
             * <ul>
             * <li><p>true:Support modifying parameter values.</p>
             * </li>
             * <li><p>false:Modifying parameter values is not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder forceModify(String forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * <p>Specifies whether to forcibly restart the instance after parameters are modified. Valid values:</p>
             * <ul>
             * <li>true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.</li>
             * <li>false: does not forcibly restart the instance.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>When this variable has a value of 1 (the default), the server automatically grants the EXECUTE and ALTER ROUTINE privileges to the creator of a stored routine, if the user cannot already execute and alter or drop the routine. (The ALTER ROUTINE privilege is required to drop the routine.) The server also automatically drops those privileges from the creator when the routine is dropped. If automatic_sp_privileges is 0, the server does not automatically add or drop these privileges.</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>autocommit</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
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
}
