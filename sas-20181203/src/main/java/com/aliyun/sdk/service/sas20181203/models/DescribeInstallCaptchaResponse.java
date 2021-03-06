// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstallCaptchaResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstallCaptchaResponse</p>
 */
public class DescribeInstallCaptchaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstallCaptchaResponseBody body;

    private DescribeInstallCaptchaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstallCaptchaResponse create() {
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
    public DescribeInstallCaptchaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstallCaptchaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstallCaptchaResponseBody body);

        @Override
        DescribeInstallCaptchaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstallCaptchaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstallCaptchaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstallCaptchaResponse response) {
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
        public Builder body(DescribeInstallCaptchaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstallCaptchaResponse build() {
            return new DescribeInstallCaptchaResponse(this);
        } 

    } 

}
