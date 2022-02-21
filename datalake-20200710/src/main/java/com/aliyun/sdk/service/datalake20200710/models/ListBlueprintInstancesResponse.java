// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBlueprintInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListBlueprintInstancesResponse</p>
 */
public class ListBlueprintInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBlueprintInstancesResponseBody body;

    private ListBlueprintInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBlueprintInstancesResponse create() {
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
    public ListBlueprintInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBlueprintInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBlueprintInstancesResponseBody body);

        @Override
        ListBlueprintInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBlueprintInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBlueprintInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBlueprintInstancesResponse response) {
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
        public Builder body(ListBlueprintInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBlueprintInstancesResponse build() {
            return new ListBlueprintInstancesResponse(this);
        } 

    } 

}
