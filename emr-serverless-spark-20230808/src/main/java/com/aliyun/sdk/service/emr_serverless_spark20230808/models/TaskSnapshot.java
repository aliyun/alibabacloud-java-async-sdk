// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link TaskSnapshot} extends {@link TeaModel}
 *
 * <p>TaskSnapshot</p>
 */
public class TaskSnapshot extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizId")
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("commiter")
    private Long commiter;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("item")
    private Task item;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("taskBizId")
    private String taskBizId;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private TaskSnapshot(Builder builder) {
        this.bizId = builder.bizId;
        this.commiter = builder.commiter;
        this.gmtCreated = builder.gmtCreated;
        this.item = builder.item;
        this.message = builder.message;
        this.taskBizId = builder.taskBizId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskSnapshot create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return commiter
     */
    public Long getCommiter() {
        return this.commiter;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return item
     */
    public Task getItem() {
        return this.item;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return taskBizId
     */
    public String getTaskBizId() {
        return this.taskBizId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String bizId; 
        private Long commiter; 
        private String gmtCreated; 
        private Task item; 
        private String message; 
        private String taskBizId; 
        private String version; 

        /**
         * bizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * commiter.
         */
        public Builder commiter(Long commiter) {
            this.commiter = commiter;
            return this;
        }

        /**
         * gmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * item.
         */
        public Builder item(Task item) {
            this.item = item;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * taskBizId.
         */
        public Builder taskBizId(String taskBizId) {
            this.taskBizId = taskBizId;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public TaskSnapshot build() {
            return new TaskSnapshot(this);
        } 

    } 

}
