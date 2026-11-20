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
 * {@link SendRuntimeQrCodeConfigChannelMessageResponseBody} extends {@link TeaModel}
 *
 * <p>SendRuntimeQrCodeConfigChannelMessageResponseBody</p>
 */
public class SendRuntimeQrCodeConfigChannelMessageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private SendRuntimeQrCodeConfigChannelMessageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendRuntimeQrCodeConfigChannelMessageResponseBody create() {
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

        private Builder(SendRuntimeQrCodeConfigChannelMessageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of sending results for each runtime. Each runtime corresponds to one result. The return order is not guaranteed to be the same as the order of RuntimeIds in the request. Match the results by RuntimeId.</p>
         */
        public Builder data(java.util.List<Data> data) {
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

        /**
         * <p>The total number of returned sending results, which is the same as the number of results in Data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SendRuntimeQrCodeConfigChannelMessageResponseBody build() {
            return new SendRuntimeQrCodeConfigChannelMessageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SendRuntimeQrCodeConfigChannelMessageResponseBody} extends {@link TeaModel}
     *
     * <p>SendRuntimeQrCodeConfigChannelMessageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("QrCodeNotifyUrl")
        private String qrCodeNotifyUrl;

        @com.aliyun.core.annotation.NameInMap("RuntimeId")
        private String runtimeId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.qrCodeNotifyUrl = builder.qrCodeNotifyUrl;
            this.runtimeId = builder.runtimeId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return qrCodeNotifyUrl
         */
        public String getQrCodeNotifyUrl() {
            return this.qrCodeNotifyUrl;
        }

        /**
         * @return runtimeId
         */
        public String getRuntimeId() {
            return this.runtimeId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String qrCodeNotifyUrl; 
            private String runtimeId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.message = model.message;
                this.qrCodeNotifyUrl = model.qrCodeNotifyUrl;
                this.runtimeId = model.runtimeId;
                this.success = model.success;
            } 

            /**
             * <p>The error code when the sending fails, such as Runtime.NotFound (the runtime does not exist) or Runtime.UserNotSupported (the runtime has no authorized users or has multiple authorized users). This parameter is not returned when the sending is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Runtime.UserNotSupported</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message when the sending fails. This parameter is not returned when the sending is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>Runtime has no authorized user</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The access URL of the QR code configuration channel page. It carries the taskId, channel code, and region parameters for the current process, and has been sent to the authorized user of the runtime by email and SMS. This parameter is returned only when the sending is successful. The taskId is valid for 1 hour.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&code=feishu&region=cn-shanghai">https://eds.console.aliyun.com/public/scan-pair?taskId=8f14e45f-ceea-4672-9f6e-3c5b2a1d****&amp;code=feishu&amp;region=cn-shanghai</a></p>
             */
            public Builder qrCodeNotifyUrl(String qrCodeNotifyUrl) {
                this.qrCodeNotifyUrl = qrCodeNotifyUrl;
                return this;
            }

            /**
             * <p>The ID of the runtime resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-xgads</p>
             */
            public Builder runtimeId(String runtimeId) {
                this.runtimeId = runtimeId;
                return this;
            }

            /**
             * <p>Indicates whether the QR code configuration channel message for the runtime was initiated successfully. If the value is false, you can check the Code and Message fields for the cause of the failure.</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
