// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddNodesResponse} extends {@link TeaModel}
 *
 * <p>AddNodesResponse</p>
 */
public class AddNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddNodesResponseBody body;

    private AddNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddNodesResponse create() {
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
    public AddNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddNodesResponseBody body);

        @Override
        AddNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddNodesResponse response) {
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
        public Builder body(AddNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddNodesResponse build() {
            return new AddNodesResponse(this);
        } 

    } 

}
