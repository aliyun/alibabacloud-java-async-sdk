// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSetResponse} extends {@link TeaModel}
 *
 * <p>UpdateSetResponse</p>
 */
public class UpdateSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSetResponseBody body;

    private UpdateSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSetResponse create() {
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
    public UpdateSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSetResponseBody body);

        @Override
        UpdateSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSetResponse response) {
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
        public Builder body(UpdateSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSetResponse build() {
            return new UpdateSetResponse(this);
        } 

    } 

}
