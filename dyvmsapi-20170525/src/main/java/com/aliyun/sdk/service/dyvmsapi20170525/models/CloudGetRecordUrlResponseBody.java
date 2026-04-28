// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudGetRecordUrlResponseBody} extends {@link TeaModel}
 *
 * <p>CloudGetRecordUrlResponseBody</p>
 */
public class CloudGetRecordUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudGetRecordUrlResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudGetRecordUrlResponseBody create() {
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudGetRecordUrlResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloudGetRecordUrlResponseBody build() {
            return new CloudGetRecordUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudGetRecordUrlResponseBody} extends {@link TeaModel}
     *
     * <p>CloudGetRecordUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.url = model.url;
            } 

            /**
             * <p>试听或下载地址，默认120分钟过期（可配置），过期后，需重新请求接口</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://voice-1.aliyun.cn/31102016/record/7000000/7000000-2016103111%204742-01087120766-01087120766--record-sip-1-1477885662.222.mp3?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20161114T100003Z&X-Amz-SignedHeaders=host&X-Amz-Expires=119&X-Amz-Credential=AKIAOTCJOBZFUWFI7FSA%2F20161114%2Fcn-north-1%2Fs3%2Faws4_request&X-Amz-Signature=0cda4389ecc743acc71d76a320705afd0c175c5ad2286305675c4dee5189b9c8">http://voice-1.aliyun.cn/31102016/record/7000000/7000000-2016103111%204742-01087120766-01087120766--record-sip-1-1477885662.222.mp3?X-Amz-Algorithm=AWS4-HMAC-SHA256&amp;X-Amz-Date=20161114T100003Z&amp;X-Amz-SignedHeaders=host&amp;X-Amz-Expires=119&amp;X-Amz-Credential=AKIAOTCJOBZFUWFI7FSA%2F20161114%2Fcn-north-1%2Fs3%2Faws4_request&amp;X-Amz-Signature=0cda4389ecc743acc71d76a320705afd0c175c5ad2286305675c4dee5189b9c8</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
