// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnrolledAccountRequest} extends {@link RequestModel}
 *
 * <p>GetEnrolledAccountRequest</p>
 */
public class GetEnrolledAccountRequest extends Request {
    @Query
    @NameInMap("AccountUid")
    @Validation(required = true)
    private Long accountUid;

    @Query
    @NameInMap("RegionId")
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
         * 账号ID
         */
        public Builder accountUid(Long accountUid) {
            this.putQueryParameter("AccountUid", accountUid);
            this.accountUid = accountUid;
            return this;
        }

        /**
         * RegionId
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
