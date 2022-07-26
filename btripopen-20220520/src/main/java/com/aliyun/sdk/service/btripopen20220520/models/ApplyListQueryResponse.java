// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyListQueryResponse} extends {@link TeaModel}
 *
 * <p>ApplyListQueryResponse</p>
 */
public class ApplyListQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyListQueryResponseBody body;

    private ApplyListQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyListQueryResponse create() {
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
    public ApplyListQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyListQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyListQueryResponseBody body);

        @Override
        ApplyListQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyListQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyListQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyListQueryResponse response) {
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
        public Builder body(ApplyListQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyListQueryResponse build() {
            return new ApplyListQueryResponse(this);
        } 

    } 

}
