// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShiftPersonnelsResponse} extends {@link TeaModel}
 *
 * <p>ListShiftPersonnelsResponse</p>
 */
public class ListShiftPersonnelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListShiftPersonnelsResponseBody body;

    private ListShiftPersonnelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListShiftPersonnelsResponse create() {
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
    public ListShiftPersonnelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListShiftPersonnelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListShiftPersonnelsResponseBody body);

        @Override
        ListShiftPersonnelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListShiftPersonnelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListShiftPersonnelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListShiftPersonnelsResponse response) {
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
        public Builder body(ListShiftPersonnelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListShiftPersonnelsResponse build() {
            return new ListShiftPersonnelsResponse(this);
        } 

    } 

}
