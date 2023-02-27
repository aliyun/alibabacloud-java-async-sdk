// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNumberLocationResponse} extends {@link TeaModel}
 *
 * <p>GetNumberLocationResponse</p>
 */
public class GetNumberLocationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNumberLocationResponseBody body;

    private GetNumberLocationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNumberLocationResponse create() {
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
    public GetNumberLocationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNumberLocationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNumberLocationResponseBody body);

        @Override
        GetNumberLocationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNumberLocationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNumberLocationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNumberLocationResponse response) {
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
        public Builder body(GetNumberLocationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNumberLocationResponse build() {
            return new GetNumberLocationResponse(this);
        } 

    } 

}
