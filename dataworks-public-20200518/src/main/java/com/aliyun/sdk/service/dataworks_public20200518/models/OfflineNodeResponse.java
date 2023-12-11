// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineNodeResponse} extends {@link TeaModel}
 *
 * <p>OfflineNodeResponse</p>
 */
public class OfflineNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OfflineNodeResponseBody body;

    private OfflineNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OfflineNodeResponse create() {
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
    public OfflineNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OfflineNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OfflineNodeResponseBody body);

        @Override
        OfflineNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OfflineNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OfflineNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OfflineNodeResponse response) {
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
        public Builder body(OfflineNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OfflineNodeResponse build() {
            return new OfflineNodeResponse(this);
        } 

    } 

}
