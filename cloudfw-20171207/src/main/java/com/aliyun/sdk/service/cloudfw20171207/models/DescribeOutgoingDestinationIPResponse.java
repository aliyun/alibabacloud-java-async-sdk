// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutgoingDestinationIPResponse} extends {@link TeaModel}
 *
 * <p>DescribeOutgoingDestinationIPResponse</p>
 */
public class DescribeOutgoingDestinationIPResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOutgoingDestinationIPResponseBody body;

    private DescribeOutgoingDestinationIPResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOutgoingDestinationIPResponse create() {
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
    public DescribeOutgoingDestinationIPResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOutgoingDestinationIPResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOutgoingDestinationIPResponseBody body);

        @Override
        DescribeOutgoingDestinationIPResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOutgoingDestinationIPResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOutgoingDestinationIPResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOutgoingDestinationIPResponse response) {
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
        public Builder body(DescribeOutgoingDestinationIPResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOutgoingDestinationIPResponse build() {
            return new DescribeOutgoingDestinationIPResponse(this);
        } 

    } 

}
