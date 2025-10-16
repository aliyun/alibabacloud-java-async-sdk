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
 * {@link DescribeUserAlarmConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserAlarmConfigResponseBody</p>
 */
public class DescribeUserAlarmConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmConfig")
    private java.util.List<AlarmConfig> alarmConfig;

    @com.aliyun.core.annotation.NameInMap("AlarmLang")
    private String alarmLang;

    @com.aliyun.core.annotation.NameInMap("ContactConfig")
    private java.util.List<ContactConfig> contactConfig;

    @com.aliyun.core.annotation.NameInMap("DefaultContact")
    private DefaultContact defaultContact;

    @com.aliyun.core.annotation.NameInMap("NotifyConfig")
    private java.util.List<NotifyConfig> notifyConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserAlarmConfigResponseBody(Builder builder) {
        this.alarmConfig = builder.alarmConfig;
        this.alarmLang = builder.alarmLang;
        this.contactConfig = builder.contactConfig;
        this.defaultContact = builder.defaultContact;
        this.notifyConfig = builder.notifyConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAlarmConfigResponseBody create() {
        return builder().build();
    }

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
     * @return defaultContact
     */
    public DefaultContact getDefaultContact() {
        return this.defaultContact;
    }

    /**
     * @return notifyConfig
     */
    public java.util.List<NotifyConfig> getNotifyConfig() {
        return this.notifyConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AlarmConfig> alarmConfig; 
        private String alarmLang; 
        private java.util.List<ContactConfig> contactConfig; 
        private DefaultContact defaultContact; 
        private java.util.List<NotifyConfig> notifyConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserAlarmConfigResponseBody model) {
            this.alarmConfig = model.alarmConfig;
            this.alarmLang = model.alarmLang;
            this.contactConfig = model.contactConfig;
            this.defaultContact = model.defaultContact;
            this.notifyConfig = model.notifyConfig;
            this.requestId = model.requestId;
        } 

        /**
         * AlarmConfig.
         */
        public Builder alarmConfig(java.util.List<AlarmConfig> alarmConfig) {
            this.alarmConfig = alarmConfig;
            return this;
        }

        /**
         * AlarmLang.
         */
        public Builder alarmLang(String alarmLang) {
            this.alarmLang = alarmLang;
            return this;
        }

        /**
         * ContactConfig.
         */
        public Builder contactConfig(java.util.List<ContactConfig> contactConfig) {
            this.contactConfig = contactConfig;
            return this;
        }

        /**
         * DefaultContact.
         */
        public Builder defaultContact(DefaultContact defaultContact) {
            this.defaultContact = defaultContact;
            return this;
        }

        /**
         * NotifyConfig.
         */
        public Builder notifyConfig(java.util.List<NotifyConfig> notifyConfig) {
            this.notifyConfig = notifyConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserAlarmConfigResponseBody build() {
            return new DescribeUserAlarmConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserAlarmConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAlarmConfigResponseBody</p>
     */
    public static class AlarmConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmHour")
        private Integer alarmHour;

        @com.aliyun.core.annotation.NameInMap("AlarmNotify")
        private Integer alarmNotify;

        @com.aliyun.core.annotation.NameInMap("AlarmPeriod")
        private Integer alarmPeriod;

        @com.aliyun.core.annotation.NameInMap("AlarmType")
        private String alarmType;

        @com.aliyun.core.annotation.NameInMap("AlarmValue")
        private String alarmValue;

        @com.aliyun.core.annotation.NameInMap("AlarmWeekDay")
        private Integer alarmWeekDay;

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
        public Integer getAlarmHour() {
            return this.alarmHour;
        }

        /**
         * @return alarmNotify
         */
        public Integer getAlarmNotify() {
            return this.alarmNotify;
        }

        /**
         * @return alarmPeriod
         */
        public Integer getAlarmPeriod() {
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
        public Integer getAlarmWeekDay() {
            return this.alarmWeekDay;
        }

        public static final class Builder {
            private Integer alarmHour; 
            private Integer alarmNotify; 
            private Integer alarmPeriod; 
            private String alarmType; 
            private String alarmValue; 
            private Integer alarmWeekDay; 

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
            public Builder alarmHour(Integer alarmHour) {
                this.alarmHour = alarmHour;
                return this;
            }

            /**
             * AlarmNotify.
             */
            public Builder alarmNotify(Integer alarmNotify) {
                this.alarmNotify = alarmNotify;
                return this;
            }

            /**
             * AlarmPeriod.
             */
            public Builder alarmPeriod(Integer alarmPeriod) {
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
            public Builder alarmWeekDay(Integer alarmWeekDay) {
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
     * {@link DescribeUserAlarmConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAlarmConfigResponseBody</p>
     */
    public static class ContactConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("MobilePhone")
        private String mobilePhone;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

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
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String email; 
            private String mobilePhone; 
            private String name; 
            private Integer status; 

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
            public Builder status(Integer status) {
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
     * {@link DescribeUserAlarmConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAlarmConfigResponseBody</p>
     */
    public static class DefaultContact extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("MobilePhone")
        private String mobilePhone;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DefaultContact(Builder builder) {
            this.email = builder.email;
            this.mobilePhone = builder.mobilePhone;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultContact create() {
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

            private Builder(DefaultContact model) {
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

            public DefaultContact build() {
                return new DefaultContact(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserAlarmConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserAlarmConfigResponseBody</p>
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
