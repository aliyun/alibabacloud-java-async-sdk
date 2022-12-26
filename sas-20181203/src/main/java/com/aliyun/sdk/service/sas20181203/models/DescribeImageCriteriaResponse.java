// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCriteriaResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageCriteriaResponse</p>
 */
public class DescribeImageCriteriaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageCriteriaResponseBody body;

    private DescribeImageCriteriaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageCriteriaResponse create() {
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
    public DescribeImageCriteriaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageCriteriaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageCriteriaResponseBody body);

        @Override
        DescribeImageCriteriaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageCriteriaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageCriteriaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageCriteriaResponse response) {
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
        public Builder body(DescribeImageCriteriaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageCriteriaResponse build() {
            return new DescribeImageCriteriaResponse(this);
        } 

    } 

}
