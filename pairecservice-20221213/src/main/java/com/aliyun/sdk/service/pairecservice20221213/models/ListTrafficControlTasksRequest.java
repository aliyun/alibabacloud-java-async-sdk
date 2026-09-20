// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListTrafficControlTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTrafficControlTasksRequest</p>
 */
public class ListTrafficControlTasksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlTargetFilter")
    private String controlTargetFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private ListTrafficControlTasksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.all = builder.all;
        this.controlTargetFilter = builder.controlTargetFilter;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sceneId = builder.sceneId;
        this.sortBy = builder.sortBy;
        this.status = builder.status;
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficControlTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return controlTargetFilter
     */
    public String getControlTargetFilter() {
        return this.controlTargetFilter;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListTrafficControlTasksRequest, Builder> {
        private String regionId; 
        private Boolean all; 
        private String controlTargetFilter; 
        private String environment; 
        private String instanceId; 
        private String name; 
        private String order; 
        private String pageNumber; 
        private String pageSize; 
        private String sceneId; 
        private String sortBy; 
        private String status; 
        private String trafficControlTaskId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListTrafficControlTasksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.all = request.all;
            this.controlTargetFilter = request.controlTargetFilter;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sceneId = request.sceneId;
            this.sortBy = request.sortBy;
            this.status = request.status;
            this.trafficControlTaskId = request.trafficControlTaskId;
            this.version = request.version;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to return all results without pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>The filter for traffic control targets. Valid values:</p>
         * <ul>
         * <li><p><code>All</code>: Returns all traffic control targets.</p>
         * </li>
         * <li><p><code>Valid</code>: Returns only active traffic control targets. A traffic control target is active if the current time is within the specified start and end time.</p>
         * </li>
         * <li><p><code>None</code>: Does not return any traffic control targets.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder controlTargetFilter(String controlTargetFilter) {
            this.putQueryParameter("ControlTargetFilter", controlTargetFilter);
            this.controlTargetFilter = controlTargetFilter;
            return this;
        }

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li><p><code>Daily</code>: the daily environment</p>
         * </li>
         * <li><p><code>Pre</code>: the pre-production environment</p>
         * </li>
         * <li><p><code>Prod</code>: the production environment</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pre</p>
         */
        public Builder environment(String environment) {
            this.putQueryParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The instance ID. You can obtain this ID by calling the <a href="https://icms.alibaba-inc.com/content/learn/pai?l=1%5C&m=16768%5C&n=4300782">ListInstances</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the traffic control task.</p>
         * 
         * <strong>example:</strong>
         * <p>task_1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><code>ASC</code>: ascending order</p>
         * </li>
         * <li><p><code>DESC</code>: descending order</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the scene. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The field by which to sort the results. Valid values:</p>
         * <ul>
         * <li><p><code>GmtCreateTime</code>: Sorts the results by creation time.</p>
         * </li>
         * <li><p><code>GmtModifiedTime</code>: Sorts the results by modification time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p><code>NotRunning</code>: The task is not running.</p>
         * </li>
         * <li><p><code>Ready</code>: The task is ready to run.</p>
         * </li>
         * <li><p><code>Running</code>: The task is running.</p>
         * </li>
         * <li><p><code>Finished</code>: The task is finished.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the traffic control task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.putQueryParameter("TrafficControlTaskId", trafficControlTaskId);
            this.trafficControlTaskId = trafficControlTaskId;
            return this;
        }

        /**
         * <p>The version. Valid values:</p>
         * <ul>
         * <li><p><code>Latest</code>: The latest version. This is the default value.</p>
         * </li>
         * <li><p><code>Released</code>: the released version</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Latest</p>
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ListTrafficControlTasksRequest build() {
            return new ListTrafficControlTasksRequest(this);
        } 

    } 

}
