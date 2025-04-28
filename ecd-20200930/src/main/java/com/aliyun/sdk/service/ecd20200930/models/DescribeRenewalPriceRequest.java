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
 * {@link DescribeRenewalPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRenewalPriceRequest</p>
 */
public class DescribeRenewalPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private DescribeRenewalPriceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRenewalPriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeRenewalPriceRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> instanceIds; 
        private Integer period; 
        private String periodUnit; 
        private String regionId; 
        private Long resellerOwnerUid; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRenewalPriceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The instance ID. The value you specify depends on the resource type (ResourceType) you&quot;re querying the renewal price for.</p>
         * <ul>
         * <li>When <code>ResourceType</code> is set to <code>Desktop</code>, you must provide the cloud computer ID as the value of <code>InstanceId</code>.</li>
         * <li>When <code>ResourceType</code> is set to <code>DesktopGroup</code>, you must provide the share ID as the value of <code>InstanceId</code>.</li>
         * <li>When <code>ResourceType</code> is set to <code>Bandwidth</code>, you must provide the ID of the premium bandwidth plan as the value of <code>InstanceId</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecd-6ldllk9zxcpfhs****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance IDs. The value you specify depends on the resource type (ResourceType) you&quot;re querying the renewal price for.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The renewal duration. The valid values for this parameter depend on the value of <code>PeriodUnit</code>.</p>
         * <ul>
         * <li>If you set <code>PeriodUnit</code> to <code>Month</code>, set the value of this parameter to 1, 2, 3, or 6.</li>
         * <li>If you set <code>PeriodUnit</code> to <code>Year</code>, set the value of this parameter to 1, 2, or 3.</li>
         * </ul>
         * <p>Default value: 1.</p>
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
         * <p>The unit of the renewal duration specified by <code>Period</code>.</p>
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
         * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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

        /**
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Desktop (default): cloud computers.</li>
         * <li>Bandwidth: premium bandwidth plans.</li>
         * <li>DesktopGroup: cloud computer shares.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desktop</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeRenewalPriceRequest build() {
            return new DescribeRenewalPriceRequest(this);
        } 

    } 

}
