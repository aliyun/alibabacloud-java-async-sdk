// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link UploadPartResponse} extends {@link TeaModel}
 *
 * <p>UploadPartResponse</p>
 */
public class UploadPartResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private UploadPartResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static UploadPartResponse create() {
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

    public interface Builder extends Response.Builder<UploadPartResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        UploadPartResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadPartResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadPartResponse response) {
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
        public UploadPartResponse build() {
            return new UploadPartResponse(this);
        } 

    } 

}
