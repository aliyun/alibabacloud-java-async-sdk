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
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
                this.code = model.code;
                this.config = model.config;
                this.configMode = model.configMode;
                this.qrCodeNotifyUrl = model.qrCodeNotifyUrl;
                this.qrCodeStatus = model.qrCodeStatus;
                this.riskType = model.riskType;
                this.status = model.status;
            } 

            /**
             * AvatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * ConfigMode.
             */
            public Builder configMode(String configMode) {
                this.configMode = configMode;
                return this;
            }

            /**
             * QrCodeNotifyUrl.
             */
            public Builder qrCodeNotifyUrl(String qrCodeNotifyUrl) {
                this.qrCodeNotifyUrl = qrCodeNotifyUrl;
                return this;
            }

            /**
             * QrCodeStatus.
             */
            public Builder qrCodeStatus(String qrCodeStatus) {
                this.qrCodeStatus = qrCodeStatus;
                return this;
            }

            /**
             * RiskType.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * Status.
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
