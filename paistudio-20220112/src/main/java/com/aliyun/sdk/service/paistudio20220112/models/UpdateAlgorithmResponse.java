// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlgorithmResponse} extends {@link TeaModel}
 *
 * <p>UpdateAlgorithmResponse</p>
 */
public class UpdateAlgorithmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAlgorithmResponseBody body;

    private UpdateAlgorithmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAlgorithmResponse create() {
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
    public UpdateAlgorithmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAlgorithmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAlgorithmResponseBody body);

        @Override
        UpdateAlgorithmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAlgorithmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAlgorithmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAlgorithmResponse response) {
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
        public Builder body(UpdateAlgorithmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAlgorithmResponse build() {
            return new UpdateAlgorithmResponse(this);
        } 

    } 

}
