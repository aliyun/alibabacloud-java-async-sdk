// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDBResourceGroupWithUserResponse} extends {@link TeaModel}
 *
 * <p>UnbindDBResourceGroupWithUserResponse</p>
 */
public class UnbindDBResourceGroupWithUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindDBResourceGroupWithUserResponseBody body;

    private UnbindDBResourceGroupWithUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindDBResourceGroupWithUserResponse create() {
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
    public UnbindDBResourceGroupWithUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindDBResourceGroupWithUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindDBResourceGroupWithUserResponseBody body);

        @Override
        UnbindDBResourceGroupWithUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindDBResourceGroupWithUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindDBResourceGroupWithUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindDBResourceGroupWithUserResponse response) {
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
        public Builder body(UnbindDBResourceGroupWithUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindDBResourceGroupWithUserResponse build() {
            return new UnbindDBResourceGroupWithUserResponse(this);
        } 

    } 

}
