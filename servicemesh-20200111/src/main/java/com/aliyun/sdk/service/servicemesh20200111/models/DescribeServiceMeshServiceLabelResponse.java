// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshServiceLabelResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshServiceLabelResponse</p>
 */
public class DescribeServiceMeshServiceLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceMeshServiceLabelResponseBody body;

    private DescribeServiceMeshServiceLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceMeshServiceLabelResponse create() {
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
    public DescribeServiceMeshServiceLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceMeshServiceLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceMeshServiceLabelResponseBody body);

        @Override
        DescribeServiceMeshServiceLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceMeshServiceLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceMeshServiceLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceMeshServiceLabelResponse response) {
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
        public Builder body(DescribeServiceMeshServiceLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceMeshServiceLabelResponse build() {
            return new DescribeServiceMeshServiceLabelResponse(this);
        } 

    } 

}
