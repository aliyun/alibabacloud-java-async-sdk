// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTranscriptionPhrasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTranscriptionPhrasesResponseBody</p>
 */
public class ListTranscriptionPhrasesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListTranscriptionPhrasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTranscriptionPhrasesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTranscriptionPhrasesResponseBody build() {
            return new ListTranscriptionPhrasesResponseBody(this);
        } 

    } 

    public static class Phrases extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhraseId")
        private String phraseId;

        private Phrases(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.phraseId = builder.phraseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phrases create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phraseId
         */
        public String getPhraseId() {
            return this.phraseId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String phraseId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * PhraseId.
             */
            public Builder phraseId(String phraseId) {
                this.phraseId = phraseId;
                return this;
            }

            public Phrases build() {
                return new Phrases(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Phrases")
        private java.util.List < Phrases> phrases;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.phrases = builder.phrases;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return phrases
         */
        public java.util.List < Phrases> getPhrases() {
            return this.phrases;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private java.util.List < Phrases> phrases; 
            private String status; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Phrases.
             */
            public Builder phrases(java.util.List < Phrases> phrases) {
                this.phrases = phrases;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
