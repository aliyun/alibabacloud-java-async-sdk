// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateUploadConfigResponseBody</p>
 */
public class GenerateUploadConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GenerateUploadConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadConfigResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GenerateUploadConfigResponseBody build() {
            return new GenerateUploadConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("FileKey")
        private String fileKey;

        @NameInMap("FormDatas")
        private java.util.Map < String, ? > formDatas;

        @NameInMap("PostUrl")
        private String postUrl;

        private Data(Builder builder) {
            this.fileKey = builder.fileKey;
            this.formDatas = builder.formDatas;
            this.postUrl = builder.postUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fileKey
         */
        public String getFileKey() {
            return this.fileKey;
        }

        /**
         * @return formDatas
         */
        public java.util.Map < String, ? > getFormDatas() {
            return this.formDatas;
        }

        /**
         * @return postUrl
         */
        public String getPostUrl() {
            return this.postUrl;
        }

        public static final class Builder {
            private String fileKey; 
            private java.util.Map < String, ? > formDatas; 
            private String postUrl; 

            /**
             * FileKey.
             */
            public Builder fileKey(String fileKey) {
                this.fileKey = fileKey;
                return this;
            }

            /**
             * FormDatas.
             */
            public Builder formDatas(java.util.Map < String, ? > formDatas) {
                this.formDatas = formDatas;
                return this;
            }

            /**
             * PostUrl.
             */
            public Builder postUrl(String postUrl) {
                this.postUrl = postUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
