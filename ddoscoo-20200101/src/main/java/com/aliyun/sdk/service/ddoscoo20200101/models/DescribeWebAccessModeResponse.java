// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessModeResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessModeResponse</p>
 */
public class DescribeWebAccessModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebAccessModeResponseBody body;

    private DescribeWebAccessModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebAccessModeResponse create() {
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
    public DescribeWebAccessModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebAccessModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebAccessModeResponseBody body);

        @Override
        DescribeWebAccessModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebAccessModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebAccessModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebAccessModeResponse response) {
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
        public Builder body(DescribeWebAccessModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebAccessModeResponse build() {
            return new DescribeWebAccessModeResponse(this);
        } 

    } 

}
