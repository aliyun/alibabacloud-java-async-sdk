// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstallCodesResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstallCodesResponse</p>
 */
public class DescribeInstallCodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstallCodesResponseBody body;

    private DescribeInstallCodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstallCodesResponse create() {
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
    public DescribeInstallCodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstallCodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstallCodesResponseBody body);

        @Override
        DescribeInstallCodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstallCodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstallCodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstallCodesResponse response) {
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
        public Builder body(DescribeInstallCodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstallCodesResponse build() {
            return new DescribeInstallCodesResponse(this);
        } 

    } 

}
