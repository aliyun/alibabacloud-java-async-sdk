// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineJobHistorysResponse} extends {@link TeaModel}
 *
 * <p>ListPipelineJobHistorysResponse</p>
 */
public class ListPipelineJobHistorysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPipelineJobHistorysResponseBody body;

    private ListPipelineJobHistorysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPipelineJobHistorysResponse create() {
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
    public ListPipelineJobHistorysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPipelineJobHistorysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPipelineJobHistorysResponseBody body);

        @Override
        ListPipelineJobHistorysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPipelineJobHistorysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPipelineJobHistorysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPipelineJobHistorysResponse response) {
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
        public Builder body(ListPipelineJobHistorysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineJobHistorysResponse build() {
            return new ListPipelineJobHistorysResponse(this);
        } 

    } 

}
