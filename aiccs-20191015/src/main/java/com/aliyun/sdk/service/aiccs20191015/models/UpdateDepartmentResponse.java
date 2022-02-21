// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDepartmentResponse} extends {@link TeaModel}
 *
 * <p>UpdateDepartmentResponse</p>
 */
public class UpdateDepartmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDepartmentResponseBody body;

    private UpdateDepartmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDepartmentResponse create() {
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
    public UpdateDepartmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDepartmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDepartmentResponseBody body);

        @Override
        UpdateDepartmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDepartmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDepartmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDepartmentResponse response) {
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
        public Builder body(UpdateDepartmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDepartmentResponse build() {
            return new UpdateDepartmentResponse(this);
        } 

    } 

}
