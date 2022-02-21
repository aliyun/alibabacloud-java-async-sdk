// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBlueprintInstanceCreatorsResponse} extends {@link TeaModel}
 *
 * <p>ListBlueprintInstanceCreatorsResponse</p>
 */
public class ListBlueprintInstanceCreatorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBlueprintInstanceCreatorsResponseBody body;

    private ListBlueprintInstanceCreatorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBlueprintInstanceCreatorsResponse create() {
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
    public ListBlueprintInstanceCreatorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBlueprintInstanceCreatorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBlueprintInstanceCreatorsResponseBody body);

        @Override
        ListBlueprintInstanceCreatorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBlueprintInstanceCreatorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBlueprintInstanceCreatorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBlueprintInstanceCreatorsResponse response) {
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
        public Builder body(ListBlueprintInstanceCreatorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBlueprintInstanceCreatorsResponse build() {
            return new ListBlueprintInstanceCreatorsResponse(this);
        } 

    } 

}
