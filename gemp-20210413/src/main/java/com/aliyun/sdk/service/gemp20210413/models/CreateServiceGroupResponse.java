// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceGroupResponse</p>
 */
public class CreateServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceGroupResponseBody body;

    private CreateServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceGroupResponse create() {
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
    public CreateServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceGroupResponseBody body);

        @Override
        CreateServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceGroupResponse response) {
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
        public Builder body(CreateServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceGroupResponse build() {
            return new CreateServiceGroupResponse(this);
        } 

    } 

}
