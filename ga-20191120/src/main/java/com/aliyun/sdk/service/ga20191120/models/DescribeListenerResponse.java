// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeListenerResponse} extends {@link TeaModel}
 *
 * <p>DescribeListenerResponse</p>
 */
public class DescribeListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeListenerResponseBody body;

    private DescribeListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeListenerResponse create() {
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
    public DescribeListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeListenerResponseBody body);

        @Override
        DescribeListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeListenerResponse response) {
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
        public Builder body(DescribeListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeListenerResponse build() {
            return new DescribeListenerResponse(this);
        } 

    } 

}
