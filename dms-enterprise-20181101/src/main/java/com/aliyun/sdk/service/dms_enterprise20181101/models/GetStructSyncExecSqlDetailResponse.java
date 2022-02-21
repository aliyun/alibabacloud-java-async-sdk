// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncExecSqlDetailResponse} extends {@link TeaModel}
 *
 * <p>GetStructSyncExecSqlDetailResponse</p>
 */
public class GetStructSyncExecSqlDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStructSyncExecSqlDetailResponseBody body;

    private GetStructSyncExecSqlDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStructSyncExecSqlDetailResponse create() {
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
    public GetStructSyncExecSqlDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStructSyncExecSqlDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStructSyncExecSqlDetailResponseBody body);

        @Override
        GetStructSyncExecSqlDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStructSyncExecSqlDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStructSyncExecSqlDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStructSyncExecSqlDetailResponse response) {
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
        public Builder body(GetStructSyncExecSqlDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStructSyncExecSqlDetailResponse build() {
            return new GetStructSyncExecSqlDetailResponse(this);
        } 

    } 

}
