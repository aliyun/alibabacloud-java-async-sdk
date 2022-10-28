// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BackFillResponse} extends {@link TeaModel}
 *
 * <p>BackFillResponse</p>
 */
public class BackFillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BackFillResponseBody body;

    private BackFillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BackFillResponse create() {
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
    public BackFillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BackFillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BackFillResponseBody body);

        @Override
        BackFillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BackFillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BackFillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BackFillResponse response) {
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
        public Builder body(BackFillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BackFillResponse build() {
            return new BackFillResponse(this);
        } 

    } 

}
