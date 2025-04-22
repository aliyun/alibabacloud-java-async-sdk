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
 * {@link LinkAccountRequest} extends {@link RequestModel}
 *
 * <p>LinkAccountRequest</p>
 */
public class LinkAccountRequest extends Request {
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

    private LinkAccountRequest(Builder builder) {
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

    public static LinkAccountRequest create() {
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

    public static final class Builder extends Request.Builder<LinkAccountRequest, Builder> {
        private String domainId; 
        private String extra; 
        private String identity; 
        private String type; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(LinkAccountRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.extra = request.extra;
            this.identity = request.identity;
            this.type = request.type;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The additional information about the unique identifier of the account. For example, if type is set to mobile, set the value of extra to a country code. For example, a value of 86 specifies a mobile number in the Chinese mainland. If you do not specify this parameter, 86 is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder extra(String extra) {
            this.putBodyParameter("extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * <p>The unique identifier of the account, such as a mobile number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyy***</p>
         */
        public Builder identity(String identity) {
            this.putBodyParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        /**
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li>mobile: a mobile number.</li>
         * <li>email: an email address.</li>
         * <li>ding: a DingTalk account.</li>
         * <li>ram: an Alibaba Cloud Resource Access Management (RAM) user.</li>
         * <li>wechat: a WeCom account.</li>
         * <li>ldap: a Lightweight Directory Access Protocol (LDAP) account.</li>
         * <li>custom: a custom account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ding</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The ID of the user with which you want to associate an account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public LinkAccountRequest build() {
            return new LinkAccountRequest(this);
        } 

    } 

}
