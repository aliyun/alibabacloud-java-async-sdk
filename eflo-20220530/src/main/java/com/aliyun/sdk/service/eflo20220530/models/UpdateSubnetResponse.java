// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubnetResponse} extends {@link TeaModel}
 *
 * <p>UpdateSubnetResponse</p>
 */
public class UpdateSubnetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSubnetResponseBody body;

    private UpdateSubnetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSubnetResponse create() {
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
    public UpdateSubnetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSubnetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSubnetResponseBody body);

        @Override
        UpdateSubnetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSubnetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSubnetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSubnetResponse response) {
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
        public Builder body(UpdateSubnetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSubnetResponse build() {
            return new UpdateSubnetResponse(this);
        } 

    } 

}
