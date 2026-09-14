// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CreateSupabaseProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateSupabaseProjectRequest</p>
 */
public class CreateSupabaseProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoScale")
    private Boolean autoScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskPerformanceLevel")
    private String diskPerformanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lightweight")
    private Boolean lightweight;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateSupabaseProjectRequest(Builder builder) {
        super(builder);
        this.accountPassword = builder.accountPassword;
        this.autoScale = builder.autoScale;
        this.clientToken = builder.clientToken;
        this.diskPerformanceLevel = builder.diskPerformanceLevel;
        this.engineVersion = builder.engineVersion;
        this.lightweight = builder.lightweight;
        this.payType = builder.payType;
        this.period = builder.period;
        this.projectName = builder.projectName;
        this.projectSpec = builder.projectSpec;
        this.regionId = builder.regionId;
        this.securityIPList = builder.securityIPList;
        this.storageSize = builder.storageSize;
        this.tags = builder.tags;
        this.usedTime = builder.usedTime;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSupabaseProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return autoScale
     */
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diskPerformanceLevel
     */
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return lightweight
     */
    public Boolean getLightweight() {
        return this.lightweight;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return projectSpec
     */
    public String getProjectSpec() {
        return this.projectSpec;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateSupabaseProjectRequest, Builder> {
        private String accountPassword; 
        private Boolean autoScale; 
        private String clientToken; 
        private String diskPerformanceLevel; 
        private String engineVersion; 
        private Boolean lightweight; 
        private String payType; 
        private String period; 
        private String projectName; 
        private String projectSpec; 
        private String regionId; 
        private String securityIPList; 
        private Long storageSize; 
        private java.util.List<Tags> tags; 
        private String usedTime; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSupabaseProjectRequest request) {
            super(request);
            this.accountPassword = request.accountPassword;
            this.autoScale = request.autoScale;
            this.clientToken = request.clientToken;
            this.diskPerformanceLevel = request.diskPerformanceLevel;
            this.engineVersion = request.engineVersion;
            this.lightweight = request.lightweight;
            this.payType = request.payType;
            this.period = request.period;
            this.projectName = request.projectName;
            this.projectSpec = request.projectSpec;
            this.regionId = request.regionId;
            this.securityIPList = request.securityIPList;
            this.storageSize = request.storageSize;
            this.tags = request.tags;
            this.usedTime = request.usedTime;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The password of the initial account.</p>
         * <p>Password rules:</p>
         * <ul>
         * <li>The password must be 8 to 32 characters in length.</li>
         * <li>The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>Supported special characters include !@#$%^&amp;*()_+-=.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestPassword123!</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto start/stop. If this parameter is not specified, the default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoScale(Boolean autoScale) {
            this.putQueryParameter("AutoScale", autoScale);
            this.autoScale = autoScale;
            return this;
        }

        /**
         * <p>The idempotency token. Ensures that duplicate requests do not result in duplicate operations.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The performance level (PL) of the cloud disk. If this parameter is not specified, the default value PL0 is used.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PL0</li>
         * <li>PL1</li>
         * <li>PL2</li>
         * <li>PL3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        public Builder diskPerformanceLevel(String diskPerformanceLevel) {
            this.putQueryParameter("DiskPerformanceLevel", diskPerformanceLevel);
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }

        /**
         * <p>The DPI engine version. If this parameter is not specified, the default value PG15 is used. PG17 and later versions support the data sandbox (branch) feature.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PG15: PostgreSQL 15.</li>
         * <li>PG17: PostgreSQL 17, which supports the data sandbox feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PG15</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * Lightweight.
         */
        public Builder lightweight(Boolean lightweight) {
            this.putQueryParameter("Lightweight", lightweight);
            this.lightweight = lightweight;
            return this;
        }

        /**
         * <p>The billing type. If this parameter is not specified, the default value Free is used.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Free: Free tier.</li>
         * <li>Postpaid: Pay-as-you-go.</li>
         * <li>Prepaid: Subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Free</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter takes effect only when PayType is set to PrePay. If this parameter is not specified, the default value Month is used.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Month: month.</li>
         * <li>Year: year.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The name of the Supabase project.</p>
         * <p>Naming rules:</p>
         * <ul>
         * <li>The name must be 1 to 128 characters in length.</li>
         * <li>The name can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start with a letter or an underscore (_).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase_demo</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The specifications of the Supabase project. The Free billing type uses free-tier specifications. For paid billing types, the specifications must match those available in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2C4G</p>
         */
        public Builder projectSpec(String projectSpec) {
            this.putQueryParameter("ProjectSpec", projectSpec);
            this.projectSpec = projectSpec;
            return this;
        }

        /**
         * <p>The region ID. Specifies the region in which to create the project.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The IP address whitelist. Separate multiple IP addresses or CIDR blocks with commas (,). If this parameter is not specified, the default value 0.0.0.0/0 is used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The storage size, in GB. If this parameter is not specified for non-Free billing types, the default value is 1 GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder storageSize(Long storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The subscription duration. This parameter takes effect only when PayType is set to PrePay. If this parameter is not specified, the default value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The vSwitch ID. This parameter is required. The zone of the vSwitch must be the same as the value of ZoneId.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1234567890</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC). This parameter is required.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1234567890</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID. The zone of the vSwitch specified by VSwitchId must be the same as this parameter value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateSupabaseProjectRequest build() {
            return new CreateSupabaseProjectRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSupabaseProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateSupabaseProjectRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
