// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstDbSlsInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstDbSlsInfoResponse</p>
 */
public class DescribeInstDbSlsInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstDbSlsInfoResponseBody body;

    private DescribeInstDbSlsInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstDbSlsInfoResponse create() {
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
    public DescribeInstDbSlsInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstDbSlsInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstDbSlsInfoResponseBody body);

        @Override
        DescribeInstDbSlsInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstDbSlsInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstDbSlsInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstDbSlsInfoResponse response) {
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
        public Builder body(DescribeInstDbSlsInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstDbSlsInfoResponse build() {
            return new DescribeInstDbSlsInfoResponse(this);
        } 

    } 

}
