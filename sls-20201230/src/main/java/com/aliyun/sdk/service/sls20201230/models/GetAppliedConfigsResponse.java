// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAppliedConfigsResponse} extends {@link TeaModel}
 *
 * <p>GetAppliedConfigsResponse</p>
 */
public class GetAppliedConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppliedConfigsResponseBody body;

    private GetAppliedConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppliedConfigsResponse create() {
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
    public GetAppliedConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppliedConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppliedConfigsResponseBody body);

        @Override
        GetAppliedConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppliedConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppliedConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppliedConfigsResponse response) {
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
        public Builder body(GetAppliedConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppliedConfigsResponse build() {
            return new GetAppliedConfigsResponse(this);
        } 

    } 

}
