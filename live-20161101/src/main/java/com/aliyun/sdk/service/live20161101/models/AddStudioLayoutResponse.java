// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddStudioLayoutResponse} extends {@link TeaModel}
 *
 * <p>AddStudioLayoutResponse</p>
 */
public class AddStudioLayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddStudioLayoutResponseBody body;

    private AddStudioLayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddStudioLayoutResponse create() {
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
    public AddStudioLayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddStudioLayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddStudioLayoutResponseBody body);

        @Override
        AddStudioLayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddStudioLayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddStudioLayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddStudioLayoutResponse response) {
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
        public Builder body(AddStudioLayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddStudioLayoutResponse build() {
            return new AddStudioLayoutResponse(this);
        } 

    } 

}
