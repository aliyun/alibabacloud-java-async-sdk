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
 * {@link UpdateWordGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWordGroupResponseBody</p>
 */
public class UpdateWordGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("WordErrorInfoList")
    private java.util.List<WordErrorInfoList> wordErrorInfoList;

    private UpdateWordGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.wordErrorInfoList = builder.wordErrorInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWordGroupResponseBody create() {
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
     * @return wordErrorInfoList
     */
    public java.util.List<WordErrorInfoList> getWordErrorInfoList() {
        return this.wordErrorInfoList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<WordErrorInfoList> wordErrorInfoList; 

        private Builder() {
        } 

        private Builder(UpdateWordGroupResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.wordErrorInfoList = model.wordErrorInfoList;
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
         * <p>If there is an error, return the error message.</p>
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
         * <p>Whether it was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>List of error information.</p>
         */
        public Builder wordErrorInfoList(java.util.List<WordErrorInfoList> wordErrorInfoList) {
            this.wordErrorInfoList = wordErrorInfoList;
            return this;
        }

        public UpdateWordGroupResponseBody build() {
            return new UpdateWordGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWordGroupResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWordGroupResponseBody</p>
     */
    public static class WordErrorInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ErrorStatus")
        private Integer errorStatus;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private WordErrorInfoList(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.errorStatus = builder.errorStatus;
            this.index = builder.index;
            this.label = builder.label;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordErrorInfoList create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return errorStatus
         */
        public Integer getErrorStatus() {
            return this.errorStatus;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
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

        public static final class Builder {
            private String errorMessage; 
            private Integer errorStatus; 
            private Long index; 
            private String label; 
            private String word; 

            private Builder() {
            } 

            private Builder(WordErrorInfoList model) {
                this.errorMessage = model.errorMessage;
                this.errorStatus = model.errorStatus;
                this.index = model.index;
                this.label = model.label;
                this.word = model.word;
            } 

            /**
             * <p>Error message description.</p>
             * 
             * <strong>example:</strong>
             * <p>Keyword can not be empty</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Error status information.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder errorStatus(Integer errorStatus) {
                this.errorStatus = errorStatus;
                return this;
            }

            /**
             * <p>Position of the error information in the array.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
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

            public WordErrorInfoList build() {
                return new WordErrorInfoList(this);
            } 

        } 

    }
}
