// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLocalDiskComponentInfoResponse} extends {@link TeaModel}
 *
 * <p>ListLocalDiskComponentInfoResponse</p>
 */
public class ListLocalDiskComponentInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLocalDiskComponentInfoResponseBody body;

    private ListLocalDiskComponentInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLocalDiskComponentInfoResponse create() {
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
    public ListLocalDiskComponentInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLocalDiskComponentInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLocalDiskComponentInfoResponseBody body);

        @Override
        ListLocalDiskComponentInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLocalDiskComponentInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLocalDiskComponentInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLocalDiskComponentInfoResponse response) {
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
        public Builder body(ListLocalDiskComponentInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLocalDiskComponentInfoResponse build() {
            return new ListLocalDiskComponentInfoResponse(this);
        } 

    } 

}
