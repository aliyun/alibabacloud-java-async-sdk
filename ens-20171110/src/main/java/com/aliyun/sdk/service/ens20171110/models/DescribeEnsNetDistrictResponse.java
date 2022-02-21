// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsNetDistrictResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsNetDistrictResponse</p>
 */
public class DescribeEnsNetDistrictResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsNetDistrictResponseBody body;

    private DescribeEnsNetDistrictResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsNetDistrictResponse create() {
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
    public DescribeEnsNetDistrictResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsNetDistrictResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsNetDistrictResponseBody body);

        @Override
        DescribeEnsNetDistrictResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsNetDistrictResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsNetDistrictResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsNetDistrictResponse response) {
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
        public Builder body(DescribeEnsNetDistrictResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsNetDistrictResponse build() {
            return new DescribeEnsNetDistrictResponse(this);
        } 

    } 

}
