// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link ListMessageRequest} extends {@link RequestModel}
 *
 * <p>ListMessageRequest</p>
 */
public class ListMessageRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extLoginUser")
    private ExtLoginUser extLoginUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalAssistantId")
    private String originalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceIdOfOriginalAssistantId")
    private String sourceIdOfOriginalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTypeOfOriginalAssistantId")
    private String sourceTypeOfOriginalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String threadId;

    private ListMessageRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.assistantId = builder.assistantId;
        this.extLoginUser = builder.extLoginUser;
        this.limit = builder.limit;
        this.order = builder.order;
        this.originalAssistantId = builder.originalAssistantId;
        this.runId = builder.runId;
        this.sourceIdOfOriginalAssistantId = builder.sourceIdOfOriginalAssistantId;
        this.sourceTypeOfOriginalAssistantId = builder.sourceTypeOfOriginalAssistantId;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * @return extLoginUser
     */
    public ExtLoginUser getExtLoginUser() {
        return this.extLoginUser;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return originalAssistantId
     */
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return sourceIdOfOriginalAssistantId
     */
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    /**
     * @return sourceTypeOfOriginalAssistantId
     */
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder extends Request.Builder<ListMessageRequest, Builder> {
        private String accountId; 
        private String assistantId; 
        private ExtLoginUser extLoginUser; 
        private Integer limit; 
        private String order; 
        private String originalAssistantId; 
        private String runId; 
        private String sourceIdOfOriginalAssistantId; 
        private String sourceTypeOfOriginalAssistantId; 
        private String threadId; 

        private Builder() {
            super();
        } 

        private Builder(ListMessageRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.assistantId = request.assistantId;
            this.extLoginUser = request.extLoginUser;
            this.limit = request.limit;
            this.order = request.order;
            this.originalAssistantId = request.originalAssistantId;
            this.runId = request.runId;
            this.sourceIdOfOriginalAssistantId = request.sourceIdOfOriginalAssistantId;
            this.sourceTypeOfOriginalAssistantId = request.sourceTypeOfOriginalAssistantId;
            this.threadId = request.threadId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putHeaderParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>assistantId1</p>
         */
        public Builder assistantId(String assistantId) {
            this.putBodyParameter("assistantId", assistantId);
            this.assistantId = assistantId;
            return this;
        }

        /**
         * extLoginUser.
         */
        public Builder extLoginUser(ExtLoginUser extLoginUser) {
            this.putBodyParameter("extLoginUser", extLoginUser);
            this.extLoginUser = extLoginUser;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * order.
         */
        public Builder order(String order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        /**
         * originalAssistantId.
         */
        public Builder originalAssistantId(String originalAssistantId) {
            this.putBodyParameter("originalAssistantId", originalAssistantId);
            this.originalAssistantId = originalAssistantId;
            return this;
        }

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * sourceIdOfOriginalAssistantId.
         */
        public Builder sourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
            this.putBodyParameter("sourceIdOfOriginalAssistantId", sourceIdOfOriginalAssistantId);
            this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
            return this;
        }

        /**
         * sourceTypeOfOriginalAssistantId.
         */
        public Builder sourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
            this.putBodyParameter("sourceTypeOfOriginalAssistantId", sourceTypeOfOriginalAssistantId);
            this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>threadId123</p>
         */
        public Builder threadId(String threadId) {
            this.putBodyParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        @Override
        public ListMessageRequest build() {
            return new ListMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageRequest} extends {@link TeaModel}
     *
     * <p>ListMessageRequest</p>
     */
    public static class ExtLoginUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extLoginUserDomain")
        private String extLoginUserDomain;

        @com.aliyun.core.annotation.NameInMap("extLoginUserId")
        private String extLoginUserId;

        @com.aliyun.core.annotation.NameInMap("extLoginUserName")
        private String extLoginUserName;

        private ExtLoginUser(Builder builder) {
            this.extLoginUserDomain = builder.extLoginUserDomain;
            this.extLoginUserId = builder.extLoginUserId;
            this.extLoginUserName = builder.extLoginUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtLoginUser create() {
            return builder().build();
        }

        /**
         * @return extLoginUserDomain
         */
        public String getExtLoginUserDomain() {
            return this.extLoginUserDomain;
        }

        /**
         * @return extLoginUserId
         */
        public String getExtLoginUserId() {
            return this.extLoginUserId;
        }

        /**
         * @return extLoginUserName
         */
        public String getExtLoginUserName() {
            return this.extLoginUserName;
        }

        public static final class Builder {
            private String extLoginUserDomain; 
            private String extLoginUserId; 
            private String extLoginUserName; 

            private Builder() {
            } 

            private Builder(ExtLoginUser model) {
                this.extLoginUserDomain = model.extLoginUserDomain;
                this.extLoginUserId = model.extLoginUserId;
                this.extLoginUserName = model.extLoginUserName;
            } 

            /**
             * extLoginUserDomain.
             */
            public Builder extLoginUserDomain(String extLoginUserDomain) {
                this.extLoginUserDomain = extLoginUserDomain;
                return this;
            }

            /**
             * extLoginUserId.
             */
            public Builder extLoginUserId(String extLoginUserId) {
                this.extLoginUserId = extLoginUserId;
                return this;
            }

            /**
             * extLoginUserName.
             */
            public Builder extLoginUserName(String extLoginUserName) {
                this.extLoginUserName = extLoginUserName;
                return this;
            }

            public ExtLoginUser build() {
                return new ExtLoginUser(this);
            } 

        } 

    }
}
