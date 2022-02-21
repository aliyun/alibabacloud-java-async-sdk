// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataCorrectPreCheckDBResponse} extends {@link TeaModel}
 *
 * <p>ListDataCorrectPreCheckDBResponse</p>
 */
public class ListDataCorrectPreCheckDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataCorrectPreCheckDBResponseBody body;

    private ListDataCorrectPreCheckDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataCorrectPreCheckDBResponse create() {
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
    public ListDataCorrectPreCheckDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataCorrectPreCheckDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataCorrectPreCheckDBResponseBody body);

        @Override
        ListDataCorrectPreCheckDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataCorrectPreCheckDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataCorrectPreCheckDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataCorrectPreCheckDBResponse response) {
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
        public Builder body(ListDataCorrectPreCheckDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataCorrectPreCheckDBResponse build() {
            return new ListDataCorrectPreCheckDBResponse(this);
        } 

    } 

}
