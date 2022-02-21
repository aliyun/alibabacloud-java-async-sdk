// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCasterVideoResourceResponse} extends {@link TeaModel}
 *
 * <p>AddCasterVideoResourceResponse</p>
 */
public class AddCasterVideoResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCasterVideoResourceResponseBody body;

    private AddCasterVideoResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCasterVideoResourceResponse create() {
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
    public AddCasterVideoResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCasterVideoResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCasterVideoResourceResponseBody body);

        @Override
        AddCasterVideoResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCasterVideoResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCasterVideoResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCasterVideoResourceResponse response) {
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
        public Builder body(AddCasterVideoResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCasterVideoResourceResponse build() {
            return new AddCasterVideoResourceResponse(this);
        } 

    } 

}
