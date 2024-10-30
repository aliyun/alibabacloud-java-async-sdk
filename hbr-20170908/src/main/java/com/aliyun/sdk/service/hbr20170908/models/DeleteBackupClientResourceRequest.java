// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteBackupClientResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupClientResourceRequest</p>
 */
public class DeleteBackupClientResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIds")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The IDs of HBR clients. The value can be a JSON array that consists of up to 100 client IDs. Separate the IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;c-0007kyu045r0********&quot;, &quot;c-000b6818umvo********&quot;]</p>
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
