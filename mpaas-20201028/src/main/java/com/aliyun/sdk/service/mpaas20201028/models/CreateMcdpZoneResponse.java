// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcdpZoneResponse} extends {@link TeaModel}
 *
 * <p>CreateMcdpZoneResponse</p>
 */
public class CreateMcdpZoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcdpZoneResponseBody body;

    private CreateMcdpZoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcdpZoneResponse create() {
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
    public CreateMcdpZoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcdpZoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcdpZoneResponseBody body);

        @Override
        CreateMcdpZoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcdpZoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcdpZoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcdpZoneResponse response) {
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
        public Builder body(CreateMcdpZoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcdpZoneResponse build() {
            return new CreateMcdpZoneResponse(this);
        } 

    } 

}
