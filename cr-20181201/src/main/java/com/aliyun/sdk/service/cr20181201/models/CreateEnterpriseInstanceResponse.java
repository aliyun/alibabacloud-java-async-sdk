// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnterpriseInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateEnterpriseInstanceResponse</p>
 */
public class CreateEnterpriseInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEnterpriseInstanceResponseBody body;

    private CreateEnterpriseInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEnterpriseInstanceResponse create() {
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
    public CreateEnterpriseInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEnterpriseInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEnterpriseInstanceResponseBody body);

        @Override
        CreateEnterpriseInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEnterpriseInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEnterpriseInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEnterpriseInstanceResponse response) {
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
        public Builder body(CreateEnterpriseInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEnterpriseInstanceResponse build() {
            return new CreateEnterpriseInstanceResponse(this);
        } 

    } 

}
