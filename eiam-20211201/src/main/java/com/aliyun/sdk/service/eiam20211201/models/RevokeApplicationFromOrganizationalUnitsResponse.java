// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeApplicationFromOrganizationalUnitsResponse} extends {@link TeaModel}
 *
 * <p>RevokeApplicationFromOrganizationalUnitsResponse</p>
 */
public class RevokeApplicationFromOrganizationalUnitsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeApplicationFromOrganizationalUnitsResponseBody body;

    private RevokeApplicationFromOrganizationalUnitsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeApplicationFromOrganizationalUnitsResponse create() {
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
    public RevokeApplicationFromOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeApplicationFromOrganizationalUnitsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeApplicationFromOrganizationalUnitsResponseBody body);

        @Override
        RevokeApplicationFromOrganizationalUnitsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeApplicationFromOrganizationalUnitsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeApplicationFromOrganizationalUnitsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeApplicationFromOrganizationalUnitsResponse response) {
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
        public Builder body(RevokeApplicationFromOrganizationalUnitsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeApplicationFromOrganizationalUnitsResponse build() {
            return new RevokeApplicationFromOrganizationalUnitsResponse(this);
        } 

    } 

}
