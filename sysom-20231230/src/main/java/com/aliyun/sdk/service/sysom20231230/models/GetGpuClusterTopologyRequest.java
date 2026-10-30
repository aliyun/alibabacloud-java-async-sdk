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
         * <p>The ID of the channel. Used to view the collective communication topology and the topology relationships of a specified channel ID under a specified communication group, such as the communication, tree, or ring topology among ranks within a communication group. This parameter must be used together with communication_id and topo_type. You can call the GetGpuClusterArgsOptions operation with the channel filter parameter to obtain the list of channel_id values under a specified communication_id.</p>
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
         * <p>The name of the cluster. You can select a cluster from the cluster list obtained by calling the GetListGpuCluster operation.</p>
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
         * <p>The ID of the communication group. Used to view the collective communication topology and the topology relationships of a specified communication group ID, such as the communication, tree, or ring topology among ranks within a communication group. This parameter must be used together with channel_id and topo_type. You can call the GetGpuClusterArgsOptions operation with the communication filter type to obtain the list of communication_id values.</p>
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
         * <p>The list of instances for which to query GPU topology information.</p>
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
         * <p>The list of pods for which to query GPU topology information.</p>
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
         * <p>The query timestamp. Default value: the current time. The timestamp must be accurate to seconds.</p>
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
         * <p>The list of tasks for which to query GPU topology information.</p>
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
         * <p>The topology type. Used to view the collective communication topology and the topology relationships of a specified topology type under a specified communication group and channel ID, such as the communication, tree, or ring topology among ranks within a communication group. This parameter must be used together with communication_id and channel_id. You can call the GetGpuClusterArgsOptions operation with the topoType filter parameter to obtain the list of topo_type values under a specified communication_id and channel_id.</p>
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
