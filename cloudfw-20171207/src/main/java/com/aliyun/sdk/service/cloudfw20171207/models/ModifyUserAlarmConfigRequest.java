// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyUserAlarmConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserAlarmConfigRequest</p>
 */
public class ModifyUserAlarmConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AlarmConfig> alarmConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmLang")
    private String alarmLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactConfig")
    private java.util.List<ContactConfig> contactConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyConfig")
    private java.util.List<NotifyConfig> notifyConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseDefaultContact")
    private Integer useDefaultContact;

    private ModifyUserAlarmConfigRequest(Builder builder) {
        super(builder);
        this.alarmConfig = builder.alarmConfig;
        this.alarmLang = builder.alarmLang;
        this.contactConfig = builder.contactConfig;
        this.lang = builder.lang;
        this.notifyConfig = builder.notifyConfig;
        this.sourceIp = builder.sourceIp;
        this.useDefaultContact = builder.useDefaultContact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserAlarmConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmConfig
     */
    public java.util.List<AlarmConfig> getAlarmConfig() {
        return this.alarmConfig;
    }

    /**
     * @return alarmLang
     */
    public String getAlarmLang() {
        return this.alarmLang;
    }

    /**
     * @return contactConfig
     */
    public java.util.List<ContactConfig> getContactConfig() {
        return this.contactConfig;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return notifyConfig
     */
    public java.util.List<NotifyConfig> getNotifyConfig() {
        return this.notifyConfig;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return useDefaultContact
     */
    public Integer getUseDefaultContact() {
        return this.useDefaultContact;
    }

    public static final class Builder extends Request.Builder<ModifyUserAlarmConfigRequest, Builder> {
        private java.util.List<AlarmConfig> alarmConfig; 
        private String alarmLang; 
        private java.util.List<ContactConfig> contactConfig; 
        private String lang; 
        private java.util.List<NotifyConfig> notifyConfig; 
        private String sourceIp; 
        private Integer useDefaultContact; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserAlarmConfigRequest request) {
            super(request);
            this.alarmConfig = request.alarmConfig;
            this.alarmLang = request.alarmLang;
            this.contactConfig = request.contactConfig;
            this.lang = request.lang;
            this.notifyConfig = request.notifyConfig;
            this.sourceIp = request.sourceIp;
            this.useDefaultContact = request.useDefaultContact;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder alarmConfig(java.util.List<AlarmConfig> alarmConfig) {
            this.putQueryParameter("AlarmConfig", alarmConfig);
            this.alarmConfig = alarmConfig;
            return this;
        }

        /**
         * AlarmLang.
         */
        public Builder alarmLang(String alarmLang) {
            this.putQueryParameter("AlarmLang", alarmLang);
            this.alarmLang = alarmLang;
            return this;
        }

        /**
         * ContactConfig.
         */
        public Builder contactConfig(java.util.List<ContactConfig> contactConfig) {
            this.putQueryParameter("ContactConfig", contactConfig);
            this.contactConfig = contactConfig;
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
         * NotifyConfig.
         */
        public Builder notifyConfig(java.util.List<NotifyConfig> notifyConfig) {
            this.putQueryParameter("NotifyConfig", notifyConfig);
            this.notifyConfig = notifyConfig;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * UseDefaultContact.
         */
        public Builder useDefaultContact(Integer useDefaultContact) {
            this.putQueryParameter("UseDefaultContact", useDefaultContact);
            this.useDefaultContact = useDefaultContact;
            return this;
        }

        @Override
        public ModifyUserAlarmConfigRequest build() {
            return new ModifyUserAlarmConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyUserAlarmConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyUserAlarmConfigRequest</p>
     */
    public static class AlarmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmHour")
        private String alarmHour;

        @com.aliyun.core.annotation.NameInMap("AlarmNotify")
        private String alarmNotify;

        @com.aliyun.core.annotation.NameInMap("AlarmPeriod")
        private String alarmPeriod;

        @com.aliyun.core.annotation.NameInMap("AlarmType")
        private String alarmType;

        @com.aliyun.core.annotation.NameInMap("AlarmValue")
        private String alarmValue;

        @com.aliyun.core.annotation.NameInMap("AlarmWeekDay")
        private String alarmWeekDay;

        private AlarmConfig(Builder builder) {
            this.alarmHour = builder.alarmHour;
            this.alarmNotify = builder.alarmNotify;
            this.alarmPeriod = builder.alarmPeriod;
            this.alarmType = builder.alarmType;
            this.alarmValue = builder.alarmValue;
            this.alarmWeekDay = builder.alarmWeekDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmConfig create() {
            return builder().build();
        }

        /**
         * @return alarmHour
         */
        public String getAlarmHour() {
            return this.alarmHour;
        }

        /**
         * @return alarmNotify
         */
        public String getAlarmNotify() {
            return this.alarmNotify;
        }

        /**
         * @return alarmPeriod
         */
        public String getAlarmPeriod() {
            return this.alarmPeriod;
        }

        /**
         * @return alarmType
         */
        public String getAlarmType() {
            return this.alarmType;
        }

        /**
         * @return alarmValue
         */
        public String getAlarmValue() {
            return this.alarmValue;
        }

        /**
         * @return alarmWeekDay
         */
        public String getAlarmWeekDay() {
            return this.alarmWeekDay;
        }

        public static final class Builder {
            private String alarmHour; 
            private String alarmNotify; 
            private String alarmPeriod; 
            private String alarmType; 
            private String alarmValue; 
            private String alarmWeekDay; 

            private Builder() {
            } 

            private Builder(AlarmConfig model) {
                this.alarmHour = model.alarmHour;
                this.alarmNotify = model.alarmNotify;
                this.alarmPeriod = model.alarmPeriod;
                this.alarmType = model.alarmType;
                this.alarmValue = model.alarmValue;
                this.alarmWeekDay = model.alarmWeekDay;
            } 

            /**
             * AlarmHour.
             */
            public Builder alarmHour(String alarmHour) {
                this.alarmHour = alarmHour;
                return this;
            }

            /**
             * AlarmNotify.
             */
            public Builder alarmNotify(String alarmNotify) {
                this.alarmNotify = alarmNotify;
                return this;
            }

            /**
             * AlarmPeriod.
             */
            public Builder alarmPeriod(String alarmPeriod) {
                this.alarmPeriod = alarmPeriod;
                return this;
            }

            /**
             * AlarmType.
             */
            public Builder alarmType(String alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * AlarmValue.
             */
            public Builder alarmValue(String alarmValue) {
                this.alarmValue = alarmValue;
                return this;
            }

            /**
             * AlarmWeekDay.
             */
            public Builder alarmWeekDay(String alarmWeekDay) {
                this.alarmWeekDay = alarmWeekDay;
                return this;
            }

            public AlarmConfig build() {
                return new AlarmConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyUserAlarmConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyUserAlarmConfigRequest</p>
     */
    public static class ContactConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("MobilePhone")
        private String mobilePhone;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ContactConfig(Builder builder) {
            this.email = builder.email;
            this.mobilePhone = builder.mobilePhone;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactConfig create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return mobilePhone
         */
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String email; 
            private String mobilePhone; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(ContactConfig model) {
                this.email = model.email;
                this.mobilePhone = model.mobilePhone;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * MobilePhone.
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ContactConfig build() {
                return new ContactConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyUserAlarmConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyUserAlarmConfigRequest</p>
     */
    public static class NotifyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotifyType")
        private String notifyType;

        @com.aliyun.core.annotation.NameInMap("NotifyValue")
        private String notifyValue;

        private NotifyConfig(Builder builder) {
            this.notifyType = builder.notifyType;
            this.notifyValue = builder.notifyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyConfig create() {
            return builder().build();
        }

        /**
         * @return notifyType
         */
        public String getNotifyType() {
            return this.notifyType;
        }

        /**
         * @return notifyValue
         */
        public String getNotifyValue() {
            return this.notifyValue;
        }

        public static final class Builder {
            private String notifyType; 
            private String notifyValue; 

            private Builder() {
            } 

            private Builder(NotifyConfig model) {
                this.notifyType = model.notifyType;
                this.notifyValue = model.notifyValue;
            } 

            /**
             * NotifyType.
             */
            public Builder notifyType(String notifyType) {
                this.notifyType = notifyType;
                return this;
            }

            /**
             * NotifyValue.
             */
            public Builder notifyValue(String notifyValue) {
                this.notifyValue = notifyValue;
                return this;
            }

            public NotifyConfig build() {
                return new NotifyConfig(this);
            } 

        } 

    }
}
