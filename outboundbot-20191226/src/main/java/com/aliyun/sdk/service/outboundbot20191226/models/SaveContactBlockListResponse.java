// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveContactBlockListResponse} extends {@link TeaModel}
 *
 * <p>SaveContactBlockListResponse</p>
 */
public class SaveContactBlockListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveContactBlockListResponseBody body;

    private SaveContactBlockListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveContactBlockListResponse create() {
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
    public SaveContactBlockListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveContactBlockListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveContactBlockListResponseBody body);

        @Override
        SaveContactBlockListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveContactBlockListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveContactBlockListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveContactBlockListResponse response) {
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
        public Builder body(SaveContactBlockListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveContactBlockListResponse build() {
            return new SaveContactBlockListResponse(this);
        } 

    } 

}
