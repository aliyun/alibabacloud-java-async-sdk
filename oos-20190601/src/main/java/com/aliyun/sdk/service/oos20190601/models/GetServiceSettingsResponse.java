// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceSettingsResponse} extends {@link TeaModel}
 *
 * <p>GetServiceSettingsResponse</p>
 */
public class GetServiceSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceSettingsResponseBody body;

    private GetServiceSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceSettingsResponse create() {
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
    public GetServiceSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceSettingsResponseBody body);

        @Override
        GetServiceSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceSettingsResponse response) {
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
        public Builder body(GetServiceSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceSettingsResponse build() {
            return new GetServiceSettingsResponse(this);
        } 

    } 

}
