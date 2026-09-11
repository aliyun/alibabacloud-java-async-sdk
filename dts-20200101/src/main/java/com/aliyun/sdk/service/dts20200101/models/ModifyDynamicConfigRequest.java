// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ModifyDynamicConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDynamicConfigRequest</p>
 */
public class ModifyDynamicConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private String configList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableLimit")
    private Boolean enableLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyDynamicConfigRequest(Builder builder) {
        super(builder);
        this.configList = builder.configList;
        this.dtsJobId = builder.dtsJobId;
        this.enableLimit = builder.enableLimit;
        this.jobCode = builder.jobCode;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDynamicConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configList
     */
    public String getConfigList() {
        return this.configList;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return enableLimit
     */
    public Boolean getEnableLimit() {
        return this.enableLimit;
    }

    /**
     * @return jobCode
     */
    public String getJobCode() {
        return this.jobCode;
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

    public static final class Builder extends Request.Builder<ModifyDynamicConfigRequest, Builder> {
        private String configList; 
        private String dtsJobId; 
        private Boolean enableLimit; 
        private String jobCode; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDynamicConfigRequest request) {
            super(request);
            this.configList = request.configList;
            this.dtsJobId = request.dtsJobId;
            this.enableLimit = request.enableLimit;
            this.jobCode = request.jobCode;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The rate limit configurations.</p>
         * <ul>
         * <li><strong>dts.datamove.blaster.qps.max</strong>: the queries per second (QPS) for querying the source database.</li>
         * <li><strong>dts.datamove.source.rps.max</strong>: the records per second (RPS) for full data synchronization or migration.</li>
         * <li><strong>dts.datamove.source.bps.max</strong>: the data volume per second for full data synchronization or migration. Unit: bytes per second.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If <strong>JobCode</strong> is set to <strong>03</strong>, you must set <strong>EnableLimit</strong> to <strong>true</strong> for the three parameters to take effect.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If <strong>JobCode</strong> is set to <strong>04</strong> or <strong>07</strong>, you only need to configure <strong>dts.datamove.source.rps.max</strong> and <strong>dts.datamove.source.bps.max</strong>.</li>
         * <li>A value of <strong>-1</strong> indicates that no rate limit is applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;dts.datamove.source.rps.max&quot;: 5000,
         *       &quot;dts.datamove.source.bps.max&quot;: 10485760
         * }</p>
         */
        public Builder configList(String configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
            return this;
        }

        /**
         * <p>The ID of the data synchronization or migration task.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to obtain the task ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ta7w132u12h****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>Specifies whether to limit the migration rate of the full data synchronization or migration task. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>JobCode</strong> is set to <strong>03</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableLimit(Boolean enableLimit) {
            this.putQueryParameter("EnableLimit", enableLimit);
            this.enableLimit = enableLimit;
            return this;
        }

        /**
         * <p>The task code. Valid values:</p>
         * <ul>
         * <li><strong>03</strong>: full data synchronization or migration task.</li>
         * <li><strong>04</strong>: incremental data migration task.</li>
         * <li><strong>07</strong>: incremental data synchronization task.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>07</p>
         */
        public Builder jobCode(String jobCode) {
            this.putQueryParameter("JobCode", jobCode);
            this.jobCode = jobCode;
            return this;
        }

        /**
         * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz6zsi7ce5rpy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyDynamicConfigRequest build() {
            return new ModifyDynamicConfigRequest(this);
        } 

    } 

}
