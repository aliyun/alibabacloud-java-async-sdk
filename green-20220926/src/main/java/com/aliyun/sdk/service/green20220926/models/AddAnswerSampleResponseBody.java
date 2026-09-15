// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link AddAnswerSampleResponseBody} extends {@link TeaModel}
 *
 * <p>AddAnswerSampleResponseBody</p>
 */
public class AddAnswerSampleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private AddAnswerSampleResponseBody(Builder builder) {
        this.libId = builder.libId;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAnswerSampleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String libId; 
        private String requestId; 
        private Result result; 
        private String taskId; 

        private Builder() {
        } 

        private Builder(AddAnswerSampleResponseBody model) {
            this.libId = model.libId;
            this.requestId = model.requestId;
            this.result = model.result;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The ID of the proxy answer library.</p>
         * 
         * <strong>example:</strong>
         * <p>alxxxx</p>
         */
        public Builder libId(String libId) {
            this.libId = libId;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alAxbbxxxx-xxx</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public AddAnswerSampleResponseBody build() {
            return new AddAnswerSampleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddAnswerSampleResponseBody} extends {@link TeaModel}
     *
     * <p>AddAnswerSampleResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("I18nKey")
        private String i18nKey;

        @com.aliyun.core.annotation.NameInMap("IllegalLengthSamples")
        private java.util.List<String> illegalLengthSamples;

        @com.aliyun.core.annotation.NameInMap("InvalidCount")
        private Integer invalidCount;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("RepeatCount")
        private Integer repeatCount;

        @com.aliyun.core.annotation.NameInMap("RepeatSamples")
        private java.util.List<String> repeatSamples;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.i18nKey = builder.i18nKey;
            this.illegalLengthSamples = builder.illegalLengthSamples;
            this.invalidCount = builder.invalidCount;
            this.libId = builder.libId;
            this.progress = builder.progress;
            this.repeatCount = builder.repeatCount;
            this.repeatSamples = builder.repeatSamples;
            this.successCount = builder.successCount;
            this.taskId = builder.taskId;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return i18nKey
         */
        public String getI18nKey() {
            return this.i18nKey;
        }

        /**
         * @return illegalLengthSamples
         */
        public java.util.List<String> getIllegalLengthSamples() {
            return this.illegalLengthSamples;
        }

        /**
         * @return invalidCount
         */
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return repeatCount
         */
        public Integer getRepeatCount() {
            return this.repeatCount;
        }

        /**
         * @return repeatSamples
         */
        public java.util.List<String> getRepeatSamples() {
            return this.repeatSamples;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String i18nKey; 
            private java.util.List<String> illegalLengthSamples; 
            private Integer invalidCount; 
            private String libId; 
            private Integer progress; 
            private Integer repeatCount; 
            private java.util.List<String> repeatSamples; 
            private Integer successCount; 
            private String taskId; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.i18nKey = model.i18nKey;
                this.illegalLengthSamples = model.illegalLengthSamples;
                this.invalidCount = model.invalidCount;
                this.libId = model.libId;
                this.progress = model.progress;
                this.repeatCount = model.repeatCount;
                this.repeatSamples = model.repeatSamples;
                this.successCount = model.successCount;
                this.taskId = model.taskId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The internationalization key.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder i18nKey(String i18nKey) {
                this.i18nKey = i18nKey;
                return this;
            }

            /**
             * <p>The collection of samples whose length is too long or too short.</p>
             */
            public Builder illegalLengthSamples(java.util.List<String> illegalLengthSamples) {
                this.illegalLengthSamples = illegalLengthSamples;
                return this;
            }

            /**
             * <p>The number of invalid records.</p>
             * 
             * <strong>example:</strong>
             * <p>118</p>
             */
            public Builder invalidCount(Integer invalidCount) {
                this.invalidCount = invalidCount;
                return this;
            }

            /**
             * <p>The ID of the proxy answer library.</p>
             * 
             * <strong>example:</strong>
             * <p>alxxxx</p>
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>The progress. For example, 90 indicates 90%.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The number of duplicate records.</p>
             * 
             * <strong>example:</strong>
             * <p>98</p>
             */
            public Builder repeatCount(Integer repeatCount) {
                this.repeatCount = repeatCount;
                return this;
            }

            /**
             * <p>The collection of duplicate samples.</p>
             */
            public Builder repeatSamples(java.util.List<String> repeatSamples) {
                this.repeatSamples = repeatSamples;
                return this;
            }

            /**
             * <p>The number of successful records.</p>
             * 
             * <strong>example:</strong>
             * <p>318</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alAxbbxxxx-xxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>534</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
