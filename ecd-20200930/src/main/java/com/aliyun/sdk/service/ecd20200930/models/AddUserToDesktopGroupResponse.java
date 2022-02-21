// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserToDesktopGroupResponse} extends {@link TeaModel}
 *
 * <p>AddUserToDesktopGroupResponse</p>
 */
public class AddUserToDesktopGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserToDesktopGroupResponseBody body;

    private AddUserToDesktopGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserToDesktopGroupResponse create() {
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
    public AddUserToDesktopGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserToDesktopGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserToDesktopGroupResponseBody body);

        @Override
        AddUserToDesktopGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserToDesktopGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserToDesktopGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserToDesktopGroupResponse response) {
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
        public Builder body(AddUserToDesktopGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserToDesktopGroupResponse build() {
            return new AddUserToDesktopGroupResponse(this);
        } 

    } 

}
