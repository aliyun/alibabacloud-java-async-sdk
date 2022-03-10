// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserTagMetaResponse} extends {@link TeaModel}
 *
 * <p>AddUserTagMetaResponse</p>
 */
public class AddUserTagMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserTagMetaResponseBody body;

    private AddUserTagMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserTagMetaResponse create() {
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
    public AddUserTagMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserTagMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserTagMetaResponseBody body);

        @Override
        AddUserTagMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserTagMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserTagMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserTagMetaResponse response) {
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
        public Builder body(AddUserTagMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserTagMetaResponse build() {
            return new AddUserTagMetaResponse(this);
        } 

    } 

}
