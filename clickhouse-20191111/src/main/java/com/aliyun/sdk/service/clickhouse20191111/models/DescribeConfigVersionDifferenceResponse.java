// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigVersionDifferenceResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigVersionDifferenceResponse</p>
 */
public class DescribeConfigVersionDifferenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigVersionDifferenceResponseBody body;

    private DescribeConfigVersionDifferenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigVersionDifferenceResponse create() {
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
    public DescribeConfigVersionDifferenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigVersionDifferenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigVersionDifferenceResponseBody body);

        @Override
        DescribeConfigVersionDifferenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigVersionDifferenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigVersionDifferenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigVersionDifferenceResponse response) {
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
        public Builder body(DescribeConfigVersionDifferenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigVersionDifferenceResponse build() {
            return new DescribeConfigVersionDifferenceResponse(this);
        } 

    } 

}
