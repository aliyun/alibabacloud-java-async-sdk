// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainBackupResponse} extends {@link TeaModel}
 *
 * <p>AddDomainBackupResponse</p>
 */
public class AddDomainBackupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDomainBackupResponseBody body;

    private AddDomainBackupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDomainBackupResponse create() {
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
    public AddDomainBackupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDomainBackupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDomainBackupResponseBody body);

        @Override
        AddDomainBackupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDomainBackupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDomainBackupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDomainBackupResponse response) {
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
        public Builder body(AddDomainBackupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDomainBackupResponse build() {
            return new AddDomainBackupResponse(this);
        } 

    } 

}
