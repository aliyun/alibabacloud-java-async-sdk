// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRoutineCodeRevisionResponse} extends {@link TeaModel}
 *
 * <p>DescribeRoutineCodeRevisionResponse</p>
 */
public class DescribeRoutineCodeRevisionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRoutineCodeRevisionResponseBody body;

    private DescribeRoutineCodeRevisionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRoutineCodeRevisionResponse create() {
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
    public DescribeRoutineCodeRevisionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRoutineCodeRevisionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRoutineCodeRevisionResponseBody body);

        @Override
        DescribeRoutineCodeRevisionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRoutineCodeRevisionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRoutineCodeRevisionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRoutineCodeRevisionResponse response) {
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
        public Builder body(DescribeRoutineCodeRevisionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRoutineCodeRevisionResponse build() {
            return new DescribeRoutineCodeRevisionResponse(this);
        } 

    } 

}
