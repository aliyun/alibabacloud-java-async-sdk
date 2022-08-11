// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDISyncTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateDISyncTaskResponse</p>
 */
public class UpdateDISyncTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDISyncTaskResponseBody body;

    private UpdateDISyncTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDISyncTaskResponse create() {
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
    public UpdateDISyncTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDISyncTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDISyncTaskResponseBody body);

        @Override
        UpdateDISyncTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDISyncTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDISyncTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDISyncTaskResponse response) {
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
        public Builder body(UpdateDISyncTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDISyncTaskResponse build() {
            return new UpdateDISyncTaskResponse(this);
        } 

    } 

}
