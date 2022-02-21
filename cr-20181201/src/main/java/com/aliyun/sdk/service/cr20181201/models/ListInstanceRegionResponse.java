// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRegionResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceRegionResponse</p>
 */
public class ListInstanceRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceRegionResponseBody body;

    private ListInstanceRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceRegionResponse create() {
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
    public ListInstanceRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceRegionResponseBody body);

        @Override
        ListInstanceRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceRegionResponse response) {
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
        public Builder body(ListInstanceRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceRegionResponse build() {
            return new ListInstanceRegionResponse(this);
        } 

    } 

}
