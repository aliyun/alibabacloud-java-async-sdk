// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDirectionalGroupResponse} extends {@link TeaModel}
 *
 * <p>AddDirectionalGroupResponse</p>
 */
public class AddDirectionalGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddDirectionalGroupResponseBody body;

    private AddDirectionalGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddDirectionalGroupResponse create() {
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
    public AddDirectionalGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddDirectionalGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddDirectionalGroupResponseBody body);

        @Override
        AddDirectionalGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddDirectionalGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddDirectionalGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddDirectionalGroupResponse response) {
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
        public Builder body(AddDirectionalGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddDirectionalGroupResponse build() {
            return new AddDirectionalGroupResponse(this);
        } 

    } 

}
