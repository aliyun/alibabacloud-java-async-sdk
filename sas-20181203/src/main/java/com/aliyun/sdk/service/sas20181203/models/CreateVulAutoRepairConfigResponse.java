// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVulAutoRepairConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateVulAutoRepairConfigResponse</p>
 */
public class CreateVulAutoRepairConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVulAutoRepairConfigResponseBody body;

    private CreateVulAutoRepairConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVulAutoRepairConfigResponse create() {
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
    public CreateVulAutoRepairConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVulAutoRepairConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVulAutoRepairConfigResponseBody body);

        @Override
        CreateVulAutoRepairConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVulAutoRepairConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVulAutoRepairConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVulAutoRepairConfigResponse response) {
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
        public Builder body(CreateVulAutoRepairConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVulAutoRepairConfigResponse build() {
            return new CreateVulAutoRepairConfigResponse(this);
        } 

    } 

}
