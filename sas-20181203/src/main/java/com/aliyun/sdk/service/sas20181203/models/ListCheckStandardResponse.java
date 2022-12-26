// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckStandardResponse} extends {@link TeaModel}
 *
 * <p>ListCheckStandardResponse</p>
 */
public class ListCheckStandardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCheckStandardResponseBody body;

    private ListCheckStandardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCheckStandardResponse create() {
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
    public ListCheckStandardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCheckStandardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCheckStandardResponseBody body);

        @Override
        ListCheckStandardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCheckStandardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCheckStandardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCheckStandardResponse response) {
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
        public Builder body(ListCheckStandardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCheckStandardResponse build() {
            return new ListCheckStandardResponse(this);
        } 

    } 

}
