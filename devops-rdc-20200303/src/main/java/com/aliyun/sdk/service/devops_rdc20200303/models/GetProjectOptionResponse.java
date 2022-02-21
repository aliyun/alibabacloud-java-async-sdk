// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectOptionResponse} extends {@link TeaModel}
 *
 * <p>GetProjectOptionResponse</p>
 */
public class GetProjectOptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProjectOptionResponseBody body;

    private GetProjectOptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProjectOptionResponse create() {
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
    public GetProjectOptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProjectOptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProjectOptionResponseBody body);

        @Override
        GetProjectOptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProjectOptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProjectOptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProjectOptionResponse response) {
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
        public Builder body(GetProjectOptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProjectOptionResponse build() {
            return new GetProjectOptionResponse(this);
        } 

    } 

}
