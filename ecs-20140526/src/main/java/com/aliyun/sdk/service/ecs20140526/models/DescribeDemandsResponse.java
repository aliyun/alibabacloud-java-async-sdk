// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDemandsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDemandsResponse</p>
 */
public class DescribeDemandsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDemandsResponseBody body;

    private DescribeDemandsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDemandsResponse create() {
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
    public DescribeDemandsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDemandsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDemandsResponseBody body);

        @Override
        DescribeDemandsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDemandsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDemandsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDemandsResponse response) {
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
        public Builder body(DescribeDemandsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDemandsResponse build() {
            return new DescribeDemandsResponse(this);
        } 

    } 

}
