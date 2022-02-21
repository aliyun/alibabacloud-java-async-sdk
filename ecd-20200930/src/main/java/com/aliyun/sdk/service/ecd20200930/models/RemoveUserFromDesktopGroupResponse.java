// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserFromDesktopGroupResponse} extends {@link TeaModel}
 *
 * <p>RemoveUserFromDesktopGroupResponse</p>
 */
public class RemoveUserFromDesktopGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveUserFromDesktopGroupResponseBody body;

    private RemoveUserFromDesktopGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveUserFromDesktopGroupResponse create() {
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
    public RemoveUserFromDesktopGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveUserFromDesktopGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveUserFromDesktopGroupResponseBody body);

        @Override
        RemoveUserFromDesktopGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveUserFromDesktopGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveUserFromDesktopGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveUserFromDesktopGroupResponse response) {
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
        public Builder body(RemoveUserFromDesktopGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveUserFromDesktopGroupResponse build() {
            return new RemoveUserFromDesktopGroupResponse(this);
        } 

    } 

}
