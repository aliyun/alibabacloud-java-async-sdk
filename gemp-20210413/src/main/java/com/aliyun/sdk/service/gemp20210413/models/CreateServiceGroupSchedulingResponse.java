// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceGroupSchedulingResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceGroupSchedulingResponse</p>
 */
public class CreateServiceGroupSchedulingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceGroupSchedulingResponseBody body;

    private CreateServiceGroupSchedulingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceGroupSchedulingResponse create() {
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
    public CreateServiceGroupSchedulingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceGroupSchedulingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceGroupSchedulingResponseBody body);

        @Override
        CreateServiceGroupSchedulingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceGroupSchedulingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceGroupSchedulingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceGroupSchedulingResponse response) {
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
        public Builder body(CreateServiceGroupSchedulingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceGroupSchedulingResponse build() {
            return new CreateServiceGroupSchedulingResponse(this);
        } 

    } 

}
