// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserConfigsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserConfigsResponse</p>
 */
public class DescribeCdnUserConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnUserConfigsResponseBody body;

    private DescribeCdnUserConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnUserConfigsResponse create() {
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
    public DescribeCdnUserConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnUserConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnUserConfigsResponseBody body);

        @Override
        DescribeCdnUserConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnUserConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnUserConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnUserConfigsResponse response) {
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
        public Builder body(DescribeCdnUserConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnUserConfigsResponse build() {
            return new DescribeCdnUserConfigsResponse(this);
        } 

    } 

}
