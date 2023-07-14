// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusInstanceByTagAndResourceGroupIdResponse} extends {@link TeaModel}
 *
 * <p>ListPrometheusInstanceByTagAndResourceGroupIdResponse</p>
 */
public class ListPrometheusInstanceByTagAndResourceGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrometheusInstanceByTagAndResourceGroupIdResponseBody body;

    private ListPrometheusInstanceByTagAndResourceGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrometheusInstanceByTagAndResourceGroupIdResponse create() {
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
    public ListPrometheusInstanceByTagAndResourceGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrometheusInstanceByTagAndResourceGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrometheusInstanceByTagAndResourceGroupIdResponseBody body);

        @Override
        ListPrometheusInstanceByTagAndResourceGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrometheusInstanceByTagAndResourceGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrometheusInstanceByTagAndResourceGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrometheusInstanceByTagAndResourceGroupIdResponse response) {
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
        public Builder body(ListPrometheusInstanceByTagAndResourceGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrometheusInstanceByTagAndResourceGroupIdResponse build() {
            return new ListPrometheusInstanceByTagAndResourceGroupIdResponse(this);
        } 

    } 

}
