// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFolderResponse} extends {@link TeaModel}
 *
 * <p>CreateFolderResponse</p>
 */
public class CreateFolderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFolderResponseBody body;

    private CreateFolderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFolderResponse create() {
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
    public CreateFolderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFolderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFolderResponseBody body);

        @Override
        CreateFolderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFolderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFolderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFolderResponse response) {
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
        public Builder body(CreateFolderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFolderResponse build() {
            return new CreateFolderResponse(this);
        } 

    } 

}
