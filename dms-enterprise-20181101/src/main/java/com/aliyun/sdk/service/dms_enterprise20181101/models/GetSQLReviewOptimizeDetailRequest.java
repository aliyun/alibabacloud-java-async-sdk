// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSQLReviewOptimizeDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSQLReviewOptimizeDetailRequest</p>
 */
public class GetSQLReviewOptimizeDetailRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SQLReviewQueryKey")
    @Validation(required = true)
    private String SQLReviewQueryKey;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetSQLReviewOptimizeDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.SQLReviewQueryKey = builder.SQLReviewQueryKey;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSQLReviewOptimizeDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return SQLReviewQueryKey
     */
    public String getSQLReviewQueryKey() {
        return this.SQLReviewQueryKey;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetSQLReviewOptimizeDetailRequest, Builder> {
        private String regionId; 
        private String SQLReviewQueryKey; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetSQLReviewOptimizeDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.SQLReviewQueryKey = request.SQLReviewQueryKey;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The key that is used to query the details of optimization suggestions. You can call the [ListSQLReviewOriginSQL](~~257870~~) operation to query the key.
         */
        public Builder SQLReviewQueryKey(String SQLReviewQueryKey) {
            this.putQueryParameter("SQLReviewQueryKey", SQLReviewQueryKey);
            this.SQLReviewQueryKey = SQLReviewQueryKey;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the ID of the tenant.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetSQLReviewOptimizeDetailRequest build() {
            return new GetSQLReviewOptimizeDetailRequest(this);
        } 

    } 

}
