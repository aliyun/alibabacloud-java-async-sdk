// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetCaseFileUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetCaseFileUploadUrlResponseBody</p>
 */
public class GetCaseFileUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCaseFileUploadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaseFileUploadUrlResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCaseFileUploadUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCaseFileUploadUrlResponseBody build() {
            return new GetCaseFileUploadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCaseFileUploadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetCaseFileUploadUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CaseFileKey")
        private String caseFileKey;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.caseFileKey = builder.caseFileKey;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return caseFileKey
         */
        public String getCaseFileKey() {
            return this.caseFileKey;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String caseFileKey; 
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.caseFileKey = model.caseFileKey;
                this.url = model.url;
            } 

            /**
             * <p>The key of the OSS file.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test/namelist.csv</p>
             */
            public Builder caseFileKey(String caseFileKey) {
                this.caseFileKey = caseFileKey;
                return this;
            }

            /**
             * <p>A pre-signed OSS file upload URL for uploading the file. The validity period is one hour.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-test/namelist.csv?Expires=1642067227&OSSAccessKeyId=****&Signature=">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-test/namelist.csv?Expires=1642067227&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
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
