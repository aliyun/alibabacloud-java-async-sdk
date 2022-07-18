// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceResponse} extends {@link TeaModel}
 *
 * <p>UpdateServiceResponse</p>
 */
public class UpdateServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateServiceResponseBody body;

    private UpdateServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateServiceResponse create() {
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
    public UpdateServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateServiceResponseBody body);

        @Override
        UpdateServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateServiceResponse response) {
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
        public Builder body(UpdateServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceResponse build() {
            return new UpdateServiceResponse(this);
        } 

    } 

}
