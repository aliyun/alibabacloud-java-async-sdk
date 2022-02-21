// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskResponse} extends {@link TeaModel}
 *
 * <p>GetTaskResponse</p>
 */
public class GetTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private GetTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static GetTaskResponse create() {
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

    public interface Builder extends Response.Builder<GetTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        GetTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTaskResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public GetTaskResponse build() {
            return new GetTaskResponse(this);
        } 

    } 

}
