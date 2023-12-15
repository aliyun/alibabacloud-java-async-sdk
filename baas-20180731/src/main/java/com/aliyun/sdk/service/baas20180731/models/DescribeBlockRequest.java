// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlockRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlockRequest</p>
 */
public class DescribeBlockRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Bizid")
    private String bizid;

    @Body
    @NameInMap("Height")
    private Long height;

    private DescribeBlockRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
        this.height = builder.height;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlockRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    /**
     * @return height
     */
    public Long getHeight() {
        return this.height;
    }

    public static final class Builder extends Request.Builder<DescribeBlockRequest, Builder> {
        private String regionId; 
        private String bizid; 
        private Long height; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlockRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
            this.height = request.height;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(Long height) {
            this.putBodyParameter("Height", height);
            this.height = height;
            return this;
        }

        @Override
        public DescribeBlockRequest build() {
            return new DescribeBlockRequest(this);
        } 

    } 

}
