// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAffectedAssetsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAffectedAssetsResponse</p>
 */
public class DescribeAffectedAssetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAffectedAssetsResponseBody body;

    private DescribeAffectedAssetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAffectedAssetsResponse create() {
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
    public DescribeAffectedAssetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAffectedAssetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAffectedAssetsResponseBody body);

        @Override
        DescribeAffectedAssetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAffectedAssetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAffectedAssetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAffectedAssetsResponse response) {
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
        public Builder body(DescribeAffectedAssetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAffectedAssetsResponse build() {
            return new DescribeAffectedAssetsResponse(this);
        } 

    } 

}
