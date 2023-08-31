// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppliedAdvicesResponse} extends {@link TeaModel}
 *
 * <p>DescribeAppliedAdvicesResponse</p>
 */
public class DescribeAppliedAdvicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAppliedAdvicesResponseBody body;

    private DescribeAppliedAdvicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAppliedAdvicesResponse create() {
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
    public DescribeAppliedAdvicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAppliedAdvicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAppliedAdvicesResponseBody body);

        @Override
        DescribeAppliedAdvicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAppliedAdvicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAppliedAdvicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAppliedAdvicesResponse response) {
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
        public Builder body(DescribeAppliedAdvicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAppliedAdvicesResponse build() {
            return new DescribeAppliedAdvicesResponse(this);
        } 

    } 

}
