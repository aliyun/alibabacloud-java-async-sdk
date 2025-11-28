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
 * {@link AddDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>AddDeviceGroupRequest</p>
 */
public class AddDeviceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedCount")
    private Integer authorizedCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private AddDeviceGroupRequest(Builder builder) {
        super(builder);
        this.authorizedCount = builder.authorizedCount;
        this.productKey = builder.productKey;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedCount
     */
    public Integer getAuthorizedCount() {
        return this.authorizedCount;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<AddDeviceGroupRequest, Builder> {
        private Integer authorizedCount; 
        private String productKey; 
        private String regionId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(AddDeviceGroupRequest request) {
            super(request);
            this.authorizedCount = request.authorizedCount;
            this.productKey = request.productKey;
            this.regionId = request.regionId;
            this.remark = request.remark;
        } 

        /**
         * AuthorizedCount.
         */
        public Builder authorizedCount(Integer authorizedCount) {
            this.putQueryParameter("AuthorizedCount", authorizedCount);
            this.authorizedCount = authorizedCount;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
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

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public AddDeviceGroupRequest build() {
            return new AddDeviceGroupRequest(this);
        } 

    } 

}
