// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertContactResponse} extends {@link TeaModel}
 *
 * <p>CreateAlertContactResponse</p>
 */
public class CreateAlertContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAlertContactResponseBody body;

    private CreateAlertContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAlertContactResponse create() {
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
    public CreateAlertContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAlertContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAlertContactResponseBody body);

        @Override
        CreateAlertContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAlertContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAlertContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAlertContactResponse response) {
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
        public Builder body(CreateAlertContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAlertContactResponse build() {
            return new CreateAlertContactResponse(this);
        } 

    } 

}
