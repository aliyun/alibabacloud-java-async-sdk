// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIPlanResponse} extends {@link TeaModel}
 *
 * <p>GetAIPlanResponse</p>
 */
public class GetAIPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAIPlanResponseBody body;

    private GetAIPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAIPlanResponse create() {
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
    public GetAIPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAIPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAIPlanResponseBody body);

        @Override
        GetAIPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAIPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAIPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAIPlanResponse response) {
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
        public Builder body(GetAIPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAIPlanResponse build() {
            return new GetAIPlanResponse(this);
        } 

    } 

}
