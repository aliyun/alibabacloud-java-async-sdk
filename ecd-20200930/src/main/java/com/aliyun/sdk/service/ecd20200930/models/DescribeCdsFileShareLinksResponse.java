// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdsFileShareLinksResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdsFileShareLinksResponse</p>
 */
public class DescribeCdsFileShareLinksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdsFileShareLinksResponseBody body;

    private DescribeCdsFileShareLinksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdsFileShareLinksResponse create() {
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
    public DescribeCdsFileShareLinksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdsFileShareLinksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdsFileShareLinksResponseBody body);

        @Override
        DescribeCdsFileShareLinksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdsFileShareLinksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdsFileShareLinksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdsFileShareLinksResponse response) {
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
        public Builder body(DescribeCdsFileShareLinksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdsFileShareLinksResponse build() {
            return new DescribeCdsFileShareLinksResponse(this);
        } 

    } 

}
