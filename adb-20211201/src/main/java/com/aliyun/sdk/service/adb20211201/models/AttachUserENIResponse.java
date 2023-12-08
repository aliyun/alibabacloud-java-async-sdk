// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachUserENIResponse} extends {@link TeaModel}
 *
 * <p>AttachUserENIResponse</p>
 */
public class AttachUserENIResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachUserENIResponseBody body;

    private AttachUserENIResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachUserENIResponse create() {
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
    public AttachUserENIResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachUserENIResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachUserENIResponseBody body);

        @Override
        AttachUserENIResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachUserENIResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachUserENIResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachUserENIResponse response) {
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
        public Builder body(AttachUserENIResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachUserENIResponse build() {
            return new AttachUserENIResponse(this);
        } 

    } 

}
