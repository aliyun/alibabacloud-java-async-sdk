// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableChangeLogResponse} extends {@link TeaModel}
 *
 * <p>GetMetaTableChangeLogResponse</p>
 */
public class GetMetaTableChangeLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaTableChangeLogResponseBody body;

    private GetMetaTableChangeLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaTableChangeLogResponse create() {
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
    public GetMetaTableChangeLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaTableChangeLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaTableChangeLogResponseBody body);

        @Override
        GetMetaTableChangeLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaTableChangeLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaTableChangeLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaTableChangeLogResponse response) {
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
        public Builder body(GetMetaTableChangeLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaTableChangeLogResponse build() {
            return new GetMetaTableChangeLogResponse(this);
        } 

    } 

}
