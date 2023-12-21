// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopObjectRetrievalResponse} extends {@link TeaModel}
 *
 * <p>PopObjectRetrievalResponse</p>
 */
public class PopObjectRetrievalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private PopObjectRetrievalResponseBody body;

    private PopObjectRetrievalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PopObjectRetrievalResponse create() {
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
    public PopObjectRetrievalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PopObjectRetrievalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PopObjectRetrievalResponseBody body);

        @Override
        PopObjectRetrievalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PopObjectRetrievalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PopObjectRetrievalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PopObjectRetrievalResponse response) {
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
        public Builder body(PopObjectRetrievalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PopObjectRetrievalResponse build() {
            return new PopObjectRetrievalResponse(this);
        } 

    } 

}
