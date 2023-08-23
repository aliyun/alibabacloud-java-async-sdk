// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLimitationResponse} extends {@link TeaModel}
 *
 * <p>DescribeLimitationResponse</p>
 */
public class DescribeLimitationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLimitationResponseBody body;

    private DescribeLimitationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLimitationResponse create() {
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
    public DescribeLimitationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLimitationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLimitationResponseBody body);

        @Override
        DescribeLimitationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLimitationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLimitationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLimitationResponse response) {
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
        public Builder body(DescribeLimitationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLimitationResponse build() {
            return new DescribeLimitationResponse(this);
        } 

    } 

}
