// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterComponentsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCasterComponentsResponse</p>
 */
public class DescribeCasterComponentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCasterComponentsResponseBody body;

    private DescribeCasterComponentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCasterComponentsResponse create() {
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
    public DescribeCasterComponentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCasterComponentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCasterComponentsResponseBody body);

        @Override
        DescribeCasterComponentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCasterComponentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCasterComponentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCasterComponentsResponse response) {
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
        public Builder body(DescribeCasterComponentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCasterComponentsResponse build() {
            return new DescribeCasterComponentsResponse(this);
        } 

    } 

}
