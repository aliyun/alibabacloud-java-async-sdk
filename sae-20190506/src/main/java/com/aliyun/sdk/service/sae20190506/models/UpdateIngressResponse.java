// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIngressResponse} extends {@link TeaModel}
 *
 * <p>UpdateIngressResponse</p>
 */
public class UpdateIngressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIngressResponseBody body;

    private UpdateIngressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIngressResponse create() {
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
    public UpdateIngressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIngressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIngressResponseBody body);

        @Override
        UpdateIngressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIngressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIngressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIngressResponse response) {
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
        public Builder body(UpdateIngressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIngressResponse build() {
            return new UpdateIngressResponse(this);
        } 

    } 

}
