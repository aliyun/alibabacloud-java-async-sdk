// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskConfigResponse</p>
 */
public class UpdateTaskConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskConfigResponseBody body;

    private UpdateTaskConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskConfigResponse create() {
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
    public UpdateTaskConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskConfigResponseBody body);

        @Override
        UpdateTaskConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskConfigResponse response) {
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
        public Builder body(UpdateTaskConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskConfigResponse build() {
            return new UpdateTaskConfigResponse(this);
        } 

    } 

}
