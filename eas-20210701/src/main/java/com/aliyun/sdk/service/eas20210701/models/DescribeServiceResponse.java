// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceResponse</p>
 */
public class DescribeServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Service body;

    private DescribeServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceResponse create() {
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
    public Service getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Service body);

        @Override
        DescribeServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Service body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceResponse response) {
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
        public Builder body(Service body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceResponse build() {
            return new DescribeServiceResponse(this);
        } 

    } 

}
