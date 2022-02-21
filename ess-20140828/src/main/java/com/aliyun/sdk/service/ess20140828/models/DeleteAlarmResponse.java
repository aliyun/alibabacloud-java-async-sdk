// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlarmResponse} extends {@link TeaModel}
 *
 * <p>DeleteAlarmResponse</p>
 */
public class DeleteAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAlarmResponseBody body;

    private DeleteAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAlarmResponse create() {
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
    public DeleteAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAlarmResponseBody body);

        @Override
        DeleteAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAlarmResponse response) {
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
        public Builder body(DeleteAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAlarmResponse build() {
            return new DeleteAlarmResponse(this);
        } 

    } 

}
