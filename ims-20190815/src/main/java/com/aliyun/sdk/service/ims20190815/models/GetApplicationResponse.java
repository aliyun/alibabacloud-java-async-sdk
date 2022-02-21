// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationResponse</p>
 */
public class GetApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApplicationResponseBody body;

    private GetApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApplicationResponse create() {
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
    public GetApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApplicationResponseBody body);

        @Override
        GetApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationResponse response) {
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
        public Builder body(GetApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationResponse build() {
            return new GetApplicationResponse(this);
        } 

    } 

}
