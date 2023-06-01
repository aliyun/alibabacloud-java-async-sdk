// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartSnatIpForSnatEntryResponse} extends {@link TeaModel}
 *
 * <p>StartSnatIpForSnatEntryResponse</p>
 */
public class StartSnatIpForSnatEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartSnatIpForSnatEntryResponseBody body;

    private StartSnatIpForSnatEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartSnatIpForSnatEntryResponse create() {
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
    public StartSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartSnatIpForSnatEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartSnatIpForSnatEntryResponseBody body);

        @Override
        StartSnatIpForSnatEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartSnatIpForSnatEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartSnatIpForSnatEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartSnatIpForSnatEntryResponse response) {
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
        public Builder body(StartSnatIpForSnatEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartSnatIpForSnatEntryResponse build() {
            return new StartSnatIpForSnatEntryResponse(this);
        } 

    } 

}
