// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableResponse} extends {@link TeaModel}
 *
 * <p>UpdateTableResponse</p>
 */
public class UpdateTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTableResponseBody body;

    private UpdateTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTableResponse create() {
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
    public UpdateTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTableResponseBody body);

        @Override
        UpdateTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTableResponse response) {
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
        public Builder body(UpdateTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTableResponse build() {
            return new UpdateTableResponse(this);
        } 

    } 

}
