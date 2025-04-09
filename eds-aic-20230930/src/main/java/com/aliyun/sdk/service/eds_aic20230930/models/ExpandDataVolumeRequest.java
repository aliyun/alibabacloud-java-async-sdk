// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ExpandDataVolumeRequest} extends {@link RequestModel}
 *
 * <p>ExpandDataVolumeRequest</p>
 */
public class ExpandDataVolumeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareDataVolume")
    private Integer shareDataVolume;

    private ExpandDataVolumeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.bizRegionId = builder.bizRegionId;
        this.nodeIds = builder.nodeIds;
        this.shareDataVolume = builder.shareDataVolume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpandDataVolumeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return shareDataVolume
     */
    public Integer getShareDataVolume() {
        return this.shareDataVolume;
    }

    public static final class Builder extends Request.Builder<ExpandDataVolumeRequest, Builder> {
        private Boolean autoPay; 
        private String bizRegionId; 
        private java.util.List<String> nodeIds; 
        private Integer shareDataVolume; 

        private Builder() {
            super();
        } 

        private Builder(ExpandDataVolumeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.bizRegionId = request.bizRegionId;
            this.nodeIds = request.nodeIds;
            this.shareDataVolume = request.shareDataVolume;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * ShareDataVolume.
         */
        public Builder shareDataVolume(Integer shareDataVolume) {
            this.putQueryParameter("ShareDataVolume", shareDataVolume);
            this.shareDataVolume = shareDataVolume;
            return this;
        }

        @Override
        public ExpandDataVolumeRequest build() {
            return new ExpandDataVolumeRequest(this);
        } 

    } 

}
