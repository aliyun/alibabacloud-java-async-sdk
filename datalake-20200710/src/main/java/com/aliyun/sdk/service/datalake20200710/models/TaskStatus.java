// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskStatus} extends {@link TeaModel}
 *
 * <p>TaskStatus</p>
 */
public class TaskStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private TaskStatus(Builder builder) {
        this.message = builder.message;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskStatus create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String message; 
        private String status; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public TaskStatus build() {
            return new TaskStatus(this);
        } 

    } 

}
