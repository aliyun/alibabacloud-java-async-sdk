// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TriggerDTOStructBody} extends {@link TeaModel}
 *
 * <p>TriggerDTOStructBody</p>
 */
public class TriggerDTOStructBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Checkpoint")
    private CheckPointStructBody checkpoint;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Option")
    private String option;

    @com.aliyun.core.annotation.NameInMap("PendingErrorLogs")
    private String pendingErrorLogs;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private TriggerDTOStructBody(Builder builder) {
        this.checkpoint = builder.checkpoint;
        this.createTime = builder.createTime;
        this.errorMessage = builder.errorMessage;
        this.name = builder.name;
        this.option = builder.option;
        this.pendingErrorLogs = builder.pendingErrorLogs;
        this.source = builder.source;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerDTOStructBody create() {
        return builder().build();
    }

    /**
     * @return checkpoint
     */
    public CheckPointStructBody getCheckpoint() {
        return this.checkpoint;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return pendingErrorLogs
     */
    public String getPendingErrorLogs() {
        return this.pendingErrorLogs;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private CheckPointStructBody checkpoint; 
        private String createTime; 
        private String errorMessage; 
        private String name; 
        private String option; 
        private String pendingErrorLogs; 
        private String source; 
        private String status; 
        private String type; 

        /**
         * Checkpoint.
         */
        public Builder checkpoint(CheckPointStructBody checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Option.
         */
        public Builder option(String option) {
            this.option = option;
            return this;
        }

        /**
         * PendingErrorLogs.
         */
        public Builder pendingErrorLogs(String pendingErrorLogs) {
            this.pendingErrorLogs = pendingErrorLogs;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TriggerDTOStructBody build() {
            return new TriggerDTOStructBody(this);
        } 

    } 

}
