// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHichinaDomainDNSResponse} extends {@link TeaModel}
 *
 * <p>ModifyHichinaDomainDNSResponse</p>
 */
public class ModifyHichinaDomainDNSResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHichinaDomainDNSResponseBody body;

    private ModifyHichinaDomainDNSResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHichinaDomainDNSResponse create() {
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
    public ModifyHichinaDomainDNSResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHichinaDomainDNSResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHichinaDomainDNSResponseBody body);

        @Override
        ModifyHichinaDomainDNSResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHichinaDomainDNSResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHichinaDomainDNSResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHichinaDomainDNSResponse response) {
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
        public Builder body(ModifyHichinaDomainDNSResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHichinaDomainDNSResponse build() {
            return new ModifyHichinaDomainDNSResponse(this);
        } 

    } 

}
