// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVbrHaResponse} extends {@link TeaModel}
 *
 * <p>DescribeVbrHaResponse</p>
 */
public class DescribeVbrHaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVbrHaResponseBody body;

    private DescribeVbrHaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVbrHaResponse create() {
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
    public DescribeVbrHaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVbrHaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVbrHaResponseBody body);

        @Override
        DescribeVbrHaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVbrHaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVbrHaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVbrHaResponse response) {
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
        public Builder body(DescribeVbrHaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVbrHaResponse build() {
            return new DescribeVbrHaResponse(this);
        } 

    } 

}
