// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link GetContactResponseBody} extends {@link TeaModel}
 *
 * <p>GetContactResponseBody</p>
 */
public class GetContactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactId")
    private Long contactId;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("EmailStatus")
    private Integer emailStatus;

    @com.aliyun.core.annotation.NameInMap("IdCard")
    private String idCard;

    @com.aliyun.core.annotation.NameInMap("Mobile")
    private String mobile;

    @com.aliyun.core.annotation.NameInMap("MobileStatus")
    private Integer mobileStatus;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebhookList")
    private java.util.List<String> webhookList;

    @com.aliyun.core.annotation.NameInMap("Webhooks")
    private String webhooks;

    private GetContactResponseBody(Builder builder) {
        this.contactId = builder.contactId;
        this.email = builder.email;
        this.emailStatus = builder.emailStatus;
        this.idCard = builder.idCard;
        this.mobile = builder.mobile;
        this.mobileStatus = builder.mobileStatus;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.webhookList = builder.webhookList;
        this.webhooks = builder.webhooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContactResponseBody create() {
        return builder().build();
    }

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
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return emailStatus
     */
    public Integer getEmailStatus() {
        return this.emailStatus;
    }

    /**
     * @return idCard
     */
    public String getIdCard() {
        return this.idCard;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return mobileStatus
     */
    public Integer getMobileStatus() {
        return this.mobileStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webhookList
     */
    public java.util.List<String> getWebhookList() {
        return this.webhookList;
    }

    /**
     * @return webhooks
     */
    public String getWebhooks() {
        return this.webhooks;
    }

    public static final class Builder {
        private Long contactId; 
        private String email; 
        private Integer emailStatus; 
        private String idCard; 
        private String mobile; 
        private Integer mobileStatus; 
        private String name; 
        private String requestId; 
        private java.util.List<String> webhookList; 
        private String webhooks; 

        private Builder() {
        } 

        private Builder(GetContactResponseBody model) {
            this.contactId = model.contactId;
            this.email = model.email;
            this.emailStatus = model.emailStatus;
            this.idCard = model.idCard;
            this.mobile = model.mobile;
            this.mobileStatus = model.mobileStatus;
            this.name = model.name;
            this.requestId = model.requestId;
            this.webhookList = model.webhookList;
            this.webhooks = model.webhooks;
        } 

        /**
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1352570</p>
         */
        public Builder contactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The email address of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@163.com">test@163.com</a></p>
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * <p>Indicates whether the email address is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder emailStatus(Integer emailStatus) {
            this.emailStatus = emailStatus;
            return this;
        }

        /**
         * <p>The ID card number of the contact. This is required for the CFCA certificate brand and not required for other brands.</p>
         * 
         * <strong>example:</strong>
         * <p>142***************</p>
         */
        public Builder idCard(String idCard) {
            this.idCard = idCard;
            return this;
        }

        /**
         * <p>The phone number of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1510108****</p>
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        /**
         * <p>Indicates whether the phone number is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mobileStatus(Integer mobileStatus) {
            this.mobileStatus = mobileStatus;
            return this;
        }

        /**
         * <p>The name of the certificate contact.</p>
         * 
         * <strong>example:</strong>
         * <p>zhang san</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EECA10D5-BD0F-4EF1-B3EA-B4578E5C6F8E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The webhook URLs of DingTalk, WeCom, or Lark chatbots, in list format.</p>
         */
        public Builder webhookList(java.util.List<String> webhookList) {
            this.webhookList = webhookList;
            return this;
        }

        /**
         * <p>The webhook URLs of DingTalk, WeCom, or Lark chatbots, in list format as a string.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;<a href="https://open.feishu.cn/open-apis/bot/v2/hook/dc1aa9b9-47cd-4b34-91ef-73c1034208e5%5C%5C%22%5D">https://open.feishu.cn/open-apis/bot/v2/hook/dc1aa9b9-47cd-4b34-91ef-73c1034208e5\\&quot;]</a></p>
         */
        public Builder webhooks(String webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public GetContactResponseBody build() {
            return new GetContactResponseBody(this);
        } 

    } 

}
