// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskTimeVariablesResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskTimeVariablesResponse</p>
 */
public class UpdateTaskTimeVariablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskTimeVariablesResponseBody body;

    private UpdateTaskTimeVariablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskTimeVariablesResponse create() {
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
    public UpdateTaskTimeVariablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskTimeVariablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskTimeVariablesResponseBody body);

        @Override
        UpdateTaskTimeVariablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskTimeVariablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskTimeVariablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskTimeVariablesResponse response) {
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
        public Builder body(UpdateTaskTimeVariablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskTimeVariablesResponse build() {
            return new UpdateTaskTimeVariablesResponse(this);
        } 

    } 

}
