// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConcurrencyConfigResponse} extends {@link TeaModel}
 *
 * <p>GetConcurrencyConfigResponse</p>
 */
public class GetConcurrencyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConcurrencyConfig body;

    private GetConcurrencyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConcurrencyConfigResponse create() {
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
    public ConcurrencyConfig getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConcurrencyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConcurrencyConfig body);

        @Override
        GetConcurrencyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConcurrencyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConcurrencyConfig body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConcurrencyConfigResponse response) {
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
        public Builder body(ConcurrencyConfig body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConcurrencyConfigResponse build() {
            return new GetConcurrencyConfigResponse(this);
        } 

    } 

}
