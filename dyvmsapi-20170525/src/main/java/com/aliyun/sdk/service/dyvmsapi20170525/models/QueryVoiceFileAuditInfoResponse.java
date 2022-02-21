// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVoiceFileAuditInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryVoiceFileAuditInfoResponse</p>
 */
public class QueryVoiceFileAuditInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryVoiceFileAuditInfoResponseBody body;

    private QueryVoiceFileAuditInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryVoiceFileAuditInfoResponse create() {
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
    public QueryVoiceFileAuditInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryVoiceFileAuditInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryVoiceFileAuditInfoResponseBody body);

        @Override
        QueryVoiceFileAuditInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryVoiceFileAuditInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryVoiceFileAuditInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryVoiceFileAuditInfoResponse response) {
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
        public Builder body(QueryVoiceFileAuditInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryVoiceFileAuditInfoResponse build() {
            return new QueryVoiceFileAuditInfoResponse(this);
        } 

    } 

}
