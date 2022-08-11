// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceApiAuthorityResponse} extends {@link TeaModel}
 *
 * <p>CreateDataServiceApiAuthorityResponse</p>
 */
public class CreateDataServiceApiAuthorityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataServiceApiAuthorityResponseBody body;

    private CreateDataServiceApiAuthorityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataServiceApiAuthorityResponse create() {
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
    public CreateDataServiceApiAuthorityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataServiceApiAuthorityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataServiceApiAuthorityResponseBody body);

        @Override
        CreateDataServiceApiAuthorityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataServiceApiAuthorityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataServiceApiAuthorityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataServiceApiAuthorityResponse response) {
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
        public Builder body(CreateDataServiceApiAuthorityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataServiceApiAuthorityResponse build() {
            return new CreateDataServiceApiAuthorityResponse(this);
        } 

    } 

}
