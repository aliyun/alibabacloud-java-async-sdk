// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link AppendObjectResponse} extends {@link TeaModel}
 *
 * <p>AppendObjectResponse</p>
 */
public class AppendObjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private AppendObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static AppendObjectResponse create() {
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

    public interface Builder extends Response.Builder<AppendObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        AppendObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AppendObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AppendObjectResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public AppendObjectResponse build() {
            return new AppendObjectResponse(this);
        } 

    } 

}
