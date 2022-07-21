// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDestinationResponse} extends {@link TeaModel}
 *
 * <p>AttachDestinationResponse</p>
 */
public class AttachDestinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDestinationResponseBody body;

    private AttachDestinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDestinationResponse create() {
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
    public AttachDestinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDestinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDestinationResponseBody body);

        @Override
        AttachDestinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDestinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDestinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDestinationResponse response) {
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
        public Builder body(AttachDestinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDestinationResponse build() {
            return new AttachDestinationResponse(this);
        } 

    } 

}
