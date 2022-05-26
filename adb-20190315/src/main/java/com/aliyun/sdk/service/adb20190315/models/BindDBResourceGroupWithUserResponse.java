// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindDBResourceGroupWithUserResponse} extends {@link TeaModel}
 *
 * <p>BindDBResourceGroupWithUserResponse</p>
 */
public class BindDBResourceGroupWithUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindDBResourceGroupWithUserResponseBody body;

    private BindDBResourceGroupWithUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindDBResourceGroupWithUserResponse create() {
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
    public BindDBResourceGroupWithUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindDBResourceGroupWithUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindDBResourceGroupWithUserResponseBody body);

        @Override
        BindDBResourceGroupWithUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindDBResourceGroupWithUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindDBResourceGroupWithUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindDBResourceGroupWithUserResponse response) {
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
        public Builder body(BindDBResourceGroupWithUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindDBResourceGroupWithUserResponse build() {
            return new BindDBResourceGroupWithUserResponse(this);
        } 

    } 

}
