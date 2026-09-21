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
 * {@link CreateCloudPhoneNodeRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudPhoneNodeRequest</p>
 */
public class CreateCloudPhoneNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageType")
    private String bandwidthPackageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelCookie")
    private String channelCookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayConfig")
    private DisplayConfig displayConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownBandwidthLimit")
    private Integer downBandwidthLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSingleImgDisk")
    private Boolean isSingleImgDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInfo")
    private NetworkInfo networkInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidCallBackUrl")
    private String paidCallBackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

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
    @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
    private Integer resolutionHeight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
    private Integer resolutionWidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerShareDataVolume")
    @com.aliyun.core.annotation.Validation(maximum = 4000, minimum = 100)
    private Integer serverShareDataVolume;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamMode")
    private Integer streamMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwapSize")
    private Integer swapSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpBandwidthLimit")
    private Integer upBandwidthLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseTemplate")
    private String useTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateCloudPhoneNodeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.bandwidthPackageType = builder.bandwidthPackageType;
        this.bizRegionId = builder.bizRegionId;
        this.channelCookie = builder.channelCookie;
        this.chargeType = builder.chargeType;
        this.count = builder.count;
        this.displayConfig = builder.displayConfig;
        this.downBandwidthLimit = builder.downBandwidthLimit;
        this.imageId = builder.imageId;
        this.instanceType = builder.instanceType;
        this.isSingleImgDisk = builder.isSingleImgDisk;
        this.networkId = builder.networkId;
        this.networkInfo = builder.networkInfo;
        this.networkType = builder.networkType;
        this.nodeName = builder.nodeName;
        this.paidCallBackUrl = builder.paidCallBackUrl;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.phoneCount = builder.phoneCount;
        this.phoneDataVolume = builder.phoneDataVolume;
        this.promotionId = builder.promotionId;
        this.resolutionHeight = builder.resolutionHeight;
        this.resolutionWidth = builder.resolutionWidth;
        this.serverShareDataVolume = builder.serverShareDataVolume;
        this.serverType = builder.serverType;
        this.streamMode = builder.streamMode;
        this.swapSize = builder.swapSize;
        this.tag = builder.tag;
        this.upBandwidthLimit = builder.upBandwidthLimit;
        this.useTemplate = builder.useTemplate;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudPhoneNodeRequest create() {
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
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return bandwidthPackageType
     */
    public String getBandwidthPackageType() {
        return this.bandwidthPackageType;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return channelCookie
     */
    public String getChannelCookie() {
        return this.channelCookie;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return displayConfig
     */
    public DisplayConfig getDisplayConfig() {
        return this.displayConfig;
    }

    /**
     * @return downBandwidthLimit
     */
    public Integer getDownBandwidthLimit() {
        return this.downBandwidthLimit;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isSingleImgDisk
     */
    public Boolean getIsSingleImgDisk() {
        return this.isSingleImgDisk;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return networkInfo
     */
    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return paidCallBackUrl
     */
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
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
     * @return resolutionHeight
     */
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    /**
     * @return resolutionWidth
     */
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    /**
     * @return serverShareDataVolume
     */
    public Integer getServerShareDataVolume() {
        return this.serverShareDataVolume;
    }

    /**
     * @return serverType
     */
    public String getServerType() {
        return this.serverType;
    }

    /**
     * @return streamMode
     */
    public Integer getStreamMode() {
        return this.streamMode;
    }

    /**
     * @return swapSize
     */
    public Integer getSwapSize() {
        return this.swapSize;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return upBandwidthLimit
     */
    public Integer getUpBandwidthLimit() {
        return this.upBandwidthLimit;
    }

    /**
     * @return useTemplate
     */
    public String getUseTemplate() {
        return this.useTemplate;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateCloudPhoneNodeRequest, Builder> {
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bandwidthPackageId; 
        private String bandwidthPackageType; 
        private String bizRegionId; 
        private String channelCookie; 
        private String chargeType; 
        private String count; 
        private DisplayConfig displayConfig; 
        private Integer downBandwidthLimit; 
        private String imageId; 
        private String instanceType; 
        private Boolean isSingleImgDisk; 
        private String networkId; 
        private NetworkInfo networkInfo; 
        private String networkType; 
        private String nodeName; 
        private String paidCallBackUrl; 
        private Integer period; 
        private String periodUnit; 
        private Integer phoneCount; 
        private Integer phoneDataVolume; 
        private String promotionId; 
        private Integer resolutionHeight; 
        private Integer resolutionWidth; 
        private Integer serverShareDataVolume; 
        private String serverType; 
        private Integer streamMode; 
        private Integer swapSize; 
        private java.util.List<Tag> tag; 
        private Integer upBandwidthLimit; 
        private String useTemplate; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudPhoneNodeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bandwidthPackageId = request.bandwidthPackageId;
            this.bandwidthPackageType = request.bandwidthPackageType;
            this.bizRegionId = request.bizRegionId;
            this.channelCookie = request.channelCookie;
            this.chargeType = request.chargeType;
            this.count = request.count;
            this.displayConfig = request.displayConfig;
            this.downBandwidthLimit = request.downBandwidthLimit;
            this.imageId = request.imageId;
            this.instanceType = request.instanceType;
            this.isSingleImgDisk = request.isSingleImgDisk;
            this.networkId = request.networkId;
            this.networkInfo = request.networkInfo;
            this.networkType = request.networkType;
            this.nodeName = request.nodeName;
            this.paidCallBackUrl = request.paidCallBackUrl;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.phoneCount = request.phoneCount;
            this.phoneDataVolume = request.phoneDataVolume;
            this.promotionId = request.promotionId;
            this.resolutionHeight = request.resolutionHeight;
            this.resolutionWidth = request.resolutionWidth;
            this.serverShareDataVolume = request.serverShareDataVolume;
            this.serverType = request.serverType;
            this.streamMode = request.streamMode;
            this.swapSize = request.swapSize;
            this.tag = request.tag;
            this.upBandwidthLimit = request.upBandwidthLimit;
            this.useTemplate = request.useTemplate;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>Specifies whether to enable automatic payment.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The ID of the Internet Shared Bandwidth instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-uf6g3hgg*******8s3lxiob3</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putQueryParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>The bandwidth type.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp_ecd</p>
         */
        public Builder bandwidthPackageType(String bandwidthPackageType) {
            this.putQueryParameter("BandwidthPackageType", bandwidthPackageType);
            this.bandwidthPackageType = bandwidthPackageType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ChannelCookie.
         */
        public Builder channelCookie(String channelCookie) {
            this.putQueryParameter("ChannelCookie", channelCookie);
            this.channelCookie = channelCookie;
            return this;
        }

        /**
         * <p>The billing type. Only subscription is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The number of cloud phone matrices to purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(String count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>The display settings.</p>
         */
        public Builder displayConfig(DisplayConfig displayConfig) {
            String displayConfigShrink = shrink(displayConfig, "DisplayConfig", "json");
            this.putBodyParameter("DisplayConfig", displayConfigShrink);
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
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-075cllfeuazh0****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * <blockquote>
         * <p>To purchase more instance types, <a href="https://smartservice.console.aliyun.com/service/pre-sales-chat?spm=5176.6d6ecb63.0.0.729adda2VqVQx7">contact pre-sales support</a>.</p>
         * </blockquote>
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
         * IsSingleImgDisk.
         */
        public Builder isSingleImgDisk(Boolean isSingleImgDisk) {
            this.putQueryParameter("IsSingleImgDisk", isSingleImgDisk);
            this.isSingleImgDisk = isSingleImgDisk;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-5mwr9azebliva****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The network mapping information of the instance.</p>
         */
        public Builder networkInfo(NetworkInfo networkInfo) {
            String networkInfoShrink = shrink(networkInfo, "NetworkInfo", "json");
            this.putQueryParameter("NetworkInfo", networkInfoShrink);
            this.networkInfo = networkInfo;
            return this;
        }

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>network_pro_ecd</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The name of the cloud phone matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>node_name</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * PaidCallBackUrl.
         */
        public Builder paidCallBackUrl(String paidCallBackUrl) {
            this.putQueryParameter("PaidCallBackUrl", paidCallBackUrl);
            this.paidCallBackUrl = paidCallBackUrl;
            return this;
        }

        /**
         * <p>The subscription duration. The unit is specified by PeriodUnit.</p>
         * <ul>
         * <li>If PeriodUnit is set to <strong>year</strong>, the value can only be 1.</li>
         * <li>If PeriodUnit is set to <strong>month</strong>, valid values are 1, 2, 3, and 6.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * <p>The number of cloud phone instances to create in a single matrix.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        public Builder phoneCount(Integer phoneCount) {
            this.putQueryParameter("PhoneCount", phoneCount);
            this.phoneCount = phoneCount;
            return this;
        }

        /**
         * <p>The size of the independent device storage. Unit: GiB.</p>
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
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putQueryParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * <p>The height of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        public Builder resolutionHeight(Integer resolutionHeight) {
            this.putQueryParameter("ResolutionHeight", resolutionHeight);
            this.resolutionHeight = resolutionHeight;
            return this;
        }

        /**
         * <p>The width of the resolution. Unit: pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        public Builder resolutionWidth(Integer resolutionWidth) {
            this.putQueryParameter("ResolutionWidth", resolutionWidth);
            this.resolutionWidth = resolutionWidth;
            return this;
        }

        /**
         * <p>The size of the shared device storage. Unit: GiB.</p>
         * <blockquote>
         * <p>The minimum value of the shared device storage must be greater than the number of instances in the matrix multiplied by 10 GiB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder serverShareDataVolume(Integer serverShareDataVolume) {
            this.putQueryParameter("ServerShareDataVolume", serverShareDataVolume);
            this.serverShareDataVolume = serverShareDataVolume;
            return this;
        }

        /**
         * <p>The specifications of the cloud phone matrix.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpm.gx7.10xlarge</p>
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        /**
         * <p>The streaming mode for instances in the cloud phone matrix. If this parameter is not specified, the default value is preemptive mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder streamMode(Integer streamMode) {
            this.putQueryParameter("StreamMode", streamMode);
            this.streamMode = streamMode;
            return this;
        }

        /**
         * SwapSize.
         */
        public Builder swapSize(Integer swapSize) {
            this.putQueryParameter("SwapSize", swapSize);
            this.swapSize = swapSize;
            return this;
        }

        /**
         * <p>The tags of the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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

        /**
         * <p>Specifies whether to use a template during creation. Set this parameter to <code>Random</code> to use a random template from the template list. Alternatively, specify a template ID to use that template.</p>
         * 
         * <strong>example:</strong>
         * <p>Random</p>
         */
        public Builder useTemplate(String useTemplate) {
            this.putQueryParameter("UseTemplate", useTemplate);
            this.useTemplate = useTemplate;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zeekryyc1q3sm72l****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateCloudPhoneNodeRequest build() {
            return new CreateCloudPhoneNodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCloudPhoneNodeRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudPhoneNodeRequest</p>
     */
    public static class DisplayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dpi")
        private Integer dpi;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private Integer fps;

        @com.aliyun.core.annotation.NameInMap("LockResolution")
        private String lockResolution;

        private DisplayConfig(Builder builder) {
            this.dpi = builder.dpi;
            this.fps = builder.fps;
            this.lockResolution = builder.lockResolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisplayConfig create() {
            return builder().build();
        }

        /**
         * @return dpi
         */
        public Integer getDpi() {
            return this.dpi;
        }

        /**
         * @return fps
         */
        public Integer getFps() {
            return this.fps;
        }

        /**
         * @return lockResolution
         */
        public String getLockResolution() {
            return this.lockResolution;
        }

        public static final class Builder {
            private Integer dpi; 
            private Integer fps; 
            private String lockResolution; 

            private Builder() {
            } 

            private Builder(DisplayConfig model) {
                this.dpi = model.dpi;
                this.fps = model.fps;
                this.lockResolution = model.lockResolution;
            } 

            /**
             * <p>The DPI. Valid values: 72 to 600.</p>
             * 
             * <strong>example:</strong>
             * <p>240</p>
             */
            public Builder dpi(Integer dpi) {
                this.dpi = dpi;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not yet available for public use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>Specifies whether to lock the resolution.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder lockResolution(String lockResolution) {
                this.lockResolution = lockResolution;
                return this;
            }

            public DisplayConfig build() {
                return new DisplayConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCloudPhoneNodeRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudPhoneNodeRequest</p>
     */
    public static class NetworkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPackageName")
        private String bandwidthPackageName;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpRatio")
        private Integer ipRatio;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("LimitedBandwidth")
        private Integer limitedBandwidth;

        @com.aliyun.core.annotation.NameInMap("PaidCallbackUrl")
        private String paidCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("VisibleType")
        private String visibleType;

        private NetworkInfo(Builder builder) {
            this.bandwidthPackageName = builder.bandwidthPackageName;
            this.cidrBlock = builder.cidrBlock;
            this.internetChargeType = builder.internetChargeType;
            this.ipRatio = builder.ipRatio;
            this.isp = builder.isp;
            this.limitedBandwidth = builder.limitedBandwidth;
            this.paidCallbackUrl = builder.paidCallbackUrl;
            this.payType = builder.payType;
            this.visibleType = builder.visibleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInfo create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageName
         */
        public String getBandwidthPackageName() {
            return this.bandwidthPackageName;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipRatio
         */
        public Integer getIpRatio() {
            return this.ipRatio;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return limitedBandwidth
         */
        public Integer getLimitedBandwidth() {
            return this.limitedBandwidth;
        }

        /**
         * @return paidCallbackUrl
         */
        public String getPaidCallbackUrl() {
            return this.paidCallbackUrl;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return visibleType
         */
        public String getVisibleType() {
            return this.visibleType;
        }

        public static final class Builder {
            private String bandwidthPackageName; 
            private String cidrBlock; 
            private String internetChargeType; 
            private Integer ipRatio; 
            private String isp; 
            private Integer limitedBandwidth; 
            private String paidCallbackUrl; 
            private String payType; 
            private String visibleType; 

            private Builder() {
            } 

            private Builder(NetworkInfo model) {
                this.bandwidthPackageName = model.bandwidthPackageName;
                this.cidrBlock = model.cidrBlock;
                this.internetChargeType = model.internetChargeType;
                this.ipRatio = model.ipRatio;
                this.isp = model.isp;
                this.limitedBandwidth = model.limitedBandwidth;
                this.paidCallbackUrl = model.paidCallbackUrl;
                this.payType = model.payType;
                this.visibleType = model.visibleType;
            } 

            /**
             * <p>The name of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>inst-bandwidth-pkg-1</p>
             */
            public Builder bandwidthPackageName(String bandwidthPackageName) {
                this.bandwidthPackageName = bandwidthPackageName;
                return this;
            }

            /**
             * <p>The private CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.13.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The billable methods of the bandwidth plan. Valid values:</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</li>
             * <li><strong>PayBy95</strong>: pay-by-95th-percentile. IPv6 Internet bandwidth does not support pay-by-95th-percentile billing by default. To use this billing method, contact your account manager.</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <ul>
             * <li><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByBandwidth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The ratio of IP addresses to instances.</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder ipRatio(Integer ipRatio) {
                this.ipRatio = ipRatio;
                return this;
            }

            /**
             * <p>The line type.</p>
             * 
             * <strong>example:</strong>
             * <p>ChinaTelecom</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The maximum bandwidth of the bandwidth plan. Unit: Mbit/s. The total bandwidth of all instances that use this bandwidth plan is subject to this limit.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder limitedBandwidth(Integer limitedBandwidth) {
                this.limitedBandwidth = limitedBandwidth;
                return this;
            }

            /**
             * PaidCallbackUrl.
             */
            public Builder paidCallbackUrl(String paidCallbackUrl) {
                this.paidCallbackUrl = paidCallbackUrl;
                return this;
            }

            /**
             * <p>The billing type.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The visibility scope.</p>
             * 
             * <strong>example:</strong>
             * <p>CPS</p>
             */
            public Builder visibleType(String visibleType) {
                this.visibleType = visibleType;
                return this;
            }

            public NetworkInfo build() {
                return new NetworkInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCloudPhoneNodeRequest} extends {@link TeaModel}
     *
     * <p>CreateCloudPhoneNodeRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>keyname</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>valuename</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
