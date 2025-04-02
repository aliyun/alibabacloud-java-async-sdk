// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetMultiDimTableAllFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiDimTableAllFieldsResponseBody</p>
 */
public class GetMultiDimTableAllFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("value")
    private java.util.List<Value> value;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetMultiDimTableAllFieldsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.value = builder.value;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiDimTableAllFieldsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public java.util.List<Value> getValue() {
        return this.value;
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
        private java.util.List<Value> value; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetMultiDimTableAllFieldsResponseBody model) {
            this.requestId = model.requestId;
            this.value = model.value;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * value.
         */
        public Builder value(java.util.List<Value> value) {
            this.value = value;
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

        public GetMultiDimTableAllFieldsResponseBody build() {
            return new GetMultiDimTableAllFieldsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiDimTableAllFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiDimTableAllFieldsResponseBody</p>
     */
    public static class Value extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Property")
        private java.util.Map<String, ?> property;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Value(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.property = builder.property;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Value create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return property
         */
        public java.util.Map<String, ?> getProperty() {
            return this.property;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private java.util.Map<String, ?> property; 
            private String type; 

            private Builder() {
            } 

            private Builder(Value model) {
                this.id = model.id;
                this.name = model.name;
                this.property = model.property;
                this.type = model.type;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * Property.
             */
            public Builder property(java.util.Map<String, ?> property) {
                this.property = property;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Value build() {
                return new Value(this);
            } 

        } 

    }
}
