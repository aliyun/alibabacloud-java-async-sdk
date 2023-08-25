// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillProcessListResponse} extends {@link TeaModel}
 *
 * <p>KillProcessListResponse</p>
 */
public class KillProcessListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private KillProcessListResponseBody body;

    private KillProcessListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static KillProcessListResponse create() {
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
    public KillProcessListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<KillProcessListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(KillProcessListResponseBody body);

        @Override
        KillProcessListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KillProcessListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private KillProcessListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KillProcessListResponse response) {
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
        public Builder body(KillProcessListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public KillProcessListResponse build() {
            return new KillProcessListResponse(this);
        } 

    } 

}
