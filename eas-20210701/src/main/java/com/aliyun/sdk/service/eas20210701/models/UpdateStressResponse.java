// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStressResponse} extends {@link TeaModel}
 *
 * <p>UpdateStressResponse</p>
 */
public class UpdateStressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateStressResponseBody body;

    private UpdateStressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateStressResponse create() {
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
    public UpdateStressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateStressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateStressResponseBody body);

        @Override
        UpdateStressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateStressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateStressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateStressResponse response) {
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
        public Builder body(UpdateStressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateStressResponse build() {
            return new UpdateStressResponse(this);
        } 

    } 

}
