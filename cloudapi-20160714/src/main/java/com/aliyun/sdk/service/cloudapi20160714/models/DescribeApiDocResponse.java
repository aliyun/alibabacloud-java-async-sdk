// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiDocResponse} extends {@link TeaModel}
 *
 * <p>DescribeApiDocResponse</p>
 */
public class DescribeApiDocResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApiDocResponseBody body;

    private DescribeApiDocResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApiDocResponse create() {
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
    public DescribeApiDocResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApiDocResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApiDocResponseBody body);

        @Override
        DescribeApiDocResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApiDocResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApiDocResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApiDocResponse response) {
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
        public Builder body(DescribeApiDocResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApiDocResponse build() {
            return new DescribeApiDocResponse(this);
        } 

    } 

}
