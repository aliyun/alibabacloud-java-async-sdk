// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddExistedNodesResponse} extends {@link TeaModel}
 *
 * <p>AddExistedNodesResponse</p>
 */
public class AddExistedNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddExistedNodesResponseBody body;

    private AddExistedNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddExistedNodesResponse create() {
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
    public AddExistedNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddExistedNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddExistedNodesResponseBody body);

        @Override
        AddExistedNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddExistedNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddExistedNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddExistedNodesResponse response) {
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
        public Builder body(AddExistedNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddExistedNodesResponse build() {
            return new AddExistedNodesResponse(this);
        } 

    } 

}
