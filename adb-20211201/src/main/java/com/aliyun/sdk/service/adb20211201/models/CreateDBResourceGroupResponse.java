// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateDBResourceGroupResponse</p>
 */
public class CreateDBResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBResourceGroupResponseBody body;

    private CreateDBResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBResourceGroupResponse create() {
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
    public CreateDBResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBResourceGroupResponseBody body);

        @Override
        CreateDBResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBResourceGroupResponse response) {
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
        public Builder body(CreateDBResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBResourceGroupResponse build() {
            return new CreateDBResourceGroupResponse(this);
        } 

    } 

}
