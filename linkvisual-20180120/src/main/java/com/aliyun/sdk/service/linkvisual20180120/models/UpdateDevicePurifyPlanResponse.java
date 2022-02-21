// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevicePurifyPlanResponse} extends {@link TeaModel}
 *
 * <p>UpdateDevicePurifyPlanResponse</p>
 */
public class UpdateDevicePurifyPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDevicePurifyPlanResponseBody body;

    private UpdateDevicePurifyPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDevicePurifyPlanResponse create() {
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
    public UpdateDevicePurifyPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDevicePurifyPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDevicePurifyPlanResponseBody body);

        @Override
        UpdateDevicePurifyPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDevicePurifyPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDevicePurifyPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDevicePurifyPlanResponse response) {
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
        public Builder body(UpdateDevicePurifyPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDevicePurifyPlanResponse build() {
            return new UpdateDevicePurifyPlanResponse(this);
        } 

    } 

}
