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

        private Builder(GetAppConfigResponseBody model) {
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
         * <p>Time consumed</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>Returned data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Data type</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>EF4B5C9B-3BC8-5171-A47B-4C5CF3DC3258</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Is successful</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetAppConfigResponseBody build() {
            return new GetAppConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("embeddingTypeList")
        private java.util.List<java.util.Map<String, String>> embeddingTypeList;

        @com.aliyun.core.annotation.NameInMap("frontendConfig")
        private java.util.Map<String, Boolean> frontendConfig;

        @com.aliyun.core.annotation.NameInMap("libraryDocumentStatusList")
        private java.util.List<java.util.Map<String, String>> libraryDocumentStatusList;

        @com.aliyun.core.annotation.NameInMap("llmHelperTypeList")
        private java.util.List<java.util.Map<String, String>> llmHelperTypeList;

        @com.aliyun.core.annotation.NameInMap("textIndexCategoryList")
        private java.util.List<String> textIndexCategoryList;

        @com.aliyun.core.annotation.NameInMap("vectorIndexCategoryList")
        private java.util.List<String> vectorIndexCategoryList;

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
        public java.util.List<java.util.Map<String, String>> getEmbeddingTypeList() {
            return this.embeddingTypeList;
        }

        /**
         * @return frontendConfig
         */
        public java.util.Map<String, Boolean> getFrontendConfig() {
            return this.frontendConfig;
        }

        /**
         * @return libraryDocumentStatusList
         */
        public java.util.List<java.util.Map<String, String>> getLibraryDocumentStatusList() {
            return this.libraryDocumentStatusList;
        }

        /**
         * @return llmHelperTypeList
         */
        public java.util.List<java.util.Map<String, String>> getLlmHelperTypeList() {
            return this.llmHelperTypeList;
        }

        /**
         * @return textIndexCategoryList
         */
        public java.util.List<String> getTextIndexCategoryList() {
            return this.textIndexCategoryList;
        }

        /**
         * @return vectorIndexCategoryList
         */
        public java.util.List<String> getVectorIndexCategoryList() {
            return this.vectorIndexCategoryList;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, String>> embeddingTypeList; 
            private java.util.Map<String, Boolean> frontendConfig; 
            private java.util.List<java.util.Map<String, String>> libraryDocumentStatusList; 
            private java.util.List<java.util.Map<String, String>> llmHelperTypeList; 
            private java.util.List<String> textIndexCategoryList; 
            private java.util.List<String> vectorIndexCategoryList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.embeddingTypeList = model.embeddingTypeList;
                this.frontendConfig = model.frontendConfig;
                this.libraryDocumentStatusList = model.libraryDocumentStatusList;
                this.llmHelperTypeList = model.llmHelperTypeList;
                this.textIndexCategoryList = model.textIndexCategoryList;
                this.vectorIndexCategoryList = model.vectorIndexCategoryList;
            } 

            /**
             * <p>Embedding type list</p>
             */
            public Builder embeddingTypeList(java.util.List<java.util.Map<String, String>> embeddingTypeList) {
                this.embeddingTypeList = embeddingTypeList;
                return this;
            }

            /**
             * <p>Frontend configuration</p>
             */
            public Builder frontendConfig(java.util.Map<String, Boolean> frontendConfig) {
                this.frontendConfig = frontendConfig;
                return this;
            }

            /**
             * <p>Document library status list</p>
             */
            public Builder libraryDocumentStatusList(java.util.List<java.util.Map<String, String>> libraryDocumentStatusList) {
                this.libraryDocumentStatusList = libraryDocumentStatusList;
                return this;
            }

            /**
             * <p>Large Language Model (LLM) type list</p>
             */
            public Builder llmHelperTypeList(java.util.List<java.util.Map<String, String>> llmHelperTypeList) {
                this.llmHelperTypeList = llmHelperTypeList;
                return this;
            }

            /**
             * <p>Text index category list</p>
             */
            public Builder textIndexCategoryList(java.util.List<String> textIndexCategoryList) {
                this.textIndexCategoryList = textIndexCategoryList;
                return this;
            }

            /**
             * <p>Vector index category list</p>
             */
            public Builder vectorIndexCategoryList(java.util.List<String> vectorIndexCategoryList) {
                this.vectorIndexCategoryList = vectorIndexCategoryList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
