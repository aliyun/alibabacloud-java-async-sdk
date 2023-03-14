// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackSourceCidrResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackSourceCidrResponse</p>
 */
public class DescribeBackSourceCidrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackSourceCidrResponseBody body;

    private DescribeBackSourceCidrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackSourceCidrResponse create() {
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
    public DescribeBackSourceCidrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackSourceCidrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackSourceCidrResponseBody body);

        @Override
        DescribeBackSourceCidrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackSourceCidrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackSourceCidrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackSourceCidrResponse response) {
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
        public Builder body(DescribeBackSourceCidrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackSourceCidrResponse build() {
            return new DescribeBackSourceCidrResponse(this);
        } 

    } 

}
