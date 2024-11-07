// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemovePropertyRequest} extends {@link RequestModel}
 *
 * <p>RemovePropertyRequest</p>
 */
public class RemovePropertyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PropertyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long propertyId;

    private RemovePropertyRequest(Builder builder) {
        super(builder);
        this.propertyId = builder.propertyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePropertyRequest create() {
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

    public static final class Builder extends Request.Builder<RemovePropertyRequest, Builder> {
        private Long propertyId; 

        private Builder() {
            super();
        } 

        private Builder(RemovePropertyRequest request) {
            super(request);
            this.propertyId = request.propertyId;
        } 

        /**
         * <p>The ID of the property. You can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the property ID.</p>
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

        @Override
        public RemovePropertyRequest build() {
            return new RemovePropertyRequest(this);
        } 

    } 

}
