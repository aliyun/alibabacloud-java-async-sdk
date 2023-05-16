// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnsSaleConditionControlResponse} extends {@link TeaModel}
 *
 * <p>DeleteEnsSaleConditionControlResponse</p>
 */
public class DeleteEnsSaleConditionControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEnsSaleConditionControlResponseBody body;

    private DeleteEnsSaleConditionControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEnsSaleConditionControlResponse create() {
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
    public DeleteEnsSaleConditionControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEnsSaleConditionControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEnsSaleConditionControlResponseBody body);

        @Override
        DeleteEnsSaleConditionControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEnsSaleConditionControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEnsSaleConditionControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEnsSaleConditionControlResponse response) {
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
        public Builder body(DeleteEnsSaleConditionControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEnsSaleConditionControlResponse build() {
            return new DeleteEnsSaleConditionControlResponse(this);
        } 

    } 

}
