// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceEventResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceEventResponse</p>
 */
public class DescribeServiceEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceEventResponseBody body;

    private DescribeServiceEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceEventResponse create() {
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
    public DescribeServiceEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceEventResponseBody body);

        @Override
        DescribeServiceEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceEventResponse response) {
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
        public Builder body(DescribeServiceEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceEventResponse build() {
            return new DescribeServiceEventResponse(this);
        } 

    } 

}
