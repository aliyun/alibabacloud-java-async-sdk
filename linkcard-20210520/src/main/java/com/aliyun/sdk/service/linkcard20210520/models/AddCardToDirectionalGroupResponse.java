// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCardToDirectionalGroupResponse} extends {@link TeaModel}
 *
 * <p>AddCardToDirectionalGroupResponse</p>
 */
public class AddCardToDirectionalGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCardToDirectionalGroupResponseBody body;

    private AddCardToDirectionalGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCardToDirectionalGroupResponse create() {
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
    public AddCardToDirectionalGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCardToDirectionalGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCardToDirectionalGroupResponseBody body);

        @Override
        AddCardToDirectionalGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCardToDirectionalGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCardToDirectionalGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCardToDirectionalGroupResponse response) {
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
        public Builder body(AddCardToDirectionalGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCardToDirectionalGroupResponse build() {
            return new AddCardToDirectionalGroupResponse(this);
        } 

    } 

}
