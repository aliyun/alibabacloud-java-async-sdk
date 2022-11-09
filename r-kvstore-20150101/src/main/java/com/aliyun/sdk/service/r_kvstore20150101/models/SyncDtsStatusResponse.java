// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncDtsStatusResponse} extends {@link TeaModel}
 *
 * <p>SyncDtsStatusResponse</p>
 */
public class SyncDtsStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncDtsStatusResponseBody body;

    private SyncDtsStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncDtsStatusResponse create() {
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
    public SyncDtsStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncDtsStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncDtsStatusResponseBody body);

        @Override
        SyncDtsStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncDtsStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncDtsStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncDtsStatusResponse response) {
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
        public Builder body(SyncDtsStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncDtsStatusResponse build() {
            return new SyncDtsStatusResponse(this);
        } 

    } 

}
