// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBaselineConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListBaselineConfigsResponse</p>
 */
public class ListBaselineConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBaselineConfigsResponseBody body;

    private ListBaselineConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBaselineConfigsResponse create() {
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
    public ListBaselineConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBaselineConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBaselineConfigsResponseBody body);

        @Override
        ListBaselineConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBaselineConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBaselineConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBaselineConfigsResponse response) {
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
        public Builder body(ListBaselineConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBaselineConfigsResponse build() {
            return new ListBaselineConfigsResponse(this);
        } 

    } 

}
