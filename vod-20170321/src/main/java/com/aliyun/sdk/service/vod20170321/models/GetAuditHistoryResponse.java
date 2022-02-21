// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditHistoryResponse} extends {@link TeaModel}
 *
 * <p>GetAuditHistoryResponse</p>
 */
public class GetAuditHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAuditHistoryResponseBody body;

    private GetAuditHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAuditHistoryResponse create() {
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
    public GetAuditHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAuditHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAuditHistoryResponseBody body);

        @Override
        GetAuditHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAuditHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAuditHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAuditHistoryResponse response) {
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
        public Builder body(GetAuditHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAuditHistoryResponse build() {
            return new GetAuditHistoryResponse(this);
        } 

    } 

}
