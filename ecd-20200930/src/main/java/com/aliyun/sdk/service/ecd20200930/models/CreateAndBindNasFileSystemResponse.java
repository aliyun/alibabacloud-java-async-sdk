// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAndBindNasFileSystemResponse} extends {@link TeaModel}
 *
 * <p>CreateAndBindNasFileSystemResponse</p>
 */
public class CreateAndBindNasFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAndBindNasFileSystemResponseBody body;

    private CreateAndBindNasFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAndBindNasFileSystemResponse create() {
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
    public CreateAndBindNasFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAndBindNasFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAndBindNasFileSystemResponseBody body);

        @Override
        CreateAndBindNasFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAndBindNasFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAndBindNasFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAndBindNasFileSystemResponse response) {
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
        public Builder body(CreateAndBindNasFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAndBindNasFileSystemResponse build() {
            return new CreateAndBindNasFileSystemResponse(this);
        } 

    } 

}
