// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link MemberApiKeyDTO} extends {@link TeaModel}
 *
 * <p>MemberApiKeyDTO</p>
 */
public class MemberApiKeyDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("client")
    private ClientDTO client;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("deleteTag")
    private Integer deleteTag;

    @com.aliyun.core.annotation.NameInMap("expireAt")
    private String expireAt;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("keyPreview")
    private String keyPreview;

    @com.aliyun.core.annotation.NameInMap("memberUserId")
    private Long memberUserId;

    @com.aliyun.core.annotation.NameInMap("memberUserName")
    private String memberUserName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private MemberApiKeyDTO(Builder builder) {
        this.client = builder.client;
        this.clientId = builder.clientId;
        this.deleteTag = builder.deleteTag;
        this.expireAt = builder.expireAt;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.key = builder.key;
        this.keyPreview = builder.keyPreview;
        this.memberUserId = builder.memberUserId;
        this.memberUserName = builder.memberUserName;
        this.name = builder.name;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MemberApiKeyDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return client
     */
    public ClientDTO getClient() {
        return this.client;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return deleteTag
     */
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    /**
     * @return expireAt
     */
    public String getExpireAt() {
        return this.expireAt;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return keyPreview
     */
    public String getKeyPreview() {
        return this.keyPreview;
    }

    /**
     * @return memberUserId
     */
    public Long getMemberUserId() {
        return this.memberUserId;
    }

    /**
     * @return memberUserName
     */
    public String getMemberUserName() {
        return this.memberUserName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private ClientDTO client; 
        private Long clientId; 
        private Integer deleteTag; 
        private String expireAt; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private String key; 
        private String keyPreview; 
        private Long memberUserId; 
        private String memberUserName; 
        private String name; 
        private String status; 

        private Builder() {
        } 

        private Builder(MemberApiKeyDTO model) {
            this.client = model.client;
            this.clientId = model.clientId;
            this.deleteTag = model.deleteTag;
            this.expireAt = model.expireAt;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.key = model.key;
            this.keyPreview = model.keyPreview;
            this.memberUserId = model.memberUserId;
            this.memberUserName = model.memberUserName;
            this.name = model.name;
            this.status = model.status;
        } 

        /**
         * <p>The parent department information.</p>
         */
        public Builder client(ClientDTO client) {
            this.client = client;
            return this;
        }

        /**
         * <p>The ID of the parent department. Member keys are mapped to their parent departments.</p>
         * 
         * <strong>example:</strong>
         * <p>438</p>
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The deletion tag. A value of 0 indicates that the key is enabled, and a non-zero value indicates that the key is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deleteTag(Integer deleteTag) {
            this.deleteTag = deleteTag;
            return this;
        }

        /**
         * <p>The expiration time. A null value indicates that the key never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12-31T00:00:00Z</p>
         */
        public Builder expireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-03T18:41:40+08:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-03T18:41:40+08:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The API key ID. This ID can be used to query the bound group by API key.</p>
         * 
         * <strong>example:</strong>
         * <p>502</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The full key. This field is not returned in the member list and is always empty.</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The masked preview of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-us****9876</p>
         */
        public Builder keyPreview(String keyPreview) {
            this.keyPreview = keyPreview;
            return this;
        }

        /**
         * <p>The ID of the department member to whom the key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>304</p>
         */
        public Builder memberUserId(Long memberUserId) {
            this.memberUserId = memberUserId;
            return this;
        }

        /**
         * <p>The member name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder memberUserName(String memberUserName) {
            this.memberUserName = memberUserName;
            return this;
        }

        /**
         * <p>The API key name.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San\&quot;s key</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The status. Valid values: active: Enabled. disabled: Disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public MemberApiKeyDTO build() {
            return new MemberApiKeyDTO(this);
        } 

    } 

}
