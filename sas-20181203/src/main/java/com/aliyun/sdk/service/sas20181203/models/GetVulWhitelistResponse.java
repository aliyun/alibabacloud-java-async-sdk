// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVulWhitelistResponse} extends {@link TeaModel}
 *
 * <p>GetVulWhitelistResponse</p>
 */
public class GetVulWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVulWhitelistResponseBody body;

    private GetVulWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVulWhitelistResponse create() {
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
    public GetVulWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVulWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVulWhitelistResponseBody body);

        @Override
        GetVulWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVulWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVulWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVulWhitelistResponse response) {
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
        public Builder body(GetVulWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVulWhitelistResponse build() {
            return new GetVulWhitelistResponse(this);
        } 

    } 

}
