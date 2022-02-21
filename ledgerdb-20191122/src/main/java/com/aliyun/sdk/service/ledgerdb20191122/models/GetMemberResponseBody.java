// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMemberResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemberResponseBody</p>
 */
public class GetMemberResponseBody extends TeaModel {
    @NameInMap("AliUid")
    private String aliUid;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("KMSKeyId")
    private String KMSKeyId;

    @NameInMap("KMSKeyVersion")
    private String KMSKeyVersion;

    @NameInMap("KeyMeta")
    private String keyMeta;

    @NameInMap("KeySource")
    private String keySource;

    @NameInMap("KeyType")
    private String keyType;

    @NameInMap("LedgerId")
    private String ledgerId;

    @NameInMap("MemberId")
    private String memberId;

    @NameInMap("PublicKey")
    private String publicKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Role")
    private String role;

    @NameInMap("State")
    private String state;

    @NameInMap("UpdateTime")
    private Long updateTime;

    private GetMemberResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.createTime = builder.createTime;
        this.KMSKeyId = builder.KMSKeyId;
        this.KMSKeyVersion = builder.KMSKeyVersion;
        this.keyMeta = builder.keyMeta;
        this.keySource = builder.keySource;
        this.keyType = builder.keyType;
        this.ledgerId = builder.ledgerId;
        this.memberId = builder.memberId;
        this.publicKey = builder.publicKey;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.state = builder.state;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemberResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
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
     * @return keyMeta
     */
    public String getKeyMeta() {
        return this.keyMeta;
    }

    /**
     * @return keySource
     */
    public String getKeySource() {
        return this.keySource;
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String aliUid; 
        private Long createTime; 
        private String KMSKeyId; 
        private String KMSKeyVersion; 
        private String keyMeta; 
        private String keySource; 
        private String keyType; 
        private String ledgerId; 
        private String memberId; 
        private String publicKey; 
        private String requestId; 
        private String role; 
        private String state; 
        private Long updateTime; 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * KMSKeyId.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * KMSKeyVersion.
         */
        public Builder KMSKeyVersion(String KMSKeyVersion) {
            this.KMSKeyVersion = KMSKeyVersion;
            return this;
        }

        /**
         * KeyMeta.
         */
        public Builder keyMeta(String keyMeta) {
            this.keyMeta = keyMeta;
            return this;
        }

        /**
         * KeySource.
         */
        public Builder keySource(String keySource) {
            this.keySource = keySource;
            return this;
        }

        /**
         * KeyType.
         */
        public Builder keyType(String keyType) {
            this.keyType = keyType;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        /**
         * PublicKey.
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetMemberResponseBody build() {
            return new GetMemberResponseBody(this);
        } 

    } 

}
