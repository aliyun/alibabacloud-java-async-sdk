// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmContactGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListAlarmContactGroupsResponse</p>
 */
public class ListAlarmContactGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlarmContactGroupsResponseBody body;

    private ListAlarmContactGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlarmContactGroupsResponse create() {
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
    public ListAlarmContactGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlarmContactGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlarmContactGroupsResponseBody body);

        @Override
        ListAlarmContactGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlarmContactGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlarmContactGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlarmContactGroupsResponse response) {
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
        public Builder body(ListAlarmContactGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlarmContactGroupsResponse build() {
            return new ListAlarmContactGroupsResponse(this);
        } 

    } 

}
