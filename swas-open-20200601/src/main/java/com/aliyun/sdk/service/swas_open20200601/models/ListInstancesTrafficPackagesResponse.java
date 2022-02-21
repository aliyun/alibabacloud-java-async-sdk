// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesTrafficPackagesResponse} extends {@link TeaModel}
 *
 * <p>ListInstancesTrafficPackagesResponse</p>
 */
public class ListInstancesTrafficPackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstancesTrafficPackagesResponseBody body;

    private ListInstancesTrafficPackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstancesTrafficPackagesResponse create() {
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
    public ListInstancesTrafficPackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstancesTrafficPackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstancesTrafficPackagesResponseBody body);

        @Override
        ListInstancesTrafficPackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstancesTrafficPackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstancesTrafficPackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstancesTrafficPackagesResponse response) {
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
        public Builder body(ListInstancesTrafficPackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstancesTrafficPackagesResponse build() {
            return new ListInstancesTrafficPackagesResponse(this);
        } 

    } 

}
