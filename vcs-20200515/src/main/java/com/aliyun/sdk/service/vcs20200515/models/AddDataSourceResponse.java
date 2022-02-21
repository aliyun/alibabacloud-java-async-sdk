// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataSourceResponse} extends {@link TeaModel}
 *
 * <p>AddDataSourceResponse</p>
 */
public class AddDataSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDataSourceResponseBody body;

    private AddDataSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDataSourceResponse create() {
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
    public AddDataSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDataSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDataSourceResponseBody body);

        @Override
        AddDataSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDataSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDataSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDataSourceResponse response) {
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
        public Builder body(AddDataSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDataSourceResponse build() {
            return new AddDataSourceResponse(this);
        } 

    } 

}
