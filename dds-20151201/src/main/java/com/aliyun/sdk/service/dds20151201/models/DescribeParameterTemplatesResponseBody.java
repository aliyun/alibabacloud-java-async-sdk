// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterTemplatesResponseBody</p>
 */
public class DescribeParameterTemplatesResponseBody extends TeaModel {
    @NameInMap("Engine")
    private String engine;

    @NameInMap("EngineVersion")
    private String engineVersion;

    @NameInMap("ParameterCount")
    private String parameterCount;

    @NameInMap("Parameters")
    private Parameters parameters;

    @NameInMap("RequestId")
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
         * ParameterCount.
         */
        public Builder parameterCount(String parameterCount) {
            this.parameterCount = parameterCount;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("CheckingCode")
        private String checkingCode;

        @NameInMap("ForceModify")
        private Boolean forceModify;

        @NameInMap("ForceRestart")
        private Boolean forceRestart;

        @NameInMap("ParameterDescription")
        private String parameterDescription;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("ParameterValue")
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
        public Boolean getForceModify() {
            return this.forceModify;
        }

        /**
         * @return forceRestart
         */
        public Boolean getForceRestart() {
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
            private Boolean forceModify; 
            private Boolean forceRestart; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            /**
             * CheckingCode.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * ForceModify.
             */
            public Builder forceModify(Boolean forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * ForceRestart.
             */
            public Builder forceRestart(Boolean forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

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

            public TemplateRecord build() {
                return new TemplateRecord(this);
            } 

        } 

    }
    public static class Parameters extends TeaModel {
        @NameInMap("TemplateRecord")
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
