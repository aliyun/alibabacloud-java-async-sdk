// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityStatInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeSecurityStatInfoResponse</p>
 */
public class DescribeSecurityStatInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSecurityStatInfoResponseBody body;

    private DescribeSecurityStatInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSecurityStatInfoResponse create() {
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
    public DescribeSecurityStatInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSecurityStatInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSecurityStatInfoResponseBody body);

        @Override
        DescribeSecurityStatInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSecurityStatInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSecurityStatInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSecurityStatInfoResponse response) {
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
        public Builder body(DescribeSecurityStatInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSecurityStatInfoResponse build() {
            return new DescribeSecurityStatInfoResponse(this);
        } 

    } 

}
