// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SparkAttemptInfo} extends {@link TeaModel}
 *
 * <p>SparkAttemptInfo</p>
 */
public class SparkAttemptInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttemptId")
    private String attemptId;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private Detail detail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private SparkAttemptInfo(Builder builder) {
        this.attemptId = builder.attemptId;
        this.detail = builder.detail;
        this.message = builder.message;
        this.priority = builder.priority;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkAttemptInfo create() {
        return builder().build();
    }

    /**
     * @return attemptId
     */
    public String getAttemptId() {
        return this.attemptId;
    }

    /**
     * @return detail
     */
    public Detail getDetail() {
        return this.detail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String attemptId; 
        private Detail detail; 
        private String message; 
        private String priority; 
        private String state; 

        /**
         * AttemptId.
         */
        public Builder attemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
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
         * Priority.
         */
        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public SparkAttemptInfo build() {
            return new SparkAttemptInfo(this);
        } 

    } 

}
