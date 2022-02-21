// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertContactRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertContactRequest</p>
 */
public class UpdateAlertContactRequest extends Request {
    @Query
    @NameInMap("ContactId")
    @Validation(required = true)
    private Long contactId;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("DingRobotWebhookUrl")
    private String dingRobotWebhookUrl;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("PhoneNum")
    private String phoneNum;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SystemNoc")
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

        private Builder(UpdateAlertContactRequest response) {
            super(response);
            this.contactId = response.contactId;
            this.contactName = response.contactName;
            this.dingRobotWebhookUrl = response.dingRobotWebhookUrl;
            this.email = response.email;
            this.phoneNum = response.phoneNum;
            this.regionId = response.regionId;
            this.systemNoc = response.systemNoc;
        } 

        /**
         * ContactId.
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * DingRobotWebhookUrl.
         */
        public Builder dingRobotWebhookUrl(String dingRobotWebhookUrl) {
            this.putQueryParameter("DingRobotWebhookUrl", dingRobotWebhookUrl);
            this.dingRobotWebhookUrl = dingRobotWebhookUrl;
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
         * PhoneNum.
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SystemNoc.
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
