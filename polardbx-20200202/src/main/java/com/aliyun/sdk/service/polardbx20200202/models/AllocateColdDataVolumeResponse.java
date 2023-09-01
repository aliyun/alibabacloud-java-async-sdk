// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateColdDataVolumeResponse} extends {@link TeaModel}
 *
 * <p>AllocateColdDataVolumeResponse</p>
 */
public class AllocateColdDataVolumeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateColdDataVolumeResponseBody body;

    private AllocateColdDataVolumeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateColdDataVolumeResponse create() {
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
    public AllocateColdDataVolumeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateColdDataVolumeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateColdDataVolumeResponseBody body);

        @Override
        AllocateColdDataVolumeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateColdDataVolumeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateColdDataVolumeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateColdDataVolumeResponse response) {
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
        public Builder body(AllocateColdDataVolumeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateColdDataVolumeResponse build() {
            return new AllocateColdDataVolumeResponse(this);
        } 

    } 

}
