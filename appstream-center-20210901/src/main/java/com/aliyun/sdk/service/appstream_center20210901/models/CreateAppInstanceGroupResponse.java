// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppInstanceGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateAppInstanceGroupResponse</p>
 */
public class CreateAppInstanceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAppInstanceGroupResponseBody body;

    private CreateAppInstanceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAppInstanceGroupResponse create() {
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
    public CreateAppInstanceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAppInstanceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAppInstanceGroupResponseBody body);

        @Override
        CreateAppInstanceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAppInstanceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAppInstanceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAppInstanceGroupResponse response) {
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
        public Builder body(CreateAppInstanceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAppInstanceGroupResponse build() {
            return new CreateAppInstanceGroupResponse(this);
        } 

    } 

}
