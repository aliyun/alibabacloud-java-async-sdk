// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommonApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CommonApplyQueryResponseBody</p>
 */
public class CommonApplyQueryResponseBody extends TeaModel {
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

    private CommonApplyQueryResponseBody(Builder builder) {
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

    public static CommonApplyQueryResponseBody create() {
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

        public CommonApplyQueryResponseBody build() {
            return new CommonApplyQueryResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("apply_id")
        private Long applyId;

        @NameInMap("biz_category")
        private Integer bizCategory;

        @NameInMap("cause")
        private String cause;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("extend_value")
        private String extendValue;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("status")
        private Integer status;

        @NameInMap("thirdpart_corp_id")
        private String thirdpartCorpId;

        @NameInMap("thirdpart_id")
        private String thirdpartId;

        @NameInMap("trip_cause")
        private String tripCause;

        @NameInMap("user_id")
        private String userId;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.bizCategory = builder.bizCategory;
            this.cause = builder.cause;
            this.corpId = builder.corpId;
            this.extendValue = builder.extendValue;
            this.gmtCreate = builder.gmtCreate;
            this.status = builder.status;
            this.thirdpartCorpId = builder.thirdpartCorpId;
            this.thirdpartId = builder.thirdpartId;
            this.tripCause = builder.tripCause;
            this.userId = builder.userId;
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
         * @return bizCategory
         */
        public Integer getBizCategory() {
            return this.bizCategory;
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return extendValue
         */
        public String getExtendValue() {
            return this.extendValue;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return thirdpartCorpId
         */
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        /**
         * @return thirdpartId
         */
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        /**
         * @return tripCause
         */
        public String getTripCause() {
            return this.tripCause;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long applyId; 
            private Integer bizCategory; 
            private String cause; 
            private String corpId; 
            private String extendValue; 
            private String gmtCreate; 
            private Integer status; 
            private String thirdpartCorpId; 
            private String thirdpartId; 
            private String tripCause; 
            private String userId; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * biz_category.
             */
            public Builder bizCategory(Integer bizCategory) {
                this.bizCategory = bizCategory;
                return this;
            }

            /**
             * cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * extend_value.
             */
            public Builder extendValue(String extendValue) {
                this.extendValue = extendValue;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * thirdpart_corp_id.
             */
            public Builder thirdpartCorpId(String thirdpartCorpId) {
                this.thirdpartCorpId = thirdpartCorpId;
                return this;
            }

            /**
             * thirdpart_id.
             */
            public Builder thirdpartId(String thirdpartId) {
                this.thirdpartId = thirdpartId;
                return this;
            }

            /**
             * trip_cause.
             */
            public Builder tripCause(String tripCause) {
                this.tripCause = tripCause;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
