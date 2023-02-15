// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExportZookeeperDataResponse} extends {@link TeaModel}
 *
 * <p>ListExportZookeeperDataResponse</p>
 */
public class ListExportZookeeperDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListExportZookeeperDataResponseBody body;

    private ListExportZookeeperDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListExportZookeeperDataResponse create() {
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
    public ListExportZookeeperDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListExportZookeeperDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListExportZookeeperDataResponseBody body);

        @Override
        ListExportZookeeperDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListExportZookeeperDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListExportZookeeperDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListExportZookeeperDataResponse response) {
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
        public Builder body(ListExportZookeeperDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListExportZookeeperDataResponse build() {
            return new ListExportZookeeperDataResponse(this);
        } 

    } 

}
