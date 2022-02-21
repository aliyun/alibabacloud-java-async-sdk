// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubDomainRecordsResponse} extends {@link TeaModel}
 *
 * <p>DeleteSubDomainRecordsResponse</p>
 */
public class DeleteSubDomainRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSubDomainRecordsResponseBody body;

    private DeleteSubDomainRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSubDomainRecordsResponse create() {
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
    public DeleteSubDomainRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSubDomainRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSubDomainRecordsResponseBody body);

        @Override
        DeleteSubDomainRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSubDomainRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSubDomainRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSubDomainRecordsResponse response) {
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
        public Builder body(DeleteSubDomainRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSubDomainRecordsResponse build() {
            return new DeleteSubDomainRecordsResponse(this);
        } 

    } 

}
