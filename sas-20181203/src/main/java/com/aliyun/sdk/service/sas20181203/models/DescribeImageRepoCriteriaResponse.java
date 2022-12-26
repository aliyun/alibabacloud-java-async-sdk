// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageRepoCriteriaResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageRepoCriteriaResponse</p>
 */
public class DescribeImageRepoCriteriaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageRepoCriteriaResponseBody body;

    private DescribeImageRepoCriteriaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageRepoCriteriaResponse create() {
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
    public DescribeImageRepoCriteriaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageRepoCriteriaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageRepoCriteriaResponseBody body);

        @Override
        DescribeImageRepoCriteriaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageRepoCriteriaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageRepoCriteriaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageRepoCriteriaResponse response) {
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
        public Builder body(DescribeImageRepoCriteriaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageRepoCriteriaResponse build() {
            return new DescribeImageRepoCriteriaResponse(this);
        } 

    } 

}
