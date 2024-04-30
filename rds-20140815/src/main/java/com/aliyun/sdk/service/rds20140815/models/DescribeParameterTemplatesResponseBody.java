// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterTemplatesResponseBody</p>
 */
public class DescribeParameterTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("ParameterCount")
    private String parameterCount;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterTemplatesResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.parameterCount = builder.parameterCount;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterTemplatesResponseBody create() {
        return builder().build();
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
     * @return parameterCount
     */
    public String getParameterCount() {
        return this.parameterCount;
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

    public static final class Builder {
        private String engine; 
        private String engineVersion; 
        private String parameterCount; 
        private Parameters parameters; 
        private String requestId; 

        /**
         * The database engine of the instance.
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
         * The number of parameters.
         */
        public Builder parameterCount(String parameterCount) {
            this.parameterCount = parameterCount;
            return this;
        }

        /**
         * The details of the parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterTemplatesResponseBody build() {
            return new DescribeParameterTemplatesResponseBody(this);
        } 

    } 

    public static class TemplateRecord extends TeaModel {
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

        private TemplateRecord(Builder builder) {
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

        public static TemplateRecord create() {
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
             * The valid values of the parameter.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * Indicates whether the parameter can be modified. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder forceModify(String forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * Indicates whether you must restart the instance for the modifications to take effect. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
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
             * The default value of the parameter.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public TemplateRecord build() {
                return new TemplateRecord(this);
            } 

        } 

    }
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateRecord")
        private java.util.List < TemplateRecord> templateRecord;

        private Parameters(Builder builder) {
            this.templateRecord = builder.templateRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return templateRecord
         */
        public java.util.List < TemplateRecord> getTemplateRecord() {
            return this.templateRecord;
        }

        public static final class Builder {
            private java.util.List < TemplateRecord> templateRecord; 

            /**
             * TemplateRecord.
             */
            public Builder templateRecord(java.util.List < TemplateRecord> templateRecord) {
                this.templateRecord = templateRecord;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
