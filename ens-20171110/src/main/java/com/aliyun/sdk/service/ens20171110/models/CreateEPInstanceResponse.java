// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEPInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateEPInstanceResponse</p>
 */
public class CreateEPInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEPInstanceResponseBody body;

    private CreateEPInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEPInstanceResponse create() {
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
    public CreateEPInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEPInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEPInstanceResponseBody body);

        @Override
        CreateEPInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEPInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEPInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEPInstanceResponse response) {
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
        public Builder body(CreateEPInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEPInstanceResponse build() {
            return new CreateEPInstanceResponse(this);
        } 

    } 

}
