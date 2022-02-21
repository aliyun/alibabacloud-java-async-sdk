// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionDetailResponse} extends {@link TeaModel}
 *
 * <p>GetSubscriptionDetailResponse</p>
 */
public class GetSubscriptionDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSubscriptionDetailResponseBody body;

    private GetSubscriptionDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSubscriptionDetailResponse create() {
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
    public GetSubscriptionDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSubscriptionDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSubscriptionDetailResponseBody body);

        @Override
        GetSubscriptionDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSubscriptionDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSubscriptionDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSubscriptionDetailResponse response) {
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
        public Builder body(GetSubscriptionDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSubscriptionDetailResponse build() {
            return new GetSubscriptionDetailResponse(this);
        } 

    } 

}
