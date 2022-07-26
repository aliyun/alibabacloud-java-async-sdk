// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DepartmentSaveResponse} extends {@link TeaModel}
 *
 * <p>DepartmentSaveResponse</p>
 */
public class DepartmentSaveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DepartmentSaveResponseBody body;

    private DepartmentSaveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DepartmentSaveResponse create() {
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
    public DepartmentSaveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DepartmentSaveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DepartmentSaveResponseBody body);

        @Override
        DepartmentSaveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DepartmentSaveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DepartmentSaveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DepartmentSaveResponse response) {
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
        public Builder body(DepartmentSaveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DepartmentSaveResponse build() {
            return new DepartmentSaveResponse(this);
        } 

    } 

}
