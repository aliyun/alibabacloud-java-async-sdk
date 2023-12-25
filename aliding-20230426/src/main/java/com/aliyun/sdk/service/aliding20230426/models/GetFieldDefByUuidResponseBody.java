// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFieldDefByUuidResponseBody} extends {@link TeaModel}
 *
 * <p>GetFieldDefByUuidResponseBody</p>
 */
public class GetFieldDefByUuidResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private GetFieldDefByUuidResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFieldDefByUuidResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetFieldDefByUuidResponseBody build() {
            return new GetFieldDefByUuidResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Behavior")
        private String behavior;

        @NameInMap("Children")
        private String children;

        @NameInMap("ComponentName")
        private String componentName;

        @NameInMap("FieldId")
        private String fieldId;

        @NameInMap("Label")
        private Object label;

        @NameInMap("Props")
        private Object props;

        @NameInMap("Success")
        private Boolean success;

        private Result(Builder builder) {
            this.behavior = builder.behavior;
            this.children = builder.children;
            this.componentName = builder.componentName;
            this.fieldId = builder.fieldId;
            this.label = builder.label;
            this.props = builder.props;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return behavior
         */
        public String getBehavior() {
            return this.behavior;
        }

        /**
         * @return children
         */
        public String getChildren() {
            return this.children;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return fieldId
         */
        public String getFieldId() {
            return this.fieldId;
        }

        /**
         * @return label
         */
        public Object getLabel() {
            return this.label;
        }

        /**
         * @return props
         */
        public Object getProps() {
            return this.props;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String behavior; 
            private String children; 
            private String componentName; 
            private String fieldId; 
            private Object label; 
            private Object props; 
            private Boolean success; 

            /**
             * Behavior.
             */
            public Builder behavior(String behavior) {
                this.behavior = behavior;
                return this;
            }

            /**
             * Children.
             */
            public Builder children(String children) {
                this.children = children;
                return this;
            }

            /**
             * ComponentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * FieldId.
             */
            public Builder fieldId(String fieldId) {
                this.fieldId = fieldId;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(Object label) {
                this.label = label;
                return this;
            }

            /**
             * Props.
             */
            public Builder props(Object props) {
                this.props = props;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
