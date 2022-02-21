// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBResourcePoolResponse} extends {@link TeaModel}
 *
 * <p>CreateDBResourcePoolResponse</p>
 */
public class CreateDBResourcePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBResourcePoolResponseBody body;

    private CreateDBResourcePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBResourcePoolResponse create() {
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
    public CreateDBResourcePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBResourcePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBResourcePoolResponseBody body);

        @Override
        CreateDBResourcePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBResourcePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBResourcePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBResourcePoolResponse response) {
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
        public Builder body(CreateDBResourcePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBResourcePoolResponse build() {
            return new CreateDBResourcePoolResponse(this);
        } 

    } 

}
