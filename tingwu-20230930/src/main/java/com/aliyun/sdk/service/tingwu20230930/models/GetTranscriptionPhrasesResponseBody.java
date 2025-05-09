// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

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
 * {@link GetTranscriptionPhrasesResponseBody} extends {@link TeaModel}
 *
 * <p>GetTranscriptionPhrasesResponseBody</p>
 */
public class GetTranscriptionPhrasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTranscriptionPhrasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTranscriptionPhrasesResponseBody create() {
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

        private Builder() {
        } 

        private Builder(GetTranscriptionPhrasesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>35124E1C-AE99-5D6C-A52E-BD689D8D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTranscriptionPhrasesResponseBody build() {
            return new GetTranscriptionPhrasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTranscriptionPhrasesResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscriptionPhrasesResponseBody</p>
     */
    public static class Phrases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PhraseId")
        private String phraseId;

        @com.aliyun.core.annotation.NameInMap("WordWeights")
        private String wordWeights;

        private Phrases(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.phraseId = builder.phraseId;
            this.wordWeights = builder.wordWeights;
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

        /**
         * @return wordWeights
         */
        public String getWordWeights() {
            return this.wordWeights;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String phraseId; 
            private String wordWeights; 

            private Builder() {
            } 

            private Builder(Phrases model) {
                this.description = model.description;
                this.name = model.name;
                this.phraseId = model.phraseId;
                this.wordWeights = model.wordWeights;
            } 

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

            /**
             * WordWeights.
             */
            public Builder wordWeights(String wordWeights) {
                this.wordWeights = wordWeights;
                return this;
            }

            public Phrases build() {
                return new Phrases(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTranscriptionPhrasesResponseBody} extends {@link TeaModel}
     *
     * <p>GetTranscriptionPhrasesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Phrases")
        private java.util.List<Phrases> phrases;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<Phrases> getPhrases() {
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
            private java.util.List<Phrases> phrases; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.phrases = model.phrases;
                this.status = model.status;
            } 

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
            public Builder phrases(java.util.List<Phrases> phrases) {
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
