// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDatasetResponse} extends {@link TeaModel}
 *
 * <p>AttachDatasetResponse</p>
 */
public class AttachDatasetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDatasetResponseBody body;

    private AttachDatasetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDatasetResponse create() {
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
    public AttachDatasetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDatasetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDatasetResponseBody body);

        @Override
        AttachDatasetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDatasetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDatasetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDatasetResponse response) {
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
        public Builder body(AttachDatasetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDatasetResponse build() {
            return new AttachDatasetResponse(this);
        } 

    } 

}
