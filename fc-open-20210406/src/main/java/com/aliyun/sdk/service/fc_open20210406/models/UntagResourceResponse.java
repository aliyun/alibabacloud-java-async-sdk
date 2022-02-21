// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourceResponse} extends {@link TeaModel}
 *
 * <p>UntagResourceResponse</p>
 */
public class UntagResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private UntagResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static UntagResourceResponse create() {
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

    public interface Builder extends Response.Builder<UntagResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        UntagResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UntagResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UntagResourceResponse response) {
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
        public UntagResourceResponse build() {
            return new UntagResourceResponse(this);
        } 

    } 

}
