// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImportTaskResultResponse} extends {@link TeaModel}
 *
 * <p>GetImportTaskResultResponse</p>
 */
public class GetImportTaskResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImportTaskResultResponseBody body;

    private GetImportTaskResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImportTaskResultResponse create() {
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
    public GetImportTaskResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImportTaskResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImportTaskResultResponseBody body);

        @Override
        GetImportTaskResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImportTaskResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImportTaskResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImportTaskResultResponse response) {
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
        public Builder body(GetImportTaskResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImportTaskResultResponse build() {
            return new GetImportTaskResultResponse(this);
        } 

    } 

}
