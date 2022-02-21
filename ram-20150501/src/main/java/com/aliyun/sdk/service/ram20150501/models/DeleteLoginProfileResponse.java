// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLoginProfileResponse} extends {@link TeaModel}
 *
 * <p>DeleteLoginProfileResponse</p>
 */
public class DeleteLoginProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLoginProfileResponseBody body;

    private DeleteLoginProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLoginProfileResponse create() {
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
    public DeleteLoginProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLoginProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLoginProfileResponseBody body);

        @Override
        DeleteLoginProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLoginProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLoginProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLoginProfileResponse response) {
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
        public Builder body(DeleteLoginProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLoginProfileResponse build() {
            return new DeleteLoginProfileResponse(this);
        } 

    } 

}
