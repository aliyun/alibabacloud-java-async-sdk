// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnterpriseDingtalkGroupCustomerMembersRequest} extends {@link RequestModel}
 *
 * <p>ListEnterpriseDingtalkGroupCustomerMembersRequest</p>
 */
public class ListEnterpriseDingtalkGroupCustomerMembersRequest extends Request {
    @Body
    @NameInMap("OpenGroupId")
    @Validation(required = true)
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

        private Builder(ListEnterpriseDingtalkGroupCustomerMembersRequest response) {
            super(response);
            this.openGroupId = response.openGroupId;
        } 

        /**
         * 企业服务群ID
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
