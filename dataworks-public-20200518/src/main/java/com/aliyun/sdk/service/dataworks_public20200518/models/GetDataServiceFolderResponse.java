// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceFolderResponse} extends {@link TeaModel}
 *
 * <p>GetDataServiceFolderResponse</p>
 */
public class GetDataServiceFolderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDataServiceFolderResponseBody body;

    private GetDataServiceFolderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDataServiceFolderResponse create() {
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
    public GetDataServiceFolderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDataServiceFolderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDataServiceFolderResponseBody body);

        @Override
        GetDataServiceFolderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDataServiceFolderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDataServiceFolderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDataServiceFolderResponse response) {
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
        public Builder body(GetDataServiceFolderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDataServiceFolderResponse build() {
            return new GetDataServiceFolderResponse(this);
        } 

    } 

}
