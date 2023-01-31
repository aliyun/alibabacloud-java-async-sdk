// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEcGrantRelationResponse} extends {@link TeaModel}
 *
 * <p>DescribeEcGrantRelationResponse</p>
 */
public class DescribeEcGrantRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEcGrantRelationResponseBody body;

    private DescribeEcGrantRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEcGrantRelationResponse create() {
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
    public DescribeEcGrantRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEcGrantRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEcGrantRelationResponseBody body);

        @Override
        DescribeEcGrantRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEcGrantRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEcGrantRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEcGrantRelationResponse response) {
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
        public Builder body(DescribeEcGrantRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEcGrantRelationResponse build() {
            return new DescribeEcGrantRelationResponse(this);
        } 

    } 

}
