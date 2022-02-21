// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnycastPopLocationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAnycastPopLocationsResponse</p>
 */
public class DescribeAnycastPopLocationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAnycastPopLocationsResponseBody body;

    private DescribeAnycastPopLocationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAnycastPopLocationsResponse create() {
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
    public DescribeAnycastPopLocationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAnycastPopLocationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAnycastPopLocationsResponseBody body);

        @Override
        DescribeAnycastPopLocationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAnycastPopLocationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAnycastPopLocationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAnycastPopLocationsResponse response) {
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
        public Builder body(DescribeAnycastPopLocationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAnycastPopLocationsResponse build() {
            return new DescribeAnycastPopLocationsResponse(this);
        } 

    } 

}
