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
 * {@link DescribeLakebaseMountParameterTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLakebaseMountParameterTemplateListResponseBody</p>
 */
public class DescribeLakebaseMountParameterTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLakebaseMountParameterTemplateListResponseBody(Builder builder) {
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLakebaseMountParameterTemplateListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private java.util.List<Parameters> parameters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLakebaseMountParameterTemplateListResponseBody model) {
            this.parameters = model.parameters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of parameter templates.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F45FFACC-xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLakebaseMountParameterTemplateListResponseBody build() {
            return new DescribeLakebaseMountParameterTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLakebaseMountParameterTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLakebaseMountParameterTemplateListResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("IsDynamic")
        private String isDynamic;

        @com.aliyun.core.annotation.NameInMap("IsUserChangeable")
        private String isUserChangeable;

        @com.aliyun.core.annotation.NameInMap("Optional")
        private String optional;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Parameters(Builder builder) {
            this.comment = builder.comment;
            this.defaultValue = builder.defaultValue;
            this.isDynamic = builder.isDynamic;
            this.isUserChangeable = builder.isUserChangeable;
            this.optional = builder.optional;
            this.parameterName = builder.parameterName;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return isDynamic
         */
        public String getIsDynamic() {
            return this.isDynamic;
        }

        /**
         * @return isUserChangeable
         */
        public String getIsUserChangeable() {
            return this.isUserChangeable;
        }

        /**
         * @return optional
         */
        public String getOptional() {
            return this.optional;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String comment; 
            private String defaultValue; 
            private String isDynamic; 
            private String isUserChangeable; 
            private String optional; 
            private String parameterName; 
            private String unit; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.comment = model.comment;
                this.defaultValue = model.defaultValue;
                this.isDynamic = model.isDynamic;
                this.isUserChangeable = model.isUserChangeable;
                this.optional = model.optional;
                this.parameterName = model.parameterName;
                this.unit = model.unit;
            } 

            /**
             * <p>The parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>Auto-increment offset</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>Indicates whether the parameter takes effect dynamically. Valid values:</p>
             * <ul>
             * <li>1: Yes.</li>
             * <li>0: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDynamic(String isDynamic) {
                this.isDynamic = isDynamic;
                return this;
            }

            /**
             * <p>Indicates whether users are allowed to modify the parameter. Valid values:</p>
             * <ul>
             * <li>1: Yes.</li>
             * <li>0: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isUserChangeable(String isUserChangeable) {
                this.isUserChangeable = isUserChangeable;
                return this;
            }

            /**
             * <p>The value range or enumerated values, such as [0-3600].</p>
             * 
             * <strong>example:</strong>
             * <p>[0-3600]</p>
             */
            public Builder optional(String optional) {
                this.optional = optional;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>auto_increment_offset</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The unit.</p>
             * 
             * <strong>example:</strong>
             * <p>s</p>
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
