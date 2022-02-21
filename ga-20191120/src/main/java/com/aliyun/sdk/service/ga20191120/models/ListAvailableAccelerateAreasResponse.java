// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableAccelerateAreasResponse} extends {@link TeaModel}
 *
 * <p>ListAvailableAccelerateAreasResponse</p>
 */
public class ListAvailableAccelerateAreasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAvailableAccelerateAreasResponseBody body;

    private ListAvailableAccelerateAreasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAvailableAccelerateAreasResponse create() {
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
    public ListAvailableAccelerateAreasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAvailableAccelerateAreasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAvailableAccelerateAreasResponseBody body);

        @Override
        ListAvailableAccelerateAreasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAvailableAccelerateAreasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAvailableAccelerateAreasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAvailableAccelerateAreasResponse response) {
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
        public Builder body(ListAvailableAccelerateAreasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAvailableAccelerateAreasResponse build() {
            return new ListAvailableAccelerateAreasResponse(this);
        } 

    } 

}
