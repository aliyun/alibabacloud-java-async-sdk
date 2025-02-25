// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAlertSettingRequest} extends {@link RequestModel}
 *
 * <p>PutAlertSettingRequest</p>
 */
public class PutAlertSettingRequest extends Request {
    @Body
    @NameInMap("AlarmLevel")
    private String alarmLevel;

    @Body
    @NameInMap("AlertName")
    private String alertName;

    @Body
    @NameInMap("AlertSettingId")
    private Long alertSettingId;

    @Query
    @NameInMap("AlertSilenceConfig")
    private String alertSilenceConfig;

    @Body
    @NameInMap("BusinessGroupIdsJson")
    private String businessGroupIdsJson;

    @Body
    @NameInMap("ContactGroupIdsJson")
    private String contactGroupIdsJson;

    @Body
    @NameInMap("ContactIdsJson")
    private String contactIdsJson;

    @Body
    @NameInMap("CustomerUid")
    private Long customerUid;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("SendDingtalkNotice")
    private Boolean sendDingtalkNotice;

    @Body
    @NameInMap("SendEmailNotice")
    private Boolean sendEmailNotice;

    @Body
    @NameInMap("SendSmsNotice")
    private Boolean sendSmsNotice;

    @Body
    @NameInMap("StopDuration")
    private Long stopDuration;

    private PutAlertSettingRequest(Builder builder) {
        super(builder);
        this.alarmLevel = builder.alarmLevel;
        this.alertName = builder.alertName;
        this.alertSettingId = builder.alertSettingId;
        this.alertSilenceConfig = builder.alertSilenceConfig;
        this.businessGroupIdsJson = builder.businessGroupIdsJson;
        this.contactGroupIdsJson = builder.contactGroupIdsJson;
        this.contactIdsJson = builder.contactIdsJson;
        this.customerUid = builder.customerUid;
        this.operaUid = builder.operaUid;
        this.sendDingtalkNotice = builder.sendDingtalkNotice;
        this.sendEmailNotice = builder.sendEmailNotice;
        this.sendSmsNotice = builder.sendSmsNotice;
        this.stopDuration = builder.stopDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAlertSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return this.alarmLevel;
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return alertSettingId
     */
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    /**
     * @return alertSilenceConfig
     */
    public String getAlertSilenceConfig() {
        return this.alertSilenceConfig;
    }

    /**
     * @return businessGroupIdsJson
     */
    public String getBusinessGroupIdsJson() {
        return this.businessGroupIdsJson;
    }

    /**
     * @return contactGroupIdsJson
     */
    public String getContactGroupIdsJson() {
        return this.contactGroupIdsJson;
    }

    /**
     * @return contactIdsJson
     */
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

    /**
     * @return customerUid
     */
    public Long getCustomerUid() {
        return this.customerUid;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return sendDingtalkNotice
     */
    public Boolean getSendDingtalkNotice() {
        return this.sendDingtalkNotice;
    }

    /**
     * @return sendEmailNotice
     */
    public Boolean getSendEmailNotice() {
        return this.sendEmailNotice;
    }

    /**
     * @return sendSmsNotice
     */
    public Boolean getSendSmsNotice() {
        return this.sendSmsNotice;
    }

    /**
     * @return stopDuration
     */
    public Long getStopDuration() {
        return this.stopDuration;
    }

    public static final class Builder extends Request.Builder<PutAlertSettingRequest, Builder> {
        private String alarmLevel; 
        private String alertName; 
        private Long alertSettingId; 
        private String alertSilenceConfig; 
        private String businessGroupIdsJson; 
        private String contactGroupIdsJson; 
        private String contactIdsJson; 
        private Long customerUid; 
        private String operaUid; 
        private Boolean sendDingtalkNotice; 
        private Boolean sendEmailNotice; 
        private Boolean sendSmsNotice; 
        private Long stopDuration; 

        private Builder() {
            super();
        } 

        private Builder(PutAlertSettingRequest request) {
            super(request);
            this.alarmLevel = request.alarmLevel;
            this.alertName = request.alertName;
            this.alertSettingId = request.alertSettingId;
            this.alertSilenceConfig = request.alertSilenceConfig;
            this.businessGroupIdsJson = request.businessGroupIdsJson;
            this.contactGroupIdsJson = request.contactGroupIdsJson;
            this.contactIdsJson = request.contactIdsJson;
            this.customerUid = request.customerUid;
            this.operaUid = request.operaUid;
            this.sendDingtalkNotice = request.sendDingtalkNotice;
            this.sendEmailNotice = request.sendEmailNotice;
            this.sendSmsNotice = request.sendSmsNotice;
            this.stopDuration = request.stopDuration;
        } 

        /**
         * AlarmLevel.
         */
        public Builder alarmLevel(String alarmLevel) {
            this.putBodyParameter("AlarmLevel", alarmLevel);
            this.alarmLevel = alarmLevel;
            return this;
        }

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.putBodyParameter("AlertName", alertName);
            this.alertName = alertName;
            return this;
        }

        /**
         * AlertSettingId.
         */
        public Builder alertSettingId(Long alertSettingId) {
            this.putBodyParameter("AlertSettingId", alertSettingId);
            this.alertSettingId = alertSettingId;
            return this;
        }

        /**
         * AlertSilenceConfig.
         */
        public Builder alertSilenceConfig(String alertSilenceConfig) {
            this.putQueryParameter("AlertSilenceConfig", alertSilenceConfig);
            this.alertSilenceConfig = alertSilenceConfig;
            return this;
        }

        /**
         * BusinessGroupIdsJson.
         */
        public Builder businessGroupIdsJson(String businessGroupIdsJson) {
            this.putBodyParameter("BusinessGroupIdsJson", businessGroupIdsJson);
            this.businessGroupIdsJson = businessGroupIdsJson;
            return this;
        }

        /**
         * ContactGroupIdsJson.
         */
        public Builder contactGroupIdsJson(String contactGroupIdsJson) {
            this.putBodyParameter("ContactGroupIdsJson", contactGroupIdsJson);
            this.contactGroupIdsJson = contactGroupIdsJson;
            return this;
        }

        /**
         * ContactIdsJson.
         */
        public Builder contactIdsJson(String contactIdsJson) {
            this.putBodyParameter("ContactIdsJson", contactIdsJson);
            this.contactIdsJson = contactIdsJson;
            return this;
        }

        /**
         * CustomerUid.
         */
        public Builder customerUid(Long customerUid) {
            this.putBodyParameter("CustomerUid", customerUid);
            this.customerUid = customerUid;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * SendDingtalkNotice.
         */
        public Builder sendDingtalkNotice(Boolean sendDingtalkNotice) {
            this.putBodyParameter("SendDingtalkNotice", sendDingtalkNotice);
            this.sendDingtalkNotice = sendDingtalkNotice;
            return this;
        }

        /**
         * SendEmailNotice.
         */
        public Builder sendEmailNotice(Boolean sendEmailNotice) {
            this.putBodyParameter("SendEmailNotice", sendEmailNotice);
            this.sendEmailNotice = sendEmailNotice;
            return this;
        }

        /**
         * SendSmsNotice.
         */
        public Builder sendSmsNotice(Boolean sendSmsNotice) {
            this.putBodyParameter("SendSmsNotice", sendSmsNotice);
            this.sendSmsNotice = sendSmsNotice;
            return this;
        }

        /**
         * StopDuration.
         */
        public Builder stopDuration(Long stopDuration) {
            this.putBodyParameter("StopDuration", stopDuration);
            this.stopDuration = stopDuration;
            return this;
        }

        @Override
        public PutAlertSettingRequest build() {
            return new PutAlertSettingRequest(this);
        } 

    } 

}
