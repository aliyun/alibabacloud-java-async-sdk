// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUsedPropertyValueRequest} extends {@link RequestModel}
 *
 * <p>CheckUsedPropertyValueRequest</p>
 */
public class CheckUsedPropertyValueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyValueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyValueId;

    private CheckUsedPropertyValueRequest(Builder builder) {
        super(builder);
        this.propertyId = builder.propertyId;
        this.propertyValueId = builder.propertyValueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUsedPropertyValueRequest create() {
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
     * @return propertyValueId
     */
    public Long getPropertyValueId() {
        return this.propertyValueId;
    }

    public static final class Builder extends Request.Builder<CheckUsedPropertyValueRequest, Builder> {
        private Long propertyId; 
        private Long propertyValueId; 

        private Builder() {
            super();
        } 

        private Builder(CheckUsedPropertyValueRequest request) {
            super(request);
            this.propertyId = request.propertyId;
            this.propertyValueId = request.propertyValueId;
        } 

        /**
         * The property ID. You can call the [ListProperty](~~ListProperty~~) operation to query property ID.
         */
        public Builder propertyId(Long propertyId) {
            this.putQueryParameter("PropertyId", propertyId);
            this.propertyId = propertyId;
            return this;
        }

        /**
         * The ID of the property value. You can call the [ListProperty](~~ListProperty~~) operation to query the ID of the property value.
         */
        public Builder propertyValueId(Long propertyValueId) {
            this.putQueryParameter("PropertyValueId", propertyValueId);
            this.propertyValueId = propertyValueId;
            return this;
        }

        @Override
        public CheckUsedPropertyValueRequest build() {
            return new CheckUsedPropertyValueRequest(this);
        } 

    } 

}
