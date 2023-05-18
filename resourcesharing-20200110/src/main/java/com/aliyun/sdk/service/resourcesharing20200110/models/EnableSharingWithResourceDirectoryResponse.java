// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSharingWithResourceDirectoryResponse} extends {@link TeaModel}
 *
 * <p>EnableSharingWithResourceDirectoryResponse</p>
 */
public class EnableSharingWithResourceDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSharingWithResourceDirectoryResponseBody body;

    private EnableSharingWithResourceDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSharingWithResourceDirectoryResponse create() {
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
    public EnableSharingWithResourceDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSharingWithResourceDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSharingWithResourceDirectoryResponseBody body);

        @Override
        EnableSharingWithResourceDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSharingWithResourceDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSharingWithResourceDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSharingWithResourceDirectoryResponse response) {
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
        public Builder body(EnableSharingWithResourceDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSharingWithResourceDirectoryResponse build() {
            return new EnableSharingWithResourceDirectoryResponse(this);
        } 

    } 

}
