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
 * {@link DescribeDesktopTypesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDesktopTypesRequest</p>
 */
public class DescribeDesktopTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppliedScope")
    private String appliedScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuCount")
    private Integer cpuCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupIdForModify")
    private String desktopGroupIdForModify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopIdForModify")
    private String desktopIdForModify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopScenario")
    private String desktopScenario;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopTypeId")
    private String desktopTypeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopTypeIdList")
    private java.util.List<String> desktopTypeIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuCount")
    private Float gpuCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuDriverType")
    private String gpuDriverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuMemory")
    private Integer gpuMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemorySize")
    private Integer memorySize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScopeSet")
    private java.util.List<String> scopeSet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportMinSessionCount")
    private Integer supportMinSessionCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeDesktopTypesRequest(Builder builder) {
        super(builder);
        this.appliedScope = builder.appliedScope;
        this.businessChannel = builder.businessChannel;
        this.cpuCount = builder.cpuCount;
        this.desktopGroupIdForModify = builder.desktopGroupIdForModify;
        this.desktopIdForModify = builder.desktopIdForModify;
        this.desktopScenario = builder.desktopScenario;
        this.desktopTypeId = builder.desktopTypeId;
        this.desktopTypeIdList = builder.desktopTypeIdList;
        this.gpuCount = builder.gpuCount;
        this.gpuDriverType = builder.gpuDriverType;
        this.gpuMemory = builder.gpuMemory;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.memorySize = builder.memorySize;
        this.officeSiteId = builder.officeSiteId;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.scopeSet = builder.scopeSet;
        this.sortType = builder.sortType;
        this.supportMinSessionCount = builder.supportMinSessionCount;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDesktopTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appliedScope
     */
    public String getAppliedScope() {
        return this.appliedScope;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return cpuCount
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * @return desktopGroupIdForModify
     */
    public String getDesktopGroupIdForModify() {
        return this.desktopGroupIdForModify;
    }

    /**
     * @return desktopIdForModify
     */
    public String getDesktopIdForModify() {
        return this.desktopIdForModify;
    }

    /**
     * @return desktopScenario
     */
    public String getDesktopScenario() {
        return this.desktopScenario;
    }

    /**
     * @return desktopTypeId
     */
    public String getDesktopTypeId() {
        return this.desktopTypeId;
    }

    /**
     * @return desktopTypeIdList
     */
    public java.util.List<String> getDesktopTypeIdList() {
        return this.desktopTypeIdList;
    }

    /**
     * @return gpuCount
     */
    public Float getGpuCount() {
        return this.gpuCount;
    }

    /**
     * @return gpuDriverType
     */
    public String getGpuDriverType() {
        return this.gpuDriverType;
    }

    /**
     * @return gpuMemory
     */
    public Integer getGpuMemory() {
        return this.gpuMemory;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return scopeSet
     */
    public java.util.List<String> getScopeSet() {
        return this.scopeSet;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return supportMinSessionCount
     */
    public Integer getSupportMinSessionCount() {
        return this.supportMinSessionCount;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeDesktopTypesRequest, Builder> {
        private String appliedScope; 
        private String businessChannel; 
        private Integer cpuCount; 
        private String desktopGroupIdForModify; 
        private String desktopIdForModify; 
        private String desktopScenario; 
        private String desktopTypeId; 
        private java.util.List<String> desktopTypeIdList; 
        private Float gpuCount; 
        private String gpuDriverType; 
        private Integer gpuMemory; 
        private String instanceTypeFamily; 
        private Integer memorySize; 
        private String officeSiteId; 
        private String orderBy; 
        private String orderType; 
        private String regionId; 
        private String scope; 
        private java.util.List<String> scopeSet; 
        private String sortType; 
        private Integer supportMinSessionCount; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDesktopTypesRequest request) {
            super(request);
            this.appliedScope = request.appliedScope;
            this.businessChannel = request.businessChannel;
            this.cpuCount = request.cpuCount;
            this.desktopGroupIdForModify = request.desktopGroupIdForModify;
            this.desktopIdForModify = request.desktopIdForModify;
            this.desktopScenario = request.desktopScenario;
            this.desktopTypeId = request.desktopTypeId;
            this.desktopTypeIdList = request.desktopTypeIdList;
            this.gpuCount = request.gpuCount;
            this.gpuDriverType = request.gpuDriverType;
            this.gpuMemory = request.gpuMemory;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.memorySize = request.memorySize;
            this.officeSiteId = request.officeSiteId;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.scopeSet = request.scopeSet;
            this.sortType = request.sortType;
            this.supportMinSessionCount = request.supportMinSessionCount;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The applicable scope of the specification. Default value: <code>Public</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder appliedScope(String appliedScope) {
            this.putQueryParameter("AppliedScope", appliedScope);
            this.appliedScope = appliedScope;
            return this;
        }

        /**
         * <p>The business channel. Valid values:
         * Enterprise: Enterprise Edition.
         * Business: Business Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cpuCount(Integer cpuCount) {
            this.putQueryParameter("CpuCount", cpuCount);
            this.cpuCount = cpuCount;
            return this;
        }

        /**
         * <p>The ID of the shared cloud computer for which you want to change the specification. If this parameter is specified, the response includes compatibility information between the specification and the shared cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-abcdefg****</p>
         */
        public Builder desktopGroupIdForModify(String desktopGroupIdForModify) {
            this.putQueryParameter("DesktopGroupIdForModify", desktopGroupIdForModify);
            this.desktopGroupIdForModify = desktopGroupIdForModify;
            return this;
        }

        /**
         * <p>The ID of the cloud computer for which you want to change the specification. If this parameter is specified, the response includes compatibility information between the specification and the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        public Builder desktopIdForModify(String desktopIdForModify) {
            this.putQueryParameter("DesktopIdForModify", desktopIdForModify);
            this.desktopIdForModify = desktopIdForModify;
            return this;
        }

        /**
         * <p>The scenarios of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>office</p>
         */
        public Builder desktopScenario(String desktopScenario) {
            this.putQueryParameter("DesktopScenario", desktopScenario);
            this.desktopScenario = desktopScenario;
            return this;
        }

        /**
         * <p>The specification ID.</p>
         * <blockquote>
         * <p>If both <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> are left empty, information about all cloud computer specifications is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecd.graphics.xlarge</p>
         */
        public Builder desktopTypeId(String desktopTypeId) {
            this.putQueryParameter("DesktopTypeId", desktopTypeId);
            this.desktopTypeId = desktopTypeId;
            return this;
        }

        /**
         * <p>The list of specification IDs.</p>
         */
        public Builder desktopTypeIdList(java.util.List<String> desktopTypeIdList) {
            this.putQueryParameter("DesktopTypeIdList", desktopTypeIdList);
            this.desktopTypeIdList = desktopTypeIdList;
            return this;
        }

        /**
         * <p>The number of GPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpuCount(Float gpuCount) {
            this.putQueryParameter("GpuCount", gpuCount);
            this.gpuCount = gpuCount;
            return this;
        }

        /**
         * <p>The GPU driver type.</p>
         * 
         * <strong>example:</strong>
         * <p>A10</p>
         */
        public Builder gpuDriverType(String gpuDriverType) {
            this.putQueryParameter("GpuDriverType", gpuDriverType);
            this.gpuDriverType = gpuDriverType;
            return this;
        }

        /**
         * <p>The GPU memory size. This parameter is meaningful only for GPU-accelerated cloud computers. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder gpuMemory(Integer gpuMemory) {
            this.putQueryParameter("GpuMemory", gpuMemory);
            this.gpuMemory = gpuMemory;
            return this;
        }

        /**
         * <p>The instance family name.</p>
         * <blockquote>
         * <p>If both <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> are left empty, information about all cloud computer specifications is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecd.graphics</p>
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder memorySize(Integer memorySize) {
            this.putQueryParameter("MemorySize", memorySize);
            this.memorySize = memorySize;
            return this;
        }

        /**
         * <p>The ID of the office network to which the shared cloud computer belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+os-c5cy7q578s8jc****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>The field by which to sort the results. If this parameter is not specified, results are sorted by creation time in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>Memory</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The order type.</p>
         * 
         * <strong>example:</strong>
         * <p>DOWNGRADE</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by WUYING Workspace.</p>
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
         * <p>The billing method of the specification.</p>
         * 
         * <strong>example:</strong>
         * <p>FastBuy</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The list of applicable scopes.</p>
         */
        public Builder scopeSet(java.util.List<String> scopeSet) {
            this.putQueryParameter("ScopeSet", scopeSet);
            this.scopeSet = scopeSet;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * <p>The minimum number of multi-sessions supported by the specification.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder supportMinSessionCount(Integer supportMinSessionCount) {
            this.putQueryParameter("SupportMinSessionCount", supportMinSessionCount);
            this.supportMinSessionCount = supportMinSessionCount;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeDesktopTypesRequest build() {
            return new DescribeDesktopTypesRequest(this);
        } 

    } 

}
