// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateContactRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateContactRequest</p>
 */
public class CreateOrUpdateContactRequest extends Request {
    @Body
    @NameInMap("ContactId")
    private Long contactId;

    @Body
    @NameInMap("ContactName")
    @Validation(required = true)
    private String contactName;

    @Body
    @NameInMap("Email")
    private String email;

    @Body
    @NameInMap("IsEmailVerify")
    private Boolean isEmailVerify;

    @Body
    @NameInMap("Phone")
    private String phone;

    @Body
    @NameInMap("ReissueSendNotice")
    private Long reissueSendNotice;

    private CreateOrUpdateContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.email = builder.email;
        this.isEmailVerify = builder.isEmailVerify;
        this.phone = builder.phone;
        this.reissueSendNotice = builder.reissueSendNotice;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return isEmailVerify
     */
    public Boolean getIsEmailVerify() {
        return this.isEmailVerify;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return reissueSendNotice
     */
    public Long getReissueSendNotice() {
        return this.reissueSendNotice;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateContactRequest, Builder> {
        private Long contactId; 
        private String contactName; 
        private String email; 
        private Boolean isEmailVerify; 
        private String phone; 
        private Long reissueSendNotice; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.contactName = request.contactName;
            this.email = request.email;
            this.isEmailVerify = request.isEmailVerify;
            this.phone = request.phone;
            this.reissueSendNotice = request.reissueSendNotice;
        } 

        /**
         * 告警联系人ID
         */
        public Builder contactId(Long contactId) {
            this.putBodyParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * 告警联系人名称
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * 告警联系人邮箱
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * IsEmailVerify.
         */
        public Builder isEmailVerify(Boolean isEmailVerify) {
            this.putBodyParameter("IsEmailVerify", isEmailVerify);
            this.isEmailVerify = isEmailVerify;
            return this;
        }

        /**
         * 告警联系人手机号码
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * 电话通知失败补发类型：0. 不补发   1. 重复拨打一次电话   2. 发送短信通知   3. 使用全局默认值（当前为不补发）
         */
        public Builder reissueSendNotice(Long reissueSendNotice) {
            this.putBodyParameter("ReissueSendNotice", reissueSendNotice);
            this.reissueSendNotice = reissueSendNotice;
            return this;
        }

        @Override
        public CreateOrUpdateContactRequest build() {
            return new CreateOrUpdateContactRequest(this);
        } 

    } 

}
