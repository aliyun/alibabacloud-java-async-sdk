// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendTestByTemplateRequest} extends {@link RequestModel}
 *
 * <p>SendTestByTemplateRequest</p>
 */
public class SendTestByTemplateRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("Birthday")
    private String birthday;

    @Query
    @NameInMap("Email")
    @Validation(required = true)
    private String email;

    @Query
    @NameInMap("Gender")
    private String gender;

    @Query
    @NameInMap("Mobile")
    private String mobile;

    @Query
    @NameInMap("NickName")
    private String nickName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Integer templateId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private SendTestByTemplateRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.birthday = builder.birthday;
        this.email = builder.email;
        this.gender = builder.gender;
        this.mobile = builder.mobile;
        this.nickName = builder.nickName;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateId = builder.templateId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTestByTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return templateId
     */
    public Integer getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<SendTestByTemplateRequest, Builder> {
        private String accountName; 
        private String birthday; 
        private String email; 
        private String gender; 
        private String mobile; 
        private String nickName; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer templateId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(SendTestByTemplateRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.birthday = request.birthday;
            this.email = request.email;
            this.gender = request.gender;
            this.mobile = request.mobile;
            this.nickName = request.nickName;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateId = request.templateId;
            this.userName = request.userName;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * Birthday.
         */
        public Builder birthday(String birthday) {
            this.putQueryParameter("Birthday", birthday);
            this.birthday = birthday;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * Gender.
         */
        public Builder gender(String gender) {
            this.putQueryParameter("Gender", gender);
            this.gender = gender;
            return this;
        }

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putQueryParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
        }

        /**
         * NickName.
         */
        public Builder nickName(String nickName) {
            this.putQueryParameter("NickName", nickName);
            this.nickName = nickName;
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
         * TemplateId.
         */
        public Builder templateId(Integer templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public SendTestByTemplateRequest build() {
            return new SendTestByTemplateRequest(this);
        } 

    } 

}
