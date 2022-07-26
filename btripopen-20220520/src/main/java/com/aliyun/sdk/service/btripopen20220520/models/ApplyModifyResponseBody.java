// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyModifyResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyModifyResponseBody</p>
 */
public class ApplyModifyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("module")
    private Module module;

    @NameInMap("result_code")
    private Integer resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private ApplyModifyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.module = builder.module;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyModifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return resultCode
     */
    public Integer getResultCode() {
        return this.resultCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String requestId; 
        private Module module; 
        private Integer resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * result_code.
         */
        public Builder resultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * result_msg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ApplyModifyResponseBody build() {
            return new ApplyModifyResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("apply_id")
        private Long applyId;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartBusinessId = builder.thirdpartBusinessId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartBusinessId
         */
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

        public static final class Builder {
            private Long applyId; 
            private String thirdpartApplyId; 
            private String thirdpartBusinessId; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * thirdpart_business_id.
             */
            public Builder thirdpartBusinessId(String thirdpartBusinessId) {
                this.thirdpartBusinessId = thirdpartBusinessId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
