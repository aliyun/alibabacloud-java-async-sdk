// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUpgradeStatusResponse} extends {@link TeaModel}
 *
 * <p>GetUpgradeStatusResponse</p>
 */
public class GetUpgradeStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUpgradeStatusResponseBody body;

    private GetUpgradeStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUpgradeStatusResponse create() {
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
    public GetUpgradeStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUpgradeStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUpgradeStatusResponseBody body);

        @Override
        GetUpgradeStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUpgradeStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUpgradeStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUpgradeStatusResponse response) {
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
        public Builder body(GetUpgradeStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUpgradeStatusResponse build() {
            return new GetUpgradeStatusResponse(this);
        } 

    } 

}
