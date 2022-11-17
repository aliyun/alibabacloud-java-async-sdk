// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetOmsOpenAPIProjectResponse} extends {@link TeaModel}
 *
 * <p>ResetOmsOpenAPIProjectResponse</p>
 */
public class ResetOmsOpenAPIProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetOmsOpenAPIProjectResponseBody body;

    private ResetOmsOpenAPIProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetOmsOpenAPIProjectResponse create() {
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
    public ResetOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetOmsOpenAPIProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetOmsOpenAPIProjectResponseBody body);

        @Override
        ResetOmsOpenAPIProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetOmsOpenAPIProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetOmsOpenAPIProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetOmsOpenAPIProjectResponse response) {
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
        public Builder body(ResetOmsOpenAPIProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetOmsOpenAPIProjectResponse build() {
            return new ResetOmsOpenAPIProjectResponse(this);
        } 

    } 

}
