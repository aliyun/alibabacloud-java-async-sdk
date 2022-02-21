// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainStagingConfigResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnDomainStagingConfigResponse</p>
 */
public class SetDcdnDomainStagingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDcdnDomainStagingConfigResponseBody body;

    private SetDcdnDomainStagingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDcdnDomainStagingConfigResponse create() {
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
    public SetDcdnDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnDomainStagingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDcdnDomainStagingConfigResponseBody body);

        @Override
        SetDcdnDomainStagingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnDomainStagingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDcdnDomainStagingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnDomainStagingConfigResponse response) {
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
        public Builder body(SetDcdnDomainStagingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDcdnDomainStagingConfigResponse build() {
            return new SetDcdnDomainStagingConfigResponse(this);
        } 

    } 

}
