// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CreateSmsAuthorizationLetterRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsAuthorizationLetterRequest</p>
 */
public class CreateSmsAuthorizationLetterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Authorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterExpDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationLetterExpDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationLetterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterPic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizationLetterPic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrganizationCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyAuthorization")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyAuthorization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> signList;

    private CreateSmsAuthorizationLetterRequest(Builder builder) {
        super(builder);
        this.authorization = builder.authorization;
        this.authorizationLetterExpDate = builder.authorizationLetterExpDate;
        this.authorizationLetterName = builder.authorizationLetterName;
        this.authorizationLetterPic = builder.authorizationLetterPic;
        this.organizationCode = builder.organizationCode;
        this.ownerId = builder.ownerId;
        this.proxyAuthorization = builder.proxyAuthorization;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signList = builder.signList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsAuthorizationLetterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorization
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * @return authorizationLetterExpDate
     */
    public String getAuthorizationLetterExpDate() {
        return this.authorizationLetterExpDate;
    }

    /**
     * @return authorizationLetterName
     */
    public String getAuthorizationLetterName() {
        return this.authorizationLetterName;
    }

    /**
     * @return authorizationLetterPic
     */
    public String getAuthorizationLetterPic() {
        return this.authorizationLetterPic;
    }

    /**
     * @return organizationCode
     */
    public String getOrganizationCode() {
        return this.organizationCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return proxyAuthorization
     */
    public String getProxyAuthorization() {
        return this.proxyAuthorization;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return signList
     */
    public java.util.List<String> getSignList() {
        return this.signList;
    }

    public static final class Builder extends Request.Builder<CreateSmsAuthorizationLetterRequest, Builder> {
        private String authorization; 
        private String authorizationLetterExpDate; 
        private String authorizationLetterName; 
        private String authorizationLetterPic; 
        private String organizationCode; 
        private Long ownerId; 
        private String proxyAuthorization; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<String> signList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsAuthorizationLetterRequest request) {
            super(request);
            this.authorization = request.authorization;
            this.authorizationLetterExpDate = request.authorizationLetterExpDate;
            this.authorizationLetterName = request.authorizationLetterName;
            this.authorizationLetterPic = request.authorizationLetterPic;
            this.organizationCode = request.organizationCode;
            this.ownerId = request.ownerId;
            this.proxyAuthorization = request.proxyAuthorization;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signList = request.signList;
        } 

        /**
         * <p>授权方，授权方命名长度不超过1000个字符，暂不支持包含除中点（·）、空格、中文括号【】、英文括号()外的任何符号或纯数字输入</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云有限公司</p>
         */
        public Builder authorization(String authorization) {
            this.putQueryParameter("Authorization", authorization);
            this.authorization = authorization;
            return this;
        }

        /**
         * <p>委托授权书有效期</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01~2026-01-01</p>
         */
        public Builder authorizationLetterExpDate(String authorizationLetterExpDate) {
            this.putQueryParameter("AuthorizationLetterExpDate", authorizationLetterExpDate);
            this.authorizationLetterExpDate = authorizationLetterExpDate;
            return this;
        }

        /**
         * <p>委托授权书命名非空，不超过100个字符，支持中文、英文或与数字组合进行命名，暂不支持任何符号或纯数字输入</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx公司授权书</p>
         */
        public Builder authorizationLetterName(String authorizationLetterName) {
            this.putQueryParameter("AuthorizationLetterName", authorizationLetterName);
            this.authorizationLetterName = authorizationLetterName;
            return this;
        }

        /**
         * <p>上传oss的委托授权书图片标识</p>
         * <p>This parameter is required.</p>
         */
        public Builder authorizationLetterPic(String authorizationLetterPic) {
            this.putQueryParameter("AuthorizationLetterPic", authorizationLetterPic);
            this.authorizationLetterPic = authorizationLetterPic;
            return this;
        }

        /**
         * <p>授权方社会统一信用代码，长度不超过150个字符</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9****************A</p>
         */
        public Builder organizationCode(String organizationCode) {
            this.putQueryParameter("OrganizationCode", organizationCode);
            this.organizationCode = organizationCode;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>被授权方，被授权方命名长度不超过1000个字符，暂不支持包含除中点（·）、空格、中文括号【】、英文括号()外的任何符号或纯数字输入</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx公司</p>
         */
        public Builder proxyAuthorization(String proxyAuthorization) {
            this.putQueryParameter("ProxyAuthorization", proxyAuthorization);
            this.proxyAuthorization = proxyAuthorization;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>委托授权签名列表，签名数量限制100个以内</p>
         * <p>This parameter is required.</p>
         */
        public Builder signList(java.util.List<String> signList) {
            String signListShrink = shrink(signList, "SignList", "json");
            this.putQueryParameter("SignList", signListShrink);
            this.signList = signList;
            return this;
        }

        @Override
        public CreateSmsAuthorizationLetterRequest build() {
            return new CreateSmsAuthorizationLetterRequest(this);
        } 

    } 

}
