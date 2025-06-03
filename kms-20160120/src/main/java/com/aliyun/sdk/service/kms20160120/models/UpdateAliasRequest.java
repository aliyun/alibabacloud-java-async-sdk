// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link UpdateAliasRequest} extends {@link RequestModel}
 *
 * <p>UpdateAliasRequest</p>
 */
public class UpdateAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    private UpdateAliasRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAliasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    public static final class Builder extends Request.Builder<UpdateAliasRequest, Builder> {
        private String aliasName; 
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAliasRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.keyId = request.keyId;
        } 

        /**
         * <p>The alias that you want to bind.</p>
         * <p>The value must be 1 to 255 characters in length and must include the alias/ prefix.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alias/example</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        @Override
        public UpdateAliasRequest build() {
            return new UpdateAliasRequest(this);
        } 

    } 

}
