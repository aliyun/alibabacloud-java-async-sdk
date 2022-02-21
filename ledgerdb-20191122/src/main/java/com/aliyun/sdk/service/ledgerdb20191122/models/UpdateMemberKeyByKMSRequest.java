// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMemberKeyByKMSRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemberKeyByKMSRequest</p>
 */
public class UpdateMemberKeyByKMSRequest extends Request {
    @Body
    @NameInMap("KMSKeyId")
    @Validation(required = true)
    private String KMSKeyId;

    @Body
    @NameInMap("KMSKeyVersion")
    private String KMSKeyVersion;

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

    private UpdateMemberKeyByKMSRequest(Builder builder) {
        super(builder);
        this.KMSKeyId = builder.KMSKeyId;
        this.KMSKeyVersion = builder.KMSKeyVersion;
        this.keyType = builder.keyType;
        this.ledgerId = builder.ledgerId;
        this.memberId = builder.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemberKeyByKMSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return KMSKeyVersion
     */
    public String getKMSKeyVersion() {
        return this.KMSKeyVersion;
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

    public static final class Builder extends Request.Builder<UpdateMemberKeyByKMSRequest, Builder> {
        private String KMSKeyId; 
        private String KMSKeyVersion; 
        private String keyType; 
        private String ledgerId; 
        private String memberId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemberKeyByKMSRequest response) {
            super(response);
            this.KMSKeyId = response.KMSKeyId;
            this.KMSKeyVersion = response.KMSKeyVersion;
            this.keyType = response.keyType;
            this.ledgerId = response.ledgerId;
            this.memberId = response.memberId;
        } 

        /**
         * KMSKeyId.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.putBodyParameter("KMSKeyId", KMSKeyId);
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * KMSKeyVersion.
         */
        public Builder KMSKeyVersion(String KMSKeyVersion) {
            this.putBodyParameter("KMSKeyVersion", KMSKeyVersion);
            this.KMSKeyVersion = KMSKeyVersion;
            return this;
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

        @Override
        public UpdateMemberKeyByKMSRequest build() {
            return new UpdateMemberKeyByKMSRequest(this);
        } 

    } 

}
