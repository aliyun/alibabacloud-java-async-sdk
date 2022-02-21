// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImAuditResponse} extends {@link TeaModel}
 *
 * <p>ImAuditResponse</p>
 */
public class ImAuditResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImAuditResponseBody body;

    private ImAuditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImAuditResponse create() {
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
    public ImAuditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImAuditResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImAuditResponseBody body);

        @Override
        ImAuditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImAuditResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImAuditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImAuditResponse response) {
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
        public Builder body(ImAuditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImAuditResponse build() {
            return new ImAuditResponse(this);
        } 

    } 

}
