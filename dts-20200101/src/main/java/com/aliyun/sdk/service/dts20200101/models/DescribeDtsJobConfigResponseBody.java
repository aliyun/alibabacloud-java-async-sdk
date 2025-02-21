// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDtsJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDtsJobConfigResponseBody</p>
 */
public class DescribeDtsJobConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDtsJobConfigResponseBody(Builder builder) {
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsJobConfigResponseBody create() {
        return builder().build();
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

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
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

        public DescribeDtsJobConfigResponseBody build() {
            return new DescribeDtsJobConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDtsJobConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDtsJobConfigResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingCode")
        private String checkingCode;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("Modifiable")
        private String modifiable;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecommendValue")
        private String recommendValue;

        @com.aliyun.core.annotation.NameInMap("RunningValue")
        private String runningValue;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private Integer valueType;

        private Parameters(Builder builder) {
            this.checkingCode = builder.checkingCode;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.forceRestart = builder.forceRestart;
            this.modifiable = builder.modifiable;
            this.module = builder.module;
            this.name = builder.name;
            this.recommendValue = builder.recommendValue;
            this.runningValue = builder.runningValue;
            this.valueType = builder.valueType;
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
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return forceRestart
         */
        public String getForceRestart() {
            return this.forceRestart;
        }

        /**
         * @return modifiable
         */
        public String getModifiable() {
            return this.modifiable;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recommendValue
         */
        public String getRecommendValue() {
            return this.recommendValue;
        }

        /**
         * @return runningValue
         */
        public String getRunningValue() {
            return this.runningValue;
        }

        /**
         * @return valueType
         */
        public Integer getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String checkingCode; 
            private String defaultValue; 
            private String description; 
            private String forceRestart; 
            private String modifiable; 
            private String module; 
            private String name; 
            private String recommendValue; 
            private String runningValue; 
            private Integer valueType; 

            /**
             * CheckingCode.
             */
            public Builder checkingCode(String checkingCode) {
                this.checkingCode = checkingCode;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * ForceRestart.
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * Modifiable.
             */
            public Builder modifiable(String modifiable) {
                this.modifiable = modifiable;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RecommendValue.
             */
            public Builder recommendValue(String recommendValue) {
                this.recommendValue = recommendValue;
                return this;
            }

            /**
             * RunningValue.
             */
            public Builder runningValue(String runningValue) {
                this.runningValue = runningValue;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(Integer valueType) {
                this.valueType = valueType;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
