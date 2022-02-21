// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskDetailResponse} extends {@link TeaModel}
 *
 * <p>UpdateTaskDetailResponse</p>
 */
public class UpdateTaskDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTaskDetailResponseBody body;

    private UpdateTaskDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTaskDetailResponse create() {
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
    public UpdateTaskDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTaskDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTaskDetailResponseBody body);

        @Override
        UpdateTaskDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTaskDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTaskDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTaskDetailResponse response) {
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
        public Builder body(UpdateTaskDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTaskDetailResponse build() {
            return new UpdateTaskDetailResponse(this);
        } 

    } 

}
