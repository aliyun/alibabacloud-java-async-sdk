// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnSubTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDcdnSubTaskRequest</p>
 */
public class DeleteDcdnSubTaskRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DeleteDcdnSubTaskRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnSubTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DeleteDcdnSubTaskRequest, Builder> {
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDcdnSubTaskRequest request) {
            super(request);
            this.ownerId = request.ownerId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DeleteDcdnSubTaskRequest build() {
            return new DeleteDcdnSubTaskRequest(this);
        } 

    } 

}
