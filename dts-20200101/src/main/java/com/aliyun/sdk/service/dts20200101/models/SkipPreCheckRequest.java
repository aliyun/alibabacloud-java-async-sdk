// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipPreCheckRequest} extends {@link RequestModel}
 *
 * <p>SkipPreCheckRequest</p>
 */
public class SkipPreCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skip")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean skip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipPreCheckItems")
    private String skipPreCheckItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipPreCheckNames")
    private String skipPreCheckNames;

    private SkipPreCheckRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.jobId = builder.jobId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.skip = builder.skip;
        this.skipPreCheckItems = builder.skipPreCheckItems;
        this.skipPreCheckNames = builder.skipPreCheckNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipPreCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return skip
     */
    public Boolean getSkip() {
        return this.skip;
    }

    /**
     * @return skipPreCheckItems
     */
    public String getSkipPreCheckItems() {
        return this.skipPreCheckItems;
    }

    /**
     * @return skipPreCheckNames
     */
    public String getSkipPreCheckNames() {
        return this.skipPreCheckNames;
    }

    public static final class Builder extends Request.Builder<SkipPreCheckRequest, Builder> {
        private String dtsJobId; 
        private String jobId; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean skip; 
        private String skipPreCheckItems; 
        private String skipPreCheckNames; 

        private Builder() {
            super();
        } 

        private Builder(SkipPreCheckRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.jobId = request.jobId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.skip = request.skip;
            this.skipPreCheckItems = request.skipPreCheckItems;
            this.skipPreCheckNames = request.skipPreCheckNames;
        } 

        /**
         * The ID of the data migration, data synchronization, or change tracking task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The ID of the precheck task. You can call the **DescribePreCheckStatus** operation to query the task ID.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Specifies whether to skip the precheck item. Valid values:
         * <p>
         * 
         * *   **true**: skips the precheck item.
         * *   **false**: does not skip the precheck item.
         * 
         * >  This parameter is required.
         */
        public Builder skip(Boolean skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * The shortened name of the precheck item. Valid values:
         * <p>
         * 
         * *   **CHECK_SAME_OBJ**: object name conflict
         * 
         * *   **CHECK_SAME_USER**: multiple usernames for one instance
         * 
         * *   **CHECK_SRC**: source database version
         * 
         * *   **CHECK_TOPOLOGY**: topology type
         * 
         * > For more information about the topologies supported by DTS, see [Synchronization topologies](~~124115~~).
         * 
         * *   **CHECK_SERVER_ID**: the server ID of the source database
         * 
         * >  Separate multiple shortened names with commas (,).
         */
        public Builder skipPreCheckItems(String skipPreCheckItems) {
            this.putQueryParameter("SkipPreCheckItems", skipPreCheckItems);
            this.skipPreCheckItems = skipPreCheckItems;
            return this;
        }

        /**
         * The name of the precheck item. This parameter corresponds to the **SkipPreCheckItems** parameter. Valid values:
         * <p>
         * 
         * *   **CHECK_SAME_OBJ_DETAIL**: object name conflict
         * 
         * *   **CHECK_SAME_USER_DETAIL**: multiple usernames for one instance
         * 
         * *   **CHECK_SRC_DETAIL**: source database version
         * 
         * *   **CHECK_TOPOLOGY_DETAIL**: topology type
         * 
         * > For more information about the topologies supported by DTS, see [Synchronization topologies](~~124115~~).
         * 
         * *   **CHECK_SERVER_ID_DETAIL**: the server ID of the source database
         * 
         * >  Separate multiple item names with commas (,).
         */
        public Builder skipPreCheckNames(String skipPreCheckNames) {
            this.putQueryParameter("SkipPreCheckNames", skipPreCheckNames);
            this.skipPreCheckNames = skipPreCheckNames;
            return this;
        }

        @Override
        public SkipPreCheckRequest build() {
            return new SkipPreCheckRequest(this);
        } 

    } 

}
