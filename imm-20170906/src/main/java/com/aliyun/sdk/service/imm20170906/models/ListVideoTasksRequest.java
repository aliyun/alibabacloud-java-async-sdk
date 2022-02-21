// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideoTasksRequest} extends {@link RequestModel}
 *
 * <p>ListVideoTasksRequest</p>
 */
public class ListVideoTasksRequest extends Request {
    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("MaxKeys")
    private Integer maxKeys;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    private ListVideoTasksRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxKeys = builder.maxKeys;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVideoTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxKeys
     */
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<ListVideoTasksRequest, Builder> {
        private String marker; 
        private Integer maxKeys; 
        private String project; 
        private String regionId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(ListVideoTasksRequest response) {
            super(response);
            this.marker = response.marker;
            this.maxKeys = response.maxKeys;
            this.project = response.project;
            this.regionId = response.regionId;
            this.taskType = response.taskType;
        } 

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * MaxKeys.
         */
        public Builder maxKeys(Integer maxKeys) {
            this.putQueryParameter("MaxKeys", maxKeys);
            this.maxKeys = maxKeys;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
            return this;
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
         * TaskType.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public ListVideoTasksRequest build() {
            return new ListVideoTasksRequest(this);
        } 

    } 

}
