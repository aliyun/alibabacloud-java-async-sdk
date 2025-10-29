// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeleteAICPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>DeleteAICPublicKeyRequest</p>
 */
public class DeleteAICPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String keyName;

    private DeleteAICPublicKeyRequest(Builder builder) {
        super(builder);
        this.keyName = builder.keyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAICPublicKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
    }

    public static final class Builder extends Request.Builder<DeleteAICPublicKeyRequest, Builder> {
        private String keyName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAICPublicKeyRequest request) {
            super(request);
            this.keyName = request.keyName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mykey</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        @Override
        public DeleteAICPublicKeyRequest build() {
            return new DeleteAICPublicKeyRequest(this);
        } 

    } 

}
