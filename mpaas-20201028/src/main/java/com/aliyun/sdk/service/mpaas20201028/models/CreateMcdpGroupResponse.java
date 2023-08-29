// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMcdpGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateMcdpGroupResponse</p>
 */
public class CreateMcdpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMcdpGroupResponseBody body;

    private CreateMcdpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMcdpGroupResponse create() {
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
    public CreateMcdpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMcdpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMcdpGroupResponseBody body);

        @Override
        CreateMcdpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMcdpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMcdpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMcdpGroupResponse response) {
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
        public Builder body(CreateMcdpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMcdpGroupResponse build() {
            return new CreateMcdpGroupResponse(this);
        } 

    } 

}
