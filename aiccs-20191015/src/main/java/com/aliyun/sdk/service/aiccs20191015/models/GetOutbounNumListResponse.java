// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOutbounNumListResponse} extends {@link TeaModel}
 *
 * <p>GetOutbounNumListResponse</p>
 */
public class GetOutbounNumListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOutbounNumListResponseBody body;

    private GetOutbounNumListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOutbounNumListResponse create() {
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
    public GetOutbounNumListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOutbounNumListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOutbounNumListResponseBody body);

        @Override
        GetOutbounNumListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOutbounNumListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOutbounNumListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOutbounNumListResponse response) {
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
        public Builder body(GetOutbounNumListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOutbounNumListResponse build() {
            return new GetOutbounNumListResponse(this);
        } 

    } 

}
