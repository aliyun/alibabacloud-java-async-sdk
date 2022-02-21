// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCollectorResponse} extends {@link TeaModel}
 *
 * <p>UpdateCollectorResponse</p>
 */
public class UpdateCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCollectorResponseBody body;

    private UpdateCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCollectorResponse create() {
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
    public UpdateCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCollectorResponseBody body);

        @Override
        UpdateCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCollectorResponse response) {
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
        public Builder body(UpdateCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCollectorResponse build() {
            return new UpdateCollectorResponse(this);
        } 

    } 

}
