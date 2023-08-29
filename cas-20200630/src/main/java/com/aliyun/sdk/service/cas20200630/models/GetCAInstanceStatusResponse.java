// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCAInstanceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetCAInstanceStatusResponse</p>
 */
public class GetCAInstanceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCAInstanceStatusResponseBody body;

    private GetCAInstanceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCAInstanceStatusResponse create() {
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
    public GetCAInstanceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCAInstanceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCAInstanceStatusResponseBody body);

        @Override
        GetCAInstanceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCAInstanceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCAInstanceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCAInstanceStatusResponse response) {
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
        public Builder body(GetCAInstanceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCAInstanceStatusResponse build() {
            return new GetCAInstanceStatusResponse(this);
        } 

    } 

}
