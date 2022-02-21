// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangesResponse} extends {@link TeaModel}
 *
 * <p>DescribeChangesResponse</p>
 */
public class DescribeChangesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeChangesResponseBody body;

    private DescribeChangesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeChangesResponse create() {
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
    public DescribeChangesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeChangesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeChangesResponseBody body);

        @Override
        DescribeChangesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeChangesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeChangesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeChangesResponse response) {
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
        public Builder body(DescribeChangesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeChangesResponse build() {
            return new DescribeChangesResponse(this);
        } 

    } 

}
