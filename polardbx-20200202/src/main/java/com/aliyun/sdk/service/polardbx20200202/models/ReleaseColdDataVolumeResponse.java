// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseColdDataVolumeResponse} extends {@link TeaModel}
 *
 * <p>ReleaseColdDataVolumeResponse</p>
 */
public class ReleaseColdDataVolumeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseColdDataVolumeResponseBody body;

    private ReleaseColdDataVolumeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseColdDataVolumeResponse create() {
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
    public ReleaseColdDataVolumeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseColdDataVolumeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseColdDataVolumeResponseBody body);

        @Override
        ReleaseColdDataVolumeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseColdDataVolumeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseColdDataVolumeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseColdDataVolumeResponse response) {
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
        public Builder body(ReleaseColdDataVolumeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseColdDataVolumeResponse build() {
            return new ReleaseColdDataVolumeResponse(this);
        } 

    } 

}
