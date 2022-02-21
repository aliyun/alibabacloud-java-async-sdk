// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangeLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeChangeLogsResponse</p>
 */
public class DescribeChangeLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeChangeLogsResponseBody body;

    private DescribeChangeLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeChangeLogsResponse create() {
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
    public DescribeChangeLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeChangeLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeChangeLogsResponseBody body);

        @Override
        DescribeChangeLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeChangeLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeChangeLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeChangeLogsResponse response) {
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
        public Builder body(DescribeChangeLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeChangeLogsResponse build() {
            return new DescribeChangeLogsResponse(this);
        } 

    } 

}
