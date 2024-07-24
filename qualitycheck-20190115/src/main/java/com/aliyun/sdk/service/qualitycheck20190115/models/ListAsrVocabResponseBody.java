// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsrVocabResponseBody} extends {@link TeaModel}
 *
 * <p>ListAsrVocabResponseBody</p>
 */
public class ListAsrVocabResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAsrVocabResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAsrVocabResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAsrVocabResponseBody build() {
            return new ListAsrVocabResponseBody(this);
        } 

    } 

    public static class AsrVocab extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VocabularyId")
        private String vocabularyId;

        private AsrVocab(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
            this.vocabularyId = builder.vocabularyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrVocab create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vocabularyId
         */
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private String name; 
            private String updateTime; 
            private String vocabularyId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VocabularyId.
             */
            public Builder vocabularyId(String vocabularyId) {
                this.vocabularyId = vocabularyId;
                return this;
            }

            public AsrVocab build() {
                return new AsrVocab(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrVocab")
        private java.util.List < AsrVocab> asrVocab;

        private Data(Builder builder) {
            this.asrVocab = builder.asrVocab;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asrVocab
         */
        public java.util.List < AsrVocab> getAsrVocab() {
            return this.asrVocab;
        }

        public static final class Builder {
            private java.util.List < AsrVocab> asrVocab; 

            /**
             * AsrVocab.
             */
            public Builder asrVocab(java.util.List < AsrVocab> asrVocab) {
                this.asrVocab = asrVocab;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
