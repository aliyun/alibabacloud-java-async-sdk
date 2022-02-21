// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpgradeVersionResponse} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeVersionResponse</p>
 */
public class DescribeUpgradeVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUpgradeVersionResponseBody body;

    private DescribeUpgradeVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUpgradeVersionResponse create() {
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
    public DescribeUpgradeVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUpgradeVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUpgradeVersionResponseBody body);

        @Override
        DescribeUpgradeVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUpgradeVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUpgradeVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUpgradeVersionResponse response) {
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
        public Builder body(DescribeUpgradeVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUpgradeVersionResponse build() {
            return new DescribeUpgradeVersionResponse(this);
        } 

    } 

}
