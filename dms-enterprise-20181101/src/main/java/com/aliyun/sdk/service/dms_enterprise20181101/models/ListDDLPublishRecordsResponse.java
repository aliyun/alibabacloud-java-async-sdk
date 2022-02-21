// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDDLPublishRecordsResponse} extends {@link TeaModel}
 *
 * <p>ListDDLPublishRecordsResponse</p>
 */
public class ListDDLPublishRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDDLPublishRecordsResponseBody body;

    private ListDDLPublishRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDDLPublishRecordsResponse create() {
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
    public ListDDLPublishRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDDLPublishRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDDLPublishRecordsResponseBody body);

        @Override
        ListDDLPublishRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDDLPublishRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDDLPublishRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDDLPublishRecordsResponse response) {
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
        public Builder body(ListDDLPublishRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDDLPublishRecordsResponse build() {
            return new ListDDLPublishRecordsResponse(this);
        } 

    } 

}
