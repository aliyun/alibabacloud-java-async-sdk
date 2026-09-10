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
 * {@link DescribeParameterTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterTemplatesResponseBody</p>
 */
public class DescribeParameterTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("ParameterCount")
    private String parameterCount;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private Parameters parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterTemplatesResponseBody(Builder builder) {
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.engine = builder.engine;
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

    public Builder toBuilder() {
        return new Builder(this);
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
        private String DBType; 
        private String DBVersion; 
        private String engine; 
        private String parameterCount; 
        private Parameters parameters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeParameterTemplatesResponseBody model) {
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.engine = model.engine;
            this.parameterCount = model.parameterCount;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The database engine.</p>
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
         * <p>183</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D963934D-8605-4473-8EAC-54C719******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterTemplatesResponseBody build() {
            return new DescribeParameterTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterTemplatesResponseBody</p>
     */
    public static class TemplateRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("ForceModify")
        private String forceModify;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("IsNodeAvailable")
        private String isNodeAvailable;

        @com.aliyun.core.annotation.NameInMap("ParamRelyRule")
        private String paramRelyRule;

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
            this.isNodeAvailable = builder.isNodeAvailable;
            this.paramRelyRule = builder.paramRelyRule;
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
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String checkingCode; 
            private String forceModify; 
            private String forceRestart; 
            private String isNodeAvailable; 
            private String paramRelyRule; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(TemplateRecord model) {
                this.checkingCode = model.checkingCode;
                this.forceModify = model.forceModify;
                this.forceRestart = model.forceRestart;
                this.isNodeAvailable = model.isNodeAvailable;
                this.paramRelyRule = model.paramRelyRule;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

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
            public Builder forceModify(String forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * ForceRestart.
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * IsNodeAvailable.
             */
            public Builder isNodeAvailable(String isNodeAvailable) {
                this.isNodeAvailable = isNodeAvailable;
                return this;
            }

            /**
             * ParamRelyRule.
             */
            public Builder paramRelyRule(String paramRelyRule) {
                this.paramRelyRule = paramRelyRule;
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
    /**
     * 
     * {@link DescribeParameterTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterTemplatesResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TemplateRecord")
        private java.util.List<TemplateRecord> templateRecord;

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
        public java.util.List<TemplateRecord> getTemplateRecord() {
            return this.templateRecord;
        }

        public static final class Builder {
            private java.util.List<TemplateRecord> templateRecord; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.templateRecord = model.templateRecord;
            } 

            /**
             * TemplateRecord.
             */
            public Builder templateRecord(java.util.List<TemplateRecord> templateRecord) {
                this.templateRecord = templateRecord;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
