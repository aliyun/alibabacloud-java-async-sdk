// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCloudGtmInstanceConfigAlertResponseBody model) {
            this.alertConfig = model.alertConfig;
            this.alertGroup = model.alertGroup;
            this.alertMode = model.alertMode;
            this.configId = model.configId;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The alert configurations.</p>
         */
        public Builder alertConfig(AlertConfig alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * <p>The alert contact groups.</p>
         */
        public Builder alertGroup(AlertGroup alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * <p>The alert configuration mode of the instance. Valid values:</p>
         * <ul>
         * <li>global: global alert configuration</li>
         * <li>instance_config: custom alert configuration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder alertMode(String alertMode) {
            this.alertMode = alertMode;
            return this;
        }

        /**
         * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Config-000**11</p>
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The ID of the GTM 3.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0F32959D-417B-4D66-8463-68606605E3E2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudGtmInstanceConfigAlertResponseBody build() {
            return new DescribeCloudGtmInstanceConfigAlertResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigAlertResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigAlertResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AlertConfigAlertConfig model) {
                this.dingtalkNotice = model.dingtalkNotice;
                this.emailNotice = model.emailNotice;
                this.noticeType = model.noticeType;
                this.smsNotice = model.smsNotice;
            } 

            /**
             * <p>Indicates whether DingTalk notifications are configured. Valid values:</p>
             * <ul>
             * <li>true: DingTalk notifications are configured. DingTalk notifications are sent after alerts are triggered.</li>
             * <li>false: DingTalk notifications are not configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dingtalkNotice(Boolean dingtalkNotice) {
                this.dingtalkNotice = dingtalkNotice;
                return this;
            }

            /**
             * <p>Indicates whether email notifications are configured. Valid values:</p>
             * <ul>
             * <li>true: Email notifications are configured. Emails are sent after alerts are triggered.</li>
             * <li>false: Email notifications are not configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder emailNotice(Boolean emailNotice) {
                this.emailNotice = emailNotice;
                return this;
            }

            /**
             * <p>The type of the alert event. Valid values:</p>
             * <ul>
             * <li>addr_alert: The address is unavailable.</li>
             * <li>addr_resume: The address becomes available.</li>
             * <li>addr_pool_unavailable: The address pool is unavailable.</li>
             * <li>addr_pool_available: The address pool becomes available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>addr_alert</p>
             */
            public Builder noticeType(String noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * <p>Indicates whether text message notifications are configured. Valid values:</p>
             * <ul>
             * <li>true: Text message notifications are configured. Text messages are sent after alerts are triggered.</li>
             * <li>false: Text message notifications are not configured.</li>
             * </ul>
             * <p>Only the China site (aliyun.com) supports text message notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigAlertResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigAlertResponseBody</p>
     */
    public static class AlertConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertConfig")
        private java.util.List<AlertConfigAlertConfig> alertConfig;

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
        public java.util.List<AlertConfigAlertConfig> getAlertConfig() {
            return this.alertConfig;
        }

        public static final class Builder {
            private java.util.List<AlertConfigAlertConfig> alertConfig; 

            private Builder() {
            } 

            private Builder(AlertConfig model) {
                this.alertConfig = model.alertConfig;
            } 

            /**
             * <p>The alert configurations.</p>
             */
            public Builder alertConfig(java.util.List<AlertConfigAlertConfig> alertConfig) {
                this.alertConfig = alertConfig;
                return this;
            }

            public AlertConfig build() {
                return new AlertConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigAlertResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigAlertResponseBody</p>
     */
    public static class AlertGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertGroup")
        private java.util.List<String> alertGroup;

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
        public java.util.List<String> getAlertGroup() {
            return this.alertGroup;
        }

        public static final class Builder {
            private java.util.List<String> alertGroup; 

            private Builder() {
            } 

            private Builder(AlertGroup model) {
                this.alertGroup = model.alertGroup;
            } 

            /**
             * <p>The alert contact groups.</p>
             */
            public Builder alertGroup(java.util.List<String> alertGroup) {
                this.alertGroup = alertGroup;
                return this;
            }

            public AlertGroup build() {
                return new AlertGroup(this);
            } 

        } 

    }
}
