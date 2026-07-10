// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link BatchSubmitPreBillResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSubmitPreBillResponseBody</p>
 */
public class BatchSubmitPreBillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("more_page")
    private Boolean morePage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result_code")
    private Integer resultCode;

    @com.aliyun.core.annotation.NameInMap("result_msg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private BatchSubmitPreBillResponseBody(Builder builder) {
        this.module = builder.module;
        this.morePage = builder.morePage;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSubmitPreBillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return morePage
     */
    public Boolean getMorePage() {
        return this.morePage;
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
        private Module module; 
        private Boolean morePage; 
        private String requestId; 
        private Integer resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(BatchSubmitPreBillResponseBody model) {
            this.module = model.module;
            this.morePage = model.morePage;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * more_page.
         */
        public Builder morePage(Boolean morePage) {
            this.morePage = morePage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public BatchSubmitPreBillResponseBody build() {
            return new BatchSubmitPreBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchSubmitPreBillResponseBody} extends {@link TeaModel}
     *
     * <p>BatchSubmitPreBillResponseBody</p>
     */
    public static class ForbidUpdateDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("can_not_update_count")
        private Integer canNotUpdateCount;

        @com.aliyun.core.annotation.NameInMap("can_update_count")
        private Integer canUpdateCount;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ForbidUpdateDetail(Builder builder) {
            this.canNotUpdateCount = builder.canNotUpdateCount;
            this.canUpdateCount = builder.canUpdateCount;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForbidUpdateDetail create() {
            return builder().build();
        }

        /**
         * @return canNotUpdateCount
         */
        public Integer getCanNotUpdateCount() {
            return this.canNotUpdateCount;
        }

        /**
         * @return canUpdateCount
         */
        public Integer getCanUpdateCount() {
            return this.canUpdateCount;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer canNotUpdateCount; 
            private Integer canUpdateCount; 
            private String value; 

            private Builder() {
            } 

            private Builder(ForbidUpdateDetail model) {
                this.canNotUpdateCount = model.canNotUpdateCount;
                this.canUpdateCount = model.canUpdateCount;
                this.value = model.value;
            } 

            /**
             * can_not_update_count.
             */
            public Builder canNotUpdateCount(Integer canNotUpdateCount) {
                this.canNotUpdateCount = canNotUpdateCount;
                return this;
            }

            /**
             * can_update_count.
             */
            public Builder canUpdateCount(Integer canUpdateCount) {
                this.canUpdateCount = canUpdateCount;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ForbidUpdateDetail build() {
                return new ForbidUpdateDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchSubmitPreBillResponseBody} extends {@link TeaModel}
     *
     * <p>BatchSubmitPreBillResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("batch_id")
        private Long batchId;

        @com.aliyun.core.annotation.NameInMap("forbid_update_bill_count")
        private Integer forbidUpdateBillCount;

        @com.aliyun.core.annotation.NameInMap("forbid_update_detail")
        private java.util.List<ForbidUpdateDetail> forbidUpdateDetail;

        @com.aliyun.core.annotation.NameInMap("match_count")
        private Integer matchCount;

        @com.aliyun.core.annotation.NameInMap("not_match_count")
        private Integer notMatchCount;

        @com.aliyun.core.annotation.NameInMap("not_match_detail")
        private java.util.List<String> notMatchDetail;

        private Module(Builder builder) {
            this.batchId = builder.batchId;
            this.forbidUpdateBillCount = builder.forbidUpdateBillCount;
            this.forbidUpdateDetail = builder.forbidUpdateDetail;
            this.matchCount = builder.matchCount;
            this.notMatchCount = builder.notMatchCount;
            this.notMatchDetail = builder.notMatchDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public Long getBatchId() {
            return this.batchId;
        }

        /**
         * @return forbidUpdateBillCount
         */
        public Integer getForbidUpdateBillCount() {
            return this.forbidUpdateBillCount;
        }

        /**
         * @return forbidUpdateDetail
         */
        public java.util.List<ForbidUpdateDetail> getForbidUpdateDetail() {
            return this.forbidUpdateDetail;
        }

        /**
         * @return matchCount
         */
        public Integer getMatchCount() {
            return this.matchCount;
        }

        /**
         * @return notMatchCount
         */
        public Integer getNotMatchCount() {
            return this.notMatchCount;
        }

        /**
         * @return notMatchDetail
         */
        public java.util.List<String> getNotMatchDetail() {
            return this.notMatchDetail;
        }

        public static final class Builder {
            private Long batchId; 
            private Integer forbidUpdateBillCount; 
            private java.util.List<ForbidUpdateDetail> forbidUpdateDetail; 
            private Integer matchCount; 
            private Integer notMatchCount; 
            private java.util.List<String> notMatchDetail; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.batchId = model.batchId;
                this.forbidUpdateBillCount = model.forbidUpdateBillCount;
                this.forbidUpdateDetail = model.forbidUpdateDetail;
                this.matchCount = model.matchCount;
                this.notMatchCount = model.notMatchCount;
                this.notMatchDetail = model.notMatchDetail;
            } 

            /**
             * batch_id.
             */
            public Builder batchId(Long batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * forbid_update_bill_count.
             */
            public Builder forbidUpdateBillCount(Integer forbidUpdateBillCount) {
                this.forbidUpdateBillCount = forbidUpdateBillCount;
                return this;
            }

            /**
             * forbid_update_detail.
             */
            public Builder forbidUpdateDetail(java.util.List<ForbidUpdateDetail> forbidUpdateDetail) {
                this.forbidUpdateDetail = forbidUpdateDetail;
                return this;
            }

            /**
             * match_count.
             */
            public Builder matchCount(Integer matchCount) {
                this.matchCount = matchCount;
                return this;
            }

            /**
             * not_match_count.
             */
            public Builder notMatchCount(Integer notMatchCount) {
                this.notMatchCount = notMatchCount;
                return this;
            }

            /**
             * not_match_detail.
             */
            public Builder notMatchDetail(java.util.List<String> notMatchDetail) {
                this.notMatchDetail = notMatchDetail;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
