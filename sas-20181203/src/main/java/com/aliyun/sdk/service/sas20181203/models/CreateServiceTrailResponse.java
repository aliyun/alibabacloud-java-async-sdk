// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceTrailResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceTrailResponse</p>
 */
public class CreateServiceTrailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceTrailResponseBody body;

    private CreateServiceTrailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceTrailResponse create() {
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
    public CreateServiceTrailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceTrailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceTrailResponseBody body);

        @Override
        CreateServiceTrailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceTrailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceTrailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceTrailResponse response) {
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
        public Builder body(CreateServiceTrailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceTrailResponse build() {
            return new CreateServiceTrailResponse(this);
        } 

    } 

}
