// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEaisEiResponse} extends {@link TeaModel}
 *
 * <p>AttachEaisEiResponse</p>
 */
public class AttachEaisEiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachEaisEiResponseBody body;

    private AttachEaisEiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachEaisEiResponse create() {
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
    public AttachEaisEiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachEaisEiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachEaisEiResponseBody body);

        @Override
        AttachEaisEiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachEaisEiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachEaisEiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachEaisEiResponse response) {
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
        public Builder body(AttachEaisEiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachEaisEiResponse build() {
            return new AttachEaisEiResponse(this);
        } 

    } 

}
