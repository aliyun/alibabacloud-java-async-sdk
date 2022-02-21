// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDnsGtmInstanceGlobalConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateDnsGtmInstanceGlobalConfigRequest</p>
 */
public class UpdateDnsGtmInstanceGlobalConfigRequest extends Request {
    @Query
    @NameInMap("AlertConfig")
    private java.util.List < AlertConfig> alertConfig;

    @Query
    @NameInMap("AlertGroup")
    private String alertGroup;

    @Query
    @NameInMap("CnameType")
    private String cnameType;

    @Query
    @NameInMap("ForceUpdate")
    private Boolean forceUpdate;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PublicCnameMode")
    private String publicCnameMode;

    @Query
    @NameInMap("PublicRr")
    private String publicRr;

    @Query
    @NameInMap("PublicUserDomainName")
    private String publicUserDomainName;

    @Query
    @NameInMap("PublicZoneName")
    private String publicZoneName;

    @Query
    @NameInMap("Ttl")
    @Validation(maximum = 9999999, minimum = 1)
    private Integer ttl;

    private UpdateDnsGtmInstanceGlobalConfigRequest(Builder builder) {
        super(builder);
        this.alertConfig = builder.alertConfig;
        this.alertGroup = builder.alertGroup;
        this.cnameType = builder.cnameType;
        this.forceUpdate = builder.forceUpdate;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.lang = builder.lang;
        this.publicCnameMode = builder.publicCnameMode;
        this.publicRr = builder.publicRr;
        this.publicUserDomainName = builder.publicUserDomainName;
        this.publicZoneName = builder.publicZoneName;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDnsGtmInstanceGlobalConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertConfig
     */
    public java.util.List < AlertConfig> getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return alertGroup
     */
    public String getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return cnameType
     */
    public String getCnameType() {
        return this.cnameType;
    }

    /**
     * @return forceUpdate
     */
    public Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return publicCnameMode
     */
    public String getPublicCnameMode() {
        return this.publicCnameMode;
    }

    /**
     * @return publicRr
     */
    public String getPublicRr() {
        return this.publicRr;
    }

    /**
     * @return publicUserDomainName
     */
    public String getPublicUserDomainName() {
        return this.publicUserDomainName;
    }

    /**
     * @return publicZoneName
     */
    public String getPublicZoneName() {
        return this.publicZoneName;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<UpdateDnsGtmInstanceGlobalConfigRequest, Builder> {
        private java.util.List < AlertConfig> alertConfig; 
        private String alertGroup; 
        private String cnameType; 
        private Boolean forceUpdate; 
        private String instanceId; 
        private String instanceName; 
        private String lang; 
        private String publicCnameMode; 
        private String publicRr; 
        private String publicUserDomainName; 
        private String publicZoneName; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDnsGtmInstanceGlobalConfigRequest response) {
            super(response);
            this.alertConfig = response.alertConfig;
            this.alertGroup = response.alertGroup;
            this.cnameType = response.cnameType;
            this.forceUpdate = response.forceUpdate;
            this.instanceId = response.instanceId;
            this.instanceName = response.instanceName;
            this.lang = response.lang;
            this.publicCnameMode = response.publicCnameMode;
            this.publicRr = response.publicRr;
            this.publicUserDomainName = response.publicUserDomainName;
            this.publicZoneName = response.publicZoneName;
            this.ttl = response.ttl;
        } 

        /**
         * AlertConfig.
         */
        public Builder alertConfig(java.util.List < AlertConfig> alertConfig) {
            this.putQueryParameter("AlertConfig", alertConfig);
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * AlertGroup.
         */
        public Builder alertGroup(String alertGroup) {
            this.putQueryParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * CnameType.
         */
        public Builder cnameType(String cnameType) {
            this.putQueryParameter("CnameType", cnameType);
            this.cnameType = cnameType;
            return this;
        }

        /**
         * ForceUpdate.
         */
        public Builder forceUpdate(Boolean forceUpdate) {
            this.putQueryParameter("ForceUpdate", forceUpdate);
            this.forceUpdate = forceUpdate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PublicCnameMode.
         */
        public Builder publicCnameMode(String publicCnameMode) {
            this.putQueryParameter("PublicCnameMode", publicCnameMode);
            this.publicCnameMode = publicCnameMode;
            return this;
        }

        /**
         * PublicRr.
         */
        public Builder publicRr(String publicRr) {
            this.putQueryParameter("PublicRr", publicRr);
            this.publicRr = publicRr;
            return this;
        }

        /**
         * PublicUserDomainName.
         */
        public Builder publicUserDomainName(String publicUserDomainName) {
            this.putQueryParameter("PublicUserDomainName", publicUserDomainName);
            this.publicUserDomainName = publicUserDomainName;
            return this;
        }

        /**
         * PublicZoneName.
         */
        public Builder publicZoneName(String publicZoneName) {
            this.putQueryParameter("PublicZoneName", publicZoneName);
            this.publicZoneName = publicZoneName;
            return this;
        }

        /**
         * Ttl.
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public UpdateDnsGtmInstanceGlobalConfigRequest build() {
            return new UpdateDnsGtmInstanceGlobalConfigRequest(this);
        } 

    } 

    public static class AlertConfig extends TeaModel {
        @NameInMap("DingtalkNotice")
        private Boolean dingtalkNotice;

        @NameInMap("EmailNotice")
        private Boolean emailNotice;

        @NameInMap("NoticeType")
        private String noticeType;

        @NameInMap("SmsNotice")
        private Boolean smsNotice;

        private AlertConfig(Builder builder) {
            this.dingtalkNotice = builder.dingtalkNotice;
            this.emailNotice = builder.emailNotice;
            this.noticeType = builder.noticeType;
            this.smsNotice = builder.smsNotice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfig create() {
            return builder().build();
        }

        /**
         * @return dingtalkNotice
         */
        public Boolean getDingtalkNotice() {
            return this.dingtalkNotice;
        }

        /**
         * @return emailNotice
         */
        public Boolean getEmailNotice() {
            return this.emailNotice;
        }

        /**
         * @return noticeType
         */
        public String getNoticeType() {
            return this.noticeType;
        }

        /**
         * @return smsNotice
         */
        public Boolean getSmsNotice() {
            return this.smsNotice;
        }

        public static final class Builder {
            private Boolean dingtalkNotice; 
            private Boolean emailNotice; 
            private String noticeType; 
            private Boolean smsNotice; 

            /**
             * DingtalkNotice.
             */
            public Builder dingtalkNotice(Boolean dingtalkNotice) {
                this.dingtalkNotice = dingtalkNotice;
                return this;
            }

            /**
             * EmailNotice.
             */
            public Builder emailNotice(Boolean emailNotice) {
                this.emailNotice = emailNotice;
                return this;
            }

            /**
             * NoticeType.
             */
            public Builder noticeType(String noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * SmsNotice.
             */
            public Builder smsNotice(Boolean smsNotice) {
                this.smsNotice = smsNotice;
                return this;
            }

            public AlertConfig build() {
                return new AlertConfig(this);
            } 

        } 

    }
}
