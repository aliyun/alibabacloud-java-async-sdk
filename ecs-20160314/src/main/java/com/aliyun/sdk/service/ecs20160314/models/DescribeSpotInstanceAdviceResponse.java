// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpotInstanceAdviceResponse} extends {@link TeaModel}
 *
 * <p>DescribeSpotInstanceAdviceResponse</p>
 */
public class DescribeSpotInstanceAdviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSpotInstanceAdviceResponseBody body;

    private DescribeSpotInstanceAdviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSpotInstanceAdviceResponse create() {
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
    public DescribeSpotInstanceAdviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSpotInstanceAdviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSpotInstanceAdviceResponseBody body);

        @Override
        DescribeSpotInstanceAdviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSpotInstanceAdviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSpotInstanceAdviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSpotInstanceAdviceResponse response) {
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
        public Builder body(DescribeSpotInstanceAdviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSpotInstanceAdviceResponse build() {
            return new DescribeSpotInstanceAdviceResponse(this);
        } 

    } 

}
