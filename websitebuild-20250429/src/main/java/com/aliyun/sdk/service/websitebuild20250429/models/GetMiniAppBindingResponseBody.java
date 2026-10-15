// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetMiniAppBindingResponseBody} extends {@link TeaModel}
 *
 * <p>GetMiniAppBindingResponseBody</p>
 */
public class GetMiniAppBindingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMiniAppBindingResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMiniAppBindingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMiniAppBindingResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The request result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMiniAppBindingResponseBody build() {
            return new GetMiniAppBindingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMiniAppBindingResponseBody} extends {@link TeaModel}
     *
     * <p>GetMiniAppBindingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthStatus")
        private String authStatus;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("IcpFiled")
        private Boolean icpFiled;

        @com.aliyun.core.annotation.NameInMap("PlatformAppid")
        private String platformAppid;

        @com.aliyun.core.annotation.NameInMap("PreviewQrCodeUrl")
        private String previewQrCodeUrl;

        @com.aliyun.core.annotation.NameInMap("ProductionQrCodeUrl")
        private String productionQrCodeUrl;

        @com.aliyun.core.annotation.NameInMap("SettingValues")
        private java.util.Map<String, String> settingValues;

        private Data(Builder builder) {
            this.authStatus = builder.authStatus;
            this.bizId = builder.bizId;
            this.icpFiled = builder.icpFiled;
            this.platformAppid = builder.platformAppid;
            this.previewQrCodeUrl = builder.previewQrCodeUrl;
            this.productionQrCodeUrl = builder.productionQrCodeUrl;
            this.settingValues = builder.settingValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authStatus
         */
        public String getAuthStatus() {
            return this.authStatus;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return icpFiled
         */
        public Boolean getIcpFiled() {
            return this.icpFiled;
        }

        /**
         * @return platformAppid
         */
        public String getPlatformAppid() {
            return this.platformAppid;
        }

        /**
         * @return previewQrCodeUrl
         */
        public String getPreviewQrCodeUrl() {
            return this.previewQrCodeUrl;
        }

        /**
         * @return productionQrCodeUrl
         */
        public String getProductionQrCodeUrl() {
            return this.productionQrCodeUrl;
        }

        /**
         * @return settingValues
         */
        public java.util.Map<String, String> getSettingValues() {
            return this.settingValues;
        }

        public static final class Builder {
            private String authStatus; 
            private String bizId; 
            private Boolean icpFiled; 
            private String platformAppid; 
            private String previewQrCodeUrl; 
            private String productionQrCodeUrl; 
            private java.util.Map<String, String> settingValues; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authStatus = model.authStatus;
                this.bizId = model.bizId;
                this.icpFiled = model.icpFiled;
                this.platformAppid = model.platformAppid;
                this.previewQrCodeUrl = model.previewQrCodeUrl;
                this.productionQrCodeUrl = model.productionQrCodeUrl;
                this.settingValues = model.settingValues;
            } 

            /**
             * <p>The authorization status.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder authStatus(String authStatus) {
                this.authStatus = authStatus;
                return this;
            }

            /**
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>WS20260206134402000001</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The ICP filing status.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder icpFiled(Boolean icpFiled) {
                this.icpFiled = icpFiled;
                return this;
            }

            /**
             * <p>The mini program ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wx7f122a7d23fdxxxx</p>
             */
            public Builder platformAppid(String platformAppid) {
                this.platformAppid = platformAppid;
                return this;
            }

            /**
             * <p>The preview QR code URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx">http://xxxx</a></p>
             */
            public Builder previewQrCodeUrl(String previewQrCodeUrl) {
                this.previewQrCodeUrl = previewQrCodeUrl;
                return this;
            }

            /**
             * <p>The production QR code URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx">http://xxxx</a></p>
             */
            public Builder productionQrCodeUrl(String productionQrCodeUrl) {
                this.productionQrCodeUrl = productionQrCodeUrl;
                return this;
            }

            /**
             * <p>The extension information.</p>
             */
            public Builder settingValues(java.util.Map<String, String> settingValues) {
                this.settingValues = settingValues;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
