// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertContactRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertContactRequest</p>
 */
public class CreateAlertContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DingRobotWebhookUrl")
    private String dingRobotWebhookUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNum")
    private String phoneNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemNoc")
    private Boolean systemNoc;

    private CreateAlertContactRequest(Builder builder) {
        super(builder);
        this.contactName = builder.contactName;
        this.dingRobotWebhookUrl = builder.dingRobotWebhookUrl;
        this.email = builder.email;
        this.phoneNum = builder.phoneNum;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.systemNoc = builder.systemNoc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return dingRobotWebhookUrl
     */
    public String getDingRobotWebhookUrl() {
        return this.dingRobotWebhookUrl;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return phoneNum
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return systemNoc
     */
    public Boolean getSystemNoc() {
        return this.systemNoc;
    }

    public static final class Builder extends Request.Builder<CreateAlertContactRequest, Builder> {
        private String contactName; 
        private String dingRobotWebhookUrl; 
        private String email; 
        private String phoneNum; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean systemNoc; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertContactRequest request) {
            super(request);
            this.contactName = request.contactName;
            this.dingRobotWebhookUrl = request.dingRobotWebhookUrl;
            this.email = request.email;
            this.phoneNum = request.phoneNum;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.systemNoc = request.systemNoc;
        } 

        /**
         * The name of the alert contact.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * The webhook URL of the DingTalk chatbot. For more information about how to obtain the URL, see [Configure a DingTalk chatbot to send alert notifications](https://www.alibabacloud.com/help/zh/doc-detail/106247.htm). You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         * <p>
         * 
         * >  Enter `alert` in the custom keyword field of DingTalk chatbot security settings.
         */
        public Builder dingRobotWebhookUrl(String dingRobotWebhookUrl) {
            this.putQueryParameter("DingRobotWebhookUrl", dingRobotWebhookUrl);
            this.dingRobotWebhookUrl = dingRobotWebhookUrl;
            return this;
        }

        /**
         * The email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The mobile number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * The ID of the region. Set the value to `cn-hangzhou`.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group. You can obtain the resource group ID in the **Resource Management** console.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies whether the alert contact receives system notifications. Valid values:
         * <p>
         * 
         * *   `true`: The alert contact receives system notifications.
         * *   `false`: The alert contact does not receive system notifications.
         */
        public Builder systemNoc(Boolean systemNoc) {
            this.putQueryParameter("SystemNoc", systemNoc);
            this.systemNoc = systemNoc;
            return this;
        }

        @Override
        public CreateAlertContactRequest build() {
            return new CreateAlertContactRequest(this);
        } 

    } 

}
