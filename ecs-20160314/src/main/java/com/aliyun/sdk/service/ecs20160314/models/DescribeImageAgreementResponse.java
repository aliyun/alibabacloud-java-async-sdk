// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageAgreementResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageAgreementResponse</p>
 */
public class DescribeImageAgreementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageAgreementResponseBody body;

    private DescribeImageAgreementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageAgreementResponse create() {
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
    public DescribeImageAgreementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageAgreementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageAgreementResponseBody body);

        @Override
        DescribeImageAgreementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageAgreementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageAgreementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageAgreementResponse response) {
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
        public Builder body(DescribeImageAgreementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageAgreementResponse build() {
            return new DescribeImageAgreementResponse(this);
        } 

    } 

}
