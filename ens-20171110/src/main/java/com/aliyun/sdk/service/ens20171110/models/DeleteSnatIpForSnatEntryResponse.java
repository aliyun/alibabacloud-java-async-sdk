// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnatIpForSnatEntryResponse} extends {@link TeaModel}
 *
 * <p>DeleteSnatIpForSnatEntryResponse</p>
 */
public class DeleteSnatIpForSnatEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSnatIpForSnatEntryResponseBody body;

    private DeleteSnatIpForSnatEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSnatIpForSnatEntryResponse create() {
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
    public DeleteSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSnatIpForSnatEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSnatIpForSnatEntryResponseBody body);

        @Override
        DeleteSnatIpForSnatEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSnatIpForSnatEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSnatIpForSnatEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSnatIpForSnatEntryResponse response) {
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
        public Builder body(DeleteSnatIpForSnatEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSnatIpForSnatEntryResponse build() {
            return new DeleteSnatIpForSnatEntryResponse(this);
        } 

    } 

}
