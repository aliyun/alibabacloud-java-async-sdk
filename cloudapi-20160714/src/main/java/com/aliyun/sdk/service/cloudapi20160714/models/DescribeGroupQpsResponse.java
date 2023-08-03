// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupQpsResponse} extends {@link TeaModel}
 *
 * <p>DescribeGroupQpsResponse</p>
 */
public class DescribeGroupQpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGroupQpsResponseBody body;

    private DescribeGroupQpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGroupQpsResponse create() {
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
    public DescribeGroupQpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGroupQpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGroupQpsResponseBody body);

        @Override
        DescribeGroupQpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGroupQpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGroupQpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGroupQpsResponse response) {
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
        public Builder body(DescribeGroupQpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGroupQpsResponse build() {
            return new DescribeGroupQpsResponse(this);
        } 

    } 

}
