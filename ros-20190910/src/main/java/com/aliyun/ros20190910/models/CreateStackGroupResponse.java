// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStackGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateStackGroupResponse</p>
 */
public class CreateStackGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStackGroupResponseBody body;

    private CreateStackGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStackGroupResponse create() {
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
    public CreateStackGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStackGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStackGroupResponseBody body);

        @Override
        CreateStackGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStackGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStackGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStackGroupResponse response) {
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
        public Builder body(CreateStackGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStackGroupResponse build() {
            return new CreateStackGroupResponse(this);
        } 

    } 

}
