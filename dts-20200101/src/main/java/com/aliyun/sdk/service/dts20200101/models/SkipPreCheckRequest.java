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
         * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c7412z57g8k****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The precheck task ID. You can call the <strong>DescribePreCheckStatus</strong> operation to query the task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b4my3zg929a****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to skip the precheck item. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder skip(Boolean skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * <p>The shortened name of the precheck item. Valid values:</p>
         * <ul>
         * <li><strong>[&quot;CHECK_SAME_OBJ&quot;]</strong>: object name conflict.</li>
         * <li><strong>[&quot;CHECK_SAME_USER&quot;]</strong>: username conflict.</li>
         * <li><strong>[&quot;CHECK_SRC&quot;]</strong>: source database version.</li>
         * <li><strong>[&quot;CHECK_TOPOLOGY&quot;]</strong>: topology. For more information about the topologies supported by Data Transmission Service (DTS), see <a href="https://help.aliyun.com/document_detail/124115.html">Synchronization topologies</a>.</li>
         * <li><strong>[&quot;CHECK_SERVER_ID&quot;]</strong>: the server ID of the source database.</li>
         * <li><strong>[&quot;CHECK_DEST_TABLE_EMPTY&quot;]</strong>: existence of objects in the destination database.</li>
         * </ul>
         * <blockquote>
         * <p>Separate multiple item names with commas (,). Example: <strong>[&quot;CHECK_SRC&quot;,&quot;CHECK_SAME_OBJ&quot;]</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;CHECK_SAME_OBJ&quot;]</p>
         */
        public Builder skipPreCheckItems(String skipPreCheckItems) {
            this.putQueryParameter("SkipPreCheckItems", skipPreCheckItems);
            this.skipPreCheckItems = skipPreCheckItems;
            return this;
        }

        /**
         * <p>The precheck item name. This parameter corresponds to <strong>SkipPreCheckItems</strong>. Valid values:</p>
         * <ul>
         * <li><strong>[&quot;CHECK_SAME_OBJ_DETAIL&quot;]</strong>: object name conflict.</li>
         * <li><strong>[&quot;CHECK_SAME_USER_DETAIL&quot;]</strong>: username conflict.</li>
         * <li><strong>[&quot;CHECK_SRC_DETAIL&quot;]</strong>: source database version.</li>
         * <li><strong>[&quot;CHECK_TOPOLOGY_DETAIL&quot;]</strong>: topology. For more information about the topologies supported by DTS, see <a href="https://help.aliyun.com/document_detail/124115.html">Synchronization topologies</a>.</li>
         * <li><strong>[&quot;CHECK_SERVER_ID_DETAIL&quot;]</strong>: the server ID of the source database.</li>
         * <li><strong>[&quot;CHECK_DEST_TABLE_EMPTY_DETAIL&quot;]</strong>: empty tables in the destination database.</li>
         * </ul>
         * <blockquote>
         * <p>Separate multiple item names with commas (,). Example: <strong>[&quot;CHECK_SRC_DETAIL&quot;,&quot;CHECK_SAME_OBJ_DETAIL&quot;]</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;CHECK_SAME_OBJ_DETAIL&quot;]</p>
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
