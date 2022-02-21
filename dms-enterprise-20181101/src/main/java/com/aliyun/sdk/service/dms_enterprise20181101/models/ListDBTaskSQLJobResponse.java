// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDBTaskSQLJobResponse} extends {@link TeaModel}
 *
 * <p>ListDBTaskSQLJobResponse</p>
 */
public class ListDBTaskSQLJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDBTaskSQLJobResponseBody body;

    private ListDBTaskSQLJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDBTaskSQLJobResponse create() {
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
    public ListDBTaskSQLJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDBTaskSQLJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDBTaskSQLJobResponseBody body);

        @Override
        ListDBTaskSQLJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDBTaskSQLJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDBTaskSQLJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDBTaskSQLJobResponse response) {
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
        public Builder body(ListDBTaskSQLJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDBTaskSQLJobResponse build() {
            return new ListDBTaskSQLJobResponse(this);
        } 

    } 

}
