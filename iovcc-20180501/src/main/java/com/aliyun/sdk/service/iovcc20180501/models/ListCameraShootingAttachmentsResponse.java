// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCameraShootingAttachmentsResponse} extends {@link TeaModel}
 *
 * <p>ListCameraShootingAttachmentsResponse</p>
 */
public class ListCameraShootingAttachmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCameraShootingAttachmentsResponseBody body;

    private ListCameraShootingAttachmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCameraShootingAttachmentsResponse create() {
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
    public ListCameraShootingAttachmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCameraShootingAttachmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCameraShootingAttachmentsResponseBody body);

        @Override
        ListCameraShootingAttachmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCameraShootingAttachmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCameraShootingAttachmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCameraShootingAttachmentsResponse response) {
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
        public Builder body(ListCameraShootingAttachmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCameraShootingAttachmentsResponse build() {
            return new ListCameraShootingAttachmentsResponse(this);
        } 

    } 

}
