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

        private Builder(UpdateDnsGtmInstanceGlobalConfigRequest request) {
            super(request);
            this.alertConfig = request.alertConfig;
            this.alertGroup = request.alertGroup;
            this.cnameType = request.cnameType;
            this.forceUpdate = request.forceUpdate;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.lang = request.lang;
            this.publicCnameMode = request.publicCnameMode;
            this.publicRr = request.publicRr;
            this.publicUserDomainName = request.publicUserDomainName;
            this.publicZoneName = request.publicZoneName;
            this.ttl = request.ttl;
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
         * The name of the alert group in the JSON format.
         */
        public Builder alertGroup(String alertGroup) {
            this.putQueryParameter("AlertGroup", alertGroup);
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * The type of the canonical name (CNAME).
         * <p>
         * 
         * *   Set the value to PUBLIC.
         */
        public Builder cnameType(String cnameType) {
            this.putQueryParameter("CnameType", cnameType);
            this.cnameType = cnameType;
            return this;
        }

        /**
         * Specifies whether to enable force updates. Valid values:
         * <p>
         * 
         * *   true: enables force update without a conflict alert.
         * *   false: disables force update. If a conflict occurs, the system displays an alert. null: This valid value of ForceUpdate provides the same information as the false value.
         */
        public Builder forceUpdate(Boolean forceUpdate) {
            this.putQueryParameter("ForceUpdate", forceUpdate);
            this.forceUpdate = forceUpdate;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the instance. This parameter is required only for the first update.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether to use a custom CNAME domain name or a CNAME domain name assigned by the system to access the instance over the Internet. Valid values:
         * <p>
         * 
         * *   SYSTEM_ASSIGN: a CNAME domain name assigned by the system
         * *   CUSTOM: a custom CNAME domain name
         */
        public Builder publicCnameMode(String publicCnameMode) {
            this.putQueryParameter("PublicCnameMode", publicCnameMode);
            this.publicCnameMode = publicCnameMode;
            return this;
        }

        /**
         * The hostname corresponding to the CNAME domain name that is used to access the instance over the Internet.
         */
        public Builder publicRr(String publicRr) {
            this.putQueryParameter("PublicRr", publicRr);
            this.publicRr = publicRr;
            return this;
        }

        /**
         * The service domain name that is used over the Internet.
         */
        public Builder publicUserDomainName(String publicUserDomainName) {
            this.putQueryParameter("PublicUserDomainName", publicUserDomainName);
            this.publicUserDomainName = publicUserDomainName;
            return this;
        }

        /**
         * The CNAME domain name that is used to access the instance over the Internet, which is the primary domain name. This parameter is required when the PublicCnameMode parameter is set to CUSTOM.
         * <p>
         * 
         * >  You must use the primary domain name. Do not include the hostname specified by the PublicRr parameter.
         */
        public Builder publicZoneName(String publicZoneName) {
            this.putQueryParameter("PublicZoneName", publicZoneName);
            this.publicZoneName = publicZoneName;
            return this;
        }

        /**
         * The global time to live (TTL).
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
