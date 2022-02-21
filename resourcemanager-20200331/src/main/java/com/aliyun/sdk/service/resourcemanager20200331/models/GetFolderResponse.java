// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFolderResponse} extends {@link TeaModel}
 *
 * <p>GetFolderResponse</p>
 */
public class GetFolderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFolderResponseBody body;

    private GetFolderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFolderResponse create() {
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
    public GetFolderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFolderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFolderResponseBody body);

        @Override
        GetFolderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFolderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFolderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFolderResponse response) {
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
        public Builder body(GetFolderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFolderResponse build() {
            return new GetFolderResponse(this);
        } 

    } 

}
