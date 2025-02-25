// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportMappCenterAppConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ExportMappCenterAppConfigResponseBody</p>
 */
public class ExportMappCenterAppConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportMappCenterAppConfigResult")
    private ExportMappCenterAppConfigResult exportMappCenterAppConfigResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ExportMappCenterAppConfigResponseBody(Builder builder) {
        this.exportMappCenterAppConfigResult = builder.exportMappCenterAppConfigResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportMappCenterAppConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return exportMappCenterAppConfigResult
     */
    public ExportMappCenterAppConfigResult getExportMappCenterAppConfigResult() {
        return this.exportMappCenterAppConfigResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private ExportMappCenterAppConfigResult exportMappCenterAppConfigResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ExportMappCenterAppConfigResult.
         */
        public Builder exportMappCenterAppConfigResult(ExportMappCenterAppConfigResult exportMappCenterAppConfigResult) {
            this.exportMappCenterAppConfigResult = exportMappCenterAppConfigResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ExportMappCenterAppConfigResponseBody build() {
            return new ExportMappCenterAppConfigResponseBody(this);
        } 

    } 

    public static class ExportMappCenterAppConfigResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigDownloadUrl")
        private String configDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private ExportMappCenterAppConfigResult(Builder builder) {
            this.configDownloadUrl = builder.configDownloadUrl;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportMappCenterAppConfigResult create() {
            return builder().build();
        }

        /**
         * @return configDownloadUrl
         */
        public String getConfigDownloadUrl() {
            return this.configDownloadUrl;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String configDownloadUrl; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * ConfigDownloadUrl.
             */
            public Builder configDownloadUrl(String configDownloadUrl) {
                this.configDownloadUrl = configDownloadUrl;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public ExportMappCenterAppConfigResult build() {
                return new ExportMappCenterAppConfigResult(this);
            } 

        } 

    }
}
