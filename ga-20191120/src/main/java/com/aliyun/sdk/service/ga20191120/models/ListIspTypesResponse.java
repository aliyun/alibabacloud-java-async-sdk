// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIspTypesResponse} extends {@link TeaModel}
 *
 * <p>ListIspTypesResponse</p>
 */
public class ListIspTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIspTypesResponseBody body;

    private ListIspTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIspTypesResponse create() {
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
    public ListIspTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIspTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIspTypesResponseBody body);

        @Override
        ListIspTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIspTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIspTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIspTypesResponse response) {
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
        public Builder body(ListIspTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIspTypesResponse build() {
            return new ListIspTypesResponse(this);
        } 

    } 

}
