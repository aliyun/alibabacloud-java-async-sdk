// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeParametersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersResponseBody</p>
 */
public class DescribeParametersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether a restart is required for changes to the parameter to take effect. Valid values:   </p>
         * <ul>
         * <li>true: A restart is required.   </li>
         * <li>false: A restart is not required.</li>
         * </ul>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The return result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParametersResponseBody build() {
            return new DescribeParametersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParametersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptableValue")
        private java.util.List<String> acceptableValue;

        @com.aliyun.core.annotation.NameInMap("CurrentValue")
        private String currentValue;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedReboot")
        private Boolean needReboot;

        @com.aliyun.core.annotation.NameInMap("Readonly")
        private Boolean readonly;

        @com.aliyun.core.annotation.NameInMap("RejectedValue")
        private java.util.List<String> rejectedValue;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        private Parameters(Builder builder) {
            this.acceptableValue = builder.acceptableValue;
            this.currentValue = builder.currentValue;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.name = builder.name;
            this.needReboot = builder.needReboot;
            this.readonly = builder.readonly;
            this.rejectedValue = builder.rejectedValue;
            this.unit = builder.unit;
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
        public java.util.List<String> getAcceptableValue() {
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
         * @return readonly
         */
        public Boolean getReadonly() {
            return this.readonly;
        }

        /**
         * @return rejectedValue
         */
        public java.util.List<String> getRejectedValue() {
            return this.rejectedValue;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private java.util.List<String> acceptableValue; 
            private String currentValue; 
            private String defaultValue; 
            private String description; 
            private String name; 
            private Boolean needReboot; 
            private Boolean readonly; 
            private java.util.List<String> rejectedValue; 
            private String unit; 
            private String valueType; 

            /**
             * <p>DescribeParameters</p>
             */
            public Builder acceptableValue(java.util.List<String> acceptableValue) {
                this.acceptableValue = acceptableValue;
                return this;
            }

            /**
             * <p>The ID of the OceanBase cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * <pre><code>http(s)://[Endpoint]/?Action=DescribeParameters
             * &amp;InstanceId=ob317v4uif****
             * &amp;Dimension=TENANT
             * &amp;DimensionValue=ob2mr3oae0****
             * &amp;Common request parameters
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>600s</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The description of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeParameters</strong>.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>connect_timeout</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needReboot(Boolean needReboot) {
                this.needReboot = needReboot;
                return this;
            }

            /**
             * <p>参数是否只读</p>
             */
            public Builder readonly(Boolean readonly) {
                this.readonly = readonly;
                return this;
            }

            /**
             * <p>{
             *     &quot;RequestId&quot;: &quot;EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C&quot;,
             *     &quot;Parameters&quot;: [
             *         {
             *             &quot;Description&quot;: &quot;The maximum delay allowed in weak-consistency reads.&quot;,
             *             &quot;ValueType&quot;: &quot;CAPACITY&quot;,
             *             &quot;CurrentValue&quot;: &quot;600&quot;,
             *             &quot;NeedReboot&quot;: false,
             *             &quot;Name&quot;: &quot;connect_timeout&quot;,
             *             &quot;DefaultValue&quot;: &quot;600s&quot;,
             *             &quot;RejectedValue&quot;: [
             *                 &quot;1s&quot;
             *             ],
             *             &quot;AcceptableValue&quot;: [
             *                 &quot;1s&quot;
             *             ]
             *         }
             *     ]
             * }</p>
             */
            public Builder rejectedValue(java.util.List<String> rejectedValue) {
                this.rejectedValue = rejectedValue;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * <p>The invalid value range of the parameter.<br>It is an array with two string elements, which represents a range. The first element represents the minimum value and the second element represents the maximum value.</p>
             * 
             * <strong>example:</strong>
             * <p>CAPACITY</p>
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
