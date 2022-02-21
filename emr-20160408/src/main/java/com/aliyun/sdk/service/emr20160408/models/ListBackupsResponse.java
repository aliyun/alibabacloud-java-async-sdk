// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBackupsResponse} extends {@link TeaModel}
 *
 * <p>ListBackupsResponse</p>
 */
public class ListBackupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBackupsResponseBody body;

    private ListBackupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBackupsResponse create() {
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
    public ListBackupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBackupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBackupsResponseBody body);

        @Override
        ListBackupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBackupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBackupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBackupsResponse response) {
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
        public Builder body(ListBackupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBackupsResponse build() {
            return new ListBackupsResponse(this);
        } 

    } 

}
