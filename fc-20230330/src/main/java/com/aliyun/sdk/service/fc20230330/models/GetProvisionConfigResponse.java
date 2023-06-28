// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProvisionConfigResponse} extends {@link TeaModel}
 *
 * <p>GetProvisionConfigResponse</p>
 */
public class GetProvisionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ProvisionConfig body;

    private GetProvisionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProvisionConfigResponse create() {
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
    public ProvisionConfig getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProvisionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ProvisionConfig body);

        @Override
        GetProvisionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProvisionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ProvisionConfig body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProvisionConfigResponse response) {
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
        public Builder body(ProvisionConfig body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProvisionConfigResponse build() {
            return new GetProvisionConfigResponse(this);
        } 

    } 

}
