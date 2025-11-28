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
 * {@link ListRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>ListRouteRuleRequest</p>
 */
public class ListRouteRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizChainName")
    private String bizChainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChainUpMode")
    private String chainUpMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupName")
    private String deviceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Num")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListRouteRuleRequest(Builder builder) {
        super(builder);
        this.bizChainName = builder.bizChainName;
        this.chainUpMode = builder.chainUpMode;
        this.deviceGroupName = builder.deviceGroupName;
        this.num = builder.num;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRouteRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizChainName
     */
    public String getBizChainName() {
        return this.bizChainName;
    }

    /**
     * @return chainUpMode
     */
    public String getChainUpMode() {
        return this.chainUpMode;
    }

    /**
     * @return deviceGroupName
     */
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListRouteRuleRequest, Builder> {
        private String bizChainName; 
        private String chainUpMode; 
        private String deviceGroupName; 
        private Integer num; 
        private String regionId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListRouteRuleRequest request) {
            super(request);
            this.bizChainName = request.bizChainName;
            this.chainUpMode = request.chainUpMode;
            this.deviceGroupName = request.deviceGroupName;
            this.num = request.num;
            this.regionId = request.regionId;
            this.size = request.size;
        } 

        /**
         * BizChainName.
         */
        public Builder bizChainName(String bizChainName) {
            this.putQueryParameter("BizChainName", bizChainName);
            this.bizChainName = bizChainName;
            return this;
        }

        /**
         * ChainUpMode.
         */
        public Builder chainUpMode(String chainUpMode) {
            this.putQueryParameter("ChainUpMode", chainUpMode);
            this.chainUpMode = chainUpMode;
            return this;
        }

        /**
         * DeviceGroupName.
         */
        public Builder deviceGroupName(String deviceGroupName) {
            this.putQueryParameter("DeviceGroupName", deviceGroupName);
            this.deviceGroupName = deviceGroupName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder num(Integer num) {
            this.putQueryParameter("Num", num);
            this.num = num;
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
         * <p>This parameter is required.</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListRouteRuleRequest build() {
            return new ListRouteRuleRequest(this);
        } 

    } 

}
