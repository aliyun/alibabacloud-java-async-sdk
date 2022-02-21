// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptMemberRequest} extends {@link RequestModel}
 *
 * <p>AcceptMemberRequest</p>
 */
public class AcceptMemberRequest extends Request {
    @Body
    @NameInMap("KeyType")
    private String keyType;

    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Body
    @NameInMap("PublicKey")
    private String publicKey;

    private AcceptMemberRequest(Builder builder) {
        super(builder);
        this.keyType = builder.keyType;
        this.ledgerId = builder.ledgerId;
        this.publicKey = builder.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptMemberRequest create() {
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
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    public static final class Builder extends Request.Builder<AcceptMemberRequest, Builder> {
        private String keyType; 
        private String ledgerId; 
        private String publicKey; 

        private Builder() {
            super();
        } 

        private Builder(AcceptMemberRequest response) {
            super(response);
            this.keyType = response.keyType;
            this.ledgerId = response.ledgerId;
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
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.putBodyParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        @Override
        public AcceptMemberRequest build() {
            return new AcceptMemberRequest(this);
        } 

    } 

}
