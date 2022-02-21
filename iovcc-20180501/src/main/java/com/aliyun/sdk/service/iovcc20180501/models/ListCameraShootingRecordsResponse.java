// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCameraShootingRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListCameraShootingRecordsResponse</p>
 */
public class ListCameraShootingRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCameraShootingRecordsResponseBody body;

    private ListCameraShootingRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCameraShootingRecordsResponse create() {
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
    public ListCameraShootingRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCameraShootingRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCameraShootingRecordsResponseBody body);

        @Override
        ListCameraShootingRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCameraShootingRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCameraShootingRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCameraShootingRecordsResponse response) {
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
        public Builder body(ListCameraShootingRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCameraShootingRecordsResponse build() {
            return new ListCameraShootingRecordsResponse(this);
        } 

    } 

}
