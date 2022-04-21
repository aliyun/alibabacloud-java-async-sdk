// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceEntriesResponse} extends {@link TeaModel}
 *
 * <p>ListServiceEntriesResponse</p>
 */
public class ListServiceEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceEntriesResponseBody body;

    private ListServiceEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceEntriesResponse create() {
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
    public ListServiceEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceEntriesResponseBody body);

        @Override
        ListServiceEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceEntriesResponse response) {
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
        public Builder body(ListServiceEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceEntriesResponse build() {
            return new ListServiceEntriesResponse(this);
        } 

    } 

}
