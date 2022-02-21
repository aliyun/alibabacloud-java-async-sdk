// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAsrVadConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeAsrVadConfigResponse</p>
 */
public class DescribeAsrVadConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAsrVadConfigResponseBody body;

    private DescribeAsrVadConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAsrVadConfigResponse create() {
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
    public DescribeAsrVadConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAsrVadConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAsrVadConfigResponseBody body);

        @Override
        DescribeAsrVadConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAsrVadConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAsrVadConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAsrVadConfigResponse response) {
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
        public Builder body(DescribeAsrVadConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAsrVadConfigResponse build() {
            return new DescribeAsrVadConfigResponse(this);
        } 

    } 

}
