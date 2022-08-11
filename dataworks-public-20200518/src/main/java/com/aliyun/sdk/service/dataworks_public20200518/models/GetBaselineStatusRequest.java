// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBaselineStatusRequest} extends {@link RequestModel}
 *
 * <p>GetBaselineStatusRequest</p>
 */
public class GetBaselineStatusRequest extends Request {
    @Body
    @NameInMap("BaselineId")
    @Validation(required = true)
    private Long baselineId;

    @Body
    @NameInMap("Bizdate")
    @Validation(required = true)
    private String bizdate;

    @Body
    @NameInMap("InGroupId")
    @Validation(required = true)
    private Integer inGroupId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetBaselineStatusRequest(Builder builder) {
        super(builder);
        this.baselineId = builder.baselineId;
        this.bizdate = builder.bizdate;
        this.inGroupId = builder.inGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineId
     */
    public Long getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return bizdate
     */
    public String getBizdate() {
        return this.bizdate;
    }

    /**
     * @return inGroupId
     */
    public Integer getInGroupId() {
        return this.inGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetBaselineStatusRequest, Builder> {
        private Long baselineId; 
        private String bizdate; 
        private Integer inGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetBaselineStatusRequest request) {
            super(request);
            this.baselineId = request.baselineId;
            this.bizdate = request.bizdate;
            this.inGroupId = request.inGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * BaselineId.
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * Bizdate.
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * InGroupId.
         */
        public Builder inGroupId(Integer inGroupId) {
            this.putBodyParameter("InGroupId", inGroupId);
            this.inGroupId = inGroupId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetBaselineStatusRequest build() {
            return new GetBaselineStatusRequest(this);
        } 

    } 

}
