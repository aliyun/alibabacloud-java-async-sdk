// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LabelPartnerUserRequest} extends {@link RequestModel}
 *
 * <p>LabelPartnerUserRequest</p>
 */
public class LabelPartnerUserRequest extends Request {
    @Body
    @NameInMap("UserPK")
    @Validation(required = true)
    private Long userPK;

    @Body
    @NameInMap("UserTag")
    @Validation(required = true)
    private String userTag;

    private LabelPartnerUserRequest(Builder builder) {
        super(builder);
        this.userPK = builder.userPK;
        this.userTag = builder.userTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LabelPartnerUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPK
     */
    public Long getUserPK() {
        return this.userPK;
    }

    /**
     * @return userTag
     */
    public String getUserTag() {
        return this.userTag;
    }

    public static final class Builder extends Request.Builder<LabelPartnerUserRequest, Builder> {
        private Long userPK; 
        private String userTag; 

        private Builder() {
            super();
        } 

        private Builder(LabelPartnerUserRequest request) {
            super(request);
            this.userPK = request.userPK;
            this.userTag = request.userTag;
        } 

        /**
         * UserPK.
         */
        public Builder userPK(Long userPK) {
            this.putBodyParameter("UserPK", userPK);
            this.userPK = userPK;
            return this;
        }

        /**
         * UserTag.
         */
        public Builder userTag(String userTag) {
            this.putBodyParameter("UserTag", userTag);
            this.userTag = userTag;
            return this;
        }

        @Override
        public LabelPartnerUserRequest build() {
            return new LabelPartnerUserRequest(this);
        } 

    } 

}
