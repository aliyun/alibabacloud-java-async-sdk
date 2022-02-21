// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEniQosGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteEniQosGroupResponse</p>
 */
public class DeleteEniQosGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEniQosGroupResponseBody body;

    private DeleteEniQosGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEniQosGroupResponse create() {
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
    public DeleteEniQosGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEniQosGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEniQosGroupResponseBody body);

        @Override
        DeleteEniQosGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEniQosGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEniQosGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEniQosGroupResponse response) {
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
        public Builder body(DeleteEniQosGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEniQosGroupResponse build() {
            return new DeleteEniQosGroupResponse(this);
        } 

    } 

}
