// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasesResponse} extends {@link TeaModel}
 *
 * <p>AddCasesResponse</p>
 */
public class AddCasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCasesResponseBody body;

    private AddCasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCasesResponse create() {
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
    public AddCasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCasesResponseBody body);

        @Override
        AddCasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCasesResponse response) {
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
        public Builder body(AddCasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCasesResponse build() {
            return new AddCasesResponse(this);
        } 

    } 

}
