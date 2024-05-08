// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAliasRequest} extends {@link RequestModel}
 *
 * <p>CreateAliasRequest</p>
 */
public class CreateAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CreateAliasRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.keyId = request.keyId;
        } 

        /**
         * The alias of the CMK.
         * <p>
         * 
         * The alias must be 1 to 255 characters in length and must contain the prefix `alias/`. The alias cannot be prefixed with the reserved word `alias/acs`.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * The ID of the CMK. The ID must be globally unique.
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
