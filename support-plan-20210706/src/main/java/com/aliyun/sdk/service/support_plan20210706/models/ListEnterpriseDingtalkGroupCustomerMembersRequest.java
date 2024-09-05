// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnterpriseDingtalkGroupCustomerMembersRequest} extends {@link RequestModel}
 *
 * <p>ListEnterpriseDingtalkGroupCustomerMembersRequest</p>
 */
public class ListEnterpriseDingtalkGroupCustomerMembersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openGroupId;

    private ListEnterpriseDingtalkGroupCustomerMembersRequest(Builder builder) {
        super(builder);
        this.openGroupId = builder.openGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseDingtalkGroupCustomerMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public static final class Builder extends Request.Builder<ListEnterpriseDingtalkGroupCustomerMembersRequest, Builder> {
        private String openGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListEnterpriseDingtalkGroupCustomerMembersRequest request) {
            super(request);
            this.openGroupId = request.openGroupId;
        } 

        /**
         * OpenGroupId.
         */
        public Builder openGroupId(String openGroupId) {
            this.putBodyParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        @Override
        public ListEnterpriseDingtalkGroupCustomerMembersRequest build() {
            return new ListEnterpriseDingtalkGroupCustomerMembersRequest(this);
        } 

    } 

}
