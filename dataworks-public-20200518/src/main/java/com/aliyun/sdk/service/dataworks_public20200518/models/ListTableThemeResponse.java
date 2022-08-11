// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableThemeResponse} extends {@link TeaModel}
 *
 * <p>ListTableThemeResponse</p>
 */
public class ListTableThemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTableThemeResponseBody body;

    private ListTableThemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTableThemeResponse create() {
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
    public ListTableThemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTableThemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTableThemeResponseBody body);

        @Override
        ListTableThemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTableThemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTableThemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTableThemeResponse response) {
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
        public Builder body(ListTableThemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTableThemeResponse build() {
            return new ListTableThemeResponse(this);
        } 

    } 

}
