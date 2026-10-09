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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserAlarmConfigResponseBody(Builder builder) {
        this.alarmConfig = builder.alarmConfig;
        this.alarmLang = builder.alarmLang;
        this.contactConfig = builder.contactConfig;
        this.defaultContact = builder.defaultContact;
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
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserAlarmConfigResponseBody model) {
            this.alarmConfig = model.alarmConfig;
            this.alarmLang = model.alarmLang;
            this.contactConfig = model.contactConfig;
            this.defaultContact = model.defaultContact;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The alarm configuration.</p>
         */
        public Builder alarmConfig(java.util.List<AlarmConfig> alarmConfig) {
            this.alarmConfig = alarmConfig;
            return this;
        }

        /**
         * <p>The language of the alarm notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder alarmLang(String alarmLang) {
            this.alarmLang = alarmLang;
            return this;
        }

        /**
         * <p>The contact information.</p>
         */
        public Builder contactConfig(java.util.List<ContactConfig> contactConfig) {
            this.contactConfig = contactConfig;
            return this;
        }

        /**
         * <p>Information about the default alarm contact.</p>
         */
        public Builder defaultContact(DefaultContact defaultContact) {
            this.defaultContact = defaultContact;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9D250177-4F11-58B8-9AFE-A4624FF1****</p>
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
             * <p>The alarm threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder alarmHour(Integer alarmHour) {
                this.alarmHour = alarmHour;
                return this;
            }

            /**
             * <p>The notification method.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alarmNotify(Integer alarmNotify) {
                this.alarmNotify = alarmNotify;
                return this;
            }

            /**
             * <p>The alarm period.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder alarmPeriod(Integer alarmPeriod) {
                this.alarmPeriod = alarmPeriod;
                return this;
            }

            /**
             * <p>The alarm type.</p>
             * 
             * <strong>example:</strong>
             * <p>bandwidth</p>
             */
            public Builder alarmType(String alarmType) {
                this.alarmType = alarmType;
                return this;
            }

            /**
             * <p>The value that triggers the alarm.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder alarmValue(String alarmValue) {
                this.alarmValue = alarmValue;
                return this;
            }

            /**
             * <p>The alarm retry count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p>1530811****@qq.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The mobile number.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * <p>The contact name.</p>
             * 
             * <strong>example:</strong>
             * <p>1531123****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the contact. Valid values: <strong>0</strong> (Disabled) and <strong>1</strong> (Enabled).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The email address of the default contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1530811****@qq.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The mobile number of the default contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1531123****</p>
             */
            public Builder mobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
                return this;
            }

            /**
             * <p>The name of the default contact.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status. Valid values: <strong>normal</strong> (Normal) and <strong>disable</strong> (Disabled).</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
}
