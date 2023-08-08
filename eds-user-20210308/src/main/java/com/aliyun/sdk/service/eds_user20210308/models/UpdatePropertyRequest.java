// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePropertyRequest} extends {@link RequestModel}
 *
 * <p>UpdatePropertyRequest</p>
 */
public class UpdatePropertyRequest extends Request {
    @Body
    @NameInMap("PropertyId")
    @Validation(required = true)
    private Long propertyId;

    @Body
    @NameInMap("PropertyKey")
    @Validation(required = true)
    private String propertyKey;

    @Body
    @NameInMap("PropertyValues")
    private java.util.List < PropertyValues> propertyValues;

    private UpdatePropertyRequest(Builder builder) {
        super(builder);
        this.propertyId = builder.propertyId;
        this.propertyKey = builder.propertyKey;
        this.propertyValues = builder.propertyValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return propertyId
     */
    public Long getPropertyId() {
        return this.propertyId;
    }

    /**
     * @return propertyKey
     */
    public String getPropertyKey() {
        return this.propertyKey;
    }

    /**
     * @return propertyValues
     */
    public java.util.List < PropertyValues> getPropertyValues() {
        return this.propertyValues;
    }

    public static final class Builder extends Request.Builder<UpdatePropertyRequest, Builder> {
        private Long propertyId; 
        private String propertyKey; 
        private java.util.List < PropertyValues> propertyValues; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePropertyRequest request) {
            super(request);
            this.propertyId = request.propertyId;
            this.propertyKey = request.propertyKey;
            this.propertyValues = request.propertyValues;
        } 

        /**
         * The operation that you want to perform. Set the value to **UpdateProperty**.
         */
        public Builder propertyId(Long propertyId) {
            this.putBodyParameter("PropertyId", propertyId);
            this.propertyId = propertyId;
            return this;
        }

        /**
         * The property values that failed to be modified.
         */
        public Builder propertyKey(String propertyKey) {
            this.putBodyParameter("PropertyKey", propertyKey);
            this.propertyKey = propertyKey;
            return this;
        }

        /**
         * The new property value N.
         */
        public Builder propertyValues(java.util.List < PropertyValues> propertyValues) {
            this.putBodyParameter("PropertyValues", propertyValues);
            this.propertyValues = propertyValues;
            return this;
        }

        @Override
        public UpdatePropertyRequest build() {
            return new UpdatePropertyRequest(this);
        } 

    } 

    public static class PropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        private String propertyValue;

        @NameInMap("PropertyValueId")
        private Long propertyValueId;

        private PropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        /**
         * @return propertyValueId
         */
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

        public static final class Builder {
            private String propertyValue; 
            private Long propertyValueId; 

            /**
             * The error code.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * The ID of the property that you want to modify. You can call the [ListProperty](~~410890~~) operation to query the property ID.
             */
            public Builder propertyValueId(Long propertyValueId) {
                this.propertyValueId = propertyValueId;
                return this;
            }

            public PropertyValues build() {
                return new PropertyValues(this);
            } 

        } 

    }
}
