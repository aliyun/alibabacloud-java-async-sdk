// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDestinationResponse} extends {@link TeaModel}
 *
 * <p>UpdateDestinationResponse</p>
 */
public class UpdateDestinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDestinationResponseBody body;

    private UpdateDestinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDestinationResponse create() {
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
    public UpdateDestinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDestinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDestinationResponseBody body);

        @Override
        UpdateDestinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDestinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDestinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDestinationResponse response) {
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
        public Builder body(UpdateDestinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDestinationResponse build() {
            return new UpdateDestinationResponse(this);
        } 

    } 

}
