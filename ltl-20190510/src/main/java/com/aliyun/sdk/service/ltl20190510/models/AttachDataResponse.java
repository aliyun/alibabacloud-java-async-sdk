// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDataResponse} extends {@link TeaModel}
 *
 * <p>AttachDataResponse</p>
 */
public class AttachDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDataResponseBody body;

    private AttachDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDataResponse create() {
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
    public AttachDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDataResponseBody body);

        @Override
        AttachDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDataResponse response) {
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
        public Builder body(AttachDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDataResponse build() {
            return new AttachDataResponse(this);
        } 

    } 

}
