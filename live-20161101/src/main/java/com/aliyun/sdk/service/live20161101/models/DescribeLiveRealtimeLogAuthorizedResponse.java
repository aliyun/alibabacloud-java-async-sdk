// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRealtimeLogAuthorizedResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveRealtimeLogAuthorizedResponse</p>
 */
public class DescribeLiveRealtimeLogAuthorizedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveRealtimeLogAuthorizedResponseBody body;

    private DescribeLiveRealtimeLogAuthorizedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveRealtimeLogAuthorizedResponse create() {
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
    public DescribeLiveRealtimeLogAuthorizedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveRealtimeLogAuthorizedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveRealtimeLogAuthorizedResponseBody body);

        @Override
        DescribeLiveRealtimeLogAuthorizedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveRealtimeLogAuthorizedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveRealtimeLogAuthorizedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveRealtimeLogAuthorizedResponse response) {
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
        public Builder body(DescribeLiveRealtimeLogAuthorizedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveRealtimeLogAuthorizedResponse build() {
            return new DescribeLiveRealtimeLogAuthorizedResponse(this);
        } 

    } 

}
