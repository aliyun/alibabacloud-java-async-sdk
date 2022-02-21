// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoBuildRecordResponse} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordResponse</p>
 */
public class ListRepoBuildRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepoBuildRecordResponseBody body;

    private ListRepoBuildRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepoBuildRecordResponse create() {
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
    public ListRepoBuildRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepoBuildRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepoBuildRecordResponseBody body);

        @Override
        ListRepoBuildRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepoBuildRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepoBuildRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepoBuildRecordResponse response) {
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
        public Builder body(ListRepoBuildRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepoBuildRecordResponse build() {
            return new ListRepoBuildRecordResponse(this);
        } 

    } 

}
