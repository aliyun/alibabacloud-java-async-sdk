// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUnBlackholeCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeUnBlackholeCountResponse</p>
 */
public class DescribeUnBlackholeCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUnBlackholeCountResponseBody body;

    private DescribeUnBlackholeCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUnBlackholeCountResponse create() {
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
    public DescribeUnBlackholeCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUnBlackholeCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUnBlackholeCountResponseBody body);

        @Override
        DescribeUnBlackholeCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUnBlackholeCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUnBlackholeCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUnBlackholeCountResponse response) {
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
        public Builder body(DescribeUnBlackholeCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUnBlackholeCountResponse build() {
            return new DescribeUnBlackholeCountResponse(this);
        } 

    } 

}
