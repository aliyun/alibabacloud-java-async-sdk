// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFCTriggerResponse} extends {@link TeaModel}
 *
 * <p>AddFCTriggerResponse</p>
 */
public class AddFCTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFCTriggerResponseBody body;

    private AddFCTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFCTriggerResponse create() {
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
    public AddFCTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFCTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFCTriggerResponseBody body);

        @Override
        AddFCTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFCTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFCTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFCTriggerResponse response) {
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
        public Builder body(AddFCTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFCTriggerResponse build() {
            return new AddFCTriggerResponse(this);
        } 

    } 

}
