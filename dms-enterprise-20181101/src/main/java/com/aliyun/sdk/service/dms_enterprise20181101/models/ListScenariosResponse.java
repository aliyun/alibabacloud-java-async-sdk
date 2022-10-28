// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScenariosResponse} extends {@link TeaModel}
 *
 * <p>ListScenariosResponse</p>
 */
public class ListScenariosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScenariosResponseBody body;

    private ListScenariosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScenariosResponse create() {
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
    public ListScenariosResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScenariosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScenariosResponseBody body);

        @Override
        ListScenariosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScenariosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScenariosResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScenariosResponse response) {
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
        public Builder body(ListScenariosResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScenariosResponse build() {
            return new ListScenariosResponse(this);
        } 

    } 

}
