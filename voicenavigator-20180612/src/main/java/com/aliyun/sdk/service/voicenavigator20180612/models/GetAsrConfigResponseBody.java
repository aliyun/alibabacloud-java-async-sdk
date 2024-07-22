// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsrConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsrConfigResponseBody</p>
 */
public class GetAsrConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAsrConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsrConfigResponseBody create() {
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
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String errorMsg; 
        private Integer httpStatusCode; 
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
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetAsrConfigResponseBody build() {
            return new GetAsrConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrAcousticModelId")
        private String asrAcousticModelId;

        @com.aliyun.core.annotation.NameInMap("AsrClassVocabularyId")
        private String asrClassVocabularyId;

        @com.aliyun.core.annotation.NameInMap("AsrCustomizationId")
        private String asrCustomizationId;

        @com.aliyun.core.annotation.NameInMap("AsrVocabularyId")
        private String asrVocabularyId;

        private Data(Builder builder) {
            this.asrAcousticModelId = builder.asrAcousticModelId;
            this.asrClassVocabularyId = builder.asrClassVocabularyId;
            this.asrCustomizationId = builder.asrCustomizationId;
            this.asrVocabularyId = builder.asrVocabularyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return asrAcousticModelId
         */
        public String getAsrAcousticModelId() {
            return this.asrAcousticModelId;
        }

        /**
         * @return asrClassVocabularyId
         */
        public String getAsrClassVocabularyId() {
            return this.asrClassVocabularyId;
        }

        /**
         * @return asrCustomizationId
         */
        public String getAsrCustomizationId() {
            return this.asrCustomizationId;
        }

        /**
         * @return asrVocabularyId
         */
        public String getAsrVocabularyId() {
            return this.asrVocabularyId;
        }

        public static final class Builder {
            private String asrAcousticModelId; 
            private String asrClassVocabularyId; 
            private String asrCustomizationId; 
            private String asrVocabularyId; 

            /**
             * AsrAcousticModelId.
             */
            public Builder asrAcousticModelId(String asrAcousticModelId) {
                this.asrAcousticModelId = asrAcousticModelId;
                return this;
            }

            /**
             * AsrClassVocabularyId.
             */
            public Builder asrClassVocabularyId(String asrClassVocabularyId) {
                this.asrClassVocabularyId = asrClassVocabularyId;
                return this;
            }

            /**
             * AsrCustomizationId.
             */
            public Builder asrCustomizationId(String asrCustomizationId) {
                this.asrCustomizationId = asrCustomizationId;
                return this;
            }

            /**
             * AsrVocabularyId.
             */
            public Builder asrVocabularyId(String asrVocabularyId) {
                this.asrVocabularyId = asrVocabularyId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
