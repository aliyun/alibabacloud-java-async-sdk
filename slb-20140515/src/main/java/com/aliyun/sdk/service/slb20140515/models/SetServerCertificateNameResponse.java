// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetServerCertificateNameResponse} extends {@link TeaModel}
 *
 * <p>SetServerCertificateNameResponse</p>
 */
public class SetServerCertificateNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetServerCertificateNameResponseBody body;

    private SetServerCertificateNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetServerCertificateNameResponse create() {
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
    public SetServerCertificateNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetServerCertificateNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetServerCertificateNameResponseBody body);

        @Override
        SetServerCertificateNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetServerCertificateNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetServerCertificateNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetServerCertificateNameResponse response) {
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
        public Builder body(SetServerCertificateNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetServerCertificateNameResponse build() {
            return new SetServerCertificateNameResponse(this);
        } 

    } 

}
