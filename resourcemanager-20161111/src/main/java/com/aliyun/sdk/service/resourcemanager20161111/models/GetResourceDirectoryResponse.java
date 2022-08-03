// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceDirectoryResponse} extends {@link TeaModel}
 *
 * <p>GetResourceDirectoryResponse</p>
 */
public class GetResourceDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceDirectoryResponseBody body;

    private GetResourceDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceDirectoryResponse create() {
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
    public GetResourceDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceDirectoryResponseBody body);

        @Override
        GetResourceDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceDirectoryResponse response) {
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
        public Builder body(GetResourceDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceDirectoryResponse build() {
            return new GetResourceDirectoryResponse(this);
        } 

    } 

}
