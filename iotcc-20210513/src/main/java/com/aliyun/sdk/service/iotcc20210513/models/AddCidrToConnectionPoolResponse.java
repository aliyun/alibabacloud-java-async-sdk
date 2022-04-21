// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCidrToConnectionPoolResponse} extends {@link TeaModel}
 *
 * <p>AddCidrToConnectionPoolResponse</p>
 */
public class AddCidrToConnectionPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddCidrToConnectionPoolResponseBody body;

    private AddCidrToConnectionPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddCidrToConnectionPoolResponse create() {
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
    public AddCidrToConnectionPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddCidrToConnectionPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddCidrToConnectionPoolResponseBody body);

        @Override
        AddCidrToConnectionPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddCidrToConnectionPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddCidrToConnectionPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddCidrToConnectionPoolResponse response) {
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
        public Builder body(AddCidrToConnectionPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddCidrToConnectionPoolResponse build() {
            return new AddCidrToConnectionPoolResponse(this);
        } 

    } 

}
