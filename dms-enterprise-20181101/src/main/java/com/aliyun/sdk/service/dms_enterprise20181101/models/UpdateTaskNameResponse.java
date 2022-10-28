// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskNameResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskNameResponse</p>
 */
public class UpdateTaskNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskNameResponseBody body;

    private UpdateTaskNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskNameResponse create() {
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
    public UpdateTaskNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskNameResponseBody body);

        @Override
        UpdateTaskNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskNameResponse response) {
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
        public Builder body(UpdateTaskNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskNameResponse build() {
            return new UpdateTaskNameResponse(this);
        } 

    } 

}
