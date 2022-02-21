// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateDesktopGroupResponse</p>
 */
public class CreateDesktopGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDesktopGroupResponseBody body;

    private CreateDesktopGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDesktopGroupResponse create() {
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
    public CreateDesktopGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDesktopGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDesktopGroupResponseBody body);

        @Override
        CreateDesktopGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDesktopGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDesktopGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDesktopGroupResponse response) {
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
        public Builder body(CreateDesktopGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDesktopGroupResponse build() {
            return new CreateDesktopGroupResponse(this);
        } 

    } 

}
