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
 * {@link UnLinkAccountRequest} extends {@link RequestModel}
 *
 * <p>UnLinkAccountRequest</p>
 */
public class UnLinkAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private UnLinkAccountRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.extra = builder.extra;
        this.identity = builder.identity;
        this.type = builder.type;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnLinkAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UnLinkAccountRequest, Builder> {
        private String domainId; 
        private String extra; 
        private String identity; 
        private String type; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UnLinkAccountRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.extra = request.extra;
            this.identity = request.identity;
            this.type = request.type;
            this.userId = request.userId;
        } 

        /**
         * <p>A short description of the struct</p>
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>Additional information for the unique account identifier. For example, when the account is a phone number, this field should be filled with the area code of the phone, such as 86 for Mainland China. If not provided, it defaults to 86.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder extra(String extra) {
            this.putBodyParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * <p>Unique identifier of the account, such as a phone number</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>139****</p>
         */
        public Builder identity(String identity) {
            this.putBodyParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * <p>Account type</p>
         * <p>mobile: Phone number</p>
         * <p>email: Email address</p>
         * <p>ding: DingTalk</p>
         * <p>ram: Alibaba Cloud RAM User</p>
         * <p>wechat: WeCom</p>
         * <p>ldap: LDAP account</p>
         * <p>custom: Custom account</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mobile</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>User identifier</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uid1</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UnLinkAccountRequest build() {
            return new UnLinkAccountRequest(this);
        } 

    } 

}
