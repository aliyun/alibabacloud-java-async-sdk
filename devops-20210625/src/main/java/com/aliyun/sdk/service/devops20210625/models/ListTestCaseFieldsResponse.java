// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTestCaseFieldsResponse} extends {@link TeaModel}
 *
 * <p>ListTestCaseFieldsResponse</p>
 */
public class ListTestCaseFieldsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTestCaseFieldsResponseBody body;

    private ListTestCaseFieldsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTestCaseFieldsResponse create() {
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
    public ListTestCaseFieldsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTestCaseFieldsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTestCaseFieldsResponseBody body);

        @Override
        ListTestCaseFieldsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTestCaseFieldsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTestCaseFieldsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTestCaseFieldsResponse response) {
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
        public Builder body(ListTestCaseFieldsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTestCaseFieldsResponse build() {
            return new ListTestCaseFieldsResponse(this);
        } 

    } 

}
