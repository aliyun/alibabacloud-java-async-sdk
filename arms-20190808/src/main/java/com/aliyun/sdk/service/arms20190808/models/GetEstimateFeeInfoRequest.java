// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEstimateFeeInfoRequest} extends {@link RequestModel}
 *
 * <p>GetEstimateFeeInfoRequest</p>
 */
public class GetEstimateFeeInfoRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetUserId")
    private String targetUserId;

    @Query
    @NameInMap("UsageCn")
    private Long usageCn;

    @Query
    @NameInMap("UsageFn")
    private Long usageFn;

    private GetEstimateFeeInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.targetUserId = builder.targetUserId;
        this.usageCn = builder.usageCn;
        this.usageFn = builder.usageFn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEstimateFeeInfoRequest create() {
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
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return usageCn
     */
    public Long getUsageCn() {
        return this.usageCn;
    }

    /**
     * @return usageFn
     */
    public Long getUsageFn() {
        return this.usageFn;
    }

    public static final class Builder extends Request.Builder<GetEstimateFeeInfoRequest, Builder> {
        private String regionId; 
        private String targetUserId; 
        private Long usageCn; 
        private Long usageFn; 

        private Builder() {
            super();
        } 

        private Builder(GetEstimateFeeInfoRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.targetUserId = response.targetUserId;
            this.usageCn = response.usageCn;
            this.usageFn = response.usageFn;
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
         * TargetUserId.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * UsageCn.
         */
        public Builder usageCn(Long usageCn) {
            this.putQueryParameter("UsageCn", usageCn);
            this.usageCn = usageCn;
            return this;
        }

        /**
         * UsageFn.
         */
        public Builder usageFn(Long usageFn) {
            this.putQueryParameter("UsageFn", usageFn);
            this.usageFn = usageFn;
            return this;
        }

        @Override
        public GetEstimateFeeInfoRequest build() {
            return new GetEstimateFeeInfoRequest(this);
        } 

    } 

}
