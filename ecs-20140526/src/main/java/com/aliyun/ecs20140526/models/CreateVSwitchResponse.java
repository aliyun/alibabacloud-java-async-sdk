// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVSwitchResponse} extends {@link TeaModel}
 *
 * <p>CreateVSwitchResponse</p>
 */
public class CreateVSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVSwitchResponseBody body;

    private CreateVSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVSwitchResponse create() {
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
    public CreateVSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVSwitchResponseBody body);

        @Override
        CreateVSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVSwitchResponse response) {
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
        public Builder body(CreateVSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVSwitchResponse build() {
            return new CreateVSwitchResponse(this);
        } 

    } 

}
