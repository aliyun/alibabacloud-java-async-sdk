// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecondRankResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecondRankResponse</p>
 */
public class DescribeSecondRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecondRankResponseBody body;

    private DescribeSecondRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecondRankResponse create() {
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
    public DescribeSecondRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecondRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecondRankResponseBody body);

        @Override
        DescribeSecondRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecondRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecondRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecondRankResponse response) {
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
        public Builder body(DescribeSecondRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecondRankResponse build() {
            return new DescribeSecondRankResponse(this);
        } 

    } 

}
