// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsWithFiltersResponse} extends {@link TeaModel}
 *
 * <p>ListJobsWithFiltersResponse</p>
 */
public class ListJobsWithFiltersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJobsWithFiltersResponseBody body;

    private ListJobsWithFiltersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJobsWithFiltersResponse create() {
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
    public ListJobsWithFiltersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJobsWithFiltersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJobsWithFiltersResponseBody body);

        @Override
        ListJobsWithFiltersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJobsWithFiltersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJobsWithFiltersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJobsWithFiltersResponse response) {
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
        public Builder body(ListJobsWithFiltersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJobsWithFiltersResponse build() {
            return new ListJobsWithFiltersResponse(this);
        } 

    } 

}
