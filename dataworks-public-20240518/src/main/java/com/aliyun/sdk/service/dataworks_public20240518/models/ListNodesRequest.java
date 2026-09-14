// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerId")
    private String containerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Recurrence")
    private String recurrence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerunMode")
    private String rerunMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.containerId = builder.containerId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.recurrence = builder.recurrence;
        this.rerunMode = builder.rerunMode;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
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
     * @return containerId
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return recurrence
     */
    public String getRecurrence() {
        return this.recurrence;
    }

    /**
     * @return rerunMode
     */
    public String getRerunMode() {
        return this.rerunMode;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String regionId; 
        private String containerId; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String recurrence; 
        private String rerunMode; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.containerId = request.containerId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.recurrence = request.recurrence;
            this.rerunMode = request.rerunMode;
            this.scene = request.scene;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Leave this parameter empty if not specified. The filter condition: within the specified container. Specify the container ID. This parameter is not related to the resource group (ResourceGroupId).</p>
         * 
         * <strong>example:</strong>
         * <p>860438872620113XXXX</p>
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * <p>The node name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Filter condition: scheduling type. Valid values:</p>
         * <ul>
         * <li><p>Normal: The node is executed normally.</p>
         * </li>
         * <li><p>Pause: The node status is set to paused, and downstream nodes that depend on the current node are blocked from execution.</p>
         * </li>
         * <li><p>Skip: The node status is set to dry run. The system directly returns a success result (with an execution duration of 0 seconds), does not block downstream node execution, and does not consume resources.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder recurrence(String recurrence) {
            this.putQueryParameter("Recurrence", recurrence);
            this.recurrence = recurrence;
            return this;
        }

        /**
         * <p>The rerun property. If not specified, this parameter is left empty. Valid values:</p>
         * <ul>
         * <li><p>Allowed: The node can be rerun regardless of whether it runs successfully or fails.</p>
         * </li>
         * <li><p>FailureAllowed: The node can be rerun only after a failed run, not after a successful run.</p>
         * </li>
         * <li><p>Denied: The node cannot be rerun regardless of whether it runs successfully or fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allowed</p>
         */
        public Builder rerunMode(String rerunMode) {
            this.putQueryParameter("RerunMode", rerunMode);
            this.rerunMode = rerunMode;
            return this;
        }

        /**
         * <p>The scene in which the node resides. Leave this parameter empty if not specified. This parameter corresponds to the partition of the left-side navigation pane in DataStudio. Valid values:</p>
         * <ul>
         * <li><p>DataworksProject: project folder.</p>
         * </li>
         * <li><p>DataworksManualWorkflow: manual workflow.</p>
         * </li>
         * <li><p>DataworksManualTask: manual node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataworksProject</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

}
