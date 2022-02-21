// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncHDMAliyunResourceResponse} extends {@link TeaModel}
 *
 * <p>SyncHDMAliyunResourceResponse</p>
 */
public class SyncHDMAliyunResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SyncHDMAliyunResourceResponseBody body;

    private SyncHDMAliyunResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SyncHDMAliyunResourceResponse create() {
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
    public SyncHDMAliyunResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SyncHDMAliyunResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SyncHDMAliyunResourceResponseBody body);

        @Override
        SyncHDMAliyunResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SyncHDMAliyunResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SyncHDMAliyunResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SyncHDMAliyunResourceResponse response) {
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
        public Builder body(SyncHDMAliyunResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SyncHDMAliyunResourceResponse build() {
            return new SyncHDMAliyunResourceResponse(this);
        } 

    } 

}
