// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableCustomBlockRecordResponse} extends {@link TeaModel}
 *
 * <p>DisableCustomBlockRecordResponse</p>
 */
public class DisableCustomBlockRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableCustomBlockRecordResponseBody body;

    private DisableCustomBlockRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableCustomBlockRecordResponse create() {
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
    public DisableCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableCustomBlockRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableCustomBlockRecordResponseBody body);

        @Override
        DisableCustomBlockRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableCustomBlockRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableCustomBlockRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableCustomBlockRecordResponse response) {
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
        public Builder body(DisableCustomBlockRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableCustomBlockRecordResponse build() {
            return new DisableCustomBlockRecordResponse(this);
        } 

    } 

}
