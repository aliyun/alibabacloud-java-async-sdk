// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetZookeeperDataImportUrlResponse} extends {@link TeaModel}
 *
 * <p>GetZookeeperDataImportUrlResponse</p>
 */
public class GetZookeeperDataImportUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetZookeeperDataImportUrlResponseBody body;

    private GetZookeeperDataImportUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetZookeeperDataImportUrlResponse create() {
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
    public GetZookeeperDataImportUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetZookeeperDataImportUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetZookeeperDataImportUrlResponseBody body);

        @Override
        GetZookeeperDataImportUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetZookeeperDataImportUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetZookeeperDataImportUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetZookeeperDataImportUrlResponse response) {
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
        public Builder body(GetZookeeperDataImportUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetZookeeperDataImportUrlResponse build() {
            return new GetZookeeperDataImportUrlResponse(this);
        } 

    } 

}
