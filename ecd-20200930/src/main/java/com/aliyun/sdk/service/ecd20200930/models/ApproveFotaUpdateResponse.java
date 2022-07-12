// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveFotaUpdateResponse} extends {@link TeaModel}
 *
 * <p>ApproveFotaUpdateResponse</p>
 */
public class ApproveFotaUpdateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApproveFotaUpdateResponseBody body;

    private ApproveFotaUpdateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApproveFotaUpdateResponse create() {
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
    public ApproveFotaUpdateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApproveFotaUpdateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApproveFotaUpdateResponseBody body);

        @Override
        ApproveFotaUpdateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApproveFotaUpdateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApproveFotaUpdateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApproveFotaUpdateResponse response) {
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
        public Builder body(ApproveFotaUpdateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApproveFotaUpdateResponse build() {
            return new ApproveFotaUpdateResponse(this);
        } 

    } 

}
