// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GenDocQaResultResponseBody} extends {@link TeaModel}
 *
 * <p>GenDocQaResultResponseBody</p>
 */
public class GenDocQaResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GenDocQaResultResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenDocQaResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(GenDocQaResultResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GenDocQaResultResponseBody build() {
            return new GenDocQaResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenDocQaResultResponseBody} extends {@link TeaModel}
     *
     * <p>GenDocQaResultResponseBody</p>
     */
    public static class ParseQaResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("answer")
        private String answer;

        @com.aliyun.core.annotation.NameInMap("question")
        private String question;

        private ParseQaResults(Builder builder) {
            this.answer = builder.answer;
            this.question = builder.question;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParseQaResults create() {
            return builder().build();
        }

        /**
         * @return answer
         */
        public String getAnswer() {
            return this.answer;
        }

        /**
         * @return question
         */
        public String getQuestion() {
            return this.question;
        }

        public static final class Builder {
            private String answer; 
            private String question; 

            private Builder() {
            } 

            private Builder(ParseQaResults model) {
                this.answer = model.answer;
                this.question = model.question;
            } 

            /**
             * answer.
             */
            public Builder answer(String answer) {
                this.answer = answer;
                return this;
            }

            /**
             * question.
             */
            public Builder question(String question) {
                this.question = question;
                return this;
            }

            public ParseQaResults build() {
                return new ParseQaResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link GenDocQaResultResponseBody} extends {@link TeaModel}
     *
     * <p>GenDocQaResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("docId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("libraryId")
        private String libraryId;

        @com.aliyun.core.annotation.NameInMap("parseQaResults")
        private java.util.List<ParseQaResults> parseQaResults;

        private Data(Builder builder) {
            this.currentStatus = builder.currentStatus;
            this.docId = builder.docId;
            this.libraryId = builder.libraryId;
            this.parseQaResults = builder.parseQaResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentStatus
         */
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return libraryId
         */
        public String getLibraryId() {
            return this.libraryId;
        }

        /**
         * @return parseQaResults
         */
        public java.util.List<ParseQaResults> getParseQaResults() {
            return this.parseQaResults;
        }

        public static final class Builder {
            private String currentStatus; 
            private String docId; 
            private String libraryId; 
            private java.util.List<ParseQaResults> parseQaResults; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentStatus = model.currentStatus;
                this.docId = model.docId;
                this.libraryId = model.libraryId;
                this.parseQaResults = model.parseQaResults;
            } 

            /**
             * currentStatus.
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * docId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * libraryId.
             */
            public Builder libraryId(String libraryId) {
                this.libraryId = libraryId;
                return this;
            }

            /**
             * parseQaResults.
             */
            public Builder parseQaResults(java.util.List<ParseQaResults> parseQaResults) {
                this.parseQaResults = parseQaResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
