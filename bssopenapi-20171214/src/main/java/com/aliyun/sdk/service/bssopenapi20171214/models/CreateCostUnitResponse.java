// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCostUnitResponse} extends {@link TeaModel}
 *
 * <p>CreateCostUnitResponse</p>
 */
public class CreateCostUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCostUnitResponseBody body;

    private CreateCostUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCostUnitResponse create() {
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
    public CreateCostUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCostUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCostUnitResponseBody body);

        @Override
        CreateCostUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCostUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCostUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCostUnitResponse response) {
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
        public Builder body(CreateCostUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCostUnitResponse build() {
            return new CreateCostUnitResponse(this);
        } 

    } 

}
