// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutObjectTaggingResponse} extends {@link TeaModel}
 *
 * <p>PutObjectTaggingResponse</p>
 */
public class PutObjectTaggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private PutObjectTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static PutObjectTaggingResponse create() {
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

    public interface Builder extends Response.Builder<PutObjectTaggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        PutObjectTaggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutObjectTaggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutObjectTaggingResponse response) {
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
        public PutObjectTaggingResponse build() {
            return new PutObjectTaggingResponse(this);
        } 

    } 

}
