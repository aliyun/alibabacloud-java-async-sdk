// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceApiResponse} extends {@link TeaModel}
 *
 * <p>CreateDataServiceApiResponse</p>
 */
public class CreateDataServiceApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataServiceApiResponseBody body;

    private CreateDataServiceApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataServiceApiResponse create() {
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
    public CreateDataServiceApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataServiceApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataServiceApiResponseBody body);

        @Override
        CreateDataServiceApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataServiceApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataServiceApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataServiceApiResponse response) {
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
        public Builder body(CreateDataServiceApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataServiceApiResponse build() {
            return new CreateDataServiceApiResponse(this);
        } 

    } 

}
