// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link GetEnrolledAccountRequest} extends {@link RequestModel}
 *
 * <p>GetEnrolledAccountRequest</p>
 */
public class GetEnrolledAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long accountUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetEnrolledAccountRequest(Builder builder) {
        super(builder);
        this.accountUid = builder.accountUid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnrolledAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountUid
     */
    public Long getAccountUid() {
        return this.accountUid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetEnrolledAccountRequest, Builder> {
        private Long accountUid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetEnrolledAccountRequest request) {
            super(request);
            this.accountUid = request.accountUid;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The account ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19534534552****</p>
         */
        public Builder accountUid(Long accountUid) {
            this.putQueryParameter("AccountUid", accountUid);
            this.accountUid = accountUid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetEnrolledAccountRequest build() {
            return new GetEnrolledAccountRequest(this);
        } 

    } 

}
