// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectIpWhiteListResponse} extends {@link TeaModel}
 *
 * <p>UpdateProjectIpWhiteListResponse</p>
 */
public class UpdateProjectIpWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateProjectIpWhiteListResponseBody body;

    private UpdateProjectIpWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateProjectIpWhiteListResponse create() {
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
    public UpdateProjectIpWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateProjectIpWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateProjectIpWhiteListResponseBody body);

        @Override
        UpdateProjectIpWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateProjectIpWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateProjectIpWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateProjectIpWhiteListResponse response) {
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
        public Builder body(UpdateProjectIpWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateProjectIpWhiteListResponse build() {
            return new UpdateProjectIpWhiteListResponse(this);
        } 

    } 

}
