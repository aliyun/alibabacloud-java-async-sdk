// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListArtifactBuildTaskLogRequest} extends {@link RequestModel}
 *
 * <p>ListArtifactBuildTaskLogRequest</p>
 */
public class ListArtifactBuildTaskLogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BuildTaskId")
    @Validation(required = true)
    private String buildTaskId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Integer page;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    private ListArtifactBuildTaskLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildTaskId = builder.buildTaskId;
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactBuildTaskLogRequest create() {
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
     * @return buildTaskId
     */
    public String getBuildTaskId() {
        return this.buildTaskId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListArtifactBuildTaskLogRequest, Builder> {
        private String regionId; 
        private String buildTaskId; 
        private String instanceId; 
        private Integer page; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListArtifactBuildTaskLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.buildTaskId = request.buildTaskId;
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.pageSize = request.pageSize;
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
         * The ID of the artifact build task.
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * The ID of the Container Registry instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListArtifactBuildTaskLogRequest build() {
            return new ListArtifactBuildTaskLogRequest(this);
        } 

    } 

}
