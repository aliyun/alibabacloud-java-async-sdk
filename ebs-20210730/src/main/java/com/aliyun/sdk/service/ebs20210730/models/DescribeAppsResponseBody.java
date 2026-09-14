// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsResponseBody</p>
 */
public class DescribeAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AppInfos")
    private java.util.List<AppInfos> appInfos;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UserCode")
    private String userCode;

    private DescribeAppsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.appInfos = builder.appInfos;
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userCode = builder.userCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return appInfos
     */
    public java.util.List<AppInfos> getAppInfos() {
        return this.appInfos;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return userCode
     */
    public String getUserCode() {
        return this.userCode;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<AppInfos> appInfos; 
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String userCode; 

        private Builder() {
        } 

        private Builder(DescribeAppsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.appInfos = model.appInfos;
            this.code = model.code;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.userCode = model.userCode;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The application information.</p>
         */
        public Builder appInfos(java.util.List<AppInfos> appInfos) {
            this.appInfos = appInfos;
            return this;
        }

        /**
         * <p>The internal error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace the %s variable in the ErrMessage error message.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1C00637-AC84-5EFD-89B5-D5CE39F0F2B1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The user error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder userCode(String userCode) {
            this.userCode = userCode;
            return this;
        }

        public DescribeAppsResponseBody build() {
            return new DescribeAppsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsResponseBody</p>
     */
    public static class AppTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private AppTags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppTags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(AppTags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>ebs</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public AppTags build() {
                return new AppTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAppsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppsResponseBody</p>
     */
    public static class AppInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppTags")
        private java.util.List<AppTags> appTags;

        @com.aliyun.core.annotation.NameInMap("Default")
        private Boolean _default;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventBridgeSendEnabled")
        private Boolean eventBridgeSendEnabled;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("MonitorSendEnabled")
        private Boolean monitorSendEnabled;

        @com.aliyun.core.annotation.NameInMap("ReportSendEnabled")
        private Boolean reportSendEnabled;

        @com.aliyun.core.annotation.NameInMap("SlsSendEnabled")
        private Boolean slsSendEnabled;

        @com.aliyun.core.annotation.NameInMap("SubscribePeriod")
        private String subscribePeriod;

        @com.aliyun.core.annotation.NameInMap("SubscribeStatus")
        private String subscribeStatus;

        private AppInfos(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appTags = builder.appTags;
            this._default = builder._default;
            this.description = builder.description;
            this.eventBridgeSendEnabled = builder.eventBridgeSendEnabled;
            this.modifyTime = builder.modifyTime;
            this.monitorSendEnabled = builder.monitorSendEnabled;
            this.reportSendEnabled = builder.reportSendEnabled;
            this.slsSendEnabled = builder.slsSendEnabled;
            this.subscribePeriod = builder.subscribePeriod;
            this.subscribeStatus = builder.subscribeStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfos create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appTags
         */
        public java.util.List<AppTags> getAppTags() {
            return this.appTags;
        }

        /**
         * @return _default
         */
        public Boolean get_default() {
            return this._default;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventBridgeSendEnabled
         */
        public Boolean getEventBridgeSendEnabled() {
            return this.eventBridgeSendEnabled;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return monitorSendEnabled
         */
        public Boolean getMonitorSendEnabled() {
            return this.monitorSendEnabled;
        }

        /**
         * @return reportSendEnabled
         */
        public Boolean getReportSendEnabled() {
            return this.reportSendEnabled;
        }

        /**
         * @return slsSendEnabled
         */
        public Boolean getSlsSendEnabled() {
            return this.slsSendEnabled;
        }

        /**
         * @return subscribePeriod
         */
        public String getSubscribePeriod() {
            return this.subscribePeriod;
        }

        /**
         * @return subscribeStatus
         */
        public String getSubscribeStatus() {
            return this.subscribeStatus;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private java.util.List<AppTags> appTags; 
            private Boolean _default; 
            private String description; 
            private Boolean eventBridgeSendEnabled; 
            private Long modifyTime; 
            private Boolean monitorSendEnabled; 
            private Boolean reportSendEnabled; 
            private Boolean slsSendEnabled; 
            private String subscribePeriod; 
            private String subscribeStatus; 

            private Builder() {
            } 

            private Builder(AppInfos model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appTags = model.appTags;
                this._default = model._default;
                this.description = model.description;
                this.eventBridgeSendEnabled = model.eventBridgeSendEnabled;
                this.modifyTime = model.modifyTime;
                this.monitorSendEnabled = model.monitorSendEnabled;
                this.reportSendEnabled = model.reportSendEnabled;
                this.slsSendEnabled = model.slsSendEnabled;
                this.subscribePeriod = model.subscribePeriod;
                this.subscribeStatus = model.subscribeStatus;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-bd5e3533</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name. This parameter takes effect only when ReportType is set to present.</p>
             * 
             * <strong>example:</strong>
             * <p>app1</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The tags contained in the user application.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder appTags(java.util.List<AppTags> appTags) {
                this.appTags = appTags;
                return this;
            }

            /**
             * <p>The default time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder _default(Boolean _default) {
                this._default = _default;
                return this;
            }

            /**
             * <p>The event description.</p>
             * 
             * <strong>example:</strong>
             * <p>This app is used to collect cloud disk usage statistics across the network</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether delivery to EventBridge is enabled.</p>
             */
            public Builder eventBridgeSendEnabled(Boolean eventBridgeSendEnabled) {
                this.eventBridgeSendEnabled = eventBridgeSendEnabled;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-14T02:11:32Z</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>Indicates whether delivery to CloudMonitor is enabled.</p>
             */
            public Builder monitorSendEnabled(Boolean monitorSendEnabled) {
                this.monitorSendEnabled = monitorSendEnabled;
                return this;
            }

            /**
             * <p>Indicates whether report sending is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder reportSendEnabled(Boolean reportSendEnabled) {
                this.reportSendEnabled = reportSendEnabled;
                return this;
            }

            /**
             * <p>Indicates whether delivery to Simple Log Service (SLS) is enabled.</p>
             */
            public Builder slsSendEnabled(Boolean slsSendEnabled) {
                this.slsSendEnabled = slsSendEnabled;
                return this;
            }

            /**
             * <p>The report subscription period.</p>
             * 
             * <strong>example:</strong>
             * <p>Weekly</p>
             */
            public Builder subscribePeriod(String subscribePeriod) {
                this.subscribePeriod = subscribePeriod;
                return this;
            }

            /**
             * <p>The subscription status. Valid values:</p>
             * <ul>
             * <li>Subscribe: subscribed.</li>
             * <li>UnSubscribe: not subscribed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Subscribe</p>
             */
            public Builder subscribeStatus(String subscribeStatus) {
                this.subscribeStatus = subscribeStatus;
                return this;
            }

            public AppInfos build() {
                return new AppInfos(this);
            } 

        } 

    }
}
