// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosisOperateRecordsResponse} extends {@link TeaModel}
 *
 * <p>CreateDiagnosisOperateRecordsResponse</p>
 */
public class CreateDiagnosisOperateRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiagnosisOperateRecordsResponseBody body;

    private CreateDiagnosisOperateRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiagnosisOperateRecordsResponse create() {
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
    public CreateDiagnosisOperateRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiagnosisOperateRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiagnosisOperateRecordsResponseBody body);

        @Override
        CreateDiagnosisOperateRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiagnosisOperateRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiagnosisOperateRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiagnosisOperateRecordsResponse response) {
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
        public Builder body(CreateDiagnosisOperateRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiagnosisOperateRecordsResponse build() {
            return new CreateDiagnosisOperateRecordsResponse(this);
        } 

    } 

}
