// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusinessSpacesResponse} extends {@link TeaModel}
 *
 * <p>ListBusinessSpacesResponse</p>
 */
public class ListBusinessSpacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBusinessSpacesResponseBody body;

    private ListBusinessSpacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBusinessSpacesResponse create() {
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
    public ListBusinessSpacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBusinessSpacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBusinessSpacesResponseBody body);

        @Override
        ListBusinessSpacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBusinessSpacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBusinessSpacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBusinessSpacesResponse response) {
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
        public Builder body(ListBusinessSpacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBusinessSpacesResponse build() {
            return new ListBusinessSpacesResponse(this);
        } 

    } 

}
