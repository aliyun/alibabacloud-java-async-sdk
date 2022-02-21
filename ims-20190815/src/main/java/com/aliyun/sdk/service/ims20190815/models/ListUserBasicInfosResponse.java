// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserBasicInfosResponse} extends {@link TeaModel}
 *
 * <p>ListUserBasicInfosResponse</p>
 */
public class ListUserBasicInfosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserBasicInfosResponseBody body;

    private ListUserBasicInfosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserBasicInfosResponse create() {
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
    public ListUserBasicInfosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserBasicInfosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserBasicInfosResponseBody body);

        @Override
        ListUserBasicInfosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserBasicInfosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserBasicInfosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserBasicInfosResponse response) {
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
        public Builder body(ListUserBasicInfosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserBasicInfosResponse build() {
            return new ListUserBasicInfosResponse(this);
        } 

    } 

}
