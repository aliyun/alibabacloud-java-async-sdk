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
         * <p>The specific throttling configuration.</p>
         * <ul>
         * <li><strong>dts.datamove.blaster.qps.max</strong>: The rate at which queries are made to the source database per second.</li>
         * <li><strong>dts.datamove.source.rps.max</strong>: The number of rows that are fully synchronized or migrated per second.</li>
         * <li><strong>dts.datamove.source.bps.max</strong>: the amount of data processed per second for full synchronization or migration. Unit: MB.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set the <strong>JobCode</strong> parameter to <strong>03</strong>, you need to specify <strong>true</strong> for the <strong>EnableLimit</strong> parameter. Otherwise, the configuration cannot take effect.</p>
         * </li>
         * <li><p>If you set the <strong>JobCode</strong> parameter to <strong>04</strong> or <strong>07</strong>, you only need to specify the <strong>dts.datamove.source.rps.max</strong> and <strong>dts.datamove.source.bps.max</strong> parameters.</p>
         * </li>
         * <li><p>A value of **-1** indicates no rate limit.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;dts.datamove.source.rps.max&quot;:5000,&quot;dts.datamove.source.bps.max&quot;:10485760}</p>
         */
        public Builder configList(String configList) {
            this.putQueryParameter("ConfigList", configList);
            this.configList = configList;
            return this;
        }

        /**
         * <p>The ID of the data migration or synchronization task.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
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
         * <p>Specifies whether to enable throttling for data synchronization or migration. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p> Only needs to be configured when the <strong>JobCode</strong> parameter is set to <strong>03</strong>.</p>
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
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>03</strong>: a full data synchronization or full data migration task.</li>
         * <li><strong>04</strong>: an incremental data migration task.</li>
         * <li><strong>07</strong>: an incremental data synchronization task.</li>
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
         * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>Resource group ID.</p>
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
