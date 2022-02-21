// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditLogicDatabaseResponse} extends {@link TeaModel}
 *
 * <p>EditLogicDatabaseResponse</p>
 */
public class EditLogicDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditLogicDatabaseResponseBody body;

    private EditLogicDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditLogicDatabaseResponse create() {
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
    public EditLogicDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditLogicDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditLogicDatabaseResponseBody body);

        @Override
        EditLogicDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditLogicDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditLogicDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditLogicDatabaseResponse response) {
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
        public Builder body(EditLogicDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditLogicDatabaseResponse build() {
            return new EditLogicDatabaseResponse(this);
        } 

    } 

}
