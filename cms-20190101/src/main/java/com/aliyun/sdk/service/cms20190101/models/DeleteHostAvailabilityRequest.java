// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHostAvailabilityRequest} extends {@link RequestModel}
 *
 * <p>DeleteHostAvailabilityRequest</p>
 */
public class DeleteHostAvailabilityRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private java.util.List < Long > id;

    private DeleteHostAvailabilityRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHostAvailabilityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public java.util.List < Long > getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteHostAvailabilityRequest, Builder> {
        private java.util.List < Long > id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHostAvailabilityRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(java.util.List < Long > id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteHostAvailabilityRequest build() {
            return new DeleteHostAvailabilityRequest(this);
        } 

    } 

}
