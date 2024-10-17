// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetBaselineStatusRequest} extends {@link RequestModel}
 *
 * <p>GetBaselineStatusRequest</p>
 */
public class GetBaselineStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long baselineId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizdate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer inGroupId;

    private GetBaselineStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineId = builder.baselineId;
        this.bizdate = builder.bizdate;
        this.inGroupId = builder.inGroupId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<GetBaselineStatusRequest, Builder> {
        private String regionId; 
        private Long baselineId; 
        private String bizdate; 
        private Integer inGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetBaselineStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineId = request.baselineId;
            this.bizdate = request.bizdate;
            this.inGroupId = request.inGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the baseline.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder baselineId(Long baselineId) {
            this.putBodyParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>The data timestamp of the baseline instance. Specify the time in the ISO 8601 standard in the yyyy-MM-dd&quot;T&quot;HH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-07-07T00:00:00+0800</p>
         */
        public Builder bizdate(String bizdate) {
            this.putBodyParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * <p>The ID of the scheduling cycle of the baseline instance. For a baseline instance that is scheduled by day, the value of this parameter is 1. For a baseline instance that is scheduled by hour, the value of this parameter ranges from 1 to 24.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder inGroupId(Integer inGroupId) {
            this.putBodyParameter("InGroupId", inGroupId);
            this.inGroupId = inGroupId;
            return this;
        }

        @Override
        public GetBaselineStatusRequest build() {
            return new GetBaselineStatusRequest(this);
        } 

    } 

}
