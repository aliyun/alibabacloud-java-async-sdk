// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSystemParametersResponseBody</p>
 */
public class DescribeSystemParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemParameters")
    private SystemParameters systemParameters;

    private DescribeSystemParametersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemParameters = builder.systemParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSystemParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemParameters
     */
    public SystemParameters getSystemParameters() {
        return this.systemParameters;
    }

    public static final class Builder {
        private String requestId; 
        private SystemParameters systemParameters; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SystemParameters.
         */
        public Builder systemParameters(SystemParameters systemParameters) {
            this.systemParameters = systemParameters;
            return this;
        }

        public DescribeSystemParametersResponseBody build() {
            return new DescribeSystemParametersResponseBody(this);
        } 

    } 

    public static class SystemParameter extends TeaModel {
        @NameInMap("DemoValue")
        private String demoValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamType")
        private String paramType;

        private SystemParameter(Builder builder) {
            this.demoValue = builder.demoValue;
            this.description = builder.description;
            this.paramName = builder.paramName;
            this.paramType = builder.paramType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParameter create() {
            return builder().build();
        }

        /**
         * @return demoValue
         */
        public String getDemoValue() {
            return this.demoValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        public static final class Builder {
            private String demoValue; 
            private String description; 
            private String paramName; 
            private String paramType; 

            /**
             * DemoValue.
             */
            public Builder demoValue(String demoValue) {
                this.demoValue = demoValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            public SystemParameter build() {
                return new SystemParameter(this);
            } 

        } 

    }
    public static class SystemParameters extends TeaModel {
        @NameInMap("SystemParameter")
        private java.util.List < SystemParameter> systemParameter;

        private SystemParameters(Builder builder) {
            this.systemParameter = builder.systemParameter;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemParameters create() {
            return builder().build();
        }

        /**
         * @return systemParameter
         */
        public java.util.List < SystemParameter> getSystemParameter() {
            return this.systemParameter;
        }

        public static final class Builder {
            private java.util.List < SystemParameter> systemParameter; 

            /**
             * SystemParameter.
             */
            public Builder systemParameter(java.util.List < SystemParameter> systemParameter) {
                this.systemParameter = systemParameter;
                return this;
            }

            public SystemParameters build() {
                return new SystemParameters(this);
            } 

        } 

    }
}
