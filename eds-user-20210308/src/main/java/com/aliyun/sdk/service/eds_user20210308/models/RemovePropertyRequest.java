// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePropertyRequest} extends {@link RequestModel}
 *
 * <p>RemovePropertyRequest</p>
 */
public class RemovePropertyRequest extends Request {
    @Body
    @NameInMap("PropertyId")
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

        private Builder(RemovePropertyRequest response) {
            super(response);
            this.propertyId = response.propertyId;
        } 

        /**
         * PropertyId.
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
