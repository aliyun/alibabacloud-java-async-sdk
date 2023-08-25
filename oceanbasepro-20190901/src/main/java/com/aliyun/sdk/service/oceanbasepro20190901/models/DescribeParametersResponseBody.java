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
         * Indicates whether a restart is required for changes to the parameter to take effect. Valid values:   
         * <p>
         * - true: A restart is required.   
         * - false: A restart is not required.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The return result of the request.
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

        @NameInMap("Readonly")
        private Boolean readonly;

        @NameInMap("RejectedValue")
        private java.util.List < String > rejectedValue;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("ValueType")
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
         * @return readonly
         */
        public Boolean getReadonly() {
            return this.readonly;
        }

        /**
         * @return rejectedValue
         */
        public java.util.List < String > getRejectedValue() {
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
            private java.util.List < String > acceptableValue; 
            private String currentValue; 
            private String defaultValue; 
            private String description; 
            private String name; 
            private Boolean needReboot; 
            private Boolean readonly; 
            private java.util.List < String > rejectedValue; 
            private String unit; 
            private String valueType; 

            /**
             * DescribeParameters
             */
            public Builder acceptableValue(java.util.List < String > acceptableValue) {
                this.acceptableValue = acceptableValue;
                return this;
            }

            /**
             * The ID of the OceanBase cluster.
             */
            public Builder currentValue(String currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * ```
             * <p>
             * http(s)://[Endpoint]/?Action=DescribeParameters
             * &InstanceId=ob317v4uif****
             * &Dimension=TENANT
             * &DimensionValue=ob2mr3oae0****
             * &Common request parameters
             * ```
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The description of the parameter.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder needReboot(Boolean needReboot) {
                this.needReboot = needReboot;
                return this;
            }

            /**
             * 参数是否只读
             */
            public Builder readonly(Boolean readonly) {
                this.readonly = readonly;
                return this;
            }

            /**
             * {
             * <p>
             *     "RequestId": "EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C",
             *     "Parameters": [
             *         {
             *             "Description": "The maximum delay allowed in weak-consistency reads.",
             *             "ValueType": "CAPACITY",
             *             "CurrentValue": "600",
             *             "NeedReboot": false,
             *             "Name": "connect_timeout",
             *             "DefaultValue": "600s",
             *             "RejectedValue": [
             *                 "1s"
             *             ],
             *             "AcceptableValue": [
             *                 "1s"
             *             ]
             *         }
             *     ]
             * }
             */
            public Builder rejectedValue(java.util.List < String > rejectedValue) {
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
             * The invalid value range of the parameter.    
             * <p>
             * It is an array with two string elements, which represents a range. The first element represents the minimum value and the second element represents the maximum value.
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
