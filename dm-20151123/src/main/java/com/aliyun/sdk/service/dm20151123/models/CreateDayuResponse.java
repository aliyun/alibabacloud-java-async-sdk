// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDayuResponse} extends {@link TeaModel}
 *
 * <p>CreateDayuResponse</p>
 */
public class CreateDayuResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDayuResponseBody body;

    private CreateDayuResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDayuResponse create() {
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
    public CreateDayuResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDayuResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDayuResponseBody body);

        @Override
        CreateDayuResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDayuResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDayuResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDayuResponse response) {
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
        public Builder body(CreateDayuResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDayuResponse build() {
            return new CreateDayuResponse(this);
        } 

    } 

}
