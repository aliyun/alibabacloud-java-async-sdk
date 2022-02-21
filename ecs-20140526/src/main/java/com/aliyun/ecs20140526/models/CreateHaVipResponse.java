// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHaVipResponse} extends {@link TeaModel}
 *
 * <p>CreateHaVipResponse</p>
 */
public class CreateHaVipResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHaVipResponseBody body;

    private CreateHaVipResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHaVipResponse create() {
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
    public CreateHaVipResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHaVipResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHaVipResponseBody body);

        @Override
        CreateHaVipResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHaVipResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHaVipResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHaVipResponse response) {
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
        public Builder body(CreateHaVipResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHaVipResponse build() {
            return new CreateHaVipResponse(this);
        } 

    } 

}
