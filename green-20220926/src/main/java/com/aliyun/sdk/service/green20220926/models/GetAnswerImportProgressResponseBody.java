// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAnswerImportProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetAnswerImportProgressResponseBody</p>
 */
public class GetAnswerImportProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("I18nKey")
    private String i18nKey;

    @com.aliyun.core.annotation.NameInMap("IllegalLengthSamples")
    private java.util.List < String > illegalLengthSamples;

    @com.aliyun.core.annotation.NameInMap("InvalidCount")
    private Integer invalidCount;

    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RepeatCount")
    private Integer repeatCount;

    @com.aliyun.core.annotation.NameInMap("RepeatSamples")
    private java.util.List < String > repeatSamples;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("Tips")
    private String tips;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetAnswerImportProgressResponseBody(Builder builder) {
        this.i18nKey = builder.i18nKey;
        this.illegalLengthSamples = builder.illegalLengthSamples;
        this.invalidCount = builder.invalidCount;
        this.libId = builder.libId;
        this.progress = builder.progress;
        this.repeatCount = builder.repeatCount;
        this.repeatSamples = builder.repeatSamples;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.taskId = builder.taskId;
        this.tips = builder.tips;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnswerImportProgressResponseBody create() {
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
    public java.util.List < String > getIllegalLengthSamples() {
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
    public java.util.List < String > getRepeatSamples() {
        return this.repeatSamples;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return tips
     */
    public String getTips() {
        return this.tips;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String i18nKey; 
        private java.util.List < String > illegalLengthSamples; 
        private Integer invalidCount; 
        private String libId; 
        private Integer progress; 
        private Integer repeatCount; 
        private java.util.List < String > repeatSamples; 
        private String requestId; 
        private Integer successCount; 
        private String taskId; 
        private String tips; 
        private Integer totalCount; 

        /**
         * I18nKey.
         */
        public Builder i18nKey(String i18nKey) {
            this.i18nKey = i18nKey;
            return this;
        }

        /**
         * IllegalLengthSamples.
         */
        public Builder illegalLengthSamples(java.util.List < String > illegalLengthSamples) {
            this.illegalLengthSamples = illegalLengthSamples;
            return this;
        }

        /**
         * InvalidCount.
         */
        public Builder invalidCount(Integer invalidCount) {
            this.invalidCount = invalidCount;
            return this;
        }

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.libId = libId;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * RepeatCount.
         */
        public Builder repeatCount(Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }

        /**
         * RepeatSamples.
         */
        public Builder repeatSamples(java.util.List < String > repeatSamples) {
            this.repeatSamples = repeatSamples;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * Tips.
         */
        public Builder tips(String tips) {
            this.tips = tips;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetAnswerImportProgressResponseBody build() {
            return new GetAnswerImportProgressResponseBody(this);
        } 

    } 

}
