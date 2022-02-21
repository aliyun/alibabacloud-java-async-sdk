// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>UpdateSubscriptionResponse</p>
 */
public class UpdateSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSubscriptionResponseBody body;

    private UpdateSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSubscriptionResponse create() {
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
    public UpdateSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSubscriptionResponseBody body);

        @Override
        UpdateSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSubscriptionResponse response) {
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
        public Builder body(UpdateSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSubscriptionResponse build() {
            return new UpdateSubscriptionResponse(this);
        } 

    } 

}
