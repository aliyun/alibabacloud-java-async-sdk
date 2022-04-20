// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReusableSlbResponse} extends {@link TeaModel}
 *
 * <p>DescribeReusableSlbResponse</p>
 */
public class DescribeReusableSlbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReusableSlbResponseBody body;

    private DescribeReusableSlbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReusableSlbResponse create() {
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
    public DescribeReusableSlbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReusableSlbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReusableSlbResponseBody body);

        @Override
        DescribeReusableSlbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReusableSlbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReusableSlbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReusableSlbResponse response) {
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
        public Builder body(DescribeReusableSlbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReusableSlbResponse build() {
            return new DescribeReusableSlbResponse(this);
        } 

    } 

}
