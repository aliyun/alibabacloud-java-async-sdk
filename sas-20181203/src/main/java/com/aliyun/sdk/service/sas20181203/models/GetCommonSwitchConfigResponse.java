// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommonSwitchConfigResponse} extends {@link TeaModel}
 *
 * <p>GetCommonSwitchConfigResponse</p>
 */
public class GetCommonSwitchConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCommonSwitchConfigResponseBody body;

    private GetCommonSwitchConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCommonSwitchConfigResponse create() {
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
    public GetCommonSwitchConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCommonSwitchConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCommonSwitchConfigResponseBody body);

        @Override
        GetCommonSwitchConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCommonSwitchConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCommonSwitchConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCommonSwitchConfigResponse response) {
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
        public Builder body(GetCommonSwitchConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCommonSwitchConfigResponse build() {
            return new GetCommonSwitchConfigResponse(this);
        } 

    } 

}
