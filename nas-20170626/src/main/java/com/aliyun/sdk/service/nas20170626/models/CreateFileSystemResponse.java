// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileSystemResponse} extends {@link TeaModel}
 *
 * <p>CreateFileSystemResponse</p>
 */
public class CreateFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFileSystemResponseBody body;

    private CreateFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFileSystemResponse create() {
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
    public CreateFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFileSystemResponseBody body);

        @Override
        CreateFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFileSystemResponse response) {
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
        public Builder body(CreateFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFileSystemResponse build() {
            return new CreateFileSystemResponse(this);
        } 

    } 

}
