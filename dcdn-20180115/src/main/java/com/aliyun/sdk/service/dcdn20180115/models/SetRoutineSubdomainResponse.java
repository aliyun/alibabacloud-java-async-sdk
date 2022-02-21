// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRoutineSubdomainResponse} extends {@link TeaModel}
 *
 * <p>SetRoutineSubdomainResponse</p>
 */
public class SetRoutineSubdomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRoutineSubdomainResponseBody body;

    private SetRoutineSubdomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRoutineSubdomainResponse create() {
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
    public SetRoutineSubdomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRoutineSubdomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRoutineSubdomainResponseBody body);

        @Override
        SetRoutineSubdomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRoutineSubdomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRoutineSubdomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRoutineSubdomainResponse response) {
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
        public Builder body(SetRoutineSubdomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRoutineSubdomainResponse build() {
            return new SetRoutineSubdomainResponse(this);
        } 

    } 

}
