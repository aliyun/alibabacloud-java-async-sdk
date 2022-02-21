// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStreamsResponse} extends {@link TeaModel}
 *
 * <p>DescribeStreamsResponse</p>
 */
public class DescribeStreamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStreamsResponseBody body;

    private DescribeStreamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStreamsResponse create() {
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
    public DescribeStreamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStreamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStreamsResponseBody body);

        @Override
        DescribeStreamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStreamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStreamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStreamsResponse response) {
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
        public Builder body(DescribeStreamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStreamsResponse build() {
            return new DescribeStreamsResponse(this);
        } 

    } 

}
