// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateADConnectorOfficeSiteResponse} extends {@link TeaModel}
 *
 * <p>CreateADConnectorOfficeSiteResponse</p>
 */
public class CreateADConnectorOfficeSiteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateADConnectorOfficeSiteResponseBody body;

    private CreateADConnectorOfficeSiteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateADConnectorOfficeSiteResponse create() {
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
    public CreateADConnectorOfficeSiteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateADConnectorOfficeSiteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateADConnectorOfficeSiteResponseBody body);

        @Override
        CreateADConnectorOfficeSiteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateADConnectorOfficeSiteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateADConnectorOfficeSiteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateADConnectorOfficeSiteResponse response) {
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
        public Builder body(CreateADConnectorOfficeSiteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateADConnectorOfficeSiteResponse build() {
            return new CreateADConnectorOfficeSiteResponse(this);
        } 

    } 

}
