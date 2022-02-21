// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupClientRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupClientRequest</p>
 */
public class DeleteBackupClientRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    private DeleteBackupClientRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupClientRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    public static final class Builder extends Request.Builder<DeleteBackupClientRequest, Builder> {
        private String clientId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupClientRequest response) {
            super(response);
            this.clientId = response.clientId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        @Override
        public DeleteBackupClientRequest build() {
            return new DeleteBackupClientRequest(this);
        } 

    } 

}
