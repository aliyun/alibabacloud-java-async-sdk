// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataLevelPermissionWhiteListResponse} extends {@link TeaModel}
 *
 * <p>SetDataLevelPermissionWhiteListResponse</p>
 */
public class SetDataLevelPermissionWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDataLevelPermissionWhiteListResponseBody body;

    private SetDataLevelPermissionWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDataLevelPermissionWhiteListResponse create() {
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
    public SetDataLevelPermissionWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDataLevelPermissionWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDataLevelPermissionWhiteListResponseBody body);

        @Override
        SetDataLevelPermissionWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDataLevelPermissionWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDataLevelPermissionWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDataLevelPermissionWhiteListResponse response) {
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
        public Builder body(SetDataLevelPermissionWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDataLevelPermissionWhiteListResponse build() {
            return new SetDataLevelPermissionWhiteListResponse(this);
        } 

    } 

}
