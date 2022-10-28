// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskOutputResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskOutputResponse</p>
 */
public class UpdateTaskOutputResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskOutputResponseBody body;

    private UpdateTaskOutputResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskOutputResponse create() {
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
    public UpdateTaskOutputResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskOutputResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskOutputResponseBody body);

        @Override
        UpdateTaskOutputResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskOutputResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskOutputResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskOutputResponse response) {
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
        public Builder body(UpdateTaskOutputResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskOutputResponse build() {
            return new UpdateTaskOutputResponse(this);
        } 

    } 

}
