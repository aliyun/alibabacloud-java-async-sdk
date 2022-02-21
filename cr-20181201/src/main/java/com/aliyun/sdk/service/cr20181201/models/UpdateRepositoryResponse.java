// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepositoryResponse} extends {@link TeaModel}
 *
 * <p>UpdateRepositoryResponse</p>
 */
public class UpdateRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRepositoryResponseBody body;

    private UpdateRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRepositoryResponse create() {
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
    public UpdateRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRepositoryResponseBody body);

        @Override
        UpdateRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRepositoryResponse response) {
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
        public Builder body(UpdateRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRepositoryResponse build() {
            return new UpdateRepositoryResponse(this);
        } 

    } 

}
