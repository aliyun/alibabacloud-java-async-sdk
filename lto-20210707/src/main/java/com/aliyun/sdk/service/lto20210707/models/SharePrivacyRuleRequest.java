// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SharePrivacyRuleRequest} extends {@link RequestModel}
 *
 * <p>SharePrivacyRuleRequest</p>
 */
public class SharePrivacyRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberIdList")
    private String memberIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivacyRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privacyRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SharePrivacyRuleRequest(Builder builder) {
        super(builder);
        this.memberIdList = builder.memberIdList;
        this.privacyRuleId = builder.privacyRuleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SharePrivacyRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberIdList
     */
    public String getMemberIdList() {
        return this.memberIdList;
    }

    /**
     * @return privacyRuleId
     */
    public String getPrivacyRuleId() {
        return this.privacyRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SharePrivacyRuleRequest, Builder> {
        private String memberIdList; 
        private String privacyRuleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SharePrivacyRuleRequest request) {
            super(request);
            this.memberIdList = request.memberIdList;
            this.privacyRuleId = request.privacyRuleId;
            this.regionId = request.regionId;
        } 

        /**
         * MemberIdList.
         */
        public Builder memberIdList(String memberIdList) {
            this.putQueryParameter("MemberIdList", memberIdList);
            this.memberIdList = memberIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder privacyRuleId(String privacyRuleId) {
            this.putQueryParameter("PrivacyRuleId", privacyRuleId);
            this.privacyRuleId = privacyRuleId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SharePrivacyRuleRequest build() {
            return new SharePrivacyRuleRequest(this);
        } 

    } 

}
