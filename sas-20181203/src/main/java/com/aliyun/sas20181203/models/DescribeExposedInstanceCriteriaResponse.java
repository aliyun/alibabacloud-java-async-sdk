// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedInstanceCriteriaResponse} extends {@link TeaModel}
 *
 * <p>DescribeExposedInstanceCriteriaResponse</p>
 */
public class DescribeExposedInstanceCriteriaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeExposedInstanceCriteriaResponseBody body;

    private DescribeExposedInstanceCriteriaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeExposedInstanceCriteriaResponse create() {
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
    public DescribeExposedInstanceCriteriaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeExposedInstanceCriteriaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeExposedInstanceCriteriaResponseBody body);

        @Override
        DescribeExposedInstanceCriteriaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeExposedInstanceCriteriaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeExposedInstanceCriteriaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeExposedInstanceCriteriaResponse response) {
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
        public Builder body(DescribeExposedInstanceCriteriaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeExposedInstanceCriteriaResponse build() {
            return new DescribeExposedInstanceCriteriaResponse(this);
        } 

    } 

}
