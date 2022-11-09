// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIntranetAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeIntranetAttributeResponse</p>
 */
public class DescribeIntranetAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIntranetAttributeResponseBody body;

    private DescribeIntranetAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIntranetAttributeResponse create() {
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
    public DescribeIntranetAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIntranetAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIntranetAttributeResponseBody body);

        @Override
        DescribeIntranetAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIntranetAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIntranetAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIntranetAttributeResponse response) {
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
        public Builder body(DescribeIntranetAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIntranetAttributeResponse build() {
            return new DescribeIntranetAttributeResponse(this);
        } 

    } 

}
