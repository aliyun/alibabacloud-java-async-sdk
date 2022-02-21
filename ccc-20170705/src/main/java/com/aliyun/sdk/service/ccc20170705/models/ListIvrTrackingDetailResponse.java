// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIvrTrackingDetailResponse} extends {@link TeaModel}
 *
 * <p>ListIvrTrackingDetailResponse</p>
 */
public class ListIvrTrackingDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIvrTrackingDetailResponseBody body;

    private ListIvrTrackingDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIvrTrackingDetailResponse create() {
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
    public ListIvrTrackingDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIvrTrackingDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIvrTrackingDetailResponseBody body);

        @Override
        ListIvrTrackingDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIvrTrackingDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIvrTrackingDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIvrTrackingDetailResponse response) {
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
        public Builder body(ListIvrTrackingDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIvrTrackingDetailResponse build() {
            return new ListIvrTrackingDetailResponse(this);
        } 

    } 

}
