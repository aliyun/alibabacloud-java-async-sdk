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

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListArtifactBuildTaskLogRequest(Builder builder) {
        super(builder);
        this.buildTaskId = builder.buildTaskId;
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListArtifactBuildTaskLogRequest, Builder> {
        private String buildTaskId; 
        private String instanceId; 
        private Integer page; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListArtifactBuildTaskLogRequest response) {
            super(response);
            this.buildTaskId = response.buildTaskId;
            this.instanceId = response.instanceId;
            this.page = response.page;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * BuildTaskId.
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListArtifactBuildTaskLogRequest build() {
            return new ListArtifactBuildTaskLogRequest(this);
        } 

    } 

}
