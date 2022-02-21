// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncInstanceMetaResponse} extends {@link TeaModel}
 *
 * <p>SyncInstanceMetaResponse</p>
 */
public class SyncInstanceMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncInstanceMetaResponseBody body;

    private SyncInstanceMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncInstanceMetaResponse create() {
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
    public SyncInstanceMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncInstanceMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncInstanceMetaResponseBody body);

        @Override
        SyncInstanceMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncInstanceMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncInstanceMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncInstanceMetaResponse response) {
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
        public Builder body(SyncInstanceMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncInstanceMetaResponse build() {
            return new SyncInstanceMetaResponse(this);
        } 

    } 

}
