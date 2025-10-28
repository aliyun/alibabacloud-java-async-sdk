// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListScaleOutEcuRequest} extends {@link RequestModel}
 *
 * <p>ListScaleOutEcuRequest</p>
 */
public class ListScaleOutEcuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNum")
    private Integer instanceNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
    private String logicalRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mem")
    private Integer mem;

    private ListScaleOutEcuRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clusterId = builder.clusterId;
        this.cpu = builder.cpu;
        this.groupId = builder.groupId;
        this.instanceNum = builder.instanceNum;
        this.logicalRegionId = builder.logicalRegionId;
        this.mem = builder.mem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScaleOutEcuRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return this.instanceNum;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return mem
     */
    public Integer getMem() {
        return this.mem;
    }

    public static final class Builder extends Request.Builder<ListScaleOutEcuRequest, Builder> {
        private String appId; 
        private String clusterId; 
        private Integer cpu; 
        private String groupId; 
        private Integer instanceNum; 
        private String logicalRegionId; 
        private Integer mem; 

        private Builder() {
            super();
        } 

        private Builder(ListScaleOutEcuRequest request) {
            super(request);
            this.appId = request.appId;
            this.clusterId = request.clusterId;
            this.cpu = request.cpu;
            this.groupId = request.groupId;
            this.instanceNum = request.instanceNum;
            this.logicalRegionId = request.logicalRegionId;
            this.mem = request.mem;
        } 

        /**
         * <p>The ID of the application. Specify this parameter if you want to query the available ECUs in the cluster where the application is deployed.</p>
         * <blockquote>
         * <p> Specify at least one of the ClusterId and AppId parameters as the query parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>b93024fd-8a9d-4ef7-99f1-5f0d65cc****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the cluster. Specify this parameter if you want to query the available ECUs in the cluster.</p>
         * <blockquote>
         * <p>Specify at least one of the ClusterId and AppId parameters as the query parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>52984524-6d48-4bbd-******************</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The number of CPU cores based on which you want to query the available ECUs in the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The ID of the instance group. Specify this parameter if you want to query the available ECUs in the cluster where the instance group resides.</p>
         * 
         * <strong>example:</strong>
         * <p>8123db90-880f-486f-<strong><strong>-</strong></strong></p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The number of ECUs that you want to query. If this parameter is not specified, all the ECUs that meet the query conditions are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instanceNum(Integer instanceNum) {
            this.putQueryParameter("InstanceNum", instanceNum);
            this.instanceNum = instanceNum;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * <ul>
         * <li>The ID of a custom namespace is in the <code>region ID:namespace identifier</code> format. Example: cn-beijing:test.</li>
         * <li>The ID of the default namespace is in the <code>region ID</code> format. Example: cn-beijing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * <p>The size of available memory based on which you want to query the available ECUs in the cluster. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder mem(Integer mem) {
            this.putQueryParameter("Mem", mem);
            this.mem = mem;
            return this;
        }

        @Override
        public ListScaleOutEcuRequest build() {
            return new ListScaleOutEcuRequest(this);
        } 

    } 

}
