// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineCanaryEnvsResponse} extends {@link TeaModel}
 *
 * <p>DescribeRoutineCanaryEnvsResponse</p>
 */
public class DescribeRoutineCanaryEnvsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRoutineCanaryEnvsResponseBody body;

    private DescribeRoutineCanaryEnvsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRoutineCanaryEnvsResponse create() {
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
    public DescribeRoutineCanaryEnvsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRoutineCanaryEnvsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRoutineCanaryEnvsResponseBody body);

        @Override
        DescribeRoutineCanaryEnvsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRoutineCanaryEnvsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRoutineCanaryEnvsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRoutineCanaryEnvsResponse response) {
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
        public Builder body(DescribeRoutineCanaryEnvsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRoutineCanaryEnvsResponse build() {
            return new DescribeRoutineCanaryEnvsResponse(this);
        } 

    } 

}
