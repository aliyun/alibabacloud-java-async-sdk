// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetadataResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetadataResponse</p>
 */
public class DescribeMetadataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetadataResponseBody body;

    private DescribeMetadataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetadataResponse create() {
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
    public DescribeMetadataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetadataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetadataResponseBody body);

        @Override
        DescribeMetadataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetadataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetadataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetadataResponse response) {
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
        public Builder body(DescribeMetadataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetadataResponse build() {
            return new DescribeMetadataResponse(this);
        } 

    } 

}
