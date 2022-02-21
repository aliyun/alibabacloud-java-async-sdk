// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepoSourceCodeRepoResponse} extends {@link TeaModel}
 *
 * <p>UpdateRepoSourceCodeRepoResponse</p>
 */
public class UpdateRepoSourceCodeRepoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRepoSourceCodeRepoResponseBody body;

    private UpdateRepoSourceCodeRepoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRepoSourceCodeRepoResponse create() {
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
    public UpdateRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRepoSourceCodeRepoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRepoSourceCodeRepoResponseBody body);

        @Override
        UpdateRepoSourceCodeRepoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRepoSourceCodeRepoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRepoSourceCodeRepoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRepoSourceCodeRepoResponse response) {
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
        public Builder body(UpdateRepoSourceCodeRepoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRepoSourceCodeRepoResponse build() {
            return new UpdateRepoSourceCodeRepoResponse(this);
        } 

    } 

}
