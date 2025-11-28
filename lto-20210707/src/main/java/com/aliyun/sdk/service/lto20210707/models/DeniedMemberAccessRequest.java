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
 * {@link DeniedMemberAccessRequest} extends {@link RequestModel}
 *
 * <p>DeniedMemberAccessRequest</p>
 */
public class DeniedMemberAccessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeniedMemberAccessRequest(Builder builder) {
        super(builder);
        this.memberAccountId = builder.memberAccountId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeniedMemberAccessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberAccountId
     */
    public String getMemberAccountId() {
        return this.memberAccountId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeniedMemberAccessRequest, Builder> {
        private String memberAccountId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeniedMemberAccessRequest request) {
            super(request);
            this.memberAccountId = request.memberAccountId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder memberAccountId(String memberAccountId) {
            this.putQueryParameter("MemberAccountId", memberAccountId);
            this.memberAccountId = memberAccountId;
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
        public DeniedMemberAccessRequest build() {
            return new DeniedMemberAccessRequest(this);
        } 

    } 

}
