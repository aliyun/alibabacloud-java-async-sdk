// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteKeyPairsRequest} extends {@link RequestModel}
 *
 * <p>DeleteKeyPairsRequest</p>
 */
public class DeleteKeyPairsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairIds")
    private java.util.List<String> keyPairIds;

    private DeleteKeyPairsRequest(Builder builder) {
        super(builder);
        this.keyPairIds = builder.keyPairIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKeyPairsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyPairIds
     */
    public java.util.List<String> getKeyPairIds() {
        return this.keyPairIds;
    }

    public static final class Builder extends Request.Builder<DeleteKeyPairsRequest, Builder> {
        private java.util.List<String> keyPairIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKeyPairsRequest request) {
            super(request);
            this.keyPairIds = request.keyPairIds;
        } 

        /**
         * KeyPairIds.
         */
        public Builder keyPairIds(java.util.List<String> keyPairIds) {
            this.putQueryParameter("KeyPairIds", keyPairIds);
            this.keyPairIds = keyPairIds;
            return this;
        }

        @Override
        public DeleteKeyPairsRequest build() {
            return new DeleteKeyPairsRequest(this);
        } 

    } 

}
