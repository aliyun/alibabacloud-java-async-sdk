// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableLevelResponse} extends {@link TeaModel}
 *
 * <p>ListTableLevelResponse</p>
 */
public class ListTableLevelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTableLevelResponseBody body;

    private ListTableLevelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTableLevelResponse create() {
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
    public ListTableLevelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTableLevelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTableLevelResponseBody body);

        @Override
        ListTableLevelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTableLevelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTableLevelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTableLevelResponse response) {
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
        public Builder body(ListTableLevelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTableLevelResponse build() {
            return new ListTableLevelResponse(this);
        } 

    } 

}
