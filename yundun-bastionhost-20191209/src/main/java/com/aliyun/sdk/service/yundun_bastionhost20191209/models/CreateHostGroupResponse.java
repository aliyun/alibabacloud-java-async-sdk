// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateHostGroupResponse</p>
 */
public class CreateHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHostGroupResponseBody body;

    private CreateHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHostGroupResponse create() {
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
    public CreateHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHostGroupResponseBody body);

        @Override
        CreateHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHostGroupResponse response) {
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
        public Builder body(CreateHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHostGroupResponse build() {
            return new CreateHostGroupResponse(this);
        } 

    } 

}
