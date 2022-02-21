// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVolumesResponse} extends {@link TeaModel}
 *
 * <p>ListVolumesResponse</p>
 */
public class ListVolumesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVolumesResponseBody body;

    private ListVolumesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVolumesResponse create() {
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
    public ListVolumesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVolumesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVolumesResponseBody body);

        @Override
        ListVolumesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVolumesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVolumesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVolumesResponse response) {
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
        public Builder body(ListVolumesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVolumesResponse build() {
            return new ListVolumesResponse(this);
        } 

    } 

}
