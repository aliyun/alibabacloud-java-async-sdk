// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetGpuClusterTopologyRequest} extends {@link RequestModel}
 *
 * <p>GetGpuClusterTopologyRequest</p>
 */
public class GetGpuClusterTopologyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("communicationId")
    private String communicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceIdList")
    private Object instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("podList")
    private Object podList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskIdList")
    private Object taskIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topoType")
    private String topoType;

    private GetGpuClusterTopologyRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.clusterId = builder.clusterId;
        this.communicationId = builder.communicationId;
        this.instanceIdList = builder.instanceIdList;
        this.podList = builder.podList;
        this.startTime = builder.startTime;
        this.taskIdList = builder.taskIdList;
        this.topoType = builder.topoType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGpuClusterTopologyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return communicationId
     */
    public String getCommunicationId() {
        return this.communicationId;
    }

    /**
     * @return instanceIdList
     */
    public Object getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return podList
     */
    public Object getPodList() {
        return this.podList;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskIdList
     */
    public Object getTaskIdList() {
        return this.taskIdList;
    }

    /**
     * @return topoType
     */
    public String getTopoType() {
        return this.topoType;
    }

    public static final class Builder extends Request.Builder<GetGpuClusterTopologyRequest, Builder> {
        private String channelId; 
        private String clusterId; 
        private String communicationId; 
        private Object instanceIdList; 
        private Object podList; 
        private String startTime; 
        private Object taskIdList; 
        private String topoType; 

        private Builder() {
            super();
        } 

        private Builder(GetGpuClusterTopologyRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.clusterId = request.clusterId;
            this.communicationId = request.communicationId;
            this.instanceIdList = request.instanceIdList;
            this.podList = request.podList;
            this.startTime = request.startTime;
            this.taskIdList = request.taskIdList;
            this.topoType = request.topoType;
        } 

        /**
         * <p>Used when viewing collective communication topology. Specifies the topology relationship for a given channel ID within a communication group, such as the inter-rank communication topology (tree or ring topology). Must be used together with communication_id and topo_type.</p>
         * <p>⚠️ Use the channel filter parameter of the GetGpuClusterArgsOptions operation to retrieve the list of channel_id values for a specified communication_id.</p>
         * 
         * <strong>example:</strong>
         * <p>communicationId =0x412523235123
         * channelId=1
         * topoType=ring</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("channelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The cluster name. Select a cluster from the cluster list returned by the GetListGpuCluster operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;cluster1&quot;</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Used when viewing collective communication topology. Specifies the topology relationship for a given communication group ID, such as the inter-rank communication topology (tree or ring topology) within a communication group. Must be used together with channel_id and topo_type.</p>
         * <p>⚠️ Use the communication filter type of the GetGpuClusterArgsOptions operation to retrieve the list of communication_id values.</p>
         * 
         * <strong>example:</strong>
         * <p>communicationId =0x412523235123
         * channelId=1
         * topoType=ring</p>
         */
        public Builder communicationId(String communicationId) {
            this.putQueryParameter("communicationId", communicationId);
            this.communicationId = communicationId;
            return this;
        }

        /**
         * <p>The GPU topology information for the specified list of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;instance1&quot;, &quot;instance2&quot;,&quot;instance3&quot;]</p>
         */
        public Builder instanceIdList(Object instanceIdList) {
            this.putQueryParameter("instanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The GPU topology information for the specified list of pods.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;pod1&quot;, &quot;pod2&quot;,&quot;pod3&quot;]</p>
         */
        public Builder podList(Object podList) {
            this.putQueryParameter("podList", podList);
            this.podList = podList;
            return this;
        }

        /**
         * <p>The timestamp for the query. Defaults to the current time. Must be a second-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1709740800</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The GPU topology information for the specified list of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;task1&quot;, &quot;task2&quot;]</p>
         */
        public Builder taskIdList(Object taskIdList) {
            this.putQueryParameter("taskIdList", taskIdList);
            this.taskIdList = taskIdList;
            return this;
        }

        /**
         * <p>Used when viewing collective communication topology. Specifies the topology relationship for a given topology type within a communication group and channel, such as the inter-rank communication topology (tree or ring topology). Must be used together with communication_id and channel_id.</p>
         * <p>⚠️ Use the topoType filter parameter of the GetGpuClusterArgsOptions operation to retrieve the list of topo_type values for a specified communication_id and channel_id.</p>
         * 
         * <strong>example:</strong>
         * <p>communicationId =0x412523235123
         * channelId=1
         * topoType=ring</p>
         */
        public Builder topoType(String topoType) {
            this.putQueryParameter("topoType", topoType);
            this.topoType = topoType;
            return this;
        }

        @Override
        public GetGpuClusterTopologyRequest build() {
            return new GetGpuClusterTopologyRequest(this);
        } 

    } 

}
