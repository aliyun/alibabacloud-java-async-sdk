// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>GetSubscriptionResponse</p>
 */
public class GetSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSubscriptionResponseBody body;

    private GetSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSubscriptionResponse create() {
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
    public GetSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSubscriptionResponseBody body);

        @Override
        GetSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSubscriptionResponse response) {
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
        public Builder body(GetSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSubscriptionResponse build() {
            return new GetSubscriptionResponse(this);
        } 

    } 

}
