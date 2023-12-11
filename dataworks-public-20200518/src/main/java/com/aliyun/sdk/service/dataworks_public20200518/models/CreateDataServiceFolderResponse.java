// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceFolderResponse} extends {@link TeaModel}
 *
 * <p>CreateDataServiceFolderResponse</p>
 */
public class CreateDataServiceFolderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataServiceFolderResponseBody body;

    private CreateDataServiceFolderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataServiceFolderResponse create() {
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
    public CreateDataServiceFolderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataServiceFolderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataServiceFolderResponseBody body);

        @Override
        CreateDataServiceFolderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataServiceFolderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataServiceFolderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataServiceFolderResponse response) {
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
        public Builder body(CreateDataServiceFolderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataServiceFolderResponse build() {
            return new CreateDataServiceFolderResponse(this);
        } 

    } 

}
