// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommonAreasResponse} extends {@link TeaModel}
 *
 * <p>ListCommonAreasResponse</p>
 */
public class ListCommonAreasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCommonAreasResponseBody body;

    private ListCommonAreasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCommonAreasResponse create() {
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
    public ListCommonAreasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCommonAreasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCommonAreasResponseBody body);

        @Override
        ListCommonAreasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCommonAreasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCommonAreasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCommonAreasResponse response) {
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
        public Builder body(ListCommonAreasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCommonAreasResponse build() {
            return new ListCommonAreasResponse(this);
        } 

    } 

}
