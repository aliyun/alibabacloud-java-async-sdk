// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForUpdatingContactInfoResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForUpdatingContactInfoResponse</p>
 */
public class SaveSingleTaskForUpdatingContactInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveSingleTaskForUpdatingContactInfoResponseBody body;

    private SaveSingleTaskForUpdatingContactInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveSingleTaskForUpdatingContactInfoResponse create() {
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
    public SaveSingleTaskForUpdatingContactInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForUpdatingContactInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveSingleTaskForUpdatingContactInfoResponseBody body);

        @Override
        SaveSingleTaskForUpdatingContactInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForUpdatingContactInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveSingleTaskForUpdatingContactInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForUpdatingContactInfoResponse response) {
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
        public Builder body(SaveSingleTaskForUpdatingContactInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForUpdatingContactInfoResponse build() {
            return new SaveSingleTaskForUpdatingContactInfoResponse(this);
        } 

    } 

}
