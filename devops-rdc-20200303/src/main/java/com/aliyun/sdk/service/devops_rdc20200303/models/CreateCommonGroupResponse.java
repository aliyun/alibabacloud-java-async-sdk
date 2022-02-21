// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommonGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateCommonGroupResponse</p>
 */
public class CreateCommonGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCommonGroupResponseBody body;

    private CreateCommonGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCommonGroupResponse create() {
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
    public CreateCommonGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCommonGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCommonGroupResponseBody body);

        @Override
        CreateCommonGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCommonGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCommonGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCommonGroupResponse response) {
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
        public Builder body(CreateCommonGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCommonGroupResponse build() {
            return new CreateCommonGroupResponse(this);
        } 

    } 

}
