// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link RemoveMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveMemberRequest</p>
 */
public class RemoveMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memberArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private RemoveMemberRequest(Builder builder) {
        super(builder);
        this.memberArn = builder.memberArn;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberArn
     */
    public String getMemberArn() {
        return this.memberArn;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveMemberRequest, Builder> {
        private String memberArn; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveMemberRequest request) {
            super(request);
            this.memberArn = request.memberArn;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The user ARN.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:emr::w-7e0fdfd197728bfe:member/300890999414063773</p>
         */
        public Builder memberArn(String memberArn) {
            this.putQueryParameter("memberArn", memberArn);
            this.memberArn = memberArn;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RemoveMemberRequest build() {
            return new RemoveMemberRequest(this);
        } 

    } 

}
