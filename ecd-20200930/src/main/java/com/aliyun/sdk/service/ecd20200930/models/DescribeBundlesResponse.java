// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBundlesResponse} extends {@link TeaModel}
 *
 * <p>DescribeBundlesResponse</p>
 */
public class DescribeBundlesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBundlesResponseBody body;

    private DescribeBundlesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBundlesResponse create() {
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
    public DescribeBundlesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBundlesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBundlesResponseBody body);

        @Override
        DescribeBundlesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBundlesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBundlesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBundlesResponse response) {
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
        public Builder body(DescribeBundlesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBundlesResponse build() {
            return new DescribeBundlesResponse(this);
        } 

    } 

}
