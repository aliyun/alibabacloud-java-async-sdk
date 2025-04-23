// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link UpdatePropertyRequest} extends {@link RequestModel}
 *
 * <p>UpdatePropertyRequest</p>
 */
public class UpdatePropertyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String propertyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyValues")
    private java.util.List<PropertyValues> propertyValues;

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
    public java.util.List<PropertyValues> getPropertyValues() {
        return this.propertyValues;
    }

    public static final class Builder extends Request.Builder<UpdatePropertyRequest, Builder> {
        private Long propertyId; 
        private String propertyKey; 
        private java.util.List<PropertyValues> propertyValues; 

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
         * <p>The ID of the property that you want to modify. You can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the property ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>390</p>
         */
        public Builder propertyId(Long propertyId) {
            this.putBodyParameter("PropertyId", propertyId);
            this.propertyId = propertyId;
            return this;
        }

        /**
         * <p>The new property name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey</p>
         */
        public Builder propertyKey(String propertyKey) {
            this.putBodyParameter("PropertyKey", propertyKey);
            this.propertyKey = propertyKey;
            return this;
        }

        /**
         * <p>The values of property.</p>
         */
        public Builder propertyValues(java.util.List<PropertyValues> propertyValues) {
            this.putBodyParameter("PropertyValues", propertyValues);
            this.propertyValues = propertyValues;
            return this;
        }

        @Override
        public UpdatePropertyRequest build() {
            return new UpdatePropertyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePropertyRequest} extends {@link TeaModel}
     *
     * <p>UpdatePropertyRequest</p>
     */
    public static class PropertyValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyValue")
        private String propertyValue;

        @com.aliyun.core.annotation.NameInMap("PropertyValueId")
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

            private Builder() {
            } 

            private Builder(PropertyValues model) {
                this.propertyValue = model.propertyValue;
                this.propertyValueId = model.propertyValueId;
            } 

            /**
             * <p>The new property value.</p>
             * 
             * <strong>example:</strong>
             * <p>testvalue</p>
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * <p>The ID of property value that you want to modify. You can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the property value ID.</p>
             * 
             * <strong>example:</strong>
             * <p>978</p>
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
