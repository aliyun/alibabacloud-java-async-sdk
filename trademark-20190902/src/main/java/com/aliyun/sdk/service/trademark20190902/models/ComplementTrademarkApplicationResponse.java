// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ComplementTrademarkApplicationResponse} extends {@link TeaModel}
 *
 * <p>ComplementTrademarkApplicationResponse</p>
 */
public class ComplementTrademarkApplicationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ComplementTrademarkApplicationResponseBody body;

    private ComplementTrademarkApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ComplementTrademarkApplicationResponse create() {
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
    public ComplementTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ComplementTrademarkApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ComplementTrademarkApplicationResponseBody body);

        @Override
        ComplementTrademarkApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ComplementTrademarkApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ComplementTrademarkApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ComplementTrademarkApplicationResponse response) {
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
        public Builder body(ComplementTrademarkApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ComplementTrademarkApplicationResponse build() {
            return new ComplementTrademarkApplicationResponse(this);
        } 

    } 

}
