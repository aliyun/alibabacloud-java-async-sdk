// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeParameterTemplatesResponseBody model) {
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.parameterCount = model.parameterCount;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The database engine that is run on the instance. The value <strong>Redis</strong> is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The major version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The number of parameters that are supported by the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder parameterCount(String parameterCount) {
            this.parameterCount = parameterCount;
            return this;
        }

        /**
         * <p>An array that consists of the details about the parameters returned.</p>
         */
        public Builder parameters(Parameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9DA28D8E-514D-4F12-ADED-70A9C818****</p>
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
        private Boolean forceModify;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private Boolean forceRestart;

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

            private Builder() {
            } 

            private Builder(TemplateRecord model) {
                this.checkingCode = model.checkingCode;
                this.forceModify = model.forceModify;
                this.forceRestart = model.forceRestart;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The valid values of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[yes|no]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>Indicates whether the parameter can be reconfigured. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The parameter can be reconfigured.</li>
             * <li><strong>false</strong>: The parameter cannot be reconfigured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder forceModify(Boolean forceModify) {
                this.forceModify = forceModify;
                return this;
            }

            /**
             * <p>Indicates whether a restart of the instance is required after the parameter is reconfigured. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: After the parameter is reconfigured, you must restart the instance to make the new value of the parameter take effect.</li>
             * <li><strong>false</strong>: After the parameter is reconfigured, the new value of the parameter immediately takes effect. You do not need to restart the instance.</li>
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
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The name of the parameter. For more information about the parameters and the parameter settings, see <a href="https://help.aliyun.com/document_detail/259681.html">Parameters</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>appendonly</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The default value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>yes</p>
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
