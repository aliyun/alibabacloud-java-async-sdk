// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateApplicationGroupResponse</p>
 */
public class CreateApplicationGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateApplicationGroupResponseBody body;

    private CreateApplicationGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateApplicationGroupResponse create() {
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
    public CreateApplicationGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateApplicationGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateApplicationGroupResponseBody body);

        @Override
        CreateApplicationGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateApplicationGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateApplicationGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateApplicationGroupResponse response) {
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
        public Builder body(CreateApplicationGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateApplicationGroupResponse build() {
            return new CreateApplicationGroupResponse(this);
        } 

    } 

}
