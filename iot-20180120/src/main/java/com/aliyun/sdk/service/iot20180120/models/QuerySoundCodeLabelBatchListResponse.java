// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySoundCodeLabelBatchListResponse} extends {@link TeaModel}
 *
 * <p>QuerySoundCodeLabelBatchListResponse</p>
 */
public class QuerySoundCodeLabelBatchListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySoundCodeLabelBatchListResponseBody body;

    private QuerySoundCodeLabelBatchListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySoundCodeLabelBatchListResponse create() {
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
    public QuerySoundCodeLabelBatchListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySoundCodeLabelBatchListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySoundCodeLabelBatchListResponseBody body);

        @Override
        QuerySoundCodeLabelBatchListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySoundCodeLabelBatchListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySoundCodeLabelBatchListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySoundCodeLabelBatchListResponse response) {
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
        public Builder body(QuerySoundCodeLabelBatchListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySoundCodeLabelBatchListResponse build() {
            return new QuerySoundCodeLabelBatchListResponse(this);
        } 

    } 

}
