// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link UpgradeKernelVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeKernelVersionRequest</p>
 */
public class UpgradeKernelVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KernelVersion")
    private String kernelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchTime")
    private Long switchTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeTime")
    private String upgradeTime;

    private UpgradeKernelVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.kernelVersion = builder.kernelVersion;
        this.lang = builder.lang;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.switchTime = builder.switchTime;
        this.upgradeTime = builder.upgradeTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeKernelVersionRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return this.kernelVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return switchTime
     */
    public Long getSwitchTime() {
        return this.switchTime;
    }

    /**
     * @return upgradeTime
     */
    public String getUpgradeTime() {
        return this.upgradeTime;
    }

    public static final class Builder extends Request.Builder<UpgradeKernelVersionRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String kernelVersion; 
        private String lang; 
        private String productCode; 
        private Long productId; 
        private Long switchTime; 
        private String upgradeTime; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeKernelVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.kernelVersion = request.kernelVersion;
            this.lang = request.lang;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.switchTime = request.switchTime;
            this.upgradeTime = request.upgradeTime;
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
         * <p>The database instance identity. You can obtain the value from Items[].InstanceId in the response of the ListDataMaskingInstances operation.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The target Milvus version. You can obtain the value from KernelVersions[].KernelVersion in the response of the ListMiniEngineVersions operation.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_20220731</p>
         */
        public Builder kernelVersion(String kernelVersion) {
            this.putQueryParameter("KernelVersion", kernelVersion);
            this.kernelVersion = kernelVersion;
            return this;
        }

        /**
         * <p>The language of the response description. Valid values:</p>
         * <ul>
         * <li>zh: Chinese.</li>
         * <li>en: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two values must match.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The identifier of the cloud service type. Valid values:</p>
         * <ul>
         * <li>5: RDS.</li>
         * <li>8: POLARDB.</li>
         * <li>27: PolarDBX2.
         * If this parameter is specified together with ProductCode, the values must match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * <p>The specified upgrade time. The value is a UNIX timestamp in milliseconds that have elapsed since 1970-01-01 00:00:00 UTC. Specify this parameter only when UpgradeTime is set to SpecifyTime, and the time must be later than the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1893456000000</p>
         */
        public Builder switchTime(Long switchTime) {
            this.putQueryParameter("SwitchTime", switchTime);
            this.switchTime = switchTime;
            return this;
        }

        /**
         * <p>The execution time of the kernel upgrade. Valid values:</p>
         * <ul>
         * <li>Immediate: Executes the upgrade immediately.</li>
         * <li>MaintainTime: Executes the upgrade during the maintenance window.</li>
         * <li>SpecifyTime: Executes the upgrade at a specified time.
         * PolarDB-X 2.0 does not support SpecifyTime.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaintainTime</p>
         */
        public Builder upgradeTime(String upgradeTime) {
            this.putQueryParameter("UpgradeTime", upgradeTime);
            this.upgradeTime = upgradeTime;
            return this;
        }

        @Override
        public UpgradeKernelVersionRequest build() {
            return new UpgradeKernelVersionRequest(this);
        } 

    } 

}
