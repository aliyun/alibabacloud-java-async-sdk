// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneFlowJobRequest} extends {@link RequestModel}
 *
 * <p>CloneFlowJobRequest</p>
 */
public class CloneFlowJobRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CloneFlowJobRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneFlowJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CloneFlowJobRequest, Builder> {
        private String id; 
        private String name; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CloneFlowJobRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * 克隆的目标作业ID。您可以调用ListFlowJob查看。
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 克隆的目标作业名称。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 克隆的目标作业所属项目。您可以调用ListFlowProject查看项目的ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CloneFlowJobRequest build() {
            return new CloneFlowJobRequest(this);
        } 

    } 

}
