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
 * {@link GetRuntimeChannelQrCodeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuntimeChannelQrCodeDetailResponseBody</p>
 */
public class GetRuntimeChannelQrCodeDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRuntimeChannelQrCodeDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuntimeChannelQrCodeDetailResponseBody create() {
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

        private Builder(GetRuntimeChannelQrCodeDetailResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The QR code configuration details of the channel. If no QR code configuration process exists for the channel under the specified runtime, this field is empty.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRuntimeChannelQrCodeDetailResponseBody build() {
            return new GetRuntimeChannelQrCodeDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuntimeChannelQrCodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuntimeChannelQrCodeDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QrCode")
        private String qrCode;

        @com.aliyun.core.annotation.NameInMap("QrCodeNotifyUrl")
        private String qrCodeNotifyUrl;

        @com.aliyun.core.annotation.NameInMap("QrCodeStatus")
        private String qrCodeStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.qrCode = builder.qrCode;
            this.qrCodeNotifyUrl = builder.qrCodeNotifyUrl;
            this.qrCodeStatus = builder.qrCodeStatus;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return qrCode
         */
        public String getQrCode() {
            return this.qrCode;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String qrCode; 
            private String qrCodeNotifyUrl; 
            private String qrCodeStatus; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.qrCode = model.qrCode;
                this.qrCodeNotifyUrl = model.qrCodeNotifyUrl;
                this.qrCodeStatus = model.qrCodeStatus;
                this.status = model.status;
            } 

            /**
             * <p>The URL or content of the QR code. If the QR code is not generated or the content is empty, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://qr.example.com/abc">https://qr.example.com/abc</a></p>
             */
            public Builder qrCode(String qrCode) {
                this.qrCode = qrCode;
                return this;
            }

            /**
             * <p>The access URL of the QR code configuration channel page. It is generated and sent to the user when the QR code configuration is initiated, and carries the taskId, channel code, and region parameters of the current process. If the URL is not recorded, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&code=dingtalk-connector&region=cn-shanghai">https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&amp;code=dingtalk-connector&amp;region=cn-shanghai</a></p>
             */
            public Builder qrCodeNotifyUrl(String qrCodeNotifyUrl) {
                this.qrCodeNotifyUrl = qrCodeNotifyUrl;
                return this;
            }

            /**
             * <p>The QR code scan status. Valid values:</p>
             * <ul>
             * <li>Generating: The QR code is being generated.</li>
             * <li>Generated: The QR code is generated.</li>
             * <li>GenerateFailed: The QR code generation failed.</li>
             * <li>Scanned: The QR code is scanned.</li>
             * <li>Configuring: The configuration is in progress.</li>
             * <li>Success: The configuration is successful.</li>
             * <li>Failed: The configuration failed.</li>
             * <li>Expired: The process has expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Generated</p>
             */
            public Builder qrCodeStatus(String qrCodeStatus) {
                this.qrCodeStatus = qrCodeStatus;
                return this;
            }

            /**
             * <p>The status of the QR code configuration process. The value is the same as QrCodeStatus. Valid values:</p>
             * <ul>
             * <li>Generating: The QR code is being generated.</li>
             * <li>Generated: The QR code is generated.</li>
             * <li>GenerateFailed: The QR code generation failed.</li>
             * <li>Scanned: The QR code is scanned.</li>
             * <li>Configuring: The configuration is in progress.</li>
             * <li>Success: The configuration is successful.</li>
             * <li>Failed: The configuration failed.</li>
             * <li>Expired: The process has expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
