// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse} extends {@link TeaModel}
 *
 * <p>SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse</p>
 */
public class SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body;

    private SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse create() {
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
    public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body);

        @Override
        SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse response) {
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
        public Builder body(SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse build() {
            return new SaveBatchTaskForUpdatingContactInfoByRegistrantProfileIdResponse(this);
        } 

    } 

}
