// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCcProtectSwitchResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebCcProtectSwitchResponse</p>
 */
public class DescribeWebCcProtectSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebCcProtectSwitchResponseBody body;

    private DescribeWebCcProtectSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebCcProtectSwitchResponse create() {
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
    public DescribeWebCcProtectSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebCcProtectSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebCcProtectSwitchResponseBody body);

        @Override
        DescribeWebCcProtectSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebCcProtectSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebCcProtectSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebCcProtectSwitchResponse response) {
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
        public Builder body(DescribeWebCcProtectSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebCcProtectSwitchResponse build() {
            return new DescribeWebCcProtectSwitchResponse(this);
        } 

    } 

}
