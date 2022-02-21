// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersResponseBody</p>
 */
public class DescribeParametersResponseBody extends TeaModel {
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeParametersResponseBody(Builder builder) {
        this.parameters = builder.parameters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParametersResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Parameters> parameters; 
        private String requestId; 

        /**
         * 参数列表信息
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParametersResponseBody build() {
            return new DescribeParametersResponseBody(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("AcceptableValue")
        private java.util.List < String > acceptableValue;

        @NameInMap("CurrentValue")
        private String currentValue;

        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeedReboot")
        private Boolean needReboot;

        @NameInMap("RejectedValue")
        private java.util.List < String > rejectedValue;

        @NameInMap("ValueType")
        private String valueType;

        private Parameters(Builder builder) {
            this.acceptableValue = builder.acceptableValue;
            this.currentValue = builder.currentValue;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.name = builder.name;
            this.needReboot = builder.needReboot;
            this.rejectedValue = builder.rejectedValue;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return acceptableValue
         */
        public java.util.List < String > getAcceptableValue() {
            return this.acceptableValue;
        }

        /**
         * @return currentValue
         */
        public String getCurrentValue() {
            return this.currentValue;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needReboot
         */
        public Boolean getNeedReboot() {
            return this.needReboot;
        }

        /**
         * @return rejectedValue
         */
        public java.util.List < String > getRejectedValue() {
            return this.rejectedValue;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private java.util.List < String > acceptableValue; 
            private String currentValue; 
            private String defaultValue; 
            private String description; 
            private String name; 
            private Boolean needReboot; 
            private java.util.List < String > rejectedValue; 
            private String valueType; 

            /**
             * 参数的可接受取值范围。 其格式为具备两个字符串元素的数组类型，表示一个范围值，第一个元素为最小值，第二个元素为最大值。
             */
            public Builder acceptableValue(java.util.List < String > acceptableValue) {
                this.acceptableValue = acceptableValue;
                return this;
            }

            /**
             * 参数的当前取值。
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * 参数的默认取值。
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * 参数的描述信息。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 参数名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 修改此参数是否需要重启 - true：需要重启 - false：不需要重启
             */
            public Builder needReboot(Boolean needReboot) {
                this.needReboot = needReboot;
                return this;
            }

            /**
             * 参数的不允许取值范围。 其格式为具备两个字符串元素的数组类型，表示一个范围值，第一个元素为最小值，第二个元素为最大值。
             */
            public Builder rejectedValue(java.util.List < String > rejectedValue) {
                this.rejectedValue = rejectedValue;
                return this;
            }

            /**
             * 参数取值的类型。 其支持： - ENUM: 数值枚举 - RANGE: 数值范围 - TIME: 时间 - CAPACITY：存储容量值（K，M，G）
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
