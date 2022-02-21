// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceDistributeJobResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceDistributeJobResponse</p>
 */
public class CreateDeviceDistributeJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceDistributeJobResponseBody body;

    private CreateDeviceDistributeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceDistributeJobResponse create() {
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
    public CreateDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceDistributeJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceDistributeJobResponseBody body);

        @Override
        CreateDeviceDistributeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceDistributeJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceDistributeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceDistributeJobResponse response) {
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
        public Builder body(CreateDeviceDistributeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceDistributeJobResponse build() {
            return new CreateDeviceDistributeJobResponse(this);
        } 

    } 

}
