// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link HttpRequestVodTestToolResponseBody} extends {@link TeaModel}
 *
 * <p>HttpRequestVodTestToolResponseBody</p>
 */
public class HttpRequestVodTestToolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Body")
    private String body;

    @com.aliyun.core.annotation.NameInMap("Header")
    private String header;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private HttpRequestVodTestToolResponseBody(Builder builder) {
        this.body = builder.body;
        this.header = builder.header;
        this.requestId = builder.requestId;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpRequestVodTestToolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return header
     */
    public String getHeader() {
        return this.header;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String body; 
        private String header; 
        private String requestId; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(HttpRequestVodTestToolResponseBody model) {
            this.body = model.body;
            this.header = model.header;
            this.requestId = model.requestId;
            this.statusCode = model.statusCode;
        } 

        /**
         * Body.
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Header.
         */
        public Builder header(String header) {
            this.header = header;
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
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public HttpRequestVodTestToolResponseBody build() {
            return new HttpRequestVodTestToolResponseBody(this);
        } 

    } 

}
