// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJobResponse} extends {@link TeaModel}
 *
 * <p>UpdateJobResponse</p>
 */
public class UpdateJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateJobResponseBody body;

    private UpdateJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateJobResponse create() {
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
    public UpdateJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateJobResponseBody body);

        @Override
        UpdateJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateJobResponse response) {
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
        public Builder body(UpdateJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateJobResponse build() {
            return new UpdateJobResponse(this);
        } 

    } 

}
