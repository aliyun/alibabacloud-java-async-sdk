// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableEcsTypesResponse} extends {@link TeaModel}
 *
 * <p>ListAvailableEcsTypesResponse</p>
 */
public class ListAvailableEcsTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAvailableEcsTypesResponseBody body;

    private ListAvailableEcsTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAvailableEcsTypesResponse create() {
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
    public ListAvailableEcsTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAvailableEcsTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAvailableEcsTypesResponseBody body);

        @Override
        ListAvailableEcsTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAvailableEcsTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAvailableEcsTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAvailableEcsTypesResponse response) {
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
        public Builder body(ListAvailableEcsTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAvailableEcsTypesResponse build() {
            return new ListAvailableEcsTypesResponse(this);
        } 

    } 

}
