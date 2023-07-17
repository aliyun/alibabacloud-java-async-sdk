// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlgorithmVersionResponse} extends {@link TeaModel}
 *
 * <p>UpdateAlgorithmVersionResponse</p>
 */
public class UpdateAlgorithmVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAlgorithmVersionResponseBody body;

    private UpdateAlgorithmVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAlgorithmVersionResponse create() {
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
    public UpdateAlgorithmVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAlgorithmVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAlgorithmVersionResponseBody body);

        @Override
        UpdateAlgorithmVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAlgorithmVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAlgorithmVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAlgorithmVersionResponse response) {
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
        public Builder body(UpdateAlgorithmVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAlgorithmVersionResponse build() {
            return new UpdateAlgorithmVersionResponse(this);
        } 

    } 

}
