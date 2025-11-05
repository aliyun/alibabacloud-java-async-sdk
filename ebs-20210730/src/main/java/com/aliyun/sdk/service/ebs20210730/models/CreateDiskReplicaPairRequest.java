// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link CreateDiskReplicaPairRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskReplicaPairRequest</p>
 */
public class CreateDiskReplicaPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationDiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationDiskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRtc")
    private Boolean enableRtc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PairName")
    private String pairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Long period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RPO")
    private Long RPO;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateDiskReplicaPairRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destinationDiskId = builder.destinationDiskId;
        this.destinationRegionId = builder.destinationRegionId;
        this.destinationZoneId = builder.destinationZoneId;
        this.diskId = builder.diskId;
        this.enableRtc = builder.enableRtc;
        this.pairName = builder.pairName;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.RPO = builder.RPO;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceZoneId = builder.sourceZoneId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskReplicaPairRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationDiskId
     */
    public String getDestinationDiskId() {
        return this.destinationDiskId;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return destinationZoneId
     */
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return enableRtc
     */
    public Boolean getEnableRtc() {
        return this.enableRtc;
    }

    /**
     * @return pairName
     */
    public String getPairName() {
        return this.pairName;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return RPO
     */
    public Long getRPO() {
        return this.RPO;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceZoneId
     */
    public String getSourceZoneId() {
        return this.sourceZoneId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateDiskReplicaPairRequest, Builder> {
        private Long bandwidth; 
        private String chargeType; 
        private String clientToken; 
        private String description; 
        private String destinationDiskId; 
        private String destinationRegionId; 
        private String destinationZoneId; 
        private String diskId; 
        private Boolean enableRtc; 
        private String pairName; 
        private Long period; 
        private String periodUnit; 
        private Long RPO; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceZoneId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskReplicaPairRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destinationDiskId = request.destinationDiskId;
            this.destinationRegionId = request.destinationRegionId;
            this.destinationZoneId = request.destinationZoneId;
            this.diskId = request.diskId;
            this.enableRtc = request.enableRtc;
            this.pairName = request.pairName;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.RPO = request.RPO;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceZoneId = request.sourceZoneId;
            this.tag = request.tag;
        } 

        /**
         * <p>The bandwidth to use to asynchronously replicate data from the primary disk to the secondary disk. Unit: Kbit/s. Valid values:</p>
         * <ul>
         * <li>10240</li>
         * <li>20480</li>
         * <li>51200</li>
         * <li>102400</li>
         * </ul>
         * <p>Default value: 10240. When you set the ChargeType parameter to POSTPAY, the Bandwidth parameter is automatically set to 0 and cannot be modified. The value 0 indicates that bandwidth is dynamically allocated based on the volume of data that is asynchronously replicated from the primary disk to the secondary disk.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The billing method of the replication pair. Valid values:</p>
         * <ul>
         * <li>PREPAY: subscription</li>
         * <li>POSTPAY: pay-as-you-go</li>
         * </ul>
         * <p>Default value: POSTPAY.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the replication pair. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the secondary disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-sa1f82p58p1tdw9g****</p>
         */
        public Builder destinationDiskId(String destinationDiskId) {
            this.putQueryParameter("DestinationDiskId", destinationDiskId);
            this.destinationDiskId = destinationDiskId;
            return this;
        }

        /**
         * <p>The region ID of the secondary disk. You can call the <a href="https://help.aliyun.com/document_detail/354276.html">DescribeRegions</a> operation to query the most recent list of regions in which async replication is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * <p>The zone ID of the secondary disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        public Builder destinationZoneId(String destinationZoneId) {
            this.putQueryParameter("DestinationZoneId", destinationZoneId);
            this.destinationZoneId = destinationZoneId;
            return this;
        }

        /**
         * <p>The ID of the primary disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-iq80sgp4d0xbk24q****</p>
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>Whether to enable replication time control. By default, this parameter is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRtc(Boolean enableRtc) {
            this.putQueryParameter("EnableRtc", enableRtc);
            this.enableRtc = enableRtc;
            return this;
        }

        /**
         * <p>The name of the replication pair. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>TestReplicaPair</p>
         */
        public Builder pairName(String pairName) {
            this.putQueryParameter("PairName", pairName);
            this.pairName = pairName;
            return this;
        }

        /**
         * <p>The subscription duration of the replication pair. When <code>ChargeType</code> is set to PREPAY, this parameter must be specified. Valid values: 1, 2, 3, 6, 12, 24, 36, and 60. The subscription duration unit is specified by <code>PeriodUnit</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The unit of the subscription duration of the replication pair. Set the value to Month. Valid value: Month</p>
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
         * <p>The recovery point objective (RPO) of the replication pair. Unit: seconds. Valid value: 900.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder RPO(Long RPO) {
            this.putQueryParameter("RPO", RPO);
            this.RPO = RPO;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the replication pair.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the replication pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvs****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The zone ID of the primary disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        public Builder sourceZoneId(String sourceZoneId) {
            this.putQueryParameter("SourceZoneId", sourceZoneId);
            this.sourceZoneId = sourceZoneId;
            return this;
        }

        /**
         * <p>The tags to add to the replication pair-consistent group. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateDiskReplicaPairRequest build() {
            return new CreateDiskReplicaPairRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDiskReplicaPairRequest} extends {@link TeaModel}
     *
     * <p>CreateDiskReplicaPairRequest</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
