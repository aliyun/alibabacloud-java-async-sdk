// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSourcePackStatusResponse} extends {@link TeaModel}
 *
 * <p>GetSourcePackStatusResponse</p>
 */
public class GetSourcePackStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSourcePackStatusResponseBody body;

    private GetSourcePackStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSourcePackStatusResponse create() {
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
    public GetSourcePackStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSourcePackStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSourcePackStatusResponseBody body);

        @Override
        GetSourcePackStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSourcePackStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSourcePackStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSourcePackStatusResponse response) {
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
        public Builder body(GetSourcePackStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSourcePackStatusResponse build() {
            return new GetSourcePackStatusResponse(this);
        } 

    } 

}
