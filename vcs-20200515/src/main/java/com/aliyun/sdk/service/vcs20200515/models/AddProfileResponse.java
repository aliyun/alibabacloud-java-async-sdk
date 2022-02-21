// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProfileResponse} extends {@link TeaModel}
 *
 * <p>AddProfileResponse</p>
 */
public class AddProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddProfileResponseBody body;

    private AddProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddProfileResponse create() {
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
    public AddProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddProfileResponseBody body);

        @Override
        AddProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddProfileResponse response) {
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
        public Builder body(AddProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddProfileResponse build() {
            return new AddProfileResponse(this);
        } 

    } 

}
