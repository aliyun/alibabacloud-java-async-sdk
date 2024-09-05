// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnterpriseDingtalkGroupCustomerMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnterpriseDingtalkGroupCustomerMemberRequest</p>
 */
public class DeleteEnterpriseDingtalkGroupCustomerMemberRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mobiles")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > mobiles;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String openGroupId;

    private DeleteEnterpriseDingtalkGroupCustomerMemberRequest(Builder builder) {
        super(builder);
        this.mobiles = builder.mobiles;
        this.openGroupId = builder.openGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnterpriseDingtalkGroupCustomerMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mobiles
     */
    public java.util.List < String > getMobiles() {
        return this.mobiles;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteEnterpriseDingtalkGroupCustomerMemberRequest, Builder> {
        private java.util.List < String > mobiles; 
        private String openGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnterpriseDingtalkGroupCustomerMemberRequest request) {
            super(request);
            this.mobiles = request.mobiles;
            this.openGroupId = request.openGroupId;
        } 

        /**
         * Mobiles.
         */
        public Builder mobiles(java.util.List < String > mobiles) {
            String mobilesShrink = shrink(mobiles, "Mobiles", "json");
            this.putBodyParameter("Mobiles", mobilesShrink);
            this.mobiles = mobiles;
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
        public DeleteEnterpriseDingtalkGroupCustomerMemberRequest build() {
            return new DeleteEnterpriseDingtalkGroupCustomerMemberRequest(this);
        } 

    } 

}
