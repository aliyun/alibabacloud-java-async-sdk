// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommandInvocationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCommandInvocationsResponse</p>
 */
public class DescribeCommandInvocationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCommandInvocationsResponseBody body;

    private DescribeCommandInvocationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCommandInvocationsResponse create() {
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
    public DescribeCommandInvocationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCommandInvocationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCommandInvocationsResponseBody body);

        @Override
        DescribeCommandInvocationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCommandInvocationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCommandInvocationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCommandInvocationsResponse response) {
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
        public Builder body(DescribeCommandInvocationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCommandInvocationsResponse build() {
            return new DescribeCommandInvocationsResponse(this);
        } 

    } 

}
