// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloseCreatedByResponse} extends {@link TeaModel}
 *
 * <p>CloseCreatedByResponse</p>
 */
public class CloseCreatedByResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CloseCreatedByResponseBody body;

    private CloseCreatedByResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CloseCreatedByResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public CloseCreatedByResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseCreatedByResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CloseCreatedByResponseBody body);

        @Override
        CloseCreatedByResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseCreatedByResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CloseCreatedByResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseCreatedByResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(CloseCreatedByResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseCreatedByResponse build() {
            return new CloseCreatedByResponse(this);
        } 

    } 

}
