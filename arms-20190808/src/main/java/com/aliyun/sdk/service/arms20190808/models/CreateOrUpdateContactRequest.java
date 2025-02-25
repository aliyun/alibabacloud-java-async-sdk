// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateOrUpdateContactRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateContactRequest</p>
 */
public class CreateOrUpdateContactRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CorpUserId")
    private String corpUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DingRobotUrl")
    private String dingRobotUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsEmailVerify")
    private Boolean isEmailVerify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReissueSendNotice")
    private Long reissueSendNotice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateOrUpdateContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.corpUserId = builder.corpUserId;
        this.dingRobotUrl = builder.dingRobotUrl;
        this.email = builder.email;
        this.isEmailVerify = builder.isEmailVerify;
        this.phone = builder.phone;
        this.reissueSendNotice = builder.reissueSendNotice;
        this.resourceGroupId = builder.resourceGroupId;
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
     * @return corpUserId
     */
    public String getCorpUserId() {
        return this.corpUserId;
    }

    /**
     * @return dingRobotUrl
     */
    public String getDingRobotUrl() {
        return this.dingRobotUrl;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateContactRequest, Builder> {
        private Long contactId; 
        private String contactName; 
        private String corpUserId; 
        private String dingRobotUrl; 
        private String email; 
        private Boolean isEmailVerify; 
        private String phone; 
        private Long reissueSendNotice; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.contactName = request.contactName;
            this.corpUserId = request.corpUserId;
            this.dingRobotUrl = request.dingRobotUrl;
            this.email = request.email;
            this.isEmailVerify = request.isEmailVerify;
            this.phone = request.phone;
            this.reissueSendNotice = request.reissueSendNotice;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the alert contact.</p>
         * <ul>
         * <li>If you do not specify this parameter, a new alert contact is created.</li>
         * <li>If you specify this parameter, the specified alert contact is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder contactId(Long contactId) {
            this.putBodyParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The name of the alert contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JohnDoe</p>
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The ID of the alert contact that is shown to the enterprise when the contact is mentioned with the at sign (@) by a third-party instant messaging (IM) tool.</p>
         * 
         * <strong>example:</strong>
         * <p>A123221</p>
         */
        public Builder corpUserId(String corpUserId) {
            this.putBodyParameter("CorpUserId", corpUserId);
            this.corpUserId = corpUserId;
            return this;
        }

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=69d4e0">https://oapi.dingtalk.com/robot/send?access_token=69d4e0</a>******</p>
         */
        public Builder dingRobotUrl(String dingRobotUrl) {
            this.putQueryParameter("DingRobotUrl", dingRobotUrl);
            this.dingRobotUrl = dingRobotUrl;
            return this;
        }

        /**
         * <p>The email address of the alert contact.</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>Phone</strong> and <strong>Email</strong> parameters. Each mobile number or email address can be used for only one alert contact.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        public Builder email(String email) {
            this.putBodyParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Specifies whether the email address is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isEmailVerify(Boolean isEmailVerify) {
            this.putBodyParameter("IsEmailVerify", isEmailVerify);
            this.isEmailVerify = isEmailVerify;
            return this;
        }

        /**
         * <p>The mobile number of the alert contact.</p>
         * <blockquote>
         * <p>You must specify at least one of the <strong>Phone</strong> and <strong>Email</strong> parameters. Each mobile number or email address can be used for only one alert contact.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        public Builder phone(String phone) {
            this.putBodyParameter("Phone", phone);
            this.phone = phone;
            return this;
        }

        /**
         * <p>The operation that you want to perform if phone calls fail to be answered. Valid values:</p>
         * <ul>
         * <li>0: No operation is performed.</li>
         * <li>1: A phone call is made again.</li>
         * <li>2: A text message is sent.</li>
         * <li>3 (default value): The global default value is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder reissueSendNotice(Long reissueSendNotice) {
            this.putBodyParameter("ReissueSendNotice", reissueSendNotice);
            this.reissueSendNotice = reissueSendNotice;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateOrUpdateContactRequest build() {
            return new CreateOrUpdateContactRequest(this);
        } 

    } 

}
