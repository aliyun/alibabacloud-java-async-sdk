// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayerVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListLayerVersionsResponse</p>
 */
public class ListLayerVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLayerVersionOutput body;

    private ListLayerVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLayerVersionsResponse create() {
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
    public ListLayerVersionOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLayerVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLayerVersionOutput body);

        @Override
        ListLayerVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLayerVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLayerVersionOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLayerVersionsResponse response) {
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
        public Builder body(ListLayerVersionOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLayerVersionsResponse build() {
            return new ListLayerVersionsResponse(this);
        } 

    } 

}
