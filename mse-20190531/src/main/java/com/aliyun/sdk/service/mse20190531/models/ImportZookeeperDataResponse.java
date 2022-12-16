// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportZookeeperDataResponse} extends {@link TeaModel}
 *
 * <p>ImportZookeeperDataResponse</p>
 */
public class ImportZookeeperDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportZookeeperDataResponseBody body;

    private ImportZookeeperDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportZookeeperDataResponse create() {
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
    public ImportZookeeperDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportZookeeperDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportZookeeperDataResponseBody body);

        @Override
        ImportZookeeperDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportZookeeperDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportZookeeperDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportZookeeperDataResponse response) {
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
        public Builder body(ImportZookeeperDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportZookeeperDataResponse build() {
            return new ImportZookeeperDataResponse(this);
        } 

    } 

}
