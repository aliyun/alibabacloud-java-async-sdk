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
         * <p>Leave this parameter empty if not specified. Filter condition: within a specified container. Specify the container ID. This parameter is independent of the resource group ID (ResourceGroupId).</p>
         * <blockquote>
         * <p> Prior to SDK version 8.0.0, this field is of type Long. In SDK version 8.0.0 and later, it is of type String. This change does not affect the normal use of the SDK. The parameter is returned based on the type defined in the SDK. Compilation failures caused by the type change may occur only when you upgrade the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
         * </blockquote>
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
         * <p>The name of the node. Fuzzy search is supported.</p>
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
         * <p>The page number of the data to retrieve, used for pagination.</p>
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
         * <p>The number of entries per page. Default is 10, and the maximum is 100.</p>
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
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
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
         * <p>The scheduling type, which is a filter condition. Valid values:</p>
         * <ul>
         * <li>Normal: The nodes are scheduled as expected.</li>
         * <li>Pause: The nodes are paused, and the running of their descendant nodes is blocked.</li>
         * <li>Skip: The nodes are dry run. The system does not actually run the nodes, but directly returns a success response. The running duration of the nodes is 0 seconds. In addition, the nodes do not occupy resources or block the running of their descendant nodes.</li>
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
         * <p>The rerun property, which is a filter condition. If you do not want to use this condition for filtering, you do not need to configure this parameter. Valid values:</p>
         * <ul>
         * <li>Allowed: The nodes can be rerun regardless of whether they are successfully run or fail to run.</li>
         * <li>FailureAllowed: The nodes can be rerun only after they fail to run.</li>
         * <li>Denied: The nodes cannot be rerun regardless of whether they are successfully run or fail to run.</li>
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
         * <p>The location of the nodes in the left-side navigation pane of the Data Studio page, which is a filter condition. If you do not want to use this condition for filtering, you do not need to configure this parameter. Valid values:</p>
         * <ul>
         * <li>DataworksProject</li>
         * <li>DataworksManualWorkflow</li>
         * <li>DataworksManualTask</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATAWORKS_PROJECT</p>
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
