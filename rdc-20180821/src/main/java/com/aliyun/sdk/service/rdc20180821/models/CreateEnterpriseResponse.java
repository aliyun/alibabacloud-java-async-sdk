// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnterpriseResponse} extends {@link TeaModel}
 *
 * <p>CreateEnterpriseResponse</p>
 */
public class CreateEnterpriseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEnterpriseResponseBody body;

    private CreateEnterpriseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEnterpriseResponse create() {
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
    public CreateEnterpriseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEnterpriseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEnterpriseResponseBody body);

        @Override
        CreateEnterpriseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEnterpriseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEnterpriseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEnterpriseResponse response) {
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
        public Builder body(CreateEnterpriseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEnterpriseResponse build() {
            return new CreateEnterpriseResponse(this);
        } 

    } 

}
