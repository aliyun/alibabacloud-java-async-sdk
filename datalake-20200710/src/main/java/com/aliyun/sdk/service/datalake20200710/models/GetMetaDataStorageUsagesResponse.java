// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDataStorageUsagesResponse} extends {@link TeaModel}
 *
 * <p>GetMetaDataStorageUsagesResponse</p>
 */
public class GetMetaDataStorageUsagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaDataStorageUsagesResponseBody body;

    private GetMetaDataStorageUsagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaDataStorageUsagesResponse create() {
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
    public GetMetaDataStorageUsagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaDataStorageUsagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaDataStorageUsagesResponseBody body);

        @Override
        GetMetaDataStorageUsagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaDataStorageUsagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaDataStorageUsagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaDataStorageUsagesResponse response) {
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
        public Builder body(GetMetaDataStorageUsagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaDataStorageUsagesResponse build() {
            return new GetMetaDataStorageUsagesResponse(this);
        } 

    } 

}
