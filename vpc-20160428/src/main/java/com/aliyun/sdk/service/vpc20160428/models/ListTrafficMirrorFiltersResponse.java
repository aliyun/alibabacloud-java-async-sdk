// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMirrorFiltersResponse} extends {@link TeaModel}
 *
 * <p>ListTrafficMirrorFiltersResponse</p>
 */
public class ListTrafficMirrorFiltersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTrafficMirrorFiltersResponseBody body;

    private ListTrafficMirrorFiltersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTrafficMirrorFiltersResponse create() {
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
    public ListTrafficMirrorFiltersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrafficMirrorFiltersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTrafficMirrorFiltersResponseBody body);

        @Override
        ListTrafficMirrorFiltersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrafficMirrorFiltersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTrafficMirrorFiltersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrafficMirrorFiltersResponse response) {
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
        public Builder body(ListTrafficMirrorFiltersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrafficMirrorFiltersResponse build() {
            return new ListTrafficMirrorFiltersResponse(this);
        } 

    } 

}
