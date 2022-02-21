// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSubListResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnSubListResponse</p>
 */
public class DescribeCdnSubListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnSubListResponseBody body;

    private DescribeCdnSubListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnSubListResponse create() {
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
    public DescribeCdnSubListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnSubListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnSubListResponseBody body);

        @Override
        DescribeCdnSubListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnSubListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnSubListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnSubListResponse response) {
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
        public Builder body(DescribeCdnSubListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnSubListResponse build() {
            return new DescribeCdnSubListResponse(this);
        } 

    } 

}
