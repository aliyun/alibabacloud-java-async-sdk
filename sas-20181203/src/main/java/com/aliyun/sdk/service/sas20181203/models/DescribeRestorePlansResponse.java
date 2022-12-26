// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestorePlansResponse} extends {@link TeaModel}
 *
 * <p>DescribeRestorePlansResponse</p>
 */
public class DescribeRestorePlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRestorePlansResponseBody body;

    private DescribeRestorePlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRestorePlansResponse create() {
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
    public DescribeRestorePlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRestorePlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRestorePlansResponseBody body);

        @Override
        DescribeRestorePlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRestorePlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRestorePlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRestorePlansResponse response) {
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
        public Builder body(DescribeRestorePlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRestorePlansResponse build() {
            return new DescribeRestorePlansResponse(this);
        } 

    } 

}
