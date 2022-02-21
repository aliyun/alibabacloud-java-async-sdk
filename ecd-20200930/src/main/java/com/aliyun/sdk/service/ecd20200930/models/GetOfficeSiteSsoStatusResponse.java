// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOfficeSiteSsoStatusResponse} extends {@link TeaModel}
 *
 * <p>GetOfficeSiteSsoStatusResponse</p>
 */
public class GetOfficeSiteSsoStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOfficeSiteSsoStatusResponseBody body;

    private GetOfficeSiteSsoStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOfficeSiteSsoStatusResponse create() {
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
    public GetOfficeSiteSsoStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOfficeSiteSsoStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOfficeSiteSsoStatusResponseBody body);

        @Override
        GetOfficeSiteSsoStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOfficeSiteSsoStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOfficeSiteSsoStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOfficeSiteSsoStatusResponse response) {
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
        public Builder body(GetOfficeSiteSsoStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOfficeSiteSsoStatusResponse build() {
            return new GetOfficeSiteSsoStatusResponse(this);
        } 

    } 

}
