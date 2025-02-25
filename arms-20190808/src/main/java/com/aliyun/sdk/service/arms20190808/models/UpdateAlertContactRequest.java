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
 * {@link UpdateAlertContactRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertContactRequest</p>
 */
public class UpdateAlertContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactId;

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
    @com.aliyun.core.annotation.NameInMap("SystemNoc")
    private Boolean systemNoc;

    private UpdateAlertContactRequest(Builder builder) {
        super(builder);
        this.contactId = builder.contactId;
        this.contactName = builder.contactName;
        this.dingRobotWebhookUrl = builder.dingRobotWebhookUrl;
        this.email = builder.email;
        this.phoneNum = builder.phoneNum;
        this.regionId = builder.regionId;
        this.systemNoc = builder.systemNoc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertContactRequest create() {
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
     * @return systemNoc
     */
    public Boolean getSystemNoc() {
        return this.systemNoc;
    }

    public static final class Builder extends Request.Builder<UpdateAlertContactRequest, Builder> {
        private Long contactId; 
        private String contactName; 
        private String dingRobotWebhookUrl; 
        private String email; 
        private String phoneNum; 
        private String regionId; 
        private Boolean systemNoc; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertContactRequest request) {
            super(request);
            this.contactId = request.contactId;
            this.contactName = request.contactName;
            this.dingRobotWebhookUrl = request.dingRobotWebhookUrl;
            this.email = request.email;
            this.phoneNum = request.phoneNum;
            this.regionId = request.regionId;
            this.systemNoc = request.systemNoc;
        } 

        /**
         * <p>The ID of the alert contact to be updated. You can call the SearchAlertContact operation to query the contact ID. For more information, see <a href="https://help.aliyun.com/document_detail/130703.html">SearchAlertContact</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>The new name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The new webhook URL of the DingTalk chatbot. For more information, see <a href="https://help.aliyun.com/document_detail/106247.html">Configure a DingTalk chatbot to send alert notifications</a>. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the original parameter value is deleted. If you specify this parameter, the original parameter value is updated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=91f2f6">https://oapi.dingtalk.com/robot/send?access_token=91f2f6</a>****</p>
         */
        public Builder dingRobotWebhookUrl(String dingRobotWebhookUrl) {
            this.putQueryParameter("DingRobotWebhookUrl", dingRobotWebhookUrl);
            this.dingRobotWebhookUrl = dingRobotWebhookUrl;
            return this;
        }

        /**
         * <p>The new email address of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the original parameter value is deleted. If you specify this parameter, the original parameter value is updated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The new mobile phone number of the alert contact. You must specify at least one of the following parameters: PhoneNum, Email, and DingRobotWebhookUrl.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the original parameter value is deleted. If you specify this parameter, the original parameter value is updated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * <p>The ID of the region. Set the value to <code>cn-hangzhou</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether the alert contact receives system notifications. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The alert contact receives system notifications.</li>
         * <li><code>false</code>: The alert contact does not receive system notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder systemNoc(Boolean systemNoc) {
            this.putQueryParameter("SystemNoc", systemNoc);
            this.systemNoc = systemNoc;
            return this;
        }

        @Override
        public UpdateAlertContactRequest build() {
            return new UpdateAlertContactRequest(this);
        } 

    } 

}
