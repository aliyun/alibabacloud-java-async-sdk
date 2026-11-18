// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeTairAIGatewayInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTairAIGatewayInstancesRequest</p>
 */
public class DescribeTairAIGatewayInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expired")
    private String expired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeTairAIGatewayInstancesRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.expired = builder.expired;
        this.instanceIds = builder.instanceIds;
        this.instanceStatus = builder.instanceStatus;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.searchKey = builder.searchKey;
        this.securityToken = builder.securityToken;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTairAIGatewayInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return expired
     */
    public String getExpired() {
        return this.expired;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
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

    public static final class Builder extends Request.Builder<DescribeTairAIGatewayInstancesRequest, Builder> {
        private String chargeType; 
        private String expired; 
        private String instanceIds; 
        private String instanceStatus; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String searchKey; 
        private String securityToken; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTairAIGatewayInstancesRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.expired = request.expired;
            this.instanceIds = request.instanceIds;
            this.instanceStatus = request.instanceStatus;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.searchKey = request.searchKey;
            this.securityToken = request.securityToken;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The expiration status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The instance has expired.</li>
         * <li><strong>false</strong>: The instance has not expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder expired(String expired) {
            this.putQueryParameter("Expired", expired);
            this.expired = expired;
            return this;
        }

        /**
         * <p>The IDs of the instances to query.</p>
         * <blockquote>
         * <p>Separate multiple instance IDs with commas (,). You can specify up to 30 instance IDs in a single request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tg-2zezxszhcgatnx****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The instance is running.</li>
         * <li><strong>Creating</strong>: The instance is being created.</li>
         * <li><strong>Changing</strong>: The instance is being modified.</li>
         * <li><strong>Inactive</strong>: The instance is disabled.</li>
         * <li><strong>Flushing</strong>: The instance data is being purged.</li>
         * <li><strong>Released</strong>: The instance is released.</li>
         * <li><strong>Transforming</strong>: The instance is being transformed.</li>
         * <li><strong>Migrating</strong>: The instance is being migrated.</li>
         * <li><strong>BackupRecovering</strong>: The instance is recovering from a backup.</li>
         * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being upgraded.</li>
         * <li><strong>NetworkModifying</strong>: The network of the instance is being modified.</li>
         * <li><strong>SSLModifying</strong>: The SSL configuration of the instance is being modified.</li>
         * <li><strong>MajorVersionUpgrading</strong>: A major engine version upgrade is in progress. The instance remains accessible.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about instance statuses and impacts, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance statuses and impacts</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.putQueryParameter("InstanceStatus", instanceStatus);
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The search keyword. Fuzzy search is supported for instance names or instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The ID of the vSwitch in the VPC. You can call the <a href="https://help.aliyun.com/document_detail/35739.html">DescribeVpcs</a> operation to query the vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeTairAIGatewayInstancesRequest build() {
            return new DescribeTairAIGatewayInstancesRequest(this);
        } 

    } 

}
