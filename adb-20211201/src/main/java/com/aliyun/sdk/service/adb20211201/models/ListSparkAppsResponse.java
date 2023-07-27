// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkAppsResponse} extends {@link TeaModel}
 *
 * <p>ListSparkAppsResponse</p>
 */
public class ListSparkAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSparkAppsResponseBody body;

    private ListSparkAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSparkAppsResponse create() {
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
    public ListSparkAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSparkAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSparkAppsResponseBody body);

        @Override
        ListSparkAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSparkAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSparkAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSparkAppsResponse response) {
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
        public Builder body(ListSparkAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSparkAppsResponse build() {
            return new ListSparkAppsResponse(this);
        } 

    } 

}
