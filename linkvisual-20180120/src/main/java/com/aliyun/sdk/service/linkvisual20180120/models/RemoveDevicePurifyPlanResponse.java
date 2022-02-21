// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveDevicePurifyPlanResponse} extends {@link TeaModel}
 *
 * <p>RemoveDevicePurifyPlanResponse</p>
 */
public class RemoveDevicePurifyPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveDevicePurifyPlanResponseBody body;

    private RemoveDevicePurifyPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveDevicePurifyPlanResponse create() {
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
    public RemoveDevicePurifyPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveDevicePurifyPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveDevicePurifyPlanResponseBody body);

        @Override
        RemoveDevicePurifyPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveDevicePurifyPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveDevicePurifyPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveDevicePurifyPlanResponse response) {
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
        public Builder body(RemoveDevicePurifyPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveDevicePurifyPlanResponse build() {
            return new RemoveDevicePurifyPlanResponse(this);
        } 

    } 

}
