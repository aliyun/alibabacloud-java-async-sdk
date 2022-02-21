// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppVersionResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppVersionResponse</p>
 */
public class UpdateAppVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppVersionResponseBody body;

    private UpdateAppVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppVersionResponse create() {
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
    public UpdateAppVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppVersionResponseBody body);

        @Override
        UpdateAppVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppVersionResponse response) {
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
        public Builder body(UpdateAppVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppVersionResponse build() {
            return new UpdateAppVersionResponse(this);
        } 

    } 

}
