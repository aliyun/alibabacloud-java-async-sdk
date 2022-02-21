// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPersonListResponse} extends {@link TeaModel}
 *
 * <p>GetPersonListResponse</p>
 */
public class GetPersonListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPersonListResponseBody body;

    private GetPersonListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPersonListResponse create() {
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
    public GetPersonListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPersonListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPersonListResponseBody body);

        @Override
        GetPersonListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPersonListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPersonListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPersonListResponse response) {
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
        public Builder body(GetPersonListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPersonListResponse build() {
            return new GetPersonListResponse(this);
        } 

    } 

}
