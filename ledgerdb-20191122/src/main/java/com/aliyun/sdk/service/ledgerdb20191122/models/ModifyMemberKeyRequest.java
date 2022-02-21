// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMemberKeyRequest} extends {@link RequestModel}
 *
 * <p>ModifyMemberKeyRequest</p>
 */
public class ModifyMemberKeyRequest extends Request {
    @Body
    @NameInMap("KeyType")
    private String keyType;

    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Body
    @NameInMap("MemberId")
    @Validation(required = true)
    private String memberId;

    @Body
    @NameInMap("PublicKey")
    @Validation(required = true)
    private String publicKey;

    private ModifyMemberKeyRequest(Builder builder) {
        super(builder);
        this.keyType = builder.keyType;
        this.ledgerId = builder.ledgerId;
        this.memberId = builder.memberId;
        this.publicKey = builder.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMemberKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return memberId
     */
    public String getMemberId() {
        return this.memberId;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    public static final class Builder extends Request.Builder<ModifyMemberKeyRequest, Builder> {
        private String keyType; 
        private String ledgerId; 
        private String memberId; 
        private String publicKey; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMemberKeyRequest response) {
            super(response);
            this.keyType = response.keyType;
            this.ledgerId = response.ledgerId;
            this.memberId = response.memberId;
            this.publicKey = response.publicKey;
        } 

        /**
         * KeyType.
         */
        public Builder keyType(String keyType) {
            this.putBodyParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putBodyParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.putBodyParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.putBodyParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        @Override
        public ModifyMemberKeyRequest build() {
            return new ModifyMemberKeyRequest(this);
        } 

    } 

}
