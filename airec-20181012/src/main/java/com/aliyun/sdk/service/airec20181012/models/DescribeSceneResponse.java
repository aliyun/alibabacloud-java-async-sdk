// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneResponse} extends {@link TeaModel}
 *
 * <p>DescribeSceneResponse</p>
 */
public class DescribeSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSceneResponseBody body;

    private DescribeSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSceneResponse create() {
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
    public DescribeSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSceneResponseBody body);

        @Override
        DescribeSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSceneResponse response) {
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
        public Builder body(DescribeSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSceneResponse build() {
            return new DescribeSceneResponse(this);
        } 

    } 

}
