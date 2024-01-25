// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupClientResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupClientResourceRequest</p>
 */
public class DeleteBackupClientResourceRequest extends Request {
    @Query
    @NameInMap("ClientIds")
    @Validation(required = true)
    private java.util.Map < String, ? > clientIds;

    private DeleteBackupClientResourceRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupClientResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIds
     */
    public java.util.Map < String, ? > getClientIds() {
        return this.clientIds;
    }

    public static final class Builder extends Request.Builder<DeleteBackupClientResourceRequest, Builder> {
        private java.util.Map < String, ? > clientIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupClientResourceRequest request) {
            super(request);
            this.clientIds = request.clientIds;
        } 

        /**
         * The IDs of HBR clients. The value can be a JSON array that consists of up to 100 client IDs. Separate the IDs with commas (,).
         */
        public Builder clientIds(java.util.Map < String, ? > clientIds) {
            String clientIdsShrink = shrink(clientIds, "ClientIds", "json");
            this.putQueryParameter("ClientIds", clientIdsShrink);
            this.clientIds = clientIds;
            return this;
        }

        @Override
        public DeleteBackupClientResourceRequest build() {
            return new DeleteBackupClientResourceRequest(this);
        } 

    } 

}
