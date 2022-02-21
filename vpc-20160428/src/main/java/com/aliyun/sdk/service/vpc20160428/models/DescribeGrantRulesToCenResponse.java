// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGrantRulesToCenResponse} extends {@link TeaModel}
 *
 * <p>DescribeGrantRulesToCenResponse</p>
 */
public class DescribeGrantRulesToCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGrantRulesToCenResponseBody body;

    private DescribeGrantRulesToCenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGrantRulesToCenResponse create() {
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
    public DescribeGrantRulesToCenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGrantRulesToCenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGrantRulesToCenResponseBody body);

        @Override
        DescribeGrantRulesToCenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGrantRulesToCenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGrantRulesToCenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGrantRulesToCenResponse response) {
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
        public Builder body(DescribeGrantRulesToCenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGrantRulesToCenResponse build() {
            return new DescribeGrantRulesToCenResponse(this);
        } 

    } 

}
