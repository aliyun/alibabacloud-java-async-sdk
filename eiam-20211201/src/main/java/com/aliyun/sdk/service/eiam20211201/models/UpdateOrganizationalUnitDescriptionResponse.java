// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOrganizationalUnitDescriptionResponse} extends {@link TeaModel}
 *
 * <p>UpdateOrganizationalUnitDescriptionResponse</p>
 */
public class UpdateOrganizationalUnitDescriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOrganizationalUnitDescriptionResponseBody body;

    private UpdateOrganizationalUnitDescriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOrganizationalUnitDescriptionResponse create() {
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
    public UpdateOrganizationalUnitDescriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOrganizationalUnitDescriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOrganizationalUnitDescriptionResponseBody body);

        @Override
        UpdateOrganizationalUnitDescriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOrganizationalUnitDescriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOrganizationalUnitDescriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOrganizationalUnitDescriptionResponse response) {
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
        public Builder body(UpdateOrganizationalUnitDescriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOrganizationalUnitDescriptionResponse build() {
            return new UpdateOrganizationalUnitDescriptionResponse(this);
        } 

    } 

}
