// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListContainerAppsResponse} extends {@link TeaModel}
 *
 * <p>ListContainerAppsResponse</p>
 */
public class ListContainerAppsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListContainerAppsResponseBody body;

    private ListContainerAppsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListContainerAppsResponse create() {
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
    public ListContainerAppsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListContainerAppsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListContainerAppsResponseBody body);

        @Override
        ListContainerAppsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListContainerAppsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListContainerAppsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListContainerAppsResponse response) {
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
        public Builder body(ListContainerAppsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListContainerAppsResponse build() {
            return new ListContainerAppsResponse(this);
        } 

    } 

}
