// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudGtmInstanceConfigAlertResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmInstanceConfigAlertResponseBody</p>
 */
public class DescribeCloudGtmInstanceConfigAlertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertConfig")
    private AlertConfig alertConfig;

    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private AlertGroup alertGroup;

    @com.aliyun.core.annotation.NameInMap("AlertMode")
    private String alertMode;

    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudGtmInstanceConfigAlertResponseBody(Builder builder) {
        this.alertConfig = builder.alertConfig;
        this.alertGroup = builder.alertGroup;
        this.alertMode = builder.alertMode;
        this.configId = builder.configId;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmInstanceConfigAlertResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertConfig
     */
    public AlertConfig getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return alertGroup
     */
    public AlertGroup getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return alertMode
     */
    public String getAlertMode() {
        return this.alertMode;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertConfig alertConfig; 
        private AlertGroup alertGroup; 
        private String alertMode; 
        private String configId; 
        private String instanceId; 
        private String requestId; 

        /**
         * AlertConfig.
         */
        public Builder alertConfig(AlertConfig alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * AlertGroup.
         */
        public Builder alertGroup(AlertGroup alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * AlertMode.
         */
        public Builder alertMode(String alertMode) {
            this.alertMode = alertMode;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBody build() {
            return new DescribeCloudGtmInstanceConfigAlertResponseBody(this);
        } 

    } 

    public static class AlertConfigAlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DingtalkNotice")
        private Boolean dingtalkNotice;

        @com.aliyun.core.annotation.NameInMap("EmailNotice")
        private Boolean emailNotice;

        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private String noticeType;

        @com.aliyun.core.annotation.NameInMap("SmsNotice")
        private Boolean smsNotice;

        private AlertConfigAlertConfig(Builder builder) {
            this.dingtalkNotice = builder.dingtalkNotice;
            this.emailNotice = builder.emailNotice;
            this.noticeType = builder.noticeType;
            this.smsNotice = builder.smsNotice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfigAlertConfig create() {
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

            public AlertConfigAlertConfig build() {
                return new AlertConfigAlertConfig(this);
            } 

        } 

    }
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private java.util.List < AlertConfigAlertConfig> alertConfig;

        private AlertConfig(Builder builder) {
            this.alertConfig = builder.alertConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertConfig create() {
            return builder().build();
        }

        /**
         * @return alertConfig
         */
        public java.util.List < AlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

        public static final class Builder {
            private java.util.List < AlertConfigAlertConfig> alertConfig; 

            /**
             * AlertConfig.
             */
            public Builder alertConfig(java.util.List < AlertConfigAlertConfig> alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            public AlertConfig build() {
                return new AlertConfig(this);
            } 

        } 

    }
    public static class AlertGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertGroup")
        private java.util.List < String > alertGroup;

        private AlertGroup(Builder builder) {
            this.alertGroup = builder.alertGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertGroup create() {
            return builder().build();
        }

        /**
         * @return alertGroup
         */
        public java.util.List < String > getAlertGroup() {
            return this.alertGroup;
        }

        public static final class Builder {
            private java.util.List < String > alertGroup; 

            /**
             * AlertGroup.
             */
            public Builder alertGroup(java.util.List < String > alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            public AlertGroup build() {
                return new AlertGroup(this);
            } 

        } 

    }
}
