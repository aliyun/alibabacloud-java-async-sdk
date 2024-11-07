// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePropertyRequest} extends {@link RequestModel}
 *
 * <p>CreatePropertyRequest</p>
 */
public class CreatePropertyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String propertyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyValues")
    private java.util.List < String > propertyValues;

    private CreatePropertyRequest(Builder builder) {
        super(builder);
        this.propertyKey = builder.propertyKey;
        this.propertyValues = builder.propertyValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List < String > getPropertyValues() {
        return this.propertyValues;
    }

    public static final class Builder extends Request.Builder<CreatePropertyRequest, Builder> {
        private String propertyKey; 
        private java.util.List < String > propertyValues; 

        private Builder() {
            super();
        } 

        private Builder(CreatePropertyRequest request) {
            super(request);
            this.propertyKey = request.propertyKey;
            this.propertyValues = request.propertyValues;
        } 

        /**
         * <p>The property name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        public Builder propertyKey(String propertyKey) {
            this.putBodyParameter("PropertyKey", propertyKey);
            this.propertyKey = propertyKey;
            return this;
        }

        /**
         * <p>The values of the property. You can specify up to 50 values for a property.</p>
         */
        public Builder propertyValues(java.util.List < String > propertyValues) {
            this.putBodyParameter("PropertyValues", propertyValues);
            this.propertyValues = propertyValues;
            return this;
        }

        @Override
        public CreatePropertyRequest build() {
            return new CreatePropertyRequest(this);
        } 

    } 

}
