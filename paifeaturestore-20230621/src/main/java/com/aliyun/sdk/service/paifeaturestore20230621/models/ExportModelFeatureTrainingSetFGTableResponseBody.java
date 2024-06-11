// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportModelFeatureTrainingSetFGTableResponseBody} extends {@link TeaModel}
 *
 * <p>ExportModelFeatureTrainingSetFGTableResponseBody</p>
 */
public class ExportModelFeatureTrainingSetFGTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ExportModelFeatureTrainingSetFGTableResponseBody(Builder builder) {
        this.taskId = builder.taskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportModelFeatureTrainingSetFGTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String taskId; 
        private String requestId; 

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportModelFeatureTrainingSetFGTableResponseBody build() {
            return new ExportModelFeatureTrainingSetFGTableResponseBody(this);
        } 

    } 

}
