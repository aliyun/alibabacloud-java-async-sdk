// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link RebootRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>RebootRCInstancesRequest</p>
 */
public class RebootRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BatchOptimization")
    private String batchOptimization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceReboot")
    private Boolean forceReboot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private RebootRCInstancesRequest(Builder builder) {
        super(builder);
        this.batchOptimization = builder.batchOptimization;
        this.forceReboot = builder.forceReboot;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootRCInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchOptimization
     */
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    /**
     * @return forceReboot
     */
    public Boolean getForceReboot() {
        return this.forceReboot;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RebootRCInstancesRequest, Builder> {
        private String batchOptimization; 
        private Boolean forceReboot; 
        private java.util.List<String> instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RebootRCInstancesRequest request) {
            super(request);
            this.batchOptimization = request.batchOptimization;
            this.forceReboot = request.forceReboot;
            this.instanceIds = request.instanceIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The batch operation mode. Set the value to <strong>AllTogether</strong>. In this mode, if all specified instances are restarted, a success message is returned. If an instance fails the verification, none of the specified instances can be restarted and an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AllTogether</p>
         */
        public Builder batchOptimization(String batchOptimization) {
            this.putQueryParameter("BatchOptimization", batchOptimization);
            this.batchOptimization = batchOptimization;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully restart the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceReboot(Boolean forceReboot) {
            this.putQueryParameter("ForceReboot", forceReboot);
            this.forceReboot = forceReboot;
            return this;
        }

        /**
         * <p>The node IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/26243.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RebootRCInstancesRequest build() {
            return new RebootRCInstancesRequest(this);
        } 

    } 

}
