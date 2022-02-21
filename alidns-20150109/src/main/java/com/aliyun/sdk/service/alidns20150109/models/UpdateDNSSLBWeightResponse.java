// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDNSSLBWeightResponse} extends {@link TeaModel}
 *
 * <p>UpdateDNSSLBWeightResponse</p>
 */
public class UpdateDNSSLBWeightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDNSSLBWeightResponseBody body;

    private UpdateDNSSLBWeightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDNSSLBWeightResponse create() {
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
    public UpdateDNSSLBWeightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDNSSLBWeightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDNSSLBWeightResponseBody body);

        @Override
        UpdateDNSSLBWeightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDNSSLBWeightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDNSSLBWeightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDNSSLBWeightResponse response) {
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
        public Builder body(UpdateDNSSLBWeightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDNSSLBWeightResponse build() {
            return new UpdateDNSSLBWeightResponse(this);
        } 

    } 

}
