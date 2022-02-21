// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTTSConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeTTSConfigResponse</p>
 */
public class DescribeTTSConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTTSConfigResponseBody body;

    private DescribeTTSConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTTSConfigResponse create() {
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
    public DescribeTTSConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTTSConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTTSConfigResponseBody body);

        @Override
        DescribeTTSConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTTSConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTTSConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTTSConfigResponse response) {
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
        public Builder body(DescribeTTSConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTTSConfigResponse build() {
            return new DescribeTTSConfigResponse(this);
        } 

    } 

}
