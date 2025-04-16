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
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizRegionId;

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
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateCloudPhoneNodeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizRegionId = builder.bizRegionId;
        this.chargeType = builder.chargeType;
        this.count = builder.count;
        this.displayConfig = builder.displayConfig;
        this.imageId = builder.imageId;
        this.instanceType = builder.instanceType;
        this.networkId = builder.networkId;
        this.nodeName = builder.nodeName;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.phoneCount = builder.phoneCount;
        this.resolutionHeight = builder.resolutionHeight;
        this.resolutionWidth = builder.resolutionWidth;
        this.serverShareDataVolume = builder.serverShareDataVolume;
        this.serverType = builder.serverType;
        this.tag = builder.tag;
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
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
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
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private String bizRegionId; 
        private String chargeType; 
        private String count; 
        private DisplayConfig displayConfig; 
        private String imageId; 
        private String instanceType; 
        private String networkId; 
        private String nodeName; 
        private Integer period; 
        private String periodUnit; 
        private Integer phoneCount; 
        private Integer resolutionHeight; 
        private Integer resolutionWidth; 
        private Integer serverShareDataVolume; 
        private String serverType; 
        private java.util.List<Tag> tag; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudPhoneNodeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizRegionId = request.bizRegionId;
            this.chargeType = request.chargeType;
            this.count = request.count;
            this.displayConfig = request.displayConfig;
            this.imageId = request.imageId;
            this.instanceType = request.instanceType;
            this.networkId = request.networkId;
            this.nodeName = request.nodeName;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.phoneCount = request.phoneCount;
            this.resolutionHeight = request.resolutionHeight;
            this.resolutionWidth = request.resolutionWidth;
            this.serverShareDataVolume = request.serverShareDataVolume;
            this.serverType = request.serverType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>Specifies whether to enable the auto-payment feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>False (default): You must manually complete the payment in the Alibaba Cloud Expenses and Costs console.</li>
         * <li>true: enables the auto-payment feature.</li>
         * </ul>
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
         * <p>Specifies whether to enable the auto-renewal feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: enables the auto-renewal feature. In this case, the system automatically renews instances upon expiration.</li>
         * <li>false (default): disables the auto-renewal feature. In this case, you need to manually renew instances upon expiration.</li>
         * </ul>
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
         * <p>The billing method. Only the subscription billing method is supported.</p>
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
         * <p>The number of cloud phone matrixes you want to purchase.</p>
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
         * DisplayConfig.
         */
        public Builder displayConfig(DisplayConfig displayConfig) {
            String displayConfigShrink = shrink(displayConfig, "DisplayConfig", "json");
            this.putBodyParameter("DisplayConfig", displayConfigShrink);
            this.displayConfig = displayConfig;
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
         * <p>The instance specification.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ac.max: By default, this specification allows up to 25 instances. You can adjust this number by using PhoneCount (Value range: 4 to 40).</li>
         * <li>ac.plus: By default, this specification allows up to 40 instances. You can adjust this number by using PhoneCount (Value range: 4 to 40).</li>
         * </ul>
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
         * <p>The subscription duration. The unit is specified by <code>PeriodUnit</code>. Valid values:</p>
         * <ul>
         * <li>When <code>PeriodUnit</code> is set to <strong>year</strong>: 1.</li>
         * <li>When <code>PeriodUnit</code> is set to <strong>month</strong>: 1, 2, 3, and 6.</li>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>Month (default)</li>
         * <li>Year</li>
         * </ul>
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
         * <p>The number of instances per cloud phone matrix.</p>
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
         * <p>The resolution height. Unit: pixel.</p>
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
         * <p>The resolution width. Unit: pixel.</p>
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
         * <p>The shared storage size Unit: GiB.</p>
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
         * <p>The matrix specification.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>cpm.gn6.gx1</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpm.gn6.gx1</p>
         */
        public Builder serverType(String serverType) {
            this.putQueryParameter("ServerType", serverType);
            this.serverType = serverType;
            return this;
        }

        /**
         * <p>The resource tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
             * Dpi.
             */
            public Builder dpi(Integer dpi) {
                this.dpi = dpi;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(Integer fps) {
                this.fps = fps;
                return this;
            }

            /**
             * LockResolution.
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
