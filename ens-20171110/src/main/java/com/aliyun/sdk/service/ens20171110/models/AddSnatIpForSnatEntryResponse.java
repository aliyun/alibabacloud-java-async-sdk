// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSnatIpForSnatEntryResponse} extends {@link TeaModel}
 *
 * <p>AddSnatIpForSnatEntryResponse</p>
 */
public class AddSnatIpForSnatEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSnatIpForSnatEntryResponseBody body;

    private AddSnatIpForSnatEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSnatIpForSnatEntryResponse create() {
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
    public AddSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSnatIpForSnatEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSnatIpForSnatEntryResponseBody body);

        @Override
        AddSnatIpForSnatEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSnatIpForSnatEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSnatIpForSnatEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSnatIpForSnatEntryResponse response) {
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
        public Builder body(AddSnatIpForSnatEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSnatIpForSnatEntryResponse build() {
            return new AddSnatIpForSnatEntryResponse(this);
        } 

    } 

}
