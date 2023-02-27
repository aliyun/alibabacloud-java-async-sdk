// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIvrTrackingDetailsResponse} extends {@link TeaModel}
 *
 * <p>ListIvrTrackingDetailsResponse</p>
 */
public class ListIvrTrackingDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIvrTrackingDetailsResponseBody body;

    private ListIvrTrackingDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIvrTrackingDetailsResponse create() {
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
    public ListIvrTrackingDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIvrTrackingDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIvrTrackingDetailsResponseBody body);

        @Override
        ListIvrTrackingDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIvrTrackingDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIvrTrackingDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIvrTrackingDetailsResponse response) {
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
        public Builder body(ListIvrTrackingDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIvrTrackingDetailsResponse build() {
            return new ListIvrTrackingDetailsResponse(this);
        } 

    } 

}
