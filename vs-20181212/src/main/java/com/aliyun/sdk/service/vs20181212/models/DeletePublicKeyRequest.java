// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DeletePublicKeyRequest} extends {@link RequestModel}
 *
 * <p>DeletePublicKeyRequest</p>
 */
public class DeletePublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyName;

    private DeletePublicKeyRequest(Builder builder) {
        super(builder);
        this.keyName = builder.keyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePublicKeyRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePublicKeyRequest, Builder> {
        private String keyName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePublicKeyRequest request) {
            super(request);
            this.keyName = request.keyName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>appKey</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
            return this;
        }

        @Override
        public DeletePublicKeyRequest build() {
            return new DeletePublicKeyRequest(this);
        } 

    } 

}
