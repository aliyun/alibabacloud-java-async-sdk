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
 * {@link CountJobByConditionRequest} extends {@link RequestModel}
 *
 * <p>CountJobByConditionRequest</p>
 */
public class CountJobByConditionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestDbType")
    private String destDbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDbType")
    private String srcDbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CountJobByConditionRequest(Builder builder) {
        super(builder);
        this.destDbType = builder.destDbType;
        this.groupId = builder.groupId;
        this.jobType = builder.jobType;
        this.params = builder.params;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.srcDbType = builder.srcDbType;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountJobByConditionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destDbType
     */
    public String getDestDbType() {
        return this.destDbType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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
     * @return srcDbType
     */
    public String getSrcDbType() {
        return this.srcDbType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CountJobByConditionRequest, Builder> {
        private String destDbType; 
        private String groupId; 
        private String jobType; 
        private String params; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private String srcDbType; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CountJobByConditionRequest request) {
            super(request);
            this.destDbType = request.destDbType;
            this.groupId = request.groupId;
            this.jobType = request.jobType;
            this.params = request.params;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.srcDbType = request.srcDbType;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * <p>The type of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        public Builder destDbType(String destDbType) {
            this.putQueryParameter("DestDbType", destDbType);
            this.destDbType = destDbType;
            return this;
        }

        /**
         * <p>The parent task ID of a distributed synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>pk13r731m****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>MIGRATION</strong>: data migration.</li>
         * <li><strong>SYNC</strong>: data synchronization.</li>
         * <li><strong>SUBSCRIBE</strong>: change tracking.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYNC</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The query value that corresponds to JobType.</p>
         * 
         * <strong>example:</strong>
         * <p>dtspk3f13r731m****</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The region ID used as a filter condition. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The resource group ID. This is a global parameter and does not need to be passed for this API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>资源组ID，全局参数，当前API无需传入。</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The type of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        public Builder srcDbType(String srcDbType) {
            this.putQueryParameter("SrcDbType", srcDbType);
            this.srcDbType = srcDbType;
            return this;
        }

        /**
         * <p>The instance status of the DTS instance. Valid values:</p>
         * <p>Data migration node statuses:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: not started.</li>
         * <li><strong>Prechecking</strong>: running a dry run.</li>
         * <li><strong>PrecheckFailed</strong>: dry run failed.</li>
         * <li><strong>PreCheckPass</strong>: dry run passed.</li>
         * <li><strong>NotConfigured</strong>: not configured.</li>
         * <li><strong>Migrating</strong>: migrating.</li>
         * <li><strong>Suspending</strong>: paused.</li>
         * <li><strong>MigrationFailed</strong>: migration failed.</li>
         * <li><strong>Finished</strong>: finished.</li>
         * <li><strong>Retrying</strong>: retrying.</li>
         * <li><strong>Upgrade</strong>: upgrading.</li>
         * <li><strong>Locked</strong>: locked.</li>
         * <li><strong>Downgrade</strong>: downgrading.</li>
         * </ul>
         * <p>Data synchronization node statuses:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: not started.</li>
         * <li><strong>Prechecking</strong>: running a dry run.</li>
         * <li><strong>PrecheckFailed</strong>: dry run failed.</li>
         * <li><strong>PreCheckPass</strong>: dry run passed.</li>
         * <li><strong>NotConfigured</strong>: not configured.</li>
         * <li><strong>Initializing</strong>: performing initial synchronization.</li>
         * <li><strong>InitializeFailed</strong>: initial synchronization failed.</li>
         * <li><strong>Synchronizing</strong>: synchronizing.</li>
         * <li><strong>Failed</strong>: synchronization failed.</li>
         * <li><strong>Suspending</strong>: paused.</li>
         * <li><strong>Modifying</strong>: modifying sub-objects.</li>
         * <li><strong>Finished</strong>: finished.</li>
         * <li><strong>Retrying</strong>: retrying.</li>
         * <li><strong>Upgrade</strong>: upgrading.</li>
         * <li><strong>Locked</strong>: locked.</li>
         * <li><strong>Downgrade</strong>: downgrading.</li>
         * </ul>
         * <p>Subscribe node statuses:</p>
         * <ul>
         * <li><strong>NotConfigured</strong>: not configured.</li>
         * <li><strong>NotStarted</strong>: not started.</li>
         * <li><strong>Prechecking</strong>: running a dry run.</li>
         * <li><strong>PrecheckFailed</strong>: dry run failed.</li>
         * <li><strong>PreCheckPass</strong>: dry run passed.</li>
         * <li><strong>Starting</strong>: starting.</li>
         * <li><strong>Normal</strong>: Normal.</li>
         * <li><strong>Retrying</strong>: retrying.</li>
         * <li><strong>Abnormal</strong>: abnormal.</li>
         * <li><strong>Upgrade</strong>: upgrading.</li>
         * <li><strong>Locked</strong>: locked.</li>
         * <li><strong>Downgrade</strong>: downgrading.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The query type. Valid values:  </p>
         * <ul>
         * <li><strong>name</strong>: queries by job name.  </li>
         * <li><strong>rds</strong>: queries by destination instance ID.  </li>
         * <li><strong>instance</strong>: queries by DTS instance ID.</li>
         * <li><strong>srcRds</strong>: queries by source instance ID.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter corresponds to the <strong>JobType</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name/instance</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CountJobByConditionRequest build() {
            return new CountJobByConditionRequest(this);
        } 

    } 

}
