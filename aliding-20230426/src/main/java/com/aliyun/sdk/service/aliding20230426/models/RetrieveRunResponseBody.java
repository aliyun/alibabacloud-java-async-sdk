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
 * {@link RetrieveRunResponseBody} extends {@link TeaModel}
 *
 * <p>RetrieveRunResponseBody</p>
 */
public class RetrieveRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cancelledAt")
    private Long cancelledAt;

    @com.aliyun.core.annotation.NameInMap("completedAt")
    private Long completedAt;

    @com.aliyun.core.annotation.NameInMap("createAt")
    private Long createAt;

    @com.aliyun.core.annotation.NameInMap("expiresAt")
    private Long expiresAt;

    @com.aliyun.core.annotation.NameInMap("failedAt")
    private Long failedAt;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("lastErrorMsg")
    private String lastErrorMsg;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("object")
    private String object;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("startedAt")
    private Long startedAt;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    private RetrieveRunResponseBody(Builder builder) {
        this.cancelledAt = builder.cancelledAt;
        this.completedAt = builder.completedAt;
        this.createAt = builder.createAt;
        this.expiresAt = builder.expiresAt;
        this.failedAt = builder.failedAt;
        this.id = builder.id;
        this.lastErrorMsg = builder.lastErrorMsg;
        this.metadata = builder.metadata;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.startedAt = builder.startedAt;
        this.status = builder.status;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelledAt
     */
    public Long getCancelledAt() {
        return this.cancelledAt;
    }

    /**
     * @return completedAt
     */
    public Long getCompletedAt() {
        return this.completedAt;
    }

    /**
     * @return createAt
     */
    public Long getCreateAt() {
        return this.createAt;
    }

    /**
     * @return expiresAt
     */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return failedAt
     */
    public Long getFailedAt() {
        return this.failedAt;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return lastErrorMsg
     */
    public String getLastErrorMsg() {
        return this.lastErrorMsg;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startedAt
     */
    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder {
        private Long cancelledAt; 
        private Long completedAt; 
        private Long createAt; 
        private Long expiresAt; 
        private Long failedAt; 
        private String id; 
        private String lastErrorMsg; 
        private java.util.Map<String, ?> metadata; 
        private String object; 
        private String requestId; 
        private Long startedAt; 
        private String status; 
        private String threadId; 

        private Builder() {
        } 

        private Builder(RetrieveRunResponseBody model) {
            this.cancelledAt = model.cancelledAt;
            this.completedAt = model.completedAt;
            this.createAt = model.createAt;
            this.expiresAt = model.expiresAt;
            this.failedAt = model.failedAt;
            this.id = model.id;
            this.lastErrorMsg = model.lastErrorMsg;
            this.metadata = model.metadata;
            this.object = model.object;
            this.requestId = model.requestId;
            this.startedAt = model.startedAt;
            this.status = model.status;
            this.threadId = model.threadId;
        } 

        /**
         * cancelledAt.
         */
        public Builder cancelledAt(Long cancelledAt) {
            this.cancelledAt = cancelledAt;
            return this;
        }

        /**
         * completedAt.
         */
        public Builder completedAt(Long completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * createAt.
         */
        public Builder createAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }

        /**
         * expiresAt.
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * failedAt.
         */
        public Builder failedAt(Long failedAt) {
            this.failedAt = failedAt;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * lastErrorMsg.
         */
        public Builder lastErrorMsg(String lastErrorMsg) {
            this.lastErrorMsg = lastErrorMsg;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * object.
         */
        public Builder object(String object) {
            this.object = object;
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
         * startedAt.
         */
        public Builder startedAt(Long startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        public RetrieveRunResponseBody build() {
            return new RetrieveRunResponseBody(this);
        } 

    } 

}
