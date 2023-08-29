// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMcubeWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMcubeWhitelistResponseBody</p>
 */
public class UpdateMcubeWhitelistResponseBody extends TeaModel {
    @NameInMap("AddWhitelistResult")
    private AddWhitelistResult addWhitelistResult;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private UpdateMcubeWhitelistResponseBody(Builder builder) {
        this.addWhitelistResult = builder.addWhitelistResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMcubeWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return addWhitelistResult
     */
    public AddWhitelistResult getAddWhitelistResult() {
        return this.addWhitelistResult;
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
        private AddWhitelistResult addWhitelistResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * AddWhitelistResult.
         */
        public Builder addWhitelistResult(AddWhitelistResult addWhitelistResult) {
            this.addWhitelistResult = addWhitelistResult;
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

        public UpdateMcubeWhitelistResponseBody build() {
            return new UpdateMcubeWhitelistResponseBody(this);
        } 

    } 

    public static class AddWhitelistInfo extends TeaModel {
        @NameInMap("FailNum")
        private Long failNum;

        @NameInMap("FailUserIds")
        private String failUserIds;

        @NameInMap("SuccessNum")
        private Long successNum;

        private AddWhitelistInfo(Builder builder) {
            this.failNum = builder.failNum;
            this.failUserIds = builder.failUserIds;
            this.successNum = builder.successNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddWhitelistInfo create() {
            return builder().build();
        }

        /**
         * @return failNum
         */
        public Long getFailNum() {
            return this.failNum;
        }

        /**
         * @return failUserIds
         */
        public String getFailUserIds() {
            return this.failUserIds;
        }

        /**
         * @return successNum
         */
        public Long getSuccessNum() {
            return this.successNum;
        }

        public static final class Builder {
            private Long failNum; 
            private String failUserIds; 
            private Long successNum; 

            /**
             * FailNum.
             */
            public Builder failNum(Long failNum) {
                this.failNum = failNum;
                return this;
            }

            /**
             * FailUserIds.
             */
            public Builder failUserIds(String failUserIds) {
                this.failUserIds = failUserIds;
                return this;
            }

            /**
             * SuccessNum.
             */
            public Builder successNum(Long successNum) {
                this.successNum = successNum;
                return this;
            }

            public AddWhitelistInfo build() {
                return new AddWhitelistInfo(this);
            } 

        } 

    }
    public static class AddWhitelistResult extends TeaModel {
        @NameInMap("AddWhitelistInfo")
        private AddWhitelistInfo addWhitelistInfo;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private AddWhitelistResult(Builder builder) {
            this.addWhitelistInfo = builder.addWhitelistInfo;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddWhitelistResult create() {
            return builder().build();
        }

        /**
         * @return addWhitelistInfo
         */
        public AddWhitelistInfo getAddWhitelistInfo() {
            return this.addWhitelistInfo;
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
            private AddWhitelistInfo addWhitelistInfo; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * AddWhitelistInfo.
             */
            public Builder addWhitelistInfo(AddWhitelistInfo addWhitelistInfo) {
                this.addWhitelistInfo = addWhitelistInfo;
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

            public AddWhitelistResult build() {
                return new AddWhitelistResult(this);
            } 

        } 

    }
}
