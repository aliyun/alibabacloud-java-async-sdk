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
         * <li>Query cluster machine list scenario: Set the retrieval type to comm_instance_id_list or instance_id_list. comm_instance_id_list: Retrieves only the list of machines in the specified cluster that participate in collective communication. instance_id_list: Retrieves the list of all machines in the specified cluster.</li>
         * <li>Query cluster AI task list scenario: Set the retrieval type to comm_task_id_list or task_id_list. comm_task_id_list: Retrieves only the list of tasks in the specified cluster that involve collective communication. task_id_list: Retrieves the list of all tasks in the specified cluster.</li>
         * <li>Query cluster AI job pod list scenario: Set the retrieval type to comm_pod_list or pod_list. comm_pod_list: Retrieves only the list of pods in the specified cluster that participate in collective communication. pod_list: Retrieves the list of all pods in the specified cluster.</li>
         * <li>Query collective communication topology scenario: communication: Retrieves all communication group IDs. channel: Retrieves the channel list under the specified communication group ID. topoType: Retrieves the topology type under the specified channel of the specified communication group ID.</li>
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
         * <p>The filter conditions, which is a JSON object. The cluster_id field is required. Other filter conditions support the following values:</p>
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
