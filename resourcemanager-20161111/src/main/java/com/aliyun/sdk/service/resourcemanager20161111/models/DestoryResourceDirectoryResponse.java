// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DestoryResourceDirectoryResponse} extends {@link TeaModel}
 *
 * <p>DestoryResourceDirectoryResponse</p>
 */
public class DestoryResourceDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DestoryResourceDirectoryResponseBody body;

    private DestoryResourceDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DestoryResourceDirectoryResponse create() {
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
    public DestoryResourceDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DestoryResourceDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DestoryResourceDirectoryResponseBody body);

        @Override
        DestoryResourceDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DestoryResourceDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DestoryResourceDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DestoryResourceDirectoryResponse response) {
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
        public Builder body(DestoryResourceDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DestoryResourceDirectoryResponse build() {
            return new DestoryResourceDirectoryResponse(this);
        } 

    } 

}
