// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHoneyPotAuthResponse} extends {@link TeaModel}
 *
 * <p>DescribeHoneyPotAuthResponse</p>
 */
public class DescribeHoneyPotAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHoneyPotAuthResponseBody body;

    private DescribeHoneyPotAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHoneyPotAuthResponse create() {
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
    public DescribeHoneyPotAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHoneyPotAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHoneyPotAuthResponseBody body);

        @Override
        DescribeHoneyPotAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHoneyPotAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHoneyPotAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHoneyPotAuthResponse response) {
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
        public Builder body(DescribeHoneyPotAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHoneyPotAuthResponse build() {
            return new DescribeHoneyPotAuthResponse(this);
        } 

    } 

}
