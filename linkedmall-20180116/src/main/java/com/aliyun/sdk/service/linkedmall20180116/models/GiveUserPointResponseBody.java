// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GiveUserPointResponseBody} extends {@link TeaModel}
 *
 * <p>GiveUserPointResponseBody</p>
 */
public class GiveUserPointResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private Model model;

    @NameInMap("RequestId")
    private String requestId;

    private GiveUserPointResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.model = builder.model;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GiveUserPointResponseBody create() {
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

        public GiveUserPointResponseBody build() {
            return new GiveUserPointResponseBody(this);
        } 

    } 

    public static class Model extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("Action")
        private String action;

        @NameInMap("Amount")
        private Long amount;

        @NameInMap("BizId")
        private String bizId;

        @NameInMap("BizUid")
        private String bizUid;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExtInfo")
        private java.util.Map < String, ? > extInfo;

        @NameInMap("IdempotentId")
        private String idempotentId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("Rest")
        private Long rest;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("Status")
        private String status;

        private Model(Builder builder) {
            this.accountId = builder.accountId;
            this.action = builder.action;
            this.amount = builder.amount;
            this.bizId = builder.bizId;
            this.bizUid = builder.bizUid;
            this.description = builder.description;
            this.extInfo = builder.extInfo;
            this.idempotentId = builder.idempotentId;
            this.name = builder.name;
            this.recordId = builder.recordId;
            this.rest = builder.rest;
            this.ruleId = builder.ruleId;
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
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return amount
         */
        public Long getAmount() {
            return this.amount;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extInfo
         */
        public java.util.Map < String, ? > getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return idempotentId
         */
        public String getIdempotentId() {
            return this.idempotentId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return rest
         */
        public Long getRest() {
            return this.rest;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String accountId; 
            private String action; 
            private Long amount; 
            private String bizId; 
            private String bizUid; 
            private String description; 
            private java.util.Map < String, ? > extInfo; 
            private String idempotentId; 
            private String name; 
            private String recordId; 
            private Long rest; 
            private String ruleId; 
            private String status; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Amount.
             */
            public Builder amount(Long amount) {
                this.amount = amount;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExtInfo.
             */
            public Builder extInfo(java.util.Map < String, ? > extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * IdempotentId.
             */
            public Builder idempotentId(String idempotentId) {
                this.idempotentId = idempotentId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * Rest.
             */
            public Builder rest(Long rest) {
                this.rest = rest;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
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
