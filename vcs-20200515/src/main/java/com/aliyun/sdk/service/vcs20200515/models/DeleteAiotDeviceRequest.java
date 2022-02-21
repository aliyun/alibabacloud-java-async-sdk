// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAiotDeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAiotDeviceRequest</p>
 */
public class DeleteAiotDeviceRequest extends Request {
    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeleteAiotDeviceRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAiotDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteAiotDeviceRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAiotDeviceRequest response) {
            super(response);
            this.id = response.id;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteAiotDeviceRequest build() {
            return new DeleteAiotDeviceRequest(this);
        } 

    } 

}
