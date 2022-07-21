// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySoundCodeLabelListResponse} extends {@link TeaModel}
 *
 * <p>QuerySoundCodeLabelListResponse</p>
 */
public class QuerySoundCodeLabelListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySoundCodeLabelListResponseBody body;

    private QuerySoundCodeLabelListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySoundCodeLabelListResponse create() {
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
    public QuerySoundCodeLabelListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySoundCodeLabelListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySoundCodeLabelListResponseBody body);

        @Override
        QuerySoundCodeLabelListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySoundCodeLabelListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySoundCodeLabelListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySoundCodeLabelListResponse response) {
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
        public Builder body(QuerySoundCodeLabelListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySoundCodeLabelListResponse build() {
            return new QuerySoundCodeLabelListResponse(this);
        } 

    } 

}
