// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApiGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateApiGroupResponse</p>
 */
public class CreateApiGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateApiGroupResponseBody body;

    private CreateApiGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateApiGroupResponse create() {
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
    public CreateApiGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateApiGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateApiGroupResponseBody body);

        @Override
        CreateApiGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateApiGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateApiGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateApiGroupResponse response) {
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
        public Builder body(CreateApiGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateApiGroupResponse build() {
            return new CreateApiGroupResponse(this);
        } 

    } 

}
