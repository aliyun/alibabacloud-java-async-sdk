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
 * {@link DescribeParameterGroupTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupTemplateListResponseBody</p>
 */
public class DescribeParameterGroupTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterGroupTemplateListResponseBody(Builder builder) {
        this.engineVersion = builder.engineVersion;
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupTemplateListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String engineVersion; 
        private java.util.List<Parameters> parameters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeParameterGroupTemplateListResponseBody model) {
            this.engineVersion = model.engineVersion;
            this.parameters = model.parameters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The compatible version.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The list of parameter details.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5D622714-AEDD-4609-9167-F5DDD3D1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterGroupTemplateListResponseBody build() {
            return new DescribeParameterGroupTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterGroupTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupTemplateListResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("Effective")
        private Long effective;

        @com.aliyun.core.annotation.NameInMap("Factor")
        private Long factor;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        @com.aliyun.core.annotation.NameInMap("Revisable")
        private Long revisable;

        @com.aliyun.core.annotation.NameInMap("SupportModifyForMinorVersion")
        private Boolean supportModifyForMinorVersion;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Parameters(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.effective = builder.effective;
            this.factor = builder.factor;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
            this.revisable = builder.revisable;
            this.supportModifyForMinorVersion = builder.supportModifyForMinorVersion;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return checkingCode
         */
        public String getCheckingCode() {
            return this.checkingCode;
        }

        /**
         * @return effective
         */
        public Long getEffective() {
            return this.effective;
        }

        /**
         * @return factor
         */
        public Long getFactor() {
            return this.factor;
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
         * @return revisable
         */
        public Long getRevisable() {
            return this.revisable;
        }

        /**
         * @return supportModifyForMinorVersion
         */
        public Boolean getSupportModifyForMinorVersion() {
            return this.supportModifyForMinorVersion;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String checkingCode; 
            private Long effective; 
            private Long factor; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 
            private Long revisable; 
            private Boolean supportModifyForMinorVersion; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.checkingCode = model.checkingCode;
                this.effective = model.effective;
                this.factor = model.factor;
                this.parameterDescription = model.parameterDescription;
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
                this.revisable = model.revisable;
                this.supportModifyForMinorVersion = model.supportModifyForMinorVersion;
                this.unit = model.unit;
            } 

            /**
             * <p>The value range of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[0|1]</p>
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * <p>Indicates whether the parameter has taken effect. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No.</li>
             * <li><strong>1</strong>: Yes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder effective(Long effective) {
                this.effective = effective;
                return this;
            }

            /**
             * <p>The divisor factor. For integer and byte type parameters, the parameter value must not only fall within the valid range but also be a multiple of Factor (when Factor is not 0).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder factor(Long factor) {
                this.factor = factor;
                return this;
            }

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable AOF persistence mode</p>
             */
            public Builder parameterDescription(String parameterDescription) {
                this.parameterDescription = parameterDescription;
                return this;
            }

            /**
             * <p>The parameter name.</p>
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
             * <p>10</p>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter can be modified. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The parameter cannot be modified.</li>
             * <li><strong>1</strong>: The parameter can be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder revisable(Long revisable) {
                this.revisable = revisable;
                return this;
            }

            /**
             * <p>Indicates whether modification for minor versions is supported. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Supported.</li>
             * <li><strong>false</strong>: Not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportModifyForMinorVersion(Boolean supportModifyForMinorVersion) {
                this.supportModifyForMinorVersion = supportModifyForMinorVersion;
                return this;
            }

            /**
             * <p>The unit of the parameter value. Valid values:</p>
             * <ul>
             * <li><strong>INT</strong>: a common integer.</li>
             * <li><strong>STRING</strong>: a fixed string.</li>
             * <li><strong>B</strong>: bytes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STRING</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
