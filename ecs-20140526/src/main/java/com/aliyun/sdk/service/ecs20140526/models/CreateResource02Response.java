// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResource02Response} extends {@link TeaModel}
 *
 * <p>CreateResource02Response</p>
 */
public class CreateResource02Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResource02ResponseBody body;

    private CreateResource02Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResource02Response create() {
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
    public CreateResource02ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResource02Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResource02ResponseBody body);

        @Override
        CreateResource02Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResource02Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResource02ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResource02Response response) {
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
        public Builder body(CreateResource02ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResource02Response build() {
            return new CreateResource02Response(this);
        } 

    } 

}
