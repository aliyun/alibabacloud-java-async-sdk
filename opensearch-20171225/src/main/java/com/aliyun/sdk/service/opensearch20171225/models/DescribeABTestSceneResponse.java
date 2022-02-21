// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeABTestSceneResponse} extends {@link TeaModel}
 *
 * <p>DescribeABTestSceneResponse</p>
 */
public class DescribeABTestSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeABTestSceneResponseBody body;

    private DescribeABTestSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeABTestSceneResponse create() {
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
    public DescribeABTestSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeABTestSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeABTestSceneResponseBody body);

        @Override
        DescribeABTestSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeABTestSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeABTestSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeABTestSceneResponse response) {
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
        public Builder body(DescribeABTestSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeABTestSceneResponse build() {
            return new DescribeABTestSceneResponse(this);
        } 

    } 

}
