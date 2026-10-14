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
 * {@link GetGpuClusterArgsOptionsRequest} extends {@link RequestModel}
 *
 * <p>GetGpuClusterArgsOptionsRequest</p>
 */
public class GetGpuClusterArgsOptionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterValues")
    private Object filterValues;

    private GetGpuClusterArgsOptionsRequest(Builder builder) {
        super(builder);
        this.filterType = builder.filterType;
        this.filterValues = builder.filterValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGpuClusterArgsOptionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterType
     */
    public String getFilterType() {
        return this.filterType;
    }

    /**
     * @return filterValues
     */
    public Object getFilterValues() {
        return this.filterValues;
    }

    public static final class Builder extends Request.Builder<GetGpuClusterArgsOptionsRequest, Builder> {
        private String filterType; 
        private Object filterValues; 

        private Builder() {
            super();
        } 

        private Builder(GetGpuClusterArgsOptionsRequest request) {
            super(request);
            this.filterType = request.filterType;
            this.filterValues = request.filterValues;
        } 

        /**
         * <ol>
         * <li><p>Query the machine list of a cluster
         * Set the retrieval type to comm_instance_id_list or instance_id_list.
         * comm_instance_id_list: retrieves only the machines that participate in collective communication in the specified cluster.
         * instance_id_list: retrieves all machines in the specified cluster.</p>
         * </li>
         * <li><p>Query the AI task list of a cluster
         * Set the retrieval type to comm_task_id_list or task_id_list.
         * comm_task_id_list: retrieves only the tasks that involve collective communication in the specified cluster.
         * task_id_list: retrieves all tasks in the specified cluster.</p>
         * </li>
         * <li><p>Query the AI job pod list of a cluster
         * Set the retrieval type to comm_pod_list or pod_list.
         * comm_pod_list: retrieves only the pods that participate in collective communication in the specified cluster.
         * pod_list: retrieves all pods in the specified cluster.</p>
         * </li>
         * <li><p>Query the collective communication topology
         * communication: retrieves all communication group IDs.
         * channel: retrieves the channel list under the specified communication group ID.
         * topoType: retrieves the topology type under the specified channel of the specified communication group ID.</p>
         * </li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_id_list</p>
         */
        public Builder filterType(String filterType) {
            this.putQueryParameter("filterType", filterType);
            this.filterType = filterType;
            return this;
        }

        /**
         * <p>The filter conditions. The value is a JSON object. The cluster_id field is required. The following optional filter conditions are supported:</p>
         * <ul>
         * <li>instance_id_list</li>
         * <li>comm_instance_id_list</li>
         * <li>pod_list</li>
         * <li>comm_pod_list</li>
         * <li>communication</li>
         * <li>task_id_list</li>
         * <li>comm_task_id_list</li>
         * <li>channel</li>
         * <li>topoType</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;cluster_id&quot;: &quot;cluster1&quot;
         * }</p>
         */
        public Builder filterValues(Object filterValues) {
            this.putQueryParameter("filterValues", filterValues);
            this.filterValues = filterValues;
            return this;
        }

        @Override
        public GetGpuClusterArgsOptionsRequest build() {
            return new GetGpuClusterArgsOptionsRequest(this);
        } 

    } 

}
