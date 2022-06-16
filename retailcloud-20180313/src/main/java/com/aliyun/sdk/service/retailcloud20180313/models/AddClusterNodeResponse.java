// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClusterNodeResponse} extends {@link TeaModel}
 *
 * <p>AddClusterNodeResponse</p>
 */
public class AddClusterNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddClusterNodeResponseBody body;

    private AddClusterNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddClusterNodeResponse create() {
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
    public AddClusterNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddClusterNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddClusterNodeResponseBody body);

        @Override
        AddClusterNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddClusterNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddClusterNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddClusterNodeResponse response) {
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
        public Builder body(AddClusterNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddClusterNodeResponse build() {
            return new AddClusterNodeResponse(this);
        } 

    } 

}
