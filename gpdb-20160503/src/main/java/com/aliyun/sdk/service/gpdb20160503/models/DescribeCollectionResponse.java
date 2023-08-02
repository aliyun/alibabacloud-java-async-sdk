// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCollectionResponse} extends {@link TeaModel}
 *
 * <p>DescribeCollectionResponse</p>
 */
public class DescribeCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCollectionResponseBody body;

    private DescribeCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCollectionResponse create() {
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
    public DescribeCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCollectionResponseBody body);

        @Override
        DescribeCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCollectionResponse response) {
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
        public Builder body(DescribeCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCollectionResponse build() {
            return new DescribeCollectionResponse(this);
        } 

    } 

}
