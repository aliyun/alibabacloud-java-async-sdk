// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateAccessGroupResponse</p>
 */
public class CreateAccessGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAccessGroupResponseBody body;

    private CreateAccessGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAccessGroupResponse create() {
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
    public CreateAccessGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAccessGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAccessGroupResponseBody body);

        @Override
        CreateAccessGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAccessGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAccessGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAccessGroupResponse response) {
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
        public Builder body(CreateAccessGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAccessGroupResponse build() {
            return new CreateAccessGroupResponse(this);
        } 

    } 

}
