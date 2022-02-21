// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmrMainVersionResponse} extends {@link TeaModel}
 *
 * <p>ListEmrMainVersionResponse</p>
 */
public class ListEmrMainVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEmrMainVersionResponseBody body;

    private ListEmrMainVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEmrMainVersionResponse create() {
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
    public ListEmrMainVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEmrMainVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEmrMainVersionResponseBody body);

        @Override
        ListEmrMainVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEmrMainVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEmrMainVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEmrMainVersionResponse response) {
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
        public Builder body(ListEmrMainVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEmrMainVersionResponse build() {
            return new ListEmrMainVersionResponse(this);
        } 

    } 

}
