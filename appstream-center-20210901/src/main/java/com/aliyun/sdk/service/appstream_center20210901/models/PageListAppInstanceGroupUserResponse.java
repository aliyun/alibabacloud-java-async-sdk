// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageListAppInstanceGroupUserResponse} extends {@link TeaModel}
 *
 * <p>PageListAppInstanceGroupUserResponse</p>
 */
public class PageListAppInstanceGroupUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PageListAppInstanceGroupUserResponseBody body;

    private PageListAppInstanceGroupUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PageListAppInstanceGroupUserResponse create() {
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
    public PageListAppInstanceGroupUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageListAppInstanceGroupUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PageListAppInstanceGroupUserResponseBody body);

        @Override
        PageListAppInstanceGroupUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageListAppInstanceGroupUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PageListAppInstanceGroupUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageListAppInstanceGroupUserResponse response) {
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
        public Builder body(PageListAppInstanceGroupUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageListAppInstanceGroupUserResponse build() {
            return new PageListAppInstanceGroupUserResponse(this);
        } 

    } 

}
