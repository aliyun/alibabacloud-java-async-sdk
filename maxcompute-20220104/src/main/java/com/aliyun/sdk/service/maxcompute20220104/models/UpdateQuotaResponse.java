// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateQuotaResponse} extends {@link TeaModel}
 *
 * <p>UpdateQuotaResponse</p>
 */
public class UpdateQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateQuotaResponseBody body;

    private UpdateQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateQuotaResponse create() {
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
    public UpdateQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateQuotaResponseBody body);

        @Override
        UpdateQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateQuotaResponse response) {
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
        public Builder body(UpdateQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateQuotaResponse build() {
            return new UpdateQuotaResponse(this);
        } 

    } 

}
