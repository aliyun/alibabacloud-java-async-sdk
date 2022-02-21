// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficMarkingPolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteTrafficMarkingPolicyResponse</p>
 */
public class DeleteTrafficMarkingPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTrafficMarkingPolicyResponseBody body;

    private DeleteTrafficMarkingPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTrafficMarkingPolicyResponse create() {
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
    public DeleteTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTrafficMarkingPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTrafficMarkingPolicyResponseBody body);

        @Override
        DeleteTrafficMarkingPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTrafficMarkingPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTrafficMarkingPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTrafficMarkingPolicyResponse response) {
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
        public Builder body(DeleteTrafficMarkingPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTrafficMarkingPolicyResponse build() {
            return new DeleteTrafficMarkingPolicyResponse(this);
        } 

    } 

}
