// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserTagMetaResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserTagMetaResponse</p>
 */
public class UpdateUserTagMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUserTagMetaResponseBody body;

    private UpdateUserTagMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUserTagMetaResponse create() {
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
    public UpdateUserTagMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserTagMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUserTagMetaResponseBody body);

        @Override
        UpdateUserTagMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserTagMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUserTagMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserTagMetaResponse response) {
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
        public Builder body(UpdateUserTagMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserTagMetaResponse build() {
            return new UpdateUserTagMetaResponse(this);
        } 

    } 

}
