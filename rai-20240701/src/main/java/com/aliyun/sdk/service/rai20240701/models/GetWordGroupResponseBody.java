// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link GetWordGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetWordGroupResponseBody</p>
 */
public class GetWordGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("WordInfoList")
    private java.util.List<WordInfoList> wordInfoList;

    private GetWordGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.groupName = builder.groupName;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.wordInfoList = builder.wordInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWordGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return wordInfoList
     */
    public java.util.List<WordInfoList> getWordInfoList() {
        return this.wordInfoList;
    }

    public static final class Builder {
        private String code; 
        private String groupName; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private java.util.List<WordInfoList> wordInfoList; 

        private Builder() {
        } 

        private Builder(GetWordGroupResponseBody model) {
            this.code = model.code;
            this.groupName = model.groupName;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.wordInfoList = model.wordInfoList;
        } 

        /**
         * <p>Status code, 00000 indicates success; others indicate failure.</p>
         * 
         * <strong>example:</strong>
         * <p>00000</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Keyword group name.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>If there is an error, returns the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Keyword group list.</p>
         */
        public Builder wordInfoList(java.util.List<WordInfoList> wordInfoList) {
            this.wordInfoList = wordInfoList;
            return this;
        }

        public GetWordGroupResponseBody build() {
            return new GetWordGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWordGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetWordGroupResponseBody</p>
     */
    public static class WordInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        @com.aliyun.core.annotation.NameInMap("WordId")
        private Long wordId;

        private WordInfoList(Builder builder) {
            this.label = builder.label;
            this.word = builder.word;
            this.wordId = builder.wordId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordInfoList create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        /**
         * @return wordId
         */
        public Long getWordId() {
            return this.wordId;
        }

        public static final class Builder {
            private String label; 
            private String word; 
            private Long wordId; 

            private Builder() {
            } 

            private Builder(WordInfoList model) {
                this.label = model.label;
                this.word = model.word;
                this.wordId = model.wordId;
            } 

            /**
             * <p>Label.</p>
             * 
             * <strong>example:</strong>
             * <p>Buss.</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>Keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>Inv.</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            /**
             * <p>ID of the successfully added word.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder wordId(Long wordId) {
                this.wordId = wordId;
                return this;
            }

            public WordInfoList build() {
                return new WordInfoList(this);
            } 

        } 

    }
}
