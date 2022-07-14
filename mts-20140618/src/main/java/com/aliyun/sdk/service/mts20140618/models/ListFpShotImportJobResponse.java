// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotImportJobResponse} extends {@link TeaModel}
 *
 * <p>ListFpShotImportJobResponse</p>
 */
public class ListFpShotImportJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFpShotImportJobResponseBody body;

    private ListFpShotImportJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFpShotImportJobResponse create() {
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
    public ListFpShotImportJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFpShotImportJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFpShotImportJobResponseBody body);

        @Override
        ListFpShotImportJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFpShotImportJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFpShotImportJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFpShotImportJobResponse response) {
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
        public Builder body(ListFpShotImportJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFpShotImportJobResponse build() {
            return new ListFpShotImportJobResponse(this);
        } 

    } 

}
