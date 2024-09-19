// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerunMode")
    private String rerunMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rerurrence")
    private String rerurrence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.containerId = builder.containerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.rerunMode = builder.rerunMode;
        this.rerurrence = builder.rerurrence;
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
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return rerunMode
     */
    public String getRerunMode() {
        return this.rerunMode;
    }

    /**
     * @return rerurrence
     */
    public String getRerurrence() {
        return this.rerurrence;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String rerunMode; 
        private String rerurrence; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.containerId = request.containerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.rerunMode = request.rerunMode;
            this.rerurrence = request.rerurrence;
            this.scene = request.scene;
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
         * ContainerId.
         */
        public Builder containerId(String containerId) {
            this.putQueryParameter("ContainerId", containerId);
            this.containerId = containerId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RerunMode.
         */
        public Builder rerunMode(String rerunMode) {
            this.putQueryParameter("RerunMode", rerunMode);
            this.rerunMode = rerunMode;
            return this;
        }

        /**
         * Rerurrence.
         */
        public Builder rerurrence(String rerurrence) {
            this.putQueryParameter("Rerurrence", rerurrence);
            this.rerurrence = rerurrence;
            return this;
        }

        /**
         * Scene.
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
