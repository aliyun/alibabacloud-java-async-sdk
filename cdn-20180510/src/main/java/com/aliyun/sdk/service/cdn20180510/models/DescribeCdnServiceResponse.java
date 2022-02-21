// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnServiceResponse</p>
 */
public class DescribeCdnServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnServiceResponseBody body;

    private DescribeCdnServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnServiceResponse create() {
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
    public DescribeCdnServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnServiceResponseBody body);

        @Override
        DescribeCdnServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnServiceResponse response) {
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
        public Builder body(DescribeCdnServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnServiceResponse build() {
            return new DescribeCdnServiceResponse(this);
        } 

    } 

}
