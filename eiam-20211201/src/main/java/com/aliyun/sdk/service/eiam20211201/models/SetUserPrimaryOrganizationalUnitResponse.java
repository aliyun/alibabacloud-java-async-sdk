// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserPrimaryOrganizationalUnitResponse} extends {@link TeaModel}
 *
 * <p>SetUserPrimaryOrganizationalUnitResponse</p>
 */
public class SetUserPrimaryOrganizationalUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetUserPrimaryOrganizationalUnitResponseBody body;

    private SetUserPrimaryOrganizationalUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetUserPrimaryOrganizationalUnitResponse create() {
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
    public SetUserPrimaryOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetUserPrimaryOrganizationalUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetUserPrimaryOrganizationalUnitResponseBody body);

        @Override
        SetUserPrimaryOrganizationalUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetUserPrimaryOrganizationalUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetUserPrimaryOrganizationalUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetUserPrimaryOrganizationalUnitResponse response) {
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
        public Builder body(SetUserPrimaryOrganizationalUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetUserPrimaryOrganizationalUnitResponse build() {
            return new SetUserPrimaryOrganizationalUnitResponse(this);
        } 

    } 

}
