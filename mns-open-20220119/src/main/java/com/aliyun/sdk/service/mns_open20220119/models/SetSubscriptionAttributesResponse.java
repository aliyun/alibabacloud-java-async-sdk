// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSubscriptionAttributesResponse} extends {@link TeaModel}
 *
 * <p>SetSubscriptionAttributesResponse</p>
 */
public class SetSubscriptionAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSubscriptionAttributesResponseBody body;

    private SetSubscriptionAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSubscriptionAttributesResponse create() {
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
    public SetSubscriptionAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSubscriptionAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSubscriptionAttributesResponseBody body);

        @Override
        SetSubscriptionAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSubscriptionAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSubscriptionAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSubscriptionAttributesResponse response) {
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
        public Builder body(SetSubscriptionAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSubscriptionAttributesResponse build() {
            return new SetSubscriptionAttributesResponse(this);
        } 

    } 

}
