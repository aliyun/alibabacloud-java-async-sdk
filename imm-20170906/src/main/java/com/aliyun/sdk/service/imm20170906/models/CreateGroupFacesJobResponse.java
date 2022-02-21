// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupFacesJobResponse} extends {@link TeaModel}
 *
 * <p>CreateGroupFacesJobResponse</p>
 */
public class CreateGroupFacesJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGroupFacesJobResponseBody body;

    private CreateGroupFacesJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGroupFacesJobResponse create() {
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
    public CreateGroupFacesJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGroupFacesJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGroupFacesJobResponseBody body);

        @Override
        CreateGroupFacesJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGroupFacesJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGroupFacesJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGroupFacesJobResponse response) {
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
        public Builder body(CreateGroupFacesJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGroupFacesJobResponse build() {
            return new CreateGroupFacesJobResponse(this);
        } 

    } 

}
