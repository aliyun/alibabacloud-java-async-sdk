// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopSnatIpForSnatEntryResponse} extends {@link TeaModel}
 *
 * <p>StopSnatIpForSnatEntryResponse</p>
 */
public class StopSnatIpForSnatEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopSnatIpForSnatEntryResponseBody body;

    private StopSnatIpForSnatEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopSnatIpForSnatEntryResponse create() {
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
    public StopSnatIpForSnatEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopSnatIpForSnatEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopSnatIpForSnatEntryResponseBody body);

        @Override
        StopSnatIpForSnatEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopSnatIpForSnatEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopSnatIpForSnatEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopSnatIpForSnatEntryResponse response) {
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
        public Builder body(StopSnatIpForSnatEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopSnatIpForSnatEntryResponse build() {
            return new StopSnatIpForSnatEntryResponse(this);
        } 

    } 

}
