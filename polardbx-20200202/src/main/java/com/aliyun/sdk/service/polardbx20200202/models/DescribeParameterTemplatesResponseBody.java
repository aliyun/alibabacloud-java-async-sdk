// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterTemplatesResponseBody</p>
 */
public class DescribeParameterTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("Dynamic")
        private Integer dynamic;

        @com.aliyun.core.annotation.NameInMap("ParameterDescription")
        private String parameterDescription;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        @com.aliyun.core.annotation.NameInMap("Revisable")
        private Integer revisable;

        private Parameters(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.dynamic = builder.dynamic;
            this.parameterDescription = builder.parameterDescription;
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
            this.revisable = builder.revisable;
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
         * @return dynamic
         */
        public Integer getDynamic() {
            return this.dynamic;
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
        public Integer getRevisable() {
            return this.revisable;
        }

        public static final class Builder {
            private String checkingCode; 
            private Integer dynamic; 
            private String parameterDescription; 
            private String parameterName; 
            private String parameterValue; 
            private Integer revisable; 

            /**
             * CheckingCode.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * Dynamic.
             */
            public Builder dynamic(Integer dynamic) {
                this.dynamic = dynamic;
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

            /**
             * Revisable.
             */
            public Builder revisable(Integer revisable) {
                this.revisable = revisable;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ParameterCount")
        private Integer parameterCount;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        private Data(Builder builder) {
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.parameterCount = builder.parameterCount;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
        public Integer getParameterCount() {
            return this.parameterCount;
        }

        /**
         * @return parameters
         */
        public java.util.List < Parameters> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String engine; 
            private String engineVersion; 
            private Integer parameterCount; 
            private java.util.List < Parameters> parameters; 

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
            public Builder parameterCount(Integer parameterCount) {
                this.parameterCount = parameterCount;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
