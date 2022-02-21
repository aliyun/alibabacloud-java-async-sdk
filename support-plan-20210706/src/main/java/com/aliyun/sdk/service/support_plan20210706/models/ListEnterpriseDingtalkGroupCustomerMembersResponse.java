// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnterpriseDingtalkGroupCustomerMembersResponse} extends {@link TeaModel}
 *
 * <p>ListEnterpriseDingtalkGroupCustomerMembersResponse</p>
 */
public class ListEnterpriseDingtalkGroupCustomerMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEnterpriseDingtalkGroupCustomerMembersResponseBody body;

    private ListEnterpriseDingtalkGroupCustomerMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEnterpriseDingtalkGroupCustomerMembersResponse create() {
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
    public ListEnterpriseDingtalkGroupCustomerMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEnterpriseDingtalkGroupCustomerMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEnterpriseDingtalkGroupCustomerMembersResponseBody body);

        @Override
        ListEnterpriseDingtalkGroupCustomerMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEnterpriseDingtalkGroupCustomerMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEnterpriseDingtalkGroupCustomerMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEnterpriseDingtalkGroupCustomerMembersResponse response) {
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
        public Builder body(ListEnterpriseDingtalkGroupCustomerMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEnterpriseDingtalkGroupCustomerMembersResponse build() {
            return new ListEnterpriseDingtalkGroupCustomerMembersResponse(this);
        } 

    } 

}
