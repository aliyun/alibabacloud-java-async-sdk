// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDingtalkGroupCustomerMemberRequest} extends {@link RequestModel}
 *
 * <p>GetEnterpriseDingtalkGroupCustomerMemberRequest</p>
 */
public class GetEnterpriseDingtalkGroupCustomerMemberRequest extends Request {
    @Body
    @NameInMap("Mobile")
    @Validation(required = true)
    private String mobile;

    @Body
    @NameInMap("OpenGroupId")
    @Validation(required = true)
    private String openGroupId;

    private GetEnterpriseDingtalkGroupCustomerMemberRequest(Builder builder) {
        super(builder);
        this.mobile = builder.mobile;
        this.openGroupId = builder.openGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnterpriseDingtalkGroupCustomerMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public static final class Builder extends Request.Builder<GetEnterpriseDingtalkGroupCustomerMemberRequest, Builder> {
        private String mobile; 
        private String openGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetEnterpriseDingtalkGroupCustomerMemberRequest response) {
            super(response);
            this.mobile = response.mobile;
            this.openGroupId = response.openGroupId;
        } 

        /**
         * Mobile.
         */
        public Builder mobile(String mobile) {
            this.putBodyParameter("Mobile", mobile);
            this.mobile = mobile;
            return this;
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
        public GetEnterpriseDingtalkGroupCustomerMemberRequest build() {
            return new GetEnterpriseDingtalkGroupCustomerMemberRequest(this);
        } 

    } 

}
