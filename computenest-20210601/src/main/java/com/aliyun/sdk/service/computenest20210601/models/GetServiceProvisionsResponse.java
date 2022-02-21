// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceProvisionsResponse} extends {@link TeaModel}
 *
 * <p>GetServiceProvisionsResponse</p>
 */
public class GetServiceProvisionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceProvisionsResponseBody body;

    private GetServiceProvisionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceProvisionsResponse create() {
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
    public GetServiceProvisionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceProvisionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceProvisionsResponseBody body);

        @Override
        GetServiceProvisionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceProvisionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceProvisionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceProvisionsResponse response) {
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
        public Builder body(GetServiceProvisionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceProvisionsResponse build() {
            return new GetServiceProvisionsResponse(this);
        } 

    } 

}
