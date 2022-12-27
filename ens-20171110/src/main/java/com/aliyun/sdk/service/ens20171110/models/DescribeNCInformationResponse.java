// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNCInformationResponse} extends {@link TeaModel}
 *
 * <p>DescribeNCInformationResponse</p>
 */
public class DescribeNCInformationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNCInformationResponseBody body;

    private DescribeNCInformationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNCInformationResponse create() {
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
    public DescribeNCInformationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNCInformationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNCInformationResponseBody body);

        @Override
        DescribeNCInformationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNCInformationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNCInformationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNCInformationResponse response) {
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
        public Builder body(DescribeNCInformationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNCInformationResponse build() {
            return new DescribeNCInformationResponse(this);
        } 

    } 

}
