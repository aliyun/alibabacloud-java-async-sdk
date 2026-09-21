// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetRuntimeChannelResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuntimeChannelResponseBody</p>
 */
public class GetRuntimeChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetRuntimeChannelResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuntimeChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetRuntimeChannelResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetRuntimeChannelResponseBody build() {
            return new GetRuntimeChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuntimeChannelResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuntimeChannelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("ChannelType")
        private String channelType;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("ConfigMode")
        private String configMode;

        @com.aliyun.core.annotation.NameInMap("QrCodeNotifyUrl")
        private String qrCodeNotifyUrl;

        @com.aliyun.core.annotation.NameInMap("QrCodeStatus")
        private String qrCodeStatus;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.channelType = builder.channelType;
            this.code = builder.code;
            this.config = builder.config;
            this.configMode = builder.configMode;
            this.qrCodeNotifyUrl = builder.qrCodeNotifyUrl;
            this.qrCodeStatus = builder.qrCodeStatus;
            this.riskType = builder.riskType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return channelType
         */
        public String getChannelType() {
            return this.channelType;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return configMode
         */
        public String getConfigMode() {
            return this.configMode;
        }

        /**
         * @return qrCodeNotifyUrl
         */
        public String getQrCodeNotifyUrl() {
            return this.qrCodeNotifyUrl;
        }

        /**
         * @return qrCodeStatus
         */
        public String getQrCodeStatus() {
            return this.qrCodeStatus;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String channelType; 
            private String code; 
            private String config; 
            private String configMode; 
            private String qrCodeNotifyUrl; 
            private String qrCodeStatus; 
            private String riskType; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.avatarUrl = model.avatarUrl;
                this.channelType = model.channelType;
                this.code = model.code;
                this.config = model.config;
                this.configMode = model.configMode;
                this.qrCodeNotifyUrl = model.qrCodeNotifyUrl;
                this.qrCodeStatus = model.qrCodeStatus;
                this.riskType = model.riskType;
                this.status = model.status;
            } 

            /**
             * <p>The channel avatar URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.com/test.jpg">https://test.com/test.jpg</a></p>
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * <p>The channel type.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder channelType(String channelType) {
                this.channelType = channelType;
                return this;
            }

            /**
             * <p>The channel code.</p>
             * 
             * <strong>example:</strong>
             * <p>dingtalk-connector</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The channel configuration JSON string.</p>
             * <p>Currently, only the simple configuration mode is supported. You must pass AppKey and AppSecret.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;appKey&quot;: &quot;abc&quot;,
             *     &quot;appSecret&quot;: &quot;efg&quot;
             * }</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The configuration mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Simple</p>
             */
            public Builder configMode(String configMode) {
                this.configMode = configMode;
                return this;
            }

            /**
             * <p>The QR code configuration notification page URL (returned only for ENTERPRISE/ENTERPRISE_JVS platforms).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eds.console.aliyun.com/public/scan-pair?taskId=e7eb5d86-1b94-4d58-****-3b78b01df99e&code=dingtalk-connector&region=cn-shanghai">https://eds.console.aliyun.com/public/scan-pair?taskId=e7eb5d86-1b94-4d58-****-3b78b01df99e&amp;code=dingtalk-connector&amp;region=cn-shanghai</a></p>
             */
            public Builder qrCodeNotifyUrl(String qrCodeNotifyUrl) {
                this.qrCodeNotifyUrl = qrCodeNotifyUrl;
                return this;
            }

            /**
             * <p>The QR code configuration status (returned only when not in a desired state).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://q.qq.com/qqbot/openclaw/entity-picker.html?session_id=c0882266-77c0-4094-af93-442*****2a58">https://q.qq.com/qqbot/openclaw/entity-picker.html?session_id=c0882266-77c0-4094-af93-442*****2a58</a></p>
             */
            public Builder qrCodeStatus(String qrCodeStatus) {
                this.qrCodeStatus = qrCodeStatus;
                return this;
            }

            /**
             * <p>The risk type (returned only when <strong>includeRiskInfo=true</strong>).</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * <p>The configuration status.</p>
             * 
             * <strong>example:</strong>
             * <p>Configured</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
