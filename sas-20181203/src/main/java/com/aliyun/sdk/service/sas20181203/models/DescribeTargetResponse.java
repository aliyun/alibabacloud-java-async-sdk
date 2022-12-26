// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTargetResponse} extends {@link TeaModel}
 *
 * <p>DescribeTargetResponse</p>
 */
public class DescribeTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTargetResponseBody body;

    private DescribeTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTargetResponse create() {
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
    public DescribeTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTargetResponseBody body);

        @Override
        DescribeTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTargetResponse response) {
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
        public Builder body(DescribeTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTargetResponse build() {
            return new DescribeTargetResponse(this);
        } 

    } 

}
