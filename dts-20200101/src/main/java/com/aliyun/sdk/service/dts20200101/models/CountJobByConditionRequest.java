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
         * <p>The ID of the DTS task.</p>
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
         * <p>The type of the DTS task. Valid values:</p>
         * <ul>
         * <li><strong>MIGRATION</strong>: data migration task</li>
         * <li><strong>SYNC</strong>: data synchronization task</li>
         * <li><strong>SUBSCRIBE</strong>: change tracking task</li>
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
         * <p>The content of the query condition, which corresponds to the value of the JobType parameter.</p>
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
         * <p>One of the query conditions. The ID of the region. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>Resource group ID, global parameter that does not need to be passed in by the current API.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource group ID, global parameter that does not need to be passed in by the current API.</p>
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
         * <p>The status of the DTS task.</p>
         * <p>Valid values for a data migration task:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is in precheck.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
         * <li><strong>NotConfigured</strong>: The task is not configured.</li>
         * <li><strong>Migrating</strong>: The task is in progress.</li>
         * <li><strong>Suspending</strong>: The task is paused.</li>
         * <li><strong>MigrationFailed</strong>: The task failed to migrate data.</li>
         * <li><strong>Finished</strong>: The task is complete.</li>
         * <li><strong>Retrying</strong>: The task is being retried.</li>
         * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
         * <li><strong>Locked</strong>: The task is locked.</li>
         * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
         * </ul>
         * <p>Valid values for a data synchronization task:</p>
         * <ul>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is in precheck.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
         * <li><strong>NotConfigured</strong>: The task is not configured.</li>
         * <li><strong>Initializing</strong>: The task is performing initial synchronization.</li>
         * <li><strong>InitializeFailed</strong>: Initial synchronization failed.</li>
         * <li><strong>Synchronizing</strong>: The task is in progress.</li>
         * <li><strong>Failed</strong>: The task failed to synchronize data.</li>
         * <li><strong>Suspending</strong>: The task is paused.</li>
         * <li><strong>Modifying</strong>: The objects in the task are being modified.</li>
         * <li><strong>Finished</strong>: The task is complete.</li>
         * <li><strong>Retrying</strong>: The task is being retried.</li>
         * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
         * <li><strong>Locked</strong>: The task is locked.</li>
         * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
         * </ul>
         * <p>Valid values for a change tracking task:</p>
         * <ul>
         * <li><strong>NotConfigured</strong>: The task is not configured.</li>
         * <li><strong>NotStarted</strong>: The task is not started.</li>
         * <li><strong>Prechecking</strong>: The task is in precheck.</li>
         * <li><strong>PrecheckFailed</strong>: The task failed to pass the precheck.</li>
         * <li><strong>PreCheckPass</strong>: The task passed the precheck.</li>
         * <li><strong>Starting</strong>: The task is being started.</li>
         * <li><strong>Normal</strong>: The task is running as expected.</li>
         * <li><strong>Retrying</strong>: The task is being retried.</li>
         * <li><strong>Abnormal</strong>: The task is not running as expected.</li>
         * <li><strong>Upgrade</strong>: The task is being upgraded.</li>
         * <li><strong>Locked</strong>: The task is locked.</li>
         * <li><strong>Downgrade</strong>: The task is being downgraded.</li>
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
         * <p>The content of the query condition. Valid values:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the task</li>
         * <li><strong>rds</strong>: the ID of the destination instance</li>
         * <li><strong>instance</strong>: the ID of the Data Transmission Service (DTS) instance</li>
         * <li><strong>srcRds</strong>: the ID of the source instance</li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter corresponds to the value of the <strong>JobType</strong> parameter.</p>
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
