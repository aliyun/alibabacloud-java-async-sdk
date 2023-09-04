// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPlansByNoticeObjectResponse} extends {@link TeaModel}
 *
 * <p>ListEscalationPlansByNoticeObjectResponse</p>
 */
public class ListEscalationPlansByNoticeObjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEscalationPlansByNoticeObjectResponseBody body;

    private ListEscalationPlansByNoticeObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEscalationPlansByNoticeObjectResponse create() {
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
    public ListEscalationPlansByNoticeObjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEscalationPlansByNoticeObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEscalationPlansByNoticeObjectResponseBody body);

        @Override
        ListEscalationPlansByNoticeObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEscalationPlansByNoticeObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEscalationPlansByNoticeObjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEscalationPlansByNoticeObjectResponse response) {
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
        public Builder body(ListEscalationPlansByNoticeObjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEscalationPlansByNoticeObjectResponse build() {
            return new ListEscalationPlansByNoticeObjectResponse(this);
        } 

    } 

}
