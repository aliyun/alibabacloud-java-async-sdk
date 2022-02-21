// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCertsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCertsResponse</p>
 */
public class DescribeCertsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCertsResponseBody body;

    private DescribeCertsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCertsResponse create() {
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
    public DescribeCertsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCertsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCertsResponseBody body);

        @Override
        DescribeCertsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCertsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCertsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCertsResponse response) {
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
        public Builder body(DescribeCertsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCertsResponse build() {
            return new DescribeCertsResponse(this);
        } 

    } 

}
