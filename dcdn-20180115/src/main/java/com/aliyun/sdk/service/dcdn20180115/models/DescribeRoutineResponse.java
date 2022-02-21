// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineResponse} extends {@link TeaModel}
 *
 * <p>DescribeRoutineResponse</p>
 */
public class DescribeRoutineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRoutineResponseBody body;

    private DescribeRoutineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRoutineResponse create() {
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
    public DescribeRoutineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRoutineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRoutineResponseBody body);

        @Override
        DescribeRoutineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRoutineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRoutineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRoutineResponse response) {
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
        public Builder body(DescribeRoutineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRoutineResponse build() {
            return new DescribeRoutineResponse(this);
        } 

    } 

}
