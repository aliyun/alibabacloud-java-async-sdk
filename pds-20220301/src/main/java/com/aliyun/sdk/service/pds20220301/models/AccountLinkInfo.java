// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link AccountLinkInfo} extends {@link TeaModel}
 *
 * <p>AccountLinkInfo</p>
 */
public class AccountLinkInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authentication_type")
    private String authenticationType;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("display_name")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.NameInMap("identity")
    private String identity;

    @com.aliyun.core.annotation.NameInMap("last_login_time")
    private Long lastLoginTime;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("user_id")
    private String userId;

    private AccountLinkInfo(Builder builder) {
        this.authenticationType = builder.authenticationType;
        this.createdAt = builder.createdAt;
        this.displayName = builder.displayName;
        this.domainId = builder.domainId;
        this.extra = builder.extra;
        this.identity = builder.identity;
        this.lastLoginTime = builder.lastLoginTime;
        this.status = builder.status;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccountLinkInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
    }

    /**
     * @return lastLoginTime
     */
    public Long getLastLoginTime() {
        return this.lastLoginTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String authenticationType; 
        private Long createdAt; 
        private String displayName; 
        private String domainId; 
        private String extra; 
        private String identity; 
        private Long lastLoginTime; 
        private String status; 
        private String userId; 

        private Builder() {
        } 

        private Builder(AccountLinkInfo model) {
            this.authenticationType = model.authenticationType;
            this.createdAt = model.createdAt;
            this.displayName = model.displayName;
            this.domainId = model.domainId;
            this.extra = model.extra;
            this.identity = model.identity;
            this.lastLoginTime = model.lastLoginTime;
            this.status = model.status;
            this.userId = model.userId;
        } 

        /**
         * authentication_type.
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * display_name.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(String extra) {
            this.extra = extra;
            return this;
        }

        /**
         * identity.
         */
        public Builder identity(String identity) {
            this.identity = identity;
            return this;
        }

        /**
         * last_login_time.
         */
        public Builder lastLoginTime(Long lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public AccountLinkInfo build() {
            return new AccountLinkInfo(this);
        } 

    } 

}
