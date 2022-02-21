// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotPersonTableResponse} extends {@link TeaModel}
 *
 * <p>UpdateAiotPersonTableResponse</p>
 */
public class UpdateAiotPersonTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAiotPersonTableResponseBody body;

    private UpdateAiotPersonTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAiotPersonTableResponse create() {
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
    public UpdateAiotPersonTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAiotPersonTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAiotPersonTableResponseBody body);

        @Override
        UpdateAiotPersonTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAiotPersonTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAiotPersonTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAiotPersonTableResponse response) {
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
        public Builder body(UpdateAiotPersonTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAiotPersonTableResponse build() {
            return new UpdateAiotPersonTableResponse(this);
        } 

    } 

}
