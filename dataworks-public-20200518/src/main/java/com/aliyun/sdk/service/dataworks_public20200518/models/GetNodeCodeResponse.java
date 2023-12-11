// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeCodeResponse} extends {@link TeaModel}
 *
 * <p>GetNodeCodeResponse</p>
 */
public class GetNodeCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNodeCodeResponseBody body;

    private GetNodeCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNodeCodeResponse create() {
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
    public GetNodeCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodeCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNodeCodeResponseBody body);

        @Override
        GetNodeCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodeCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNodeCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodeCodeResponse response) {
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
        public Builder body(GetNodeCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodeCodeResponse build() {
            return new GetNodeCodeResponse(this);
        } 

    } 

}
