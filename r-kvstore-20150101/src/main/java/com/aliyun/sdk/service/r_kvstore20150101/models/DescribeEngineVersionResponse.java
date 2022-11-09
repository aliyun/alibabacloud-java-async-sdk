// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEngineVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeEngineVersionResponse</p>
 */
public class DescribeEngineVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEngineVersionResponseBody body;

    private DescribeEngineVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEngineVersionResponse create() {
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
    public DescribeEngineVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEngineVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEngineVersionResponseBody body);

        @Override
        DescribeEngineVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEngineVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEngineVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEngineVersionResponse response) {
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
        public Builder body(DescribeEngineVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEngineVersionResponse build() {
            return new DescribeEngineVersionResponse(this);
        } 

    } 

}
