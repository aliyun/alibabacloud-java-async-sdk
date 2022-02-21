// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePurchasedApiGroupResponse} extends {@link TeaModel}
 *
 * <p>DescribePurchasedApiGroupResponse</p>
 */
public class DescribePurchasedApiGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePurchasedApiGroupResponseBody body;

    private DescribePurchasedApiGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePurchasedApiGroupResponse create() {
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
    public DescribePurchasedApiGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePurchasedApiGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePurchasedApiGroupResponseBody body);

        @Override
        DescribePurchasedApiGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePurchasedApiGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePurchasedApiGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePurchasedApiGroupResponse response) {
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
        public Builder body(DescribePurchasedApiGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePurchasedApiGroupResponse build() {
            return new DescribePurchasedApiGroupResponse(this);
        } 

    } 

}
