// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvusknowledgebase20260604.models;

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
 * {@link GetKnowledgeBasePreSignedUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetKnowledgeBasePreSignedUrlResponseBody</p>
 */
public class GetKnowledgeBasePreSignedUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetKnowledgeBasePreSignedUrlResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBasePreSignedUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetKnowledgeBasePreSignedUrlResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.success = model.success;
        } 

        /**
         * accessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetKnowledgeBasePreSignedUrlResponseBody build() {
            return new GetKnowledgeBasePreSignedUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKnowledgeBasePreSignedUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetKnowledgeBasePreSignedUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("expiresIn")
        private Integer expiresIn;

        @com.aliyun.core.annotation.NameInMap("preSignedUrls")
        private java.util.List<String> preSignedUrls;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.expiresIn = builder.expiresIn;
            this.preSignedUrls = builder.preSignedUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return expiresIn
         */
        public Integer getExpiresIn() {
            return this.expiresIn;
        }

        /**
         * @return preSignedUrls
         */
        public java.util.List<String> getPreSignedUrls() {
            return this.preSignedUrls;
        }

        public static final class Builder {
            private String bucketName; 
            private Integer expiresIn; 
            private java.util.List<String> preSignedUrls; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bucketName = model.bucketName;
                this.expiresIn = model.expiresIn;
                this.preSignedUrls = model.preSignedUrls;
            } 

            /**
             * bucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * expiresIn.
             */
            public Builder expiresIn(Integer expiresIn) {
                this.expiresIn = expiresIn;
                return this;
            }

            /**
             * preSignedUrls.
             */
            public Builder preSignedUrls(java.util.List<String> preSignedUrls) {
                this.preSignedUrls = preSignedUrls;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
