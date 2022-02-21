// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbscInstanceResponse} extends {@link TeaModel}
 *
 * <p>DescribeDbscInstanceResponse</p>
 */
public class DescribeDbscInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDbscInstanceResponseBody body;

    private DescribeDbscInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDbscInstanceResponse create() {
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
    public DescribeDbscInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDbscInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDbscInstanceResponseBody body);

        @Override
        DescribeDbscInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDbscInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDbscInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDbscInstanceResponse response) {
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
        public Builder body(DescribeDbscInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDbscInstanceResponse build() {
            return new DescribeDbscInstanceResponse(this);
        } 

    } 

}
