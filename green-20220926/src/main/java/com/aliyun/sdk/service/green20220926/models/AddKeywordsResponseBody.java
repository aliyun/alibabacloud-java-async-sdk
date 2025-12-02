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
 * {@link AddKeywordsResponseBody} extends {@link TeaModel}
 *
 * <p>AddKeywordsResponseBody</p>
 */
public class AddKeywordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddKeywordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKeywordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddKeywordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Return code. A return of 200 represents success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned in response to the request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddKeywordsResponseBody build() {
            return new AddKeywordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddKeywordsResponseBody} extends {@link TeaModel}
     *
     * <p>AddKeywordsResponseBody</p>
     */
    public static class KeywordsResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("I18nKey")
        private String i18nKey;

        @com.aliyun.core.annotation.NameInMap("IllegalLengthKeywords")
        private java.util.List<String> illegalLengthKeywords;

        @com.aliyun.core.annotation.NameInMap("InvalidCount")
        private Integer invalidCount;

        @com.aliyun.core.annotation.NameInMap("InvalidKeywords")
        private java.util.List<String> invalidKeywords;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("RepeatCount")
        private Integer repeatCount;

        @com.aliyun.core.annotation.NameInMap("RepeatKeywords")
        private java.util.List<String> repeatKeywords;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("Tips")
        private String tips;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private KeywordsResult(Builder builder) {
            this.i18nKey = builder.i18nKey;
            this.illegalLengthKeywords = builder.illegalLengthKeywords;
            this.invalidCount = builder.invalidCount;
            this.invalidKeywords = builder.invalidKeywords;
            this.libId = builder.libId;
            this.progress = builder.progress;
            this.repeatCount = builder.repeatCount;
            this.repeatKeywords = builder.repeatKeywords;
            this.successCount = builder.successCount;
            this.tips = builder.tips;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordsResult create() {
            return builder().build();
        }

        /**
         * @return i18nKey
         */
        public String getI18nKey() {
            return this.i18nKey;
        }

        /**
         * @return illegalLengthKeywords
         */
        public java.util.List<String> getIllegalLengthKeywords() {
            return this.illegalLengthKeywords;
        }

        /**
         * @return invalidCount
         */
        public Integer getInvalidCount() {
            return this.invalidCount;
        }

        /**
         * @return invalidKeywords
         */
        public java.util.List<String> getInvalidKeywords() {
            return this.invalidKeywords;
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
         * @return repeatKeywords
         */
        public java.util.List<String> getRepeatKeywords() {
            return this.repeatKeywords;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
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
            private java.util.List<String> illegalLengthKeywords; 
            private Integer invalidCount; 
            private java.util.List<String> invalidKeywords; 
            private String libId; 
            private Integer progress; 
            private Integer repeatCount; 
            private java.util.List<String> repeatKeywords; 
            private Integer successCount; 
            private String tips; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(KeywordsResult model) {
                this.i18nKey = model.i18nKey;
                this.illegalLengthKeywords = model.illegalLengthKeywords;
                this.invalidCount = model.invalidCount;
                this.invalidKeywords = model.invalidKeywords;
                this.libId = model.libId;
                this.progress = model.progress;
                this.repeatCount = model.repeatCount;
                this.repeatKeywords = model.repeatKeywords;
                this.successCount = model.successCount;
                this.tips = model.tips;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Internationalization key.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder i18nKey(String i18nKey) {
                this.i18nKey = i18nKey;
                return this;
            }

            /**
             * <p>List of keywords that are too long or too short.</p>
             */
            public Builder illegalLengthKeywords(java.util.List<String> illegalLengthKeywords) {
                this.illegalLengthKeywords = illegalLengthKeywords;
                return this;
            }

            /**
             * <p>Invalid keyword count</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder invalidCount(Integer invalidCount) {
                this.invalidCount = invalidCount;
                return this;
            }

            /**
             * <p>List of invalid keywords</p>
             */
            public Builder invalidKeywords(java.util.List<String> invalidKeywords) {
                this.invalidKeywords = invalidKeywords;
                return this;
            }

            /**
             * <p>The keyword library ID.</p>
             * 
             * <strong>example:</strong>
             * <p>customxx_xxxx</p>
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>The progress percentage of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Duplicate keyword count</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder repeatCount(Integer repeatCount) {
                this.repeatCount = repeatCount;
                return this;
            }

            /**
             * <p>List of duplicate keywords</p>
             */
            public Builder repeatKeywords(java.util.List<String> repeatKeywords) {
                this.repeatKeywords = repeatKeywords;
                return this;
            }

            /**
             * <p>The success count of the keywords.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The tips.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder tips(String tips) {
                this.tips = tips;
                return this;
            }

            /**
             * <p>The total count of the keywords.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public KeywordsResult build() {
                return new KeywordsResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddKeywordsResponseBody} extends {@link TeaModel}
     *
     * <p>AddKeywordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeywordsResult")
        private KeywordsResult keywordsResult;

        @com.aliyun.core.annotation.NameInMap("LibId")
        private String libId;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.keywordsResult = builder.keywordsResult;
            this.libId = builder.libId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return keywordsResult
         */
        public KeywordsResult getKeywordsResult() {
            return this.keywordsResult;
        }

        /**
         * @return libId
         */
        public String getLibId() {
            return this.libId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private KeywordsResult keywordsResult; 
            private String libId; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.keywordsResult = model.keywordsResult;
                this.libId = model.libId;
                this.taskId = model.taskId;
            } 

            /**
             * <p>Result.</p>
             */
            public Builder keywordsResult(KeywordsResult keywordsResult) {
                this.keywordsResult = keywordsResult;
                return this;
            }

            /**
             * <p>The ID of the keyword library.</p>
             * 
             * <strong>example:</strong>
             * <p>customxx_xxxx</p>
             */
            public Builder libId(String libId) {
                this.libId = libId;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx-xxxxx</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
