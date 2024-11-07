// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteUserPropertyValueRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserPropertyValueRequest</p>
 */
public class DeleteUserPropertyValueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyValueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyValueId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private DeleteUserPropertyValueRequest(Builder builder) {
        super(builder);
        this.propertyId = builder.propertyId;
        this.propertyValueId = builder.propertyValueId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserPropertyValueRequest create() {
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

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteUserPropertyValueRequest, Builder> {
        private Long propertyId; 
        private Long propertyValueId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserPropertyValueRequest request) {
            super(request);
            this.propertyId = request.propertyId;
            this.propertyValueId = request.propertyValueId;
            this.userId = request.userId;
        } 

        /**
         * <p>The property ID.</p>
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
         * <p>The ID of the property value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>978</p>
         */
        public Builder propertyValueId(Long propertyValueId) {
            this.putBodyParameter("PropertyValueId", propertyValueId);
            this.propertyValueId = propertyValueId;
            return this;
        }

        /**
         * <p>The ID of the convenience user.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteUserPropertyValueRequest build() {
            return new DeleteUserPropertyValueRequest(this);
        } 

    } 

}
