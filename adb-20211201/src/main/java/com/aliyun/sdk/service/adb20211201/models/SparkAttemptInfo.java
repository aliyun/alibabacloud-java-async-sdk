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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SparkAttemptInfo model) {
            this.attemptId = model.attemptId;
            this.detail = model.detail;
            this.message = model.message;
            this.priority = model.priority;
            this.state = model.state;
        } 

        /**
         * <p>The attempt ID of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>s202207151211hz****-0001</p>
         */
        public Builder attemptId(String attemptId) {
            this.attemptId = attemptId;
            return this;
        }

        /**
         * <p>The information about the Spark application.</p>
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The alert message returned, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>WARN: Disk is full</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The attempt priority of the Spark application.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder priority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The state of the Spark application. Valid values:</p>
         * <ul>
         * <li><strong>SUBMITTED</strong></li>
         * <li><strong>STARTING</strong></li>
         * <li><strong>RUNNING</strong></li>
         * <li><strong>FAILING</strong></li>
         * <li><strong>FAILED</strong></li>
         * <li><strong>KILLING</strong></li>
         * <li><strong>KILLED</strong></li>
         * <li><strong>SUCCEEDING</strong></li>
         * <li><strong>COMPLETED</strong></li>
         * <li><strong>FATAL</strong></li>
         * <li><strong>UNKNOWN</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
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
