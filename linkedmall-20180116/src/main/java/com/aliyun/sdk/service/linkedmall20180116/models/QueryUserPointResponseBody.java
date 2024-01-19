// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserPointResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserPointResponseBody</p>
 */
public class QueryUserPointResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    private QueryUserPointResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserPointResponseBody create() {
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
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Model model; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryUserPointResponseBody build() {
            return new QueryUserPointResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("BizId")
        private String bizId;

        @NameInMap("BizUid")
        private String bizUid;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CurrentAmount")
        private Long currentAmount;

        @NameInMap("FrozenAmount")
        private Long frozenAmount;

        @NameInMap("HistoryAmount")
        private Long historyAmount;

        @NameInMap("Level")
        private String level;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Status")
        private String status;

        private Model(Builder builder) {
            this.accountId = builder.accountId;
            this.bizId = builder.bizId;
            this.bizUid = builder.bizUid;
            this.createTime = builder.createTime;
            this.currentAmount = builder.currentAmount;
            this.frozenAmount = builder.frozenAmount;
            this.historyAmount = builder.historyAmount;
            this.level = builder.level;
            this.modifyTime = builder.modifyTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizUid
         */
        public String getBizUid() {
            return this.bizUid;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentAmount
         */
        public Long getCurrentAmount() {
            return this.currentAmount;
        }

        /**
         * @return frozenAmount
         */
        public Long getFrozenAmount() {
            return this.frozenAmount;
        }

        /**
         * @return historyAmount
         */
        public Long getHistoryAmount() {
            return this.historyAmount;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountId; 
            private String bizId; 
            private String bizUid; 
            private Long createTime; 
            private Long currentAmount; 
            private Long frozenAmount; 
            private Long historyAmount; 
            private String level; 
            private Long modifyTime; 
            private String status; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizUid.
             */
            public Builder bizUid(String bizUid) {
                this.bizUid = bizUid;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentAmount.
             */
            public Builder currentAmount(Long currentAmount) {
                this.currentAmount = currentAmount;
                return this;
            }

            /**
             * FrozenAmount.
             */
            public Builder frozenAmount(Long frozenAmount) {
                this.frozenAmount = frozenAmount;
                return this;
            }

            /**
             * HistoryAmount.
             */
            public Builder historyAmount(Long historyAmount) {
                this.historyAmount = historyAmount;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
