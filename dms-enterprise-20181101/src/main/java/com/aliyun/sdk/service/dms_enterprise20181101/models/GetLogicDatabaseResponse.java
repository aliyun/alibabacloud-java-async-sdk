// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLogicDatabaseResponse} extends {@link TeaModel}
 *
 * <p>GetLogicDatabaseResponse</p>
 */
public class GetLogicDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLogicDatabaseResponseBody body;

    private GetLogicDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLogicDatabaseResponse create() {
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
    public GetLogicDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLogicDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLogicDatabaseResponseBody body);

        @Override
        GetLogicDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLogicDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLogicDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLogicDatabaseResponse response) {
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
        public Builder body(GetLogicDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLogicDatabaseResponse build() {
            return new GetLogicDatabaseResponse(this);
        } 

    } 

}
