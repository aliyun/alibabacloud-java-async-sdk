// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileSystemWithMountTargetsResponse} extends {@link TeaModel}
 *
 * <p>ListFileSystemWithMountTargetsResponse</p>
 */
public class ListFileSystemWithMountTargetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFileSystemWithMountTargetsResponseBody body;

    private ListFileSystemWithMountTargetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFileSystemWithMountTargetsResponse create() {
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
    public ListFileSystemWithMountTargetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFileSystemWithMountTargetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFileSystemWithMountTargetsResponseBody body);

        @Override
        ListFileSystemWithMountTargetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFileSystemWithMountTargetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFileSystemWithMountTargetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFileSystemWithMountTargetsResponse response) {
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
        public Builder body(ListFileSystemWithMountTargetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFileSystemWithMountTargetsResponse build() {
            return new ListFileSystemWithMountTargetsResponse(this);
        } 

    } 

}
