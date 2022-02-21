// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppVersionRemarkResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppVersionRemarkResponse</p>
 */
public class UpdateAppVersionRemarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppVersionRemarkResponseBody body;

    private UpdateAppVersionRemarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppVersionRemarkResponse create() {
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
    public UpdateAppVersionRemarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppVersionRemarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppVersionRemarkResponseBody body);

        @Override
        UpdateAppVersionRemarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppVersionRemarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppVersionRemarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppVersionRemarkResponse response) {
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
        public Builder body(UpdateAppVersionRemarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppVersionRemarkResponse build() {
            return new UpdateAppVersionRemarkResponse(this);
        } 

    } 

}
