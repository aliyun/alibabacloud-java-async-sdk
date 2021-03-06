// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTriggerResponse} extends {@link TeaModel}
 *
 * <p>GetTriggerResponse</p>
 */
public class GetTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTriggerResponseBody body;

    private GetTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTriggerResponse create() {
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
    public GetTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTriggerResponseBody body);

        @Override
        GetTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTriggerResponse response) {
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
        public Builder body(GetTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTriggerResponse build() {
            return new GetTriggerResponse(this);
        } 

    } 

}
