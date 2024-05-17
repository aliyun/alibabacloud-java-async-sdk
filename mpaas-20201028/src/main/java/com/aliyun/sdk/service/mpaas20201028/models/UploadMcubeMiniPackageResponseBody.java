// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMcubeMiniPackageResponseBody} extends {@link TeaModel}
 *
 * <p>UploadMcubeMiniPackageResponseBody</p>
 */
public class UploadMcubeMiniPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("UploadMiniPackageResult")
    private UploadMiniPackageResult uploadMiniPackageResult;

    private UploadMcubeMiniPackageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.uploadMiniPackageResult = builder.uploadMiniPackageResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMcubeMiniPackageResponseBody create() {
        return builder().build();
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

    /**
     * @return uploadMiniPackageResult
     */
    public UploadMiniPackageResult getUploadMiniPackageResult() {
        return this.uploadMiniPackageResult;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private UploadMiniPackageResult uploadMiniPackageResult; 

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

        /**
         * UploadMiniPackageResult.
         */
        public Builder uploadMiniPackageResult(UploadMiniPackageResult uploadMiniPackageResult) {
            this.uploadMiniPackageResult = uploadMiniPackageResult;
            return this;
        }

        public UploadMcubeMiniPackageResponseBody build() {
            return new UploadMcubeMiniPackageResponseBody(this);
        } 

    } 

    public static class ReturnPackageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DebugUrl")
        private String debugUrl;

        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ReturnPackageResult(Builder builder) {
            this.debugUrl = builder.debugUrl;
            this.packageId = builder.packageId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReturnPackageResult create() {
            return builder().build();
        }

        /**
         * @return debugUrl
         */
        public String getDebugUrl() {
            return this.debugUrl;
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String debugUrl; 
            private String packageId; 
            private String userId; 

            /**
             * DebugUrl.
             */
            public Builder debugUrl(String debugUrl) {
                this.debugUrl = debugUrl;
                return this;
            }

            /**
             * PackageId.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ReturnPackageResult build() {
                return new ReturnPackageResult(this);
            } 

        } 

    }
    public static class UploadMiniPackageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("ReturnPackageResult")
        private ReturnPackageResult returnPackageResult;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private UploadMiniPackageResult(Builder builder) {
            this.resultMsg = builder.resultMsg;
            this.returnPackageResult = builder.returnPackageResult;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadMiniPackageResult create() {
            return builder().build();
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return returnPackageResult
         */
        public ReturnPackageResult getReturnPackageResult() {
            return this.returnPackageResult;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String resultMsg; 
            private ReturnPackageResult returnPackageResult; 
            private Boolean success; 

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * ReturnPackageResult.
             */
            public Builder returnPackageResult(ReturnPackageResult returnPackageResult) {
                this.returnPackageResult = returnPackageResult;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public UploadMiniPackageResult build() {
                return new UploadMiniPackageResult(this);
            } 

        } 

    }
}
