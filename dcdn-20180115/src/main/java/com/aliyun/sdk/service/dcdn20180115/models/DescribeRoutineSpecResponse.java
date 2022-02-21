// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineSpecResponse} extends {@link TeaModel}
 *
 * <p>DescribeRoutineSpecResponse</p>
 */
public class DescribeRoutineSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRoutineSpecResponseBody body;

    private DescribeRoutineSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRoutineSpecResponse create() {
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
    public DescribeRoutineSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRoutineSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRoutineSpecResponseBody body);

        @Override
        DescribeRoutineSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRoutineSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRoutineSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRoutineSpecResponse response) {
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
        public Builder body(DescribeRoutineSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRoutineSpecResponse build() {
            return new DescribeRoutineSpecResponse(this);
        } 

    } 

}
