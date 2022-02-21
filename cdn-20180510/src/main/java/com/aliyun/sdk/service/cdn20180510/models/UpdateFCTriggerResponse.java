// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFCTriggerResponse} extends {@link TeaModel}
 *
 * <p>UpdateFCTriggerResponse</p>
 */
public class UpdateFCTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFCTriggerResponseBody body;

    private UpdateFCTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFCTriggerResponse create() {
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
    public UpdateFCTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFCTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFCTriggerResponseBody body);

        @Override
        UpdateFCTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFCTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFCTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFCTriggerResponse response) {
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
        public Builder body(UpdateFCTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFCTriggerResponse build() {
            return new UpdateFCTriggerResponse(this);
        } 

    } 

}
