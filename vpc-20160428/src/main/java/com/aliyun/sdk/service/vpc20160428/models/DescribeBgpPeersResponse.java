// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBgpPeersResponse} extends {@link TeaModel}
 *
 * <p>DescribeBgpPeersResponse</p>
 */
public class DescribeBgpPeersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBgpPeersResponseBody body;

    private DescribeBgpPeersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBgpPeersResponse create() {
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
    public DescribeBgpPeersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBgpPeersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBgpPeersResponseBody body);

        @Override
        DescribeBgpPeersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBgpPeersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBgpPeersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBgpPeersResponse response) {
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
        public Builder body(DescribeBgpPeersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBgpPeersResponse build() {
            return new DescribeBgpPeersResponse(this);
        } 

    } 

}
