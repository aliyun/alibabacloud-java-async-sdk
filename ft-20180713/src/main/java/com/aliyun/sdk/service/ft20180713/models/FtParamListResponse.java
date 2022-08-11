// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FtParamListResponse} extends {@link TeaModel}
 *
 * <p>FtParamListResponse</p>
 */
public class FtParamListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FtParamListResponseBody body;

    private FtParamListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FtParamListResponse create() {
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
     * @return body
     */
    public FtParamListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FtParamListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FtParamListResponseBody body);

        @Override
        FtParamListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FtParamListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FtParamListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FtParamListResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(FtParamListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FtParamListResponse build() {
            return new FtParamListResponse(this);
        } 

    } 

}
