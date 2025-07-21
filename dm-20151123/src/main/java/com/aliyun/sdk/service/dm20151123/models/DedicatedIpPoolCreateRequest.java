// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpPoolCreateRequest} extends {@link RequestModel}
 *
 * <p>DedicatedIpPoolCreateRequest</p>
 */
public class DedicatedIpPoolCreateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyResourceIds")
    private String buyResourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 50, minLength = 1)
    private String name;

    private DedicatedIpPoolCreateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buyResourceIds = builder.buyResourceIds;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpPoolCreateRequest create() {
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
     * @return buyResourceIds
     */
    public String getBuyResourceIds() {
        return this.buyResourceIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DedicatedIpPoolCreateRequest, Builder> {
        private String regionId; 
        private String buyResourceIds; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DedicatedIpPoolCreateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buyResourceIds = request.buyResourceIds;
            this.name = request.name;
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
         * <p>Purchased IP instance IDs, separated by commas; derived from the IP purchase instance IDs returned by the DedicatedIpNonePoolList interface.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx,xxx</p>
         */
        public Builder buyResourceIds(String buyResourceIds) {
            this.putQueryParameter("BuyResourceIds", buyResourceIds);
            this.buyResourceIds = buyResourceIds;
            return this;
        }

        /**
         * <p>IP pool name;
         * Length should be 1-50 characters, allowing English letters, numbers, _, and -. The name cannot be modified after the IP pool is created.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DedicatedIpPoolCreateRequest build() {
            return new DedicatedIpPoolCreateRequest(this);
        } 

    } 

}
