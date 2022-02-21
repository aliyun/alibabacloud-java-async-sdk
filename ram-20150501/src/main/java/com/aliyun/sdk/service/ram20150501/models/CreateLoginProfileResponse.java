// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoginProfileResponse} extends {@link TeaModel}
 *
 * <p>CreateLoginProfileResponse</p>
 */
public class CreateLoginProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLoginProfileResponseBody body;

    private CreateLoginProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLoginProfileResponse create() {
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
    public CreateLoginProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLoginProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLoginProfileResponseBody body);

        @Override
        CreateLoginProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLoginProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLoginProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLoginProfileResponse response) {
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
        public Builder body(CreateLoginProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLoginProfileResponse build() {
            return new CreateLoginProfileResponse(this);
        } 

    } 

}
