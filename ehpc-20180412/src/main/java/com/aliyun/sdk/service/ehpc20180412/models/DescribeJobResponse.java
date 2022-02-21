// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobResponse</p>
 */
public class DescribeJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobResponseBody body;

    private DescribeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobResponse create() {
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
    public DescribeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobResponseBody body);

        @Override
        DescribeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobResponse response) {
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
        public Builder body(DescribeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobResponse build() {
            return new DescribeJobResponse(this);
        } 

    } 

}
