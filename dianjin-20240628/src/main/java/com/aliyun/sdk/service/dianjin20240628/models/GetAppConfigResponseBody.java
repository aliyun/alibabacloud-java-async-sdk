// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppConfigResponseBody</p>
 */
public class GetAppConfigResponseBody extends TeaModel {
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

    private GetAppConfigResponseBody(Builder builder) {
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

    public static GetAppConfigResponseBody create() {
        return builder().build();
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

        public GetAppConfigResponseBody build() {
            return new GetAppConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("embeddingTypeList")
        private java.util.List < java.util.Map<String, String>> embeddingTypeList;

        @com.aliyun.core.annotation.NameInMap("frontendConfig")
        private java.util.Map < String, Boolean > frontendConfig;

        @com.aliyun.core.annotation.NameInMap("libraryDocumentStatusList")
        private java.util.List < java.util.Map<String, String>> libraryDocumentStatusList;

        @com.aliyun.core.annotation.NameInMap("llmHelperTypeList")
        private java.util.List < java.util.Map<String, String>> llmHelperTypeList;

        @com.aliyun.core.annotation.NameInMap("textIndexCategoryList")
        private java.util.List < String > textIndexCategoryList;

        @com.aliyun.core.annotation.NameInMap("vectorIndexCategoryList")
        private java.util.List < String > vectorIndexCategoryList;

        private Data(Builder builder) {
            this.embeddingTypeList = builder.embeddingTypeList;
            this.frontendConfig = builder.frontendConfig;
            this.libraryDocumentStatusList = builder.libraryDocumentStatusList;
            this.llmHelperTypeList = builder.llmHelperTypeList;
            this.textIndexCategoryList = builder.textIndexCategoryList;
            this.vectorIndexCategoryList = builder.vectorIndexCategoryList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return embeddingTypeList
         */
        public java.util.List < java.util.Map<String, String>> getEmbeddingTypeList() {
            return this.embeddingTypeList;
        }

        /**
         * @return frontendConfig
         */
        public java.util.Map < String, Boolean > getFrontendConfig() {
            return this.frontendConfig;
        }

        /**
         * @return libraryDocumentStatusList
         */
        public java.util.List < java.util.Map<String, String>> getLibraryDocumentStatusList() {
            return this.libraryDocumentStatusList;
        }

        /**
         * @return llmHelperTypeList
         */
        public java.util.List < java.util.Map<String, String>> getLlmHelperTypeList() {
            return this.llmHelperTypeList;
        }

        /**
         * @return textIndexCategoryList
         */
        public java.util.List < String > getTextIndexCategoryList() {
            return this.textIndexCategoryList;
        }

        /**
         * @return vectorIndexCategoryList
         */
        public java.util.List < String > getVectorIndexCategoryList() {
            return this.vectorIndexCategoryList;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, String>> embeddingTypeList; 
            private java.util.Map < String, Boolean > frontendConfig; 
            private java.util.List < java.util.Map<String, String>> libraryDocumentStatusList; 
            private java.util.List < java.util.Map<String, String>> llmHelperTypeList; 
            private java.util.List < String > textIndexCategoryList; 
            private java.util.List < String > vectorIndexCategoryList; 

            /**
             * embeddingTypeList.
             */
            public Builder embeddingTypeList(java.util.List < java.util.Map<String, String>> embeddingTypeList) {
                this.embeddingTypeList = embeddingTypeList;
                return this;
            }

            /**
             * frontendConfig.
             */
            public Builder frontendConfig(java.util.Map < String, Boolean > frontendConfig) {
                this.frontendConfig = frontendConfig;
                return this;
            }

            /**
             * libraryDocumentStatusList.
             */
            public Builder libraryDocumentStatusList(java.util.List < java.util.Map<String, String>> libraryDocumentStatusList) {
                this.libraryDocumentStatusList = libraryDocumentStatusList;
                return this;
            }

            /**
             * llmHelperTypeList.
             */
            public Builder llmHelperTypeList(java.util.List < java.util.Map<String, String>> llmHelperTypeList) {
                this.llmHelperTypeList = llmHelperTypeList;
                return this;
            }

            /**
             * textIndexCategoryList.
             */
            public Builder textIndexCategoryList(java.util.List < String > textIndexCategoryList) {
                this.textIndexCategoryList = textIndexCategoryList;
                return this;
            }

            /**
             * vectorIndexCategoryList.
             */
            public Builder vectorIndexCategoryList(java.util.List < String > vectorIndexCategoryList) {
                this.vectorIndexCategoryList = vectorIndexCategoryList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
