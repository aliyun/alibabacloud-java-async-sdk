// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordFileDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRecordFileDownloadUrlResponseBody</p>
 */
public class QueryRecordFileDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryRecordFileDownloadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.downloadUrl = builder.downloadUrl;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordFileDownloadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
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
        private String downloadUrl; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other status codes indicate that the request failed. For more information, see [Error codes](~~109196~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The download URL of the recording file. The download URL is valid for 2 hours.
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryRecordFileDownloadUrlResponseBody build() {
            return new QueryRecordFileDownloadUrlResponseBody(this);
        } 

    } 

}
