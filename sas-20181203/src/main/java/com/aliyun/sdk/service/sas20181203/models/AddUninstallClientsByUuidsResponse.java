// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUninstallClientsByUuidsResponse} extends {@link TeaModel}
 *
 * <p>AddUninstallClientsByUuidsResponse</p>
 */
public class AddUninstallClientsByUuidsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUninstallClientsByUuidsResponseBody body;

    private AddUninstallClientsByUuidsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUninstallClientsByUuidsResponse create() {
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
    public AddUninstallClientsByUuidsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUninstallClientsByUuidsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUninstallClientsByUuidsResponseBody body);

        @Override
        AddUninstallClientsByUuidsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUninstallClientsByUuidsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUninstallClientsByUuidsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUninstallClientsByUuidsResponse response) {
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
        public Builder body(AddUninstallClientsByUuidsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUninstallClientsByUuidsResponse build() {
            return new AddUninstallClientsByUuidsResponse(this);
        } 

    } 

}
