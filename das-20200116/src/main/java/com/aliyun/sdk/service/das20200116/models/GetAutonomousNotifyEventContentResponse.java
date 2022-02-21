// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutonomousNotifyEventContentResponse} extends {@link TeaModel}
 *
 * <p>GetAutonomousNotifyEventContentResponse</p>
 */
public class GetAutonomousNotifyEventContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAutonomousNotifyEventContentResponseBody body;

    private GetAutonomousNotifyEventContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAutonomousNotifyEventContentResponse create() {
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
    public GetAutonomousNotifyEventContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAutonomousNotifyEventContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAutonomousNotifyEventContentResponseBody body);

        @Override
        GetAutonomousNotifyEventContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAutonomousNotifyEventContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAutonomousNotifyEventContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAutonomousNotifyEventContentResponse response) {
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
        public Builder body(GetAutonomousNotifyEventContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAutonomousNotifyEventContentResponse build() {
            return new GetAutonomousNotifyEventContentResponse(this);
        } 

    } 

}
