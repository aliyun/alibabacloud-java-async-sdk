// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebRTCStatsResponse} extends {@link TeaModel}
 *
 * <p>SaveWebRTCStatsResponse</p>
 */
public class SaveWebRTCStatsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveWebRTCStatsResponseBody body;

    private SaveWebRTCStatsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveWebRTCStatsResponse create() {
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
    public SaveWebRTCStatsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveWebRTCStatsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveWebRTCStatsResponseBody body);

        @Override
        SaveWebRTCStatsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveWebRTCStatsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveWebRTCStatsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveWebRTCStatsResponse response) {
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
        public Builder body(SaveWebRTCStatsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveWebRTCStatsResponse build() {
            return new SaveWebRTCStatsResponse(this);
        } 

    } 

}
