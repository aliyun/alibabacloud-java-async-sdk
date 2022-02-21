// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListDepartmentResponse} extends {@link TeaModel}
 *
 * <p>GetListDepartmentResponse</p>
 */
public class GetListDepartmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetListDepartmentResponseBody body;

    private GetListDepartmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetListDepartmentResponse create() {
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
    public GetListDepartmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetListDepartmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetListDepartmentResponseBody body);

        @Override
        GetListDepartmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetListDepartmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetListDepartmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetListDepartmentResponse response) {
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
        public Builder body(GetListDepartmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetListDepartmentResponse build() {
            return new GetListDepartmentResponse(this);
        } 

    } 

}
