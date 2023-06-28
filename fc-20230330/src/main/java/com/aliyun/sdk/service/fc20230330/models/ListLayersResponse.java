// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayersResponse} extends {@link TeaModel}
 *
 * <p>ListLayersResponse</p>
 */
public class ListLayersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLayersOutput body;

    private ListLayersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLayersResponse create() {
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
    public ListLayersOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLayersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLayersOutput body);

        @Override
        ListLayersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLayersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLayersOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLayersResponse response) {
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
        public Builder body(ListLayersOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLayersResponse build() {
            return new ListLayersResponse(this);
        } 

    } 

}
