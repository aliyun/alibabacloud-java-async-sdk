// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradePostPayOrderResponse} extends {@link TeaModel}
 *
 * <p>UpgradePostPayOrderResponse</p>
 */
public class UpgradePostPayOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradePostPayOrderResponseBody body;

    private UpgradePostPayOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradePostPayOrderResponse create() {
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
    public UpgradePostPayOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradePostPayOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradePostPayOrderResponseBody body);

        @Override
        UpgradePostPayOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradePostPayOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradePostPayOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradePostPayOrderResponse response) {
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
        public Builder body(UpgradePostPayOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradePostPayOrderResponse build() {
            return new UpgradePostPayOrderResponse(this);
        } 

    } 

}
