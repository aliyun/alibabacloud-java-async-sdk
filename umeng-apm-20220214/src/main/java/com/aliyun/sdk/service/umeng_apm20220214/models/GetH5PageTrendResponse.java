// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetH5PageTrendResponse} extends {@link TeaModel}
 *
 * <p>GetH5PageTrendResponse</p>
 */
public class GetH5PageTrendResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetH5PageTrendResponseBody body;

    private GetH5PageTrendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetH5PageTrendResponse create() {
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
    public GetH5PageTrendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetH5PageTrendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetH5PageTrendResponseBody body);

        @Override
        GetH5PageTrendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetH5PageTrendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetH5PageTrendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetH5PageTrendResponse response) {
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
        public Builder body(GetH5PageTrendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetH5PageTrendResponse build() {
            return new GetH5PageTrendResponse(this);
        } 

    } 

}
