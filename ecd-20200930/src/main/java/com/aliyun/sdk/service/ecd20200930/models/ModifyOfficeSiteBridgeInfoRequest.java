// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyOfficeSiteBridgeInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfficeSiteBridgeInfoRequest</p>
 */
public class ModifyOfficeSiteBridgeInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeId")
    private String bridgeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeLevel")
    private String bridgeLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BridgeType")
    private String bridgeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBridge")
    private Boolean enableBridge;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("License")
    private String license;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyOfficeSiteBridgeInfoRequest(Builder builder) {
        super(builder);
        this.bridgeId = builder.bridgeId;
        this.bridgeLevel = builder.bridgeLevel;
        this.bridgeType = builder.bridgeType;
        this.enableBridge = builder.enableBridge;
        this.license = builder.license;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteBridgeInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bridgeId
     */
    public String getBridgeId() {
        return this.bridgeId;
    }

    /**
     * @return bridgeLevel
     */
    public String getBridgeLevel() {
        return this.bridgeLevel;
    }

    /**
     * @return bridgeType
     */
    public String getBridgeType() {
        return this.bridgeType;
    }

    /**
     * @return enableBridge
     */
    public Boolean getEnableBridge() {
        return this.enableBridge;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyOfficeSiteBridgeInfoRequest, Builder> {
        private String bridgeId; 
        private String bridgeLevel; 
        private String bridgeType; 
        private Boolean enableBridge; 
        private String license; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfficeSiteBridgeInfoRequest request) {
            super(request);
            this.bridgeId = request.bridgeId;
            this.bridgeLevel = request.bridgeLevel;
            this.bridgeType = request.bridgeType;
            this.enableBridge = request.enableBridge;
            this.license = request.license;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The virtual bridge ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vb-fsifhaiushfishf***</p>
         */
        public Builder bridgeId(String bridgeId) {
            this.putQueryParameter("BridgeId", bridgeId);
            this.bridgeId = bridgeId;
            return this;
        }

        /**
         * <p>The virtual bridge specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>vb.pro</p>
         */
        public Builder bridgeLevel(String bridgeLevel) {
            this.putQueryParameter("BridgeLevel", bridgeLevel);
            this.bridgeLevel = bridgeLevel;
            return this;
        }

        /**
         * <p>The third-party plugin type of the virtual bridge.</p>
         * 
         * <strong>example:</strong>
         * <p>unsr</p>
         */
        public Builder bridgeType(String bridgeType) {
            this.putQueryParameter("BridgeType", bridgeType);
            this.bridgeType = bridgeType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the bridge.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBridge(Boolean enableBridge) {
            this.putQueryParameter("EnableBridge", enableBridge);
            this.enableBridge = enableBridge;
            return this;
        }

        /**
         * <p>The activation code object.</p>
         * 
         * <strong>example:</strong>
         * <p>ab5b76f4c0bf4a5abd06ea23991a47afa1a4bb4acb4e4204882b40795f946e74</p>
         */
        public Builder license(String license) {
            this.putQueryParameter("License", license);
            this.license = license;
            return this;
        }

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-387822****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyOfficeSiteBridgeInfoRequest build() {
            return new ModifyOfficeSiteBridgeInfoRequest(this);
        } 

    } 

}
