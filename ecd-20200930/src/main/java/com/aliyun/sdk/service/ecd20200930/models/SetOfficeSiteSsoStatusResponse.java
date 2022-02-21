// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetOfficeSiteSsoStatusResponse} extends {@link TeaModel}
 *
 * <p>SetOfficeSiteSsoStatusResponse</p>
 */
public class SetOfficeSiteSsoStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetOfficeSiteSsoStatusResponseBody body;

    private SetOfficeSiteSsoStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetOfficeSiteSsoStatusResponse create() {
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
    public SetOfficeSiteSsoStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetOfficeSiteSsoStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetOfficeSiteSsoStatusResponseBody body);

        @Override
        SetOfficeSiteSsoStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetOfficeSiteSsoStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetOfficeSiteSsoStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetOfficeSiteSsoStatusResponse response) {
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
        public Builder body(SetOfficeSiteSsoStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetOfficeSiteSsoStatusResponse build() {
            return new SetOfficeSiteSsoStatusResponse(this);
        } 

    } 

}
