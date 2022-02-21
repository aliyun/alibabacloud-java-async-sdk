// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLineResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomLineResponse</p>
 */
public class DescribeCustomLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomLineResponseBody body;

    private DescribeCustomLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomLineResponse create() {
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
    public DescribeCustomLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomLineResponseBody body);

        @Override
        DescribeCustomLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomLineResponse response) {
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
        public Builder body(DescribeCustomLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomLineResponse build() {
            return new DescribeCustomLineResponse(this);
        } 

    } 

}
