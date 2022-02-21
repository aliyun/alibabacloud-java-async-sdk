// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProfileResponse} extends {@link TeaModel}
 *
 * <p>UpdateProfileResponse</p>
 */
public class UpdateProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProfileResponseBody body;

    private UpdateProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProfileResponse create() {
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
    public UpdateProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProfileResponseBody body);

        @Override
        UpdateProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProfileResponse response) {
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
        public Builder body(UpdateProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProfileResponse build() {
            return new UpdateProfileResponse(this);
        } 

    } 

}
