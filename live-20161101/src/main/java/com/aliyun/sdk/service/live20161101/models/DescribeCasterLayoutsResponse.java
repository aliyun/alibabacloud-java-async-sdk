// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterLayoutsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCasterLayoutsResponse</p>
 */
public class DescribeCasterLayoutsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCasterLayoutsResponseBody body;

    private DescribeCasterLayoutsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCasterLayoutsResponse create() {
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
    public DescribeCasterLayoutsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCasterLayoutsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCasterLayoutsResponseBody body);

        @Override
        DescribeCasterLayoutsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCasterLayoutsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCasterLayoutsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCasterLayoutsResponse response) {
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
        public Builder body(DescribeCasterLayoutsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCasterLayoutsResponse build() {
            return new DescribeCasterLayoutsResponse(this);
        } 

    } 

}
