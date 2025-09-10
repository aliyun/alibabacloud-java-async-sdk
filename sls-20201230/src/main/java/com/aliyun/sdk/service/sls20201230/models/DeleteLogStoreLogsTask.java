// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DeleteLogStoreLogsTask} extends {@link TeaModel}
 *
 * <p>DeleteLogStoreLogsTask</p>
 */
public class DeleteLogStoreLogsTask extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("from")
    private Integer from;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("to")
    private Integer to;

    private DeleteLogStoreLogsTask(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.from = builder.from;
        this.progress = builder.progress;
        this.query = builder.query;
        this.taskId = builder.taskId;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogStoreLogsTask create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String errorMessage; 
        private Integer from; 
        private Integer progress; 
        private String query; 
        private String taskId; 
        private Integer to; 

        private Builder() {
        } 

        private Builder(DeleteLogStoreLogsTask model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.from = model.from;
            this.progress = model.progress;
            this.query = model.query;
            this.taskId = model.taskId;
            this.to = model.to;
        } 

        /**
         * errorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Integer from) {
            this.from = from;
            return this;
        }

        /**
         * progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Integer to) {
            this.to = to;
            return this;
        }

        public DeleteLogStoreLogsTask build() {
            return new DeleteLogStoreLogsTask(this);
        } 

    } 

}
