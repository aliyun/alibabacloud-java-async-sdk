// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAliasRequest} extends {@link RequestModel}
 *
 * <p>CreateAliasRequest</p>
 */
public class CreateAliasRequest extends Request {
    @Query
    @NameInMap("AliasName")
    @Validation(required = true)
    private String aliasName;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    private CreateAliasRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAliasRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAliasRequest, Builder> {
        private String aliasName; 
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAliasRequest response) {
            super(response);
            this.aliasName = response.aliasName;
            this.keyId = response.keyId;
        } 

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        @Override
        public CreateAliasRequest build() {
            return new CreateAliasRequest(this);
        } 

    } 

}
