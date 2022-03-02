// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link ListObjectsV2Response} extends {@link TeaModel}
 *
 * <p>ListObjectsV2Response</p>
 */
public class ListObjectsV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListObjectsV2ResponseBody body;

    private ListObjectsV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListObjectsV2Response create() {
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
    public ListObjectsV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListObjectsV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListObjectsV2ResponseBody body);

        @Override
        ListObjectsV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListObjectsV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListObjectsV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListObjectsV2Response response) {
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
        public Builder body(ListObjectsV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListObjectsV2Response build() {
            return new ListObjectsV2Response(this);
        } 

    } 

}
