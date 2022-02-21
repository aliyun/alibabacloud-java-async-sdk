// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForUpdateProhibitionLockResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForUpdateProhibitionLockResponse</p>
 */
public class SaveSingleTaskForUpdateProhibitionLockResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSingleTaskForUpdateProhibitionLockResponseBody body;

    private SaveSingleTaskForUpdateProhibitionLockResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSingleTaskForUpdateProhibitionLockResponse create() {
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
    public SaveSingleTaskForUpdateProhibitionLockResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForUpdateProhibitionLockResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSingleTaskForUpdateProhibitionLockResponseBody body);

        @Override
        SaveSingleTaskForUpdateProhibitionLockResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForUpdateProhibitionLockResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSingleTaskForUpdateProhibitionLockResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForUpdateProhibitionLockResponse response) {
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
        public Builder body(SaveSingleTaskForUpdateProhibitionLockResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForUpdateProhibitionLockResponse build() {
            return new SaveSingleTaskForUpdateProhibitionLockResponse(this);
        } 

    } 

}
