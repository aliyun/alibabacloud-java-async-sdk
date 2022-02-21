// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppVersionStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppVersionStatusResponse</p>
 */
public class UpdateAppVersionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppVersionStatusResponseBody body;

    private UpdateAppVersionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppVersionStatusResponse create() {
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
    public UpdateAppVersionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppVersionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppVersionStatusResponseBody body);

        @Override
        UpdateAppVersionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppVersionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppVersionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppVersionStatusResponse response) {
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
        public Builder body(UpdateAppVersionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppVersionStatusResponse build() {
            return new UpdateAppVersionStatusResponse(this);
        } 

    } 

}
