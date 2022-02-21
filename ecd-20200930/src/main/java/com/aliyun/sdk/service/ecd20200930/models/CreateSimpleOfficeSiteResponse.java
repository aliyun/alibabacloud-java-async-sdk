// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimpleOfficeSiteResponse} extends {@link TeaModel}
 *
 * <p>CreateSimpleOfficeSiteResponse</p>
 */
public class CreateSimpleOfficeSiteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSimpleOfficeSiteResponseBody body;

    private CreateSimpleOfficeSiteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSimpleOfficeSiteResponse create() {
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
    public CreateSimpleOfficeSiteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSimpleOfficeSiteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSimpleOfficeSiteResponseBody body);

        @Override
        CreateSimpleOfficeSiteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSimpleOfficeSiteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSimpleOfficeSiteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSimpleOfficeSiteResponse response) {
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
        public Builder body(CreateSimpleOfficeSiteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSimpleOfficeSiteResponse build() {
            return new CreateSimpleOfficeSiteResponse(this);
        } 

    } 

}
