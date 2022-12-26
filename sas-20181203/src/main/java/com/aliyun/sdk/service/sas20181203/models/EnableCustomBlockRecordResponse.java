// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableCustomBlockRecordResponse} extends {@link TeaModel}
 *
 * <p>EnableCustomBlockRecordResponse</p>
 */
public class EnableCustomBlockRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableCustomBlockRecordResponseBody body;

    private EnableCustomBlockRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableCustomBlockRecordResponse create() {
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
    public EnableCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableCustomBlockRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableCustomBlockRecordResponseBody body);

        @Override
        EnableCustomBlockRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableCustomBlockRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableCustomBlockRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableCustomBlockRecordResponse response) {
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
        public Builder body(EnableCustomBlockRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableCustomBlockRecordResponse build() {
            return new EnableCustomBlockRecordResponse(this);
        } 

    } 

}
