// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVolumesResponse} extends {@link TeaModel}
 *
 * <p>CreateVolumesResponse</p>
 */
public class CreateVolumesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVolumesResponseBody body;

    private CreateVolumesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVolumesResponse create() {
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
    public CreateVolumesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVolumesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVolumesResponseBody body);

        @Override
        CreateVolumesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVolumesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVolumesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVolumesResponse response) {
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
        public Builder body(CreateVolumesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVolumesResponse build() {
            return new CreateVolumesResponse(this);
        } 

    } 

}
