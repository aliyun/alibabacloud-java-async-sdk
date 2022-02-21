// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAllowedIpResponse} extends {@link TeaModel}
 *
 * <p>UpdateAllowedIpResponse</p>
 */
public class UpdateAllowedIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAllowedIpResponseBody body;

    private UpdateAllowedIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAllowedIpResponse create() {
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
    public UpdateAllowedIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAllowedIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAllowedIpResponseBody body);

        @Override
        UpdateAllowedIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAllowedIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAllowedIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAllowedIpResponse response) {
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
        public Builder body(UpdateAllowedIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAllowedIpResponse build() {
            return new UpdateAllowedIpResponse(this);
        } 

    } 

}
