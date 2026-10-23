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
 * {@link ChangeCloudPhoneNodeRequest} extends {@link RequestModel}
 *
 * <p>ChangeCloudPhoneNodeRequest</p>
 */
public class ChangeCloudPhoneNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayConfig")
    private String displayConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownBandwidthLimit")
    private Integer downBandwidthLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneCount")
    private Integer phoneCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneDataVolume")
    private Integer phoneDataVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionId")
    private String promotionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareDataVolume")
    private Integer shareDataVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwapSize")
    private Integer swapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpBandwidthLimit")
    private Integer upBandwidthLimit;

    private ChangeCloudPhoneNodeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.displayConfig = builder.displayConfig;
        this.downBandwidthLimit = builder.downBandwidthLimit;
        this.instanceType = builder.instanceType;
        this.nodeId = builder.nodeId;
        this.phoneCount = builder.phoneCount;
        this.phoneDataVolume = builder.phoneDataVolume;
        this.promotionId = builder.promotionId;
        this.shareDataVolume = builder.shareDataVolume;
        this.swapSize = builder.swapSize;
        this.upBandwidthLimit = builder.upBandwidthLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCloudPhoneNodeRequest create() {
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
     * @return displayConfig
     */
    public String getDisplayConfig() {
        return this.displayConfig;
    }

    /**
     * @return downBandwidthLimit
     */
    public Integer getDownBandwidthLimit() {
        return this.downBandwidthLimit;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return phoneCount
     */
    public Integer getPhoneCount() {
        return this.phoneCount;
    }

    /**
     * @return phoneDataVolume
     */
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return shareDataVolume
     */
    public Integer getShareDataVolume() {
        return this.shareDataVolume;
    }

    /**
     * @return swapSize
     */
    public Integer getSwapSize() {
        return this.swapSize;
    }

    /**
     * @return upBandwidthLimit
     */
    public Integer getUpBandwidthLimit() {
        return this.upBandwidthLimit;
    }

    public static final class Builder extends Request.Builder<ChangeCloudPhoneNodeRequest, Builder> {
        private Boolean autoPay; 
        private String displayConfig; 
        private Integer downBandwidthLimit; 
        private String instanceType; 
        private String nodeId; 
        private Integer phoneCount; 
        private Integer phoneDataVolume; 
        private String promotionId; 
        private Integer shareDataVolume; 
        private Integer swapSize; 
        private Integer upBandwidthLimit; 

        private Builder() {
            super();
        } 

        private Builder(ChangeCloudPhoneNodeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.displayConfig = request.displayConfig;
            this.downBandwidthLimit = request.downBandwidthLimit;
            this.instanceType = request.instanceType;
            this.nodeId = request.nodeId;
            this.phoneCount = request.phoneCount;
            this.phoneDataVolume = request.phoneDataVolume;
            this.promotionId = request.promotionId;
            this.shareDataVolume = request.shareDataVolume;
            this.swapSize = request.swapSize;
            this.upBandwidthLimit = request.upBandwidthLimit;
        } 

        /**
         * <p>Specifies whether to enable automatic payment. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The display settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dpi&quot;:320}</p>
         */
        public Builder displayConfig(String displayConfig) {
            this.putQueryParameter("DisplayConfig", displayConfig);
            this.displayConfig = displayConfig;
            return this;
        }

        /**
         * <p>The downstream bandwidth throttling. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder downBandwidthLimit(Integer downBandwidthLimit) {
            this.putQueryParameter("DownBandwidthLimit", downBandwidthLimit);
            this.downBandwidthLimit = downBandwidthLimit;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ac.max</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The ID of the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>cpn-0ugbptfu473fy****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The number of cloud phone instances. You can call the <a href="https://help.aliyun.com/document_detail/2807299.html">DescribeSpec</a> operation to query the maximum and minimum limits on the number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder phoneCount(Integer phoneCount) {
            this.putQueryParameter("PhoneCount", phoneCount);
            this.phoneCount = phoneCount;
            return this;
        }

        /**
         * <p>The local storage size. Valid values: 10 to 4000. Unit: GiB. If this parameter is left empty, the original size is retained.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder phoneDataVolume(Integer phoneDataVolume) {
            this.putQueryParameter("PhoneDataVolume", phoneDataVolume);
            this.phoneDataVolume = phoneDataVolume;
            return this;
        }

        /**
         * <p>The ID of the promotion.</p>
         * 
         * <strong>example:</strong>
         * <p>50003308011****</p>
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The size of the shared storage. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder shareDataVolume(Integer shareDataVolume) {
            this.putQueryParameter("ShareDataVolume", shareDataVolume);
            this.shareDataVolume = shareDataVolume;
            return this;
        }

        /**
         * <p>The size of the swap space.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder swapSize(Integer swapSize) {
            this.putQueryParameter("SwapSize", swapSize);
            this.swapSize = swapSize;
            return this;
        }

        /**
         * <p>The upstream bandwidth throttling. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder upBandwidthLimit(Integer upBandwidthLimit) {
            this.putQueryParameter("UpBandwidthLimit", upBandwidthLimit);
            this.upBandwidthLimit = upBandwidthLimit;
            return this;
        }

        @Override
        public ChangeCloudPhoneNodeRequest build() {
            return new ChangeCloudPhoneNodeRequest(this);
        } 

    } 

}
