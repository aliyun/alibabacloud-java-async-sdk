// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllDepartmentResponse} extends {@link TeaModel}
 *
 * <p>GetAllDepartmentResponse</p>
 */
public class GetAllDepartmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAllDepartmentResponseBody body;

    private GetAllDepartmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAllDepartmentResponse create() {
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
    public GetAllDepartmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAllDepartmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAllDepartmentResponseBody body);

        @Override
        GetAllDepartmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAllDepartmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAllDepartmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAllDepartmentResponse response) {
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
        public Builder body(GetAllDepartmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAllDepartmentResponse build() {
            return new GetAllDepartmentResponse(this);
        } 

    } 

}
