// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBuDBInstanceRelationResponse} extends {@link TeaModel}
 *
 * <p>AddBuDBInstanceRelationResponse</p>
 */
public class AddBuDBInstanceRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddBuDBInstanceRelationResponseBody body;

    private AddBuDBInstanceRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddBuDBInstanceRelationResponse create() {
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
    public AddBuDBInstanceRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddBuDBInstanceRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddBuDBInstanceRelationResponseBody body);

        @Override
        AddBuDBInstanceRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddBuDBInstanceRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddBuDBInstanceRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddBuDBInstanceRelationResponse response) {
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
        public Builder body(AddBuDBInstanceRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddBuDBInstanceRelationResponse build() {
            return new AddBuDBInstanceRelationResponse(this);
        } 

    } 

}
