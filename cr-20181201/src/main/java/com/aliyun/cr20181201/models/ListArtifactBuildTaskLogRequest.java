// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    private String buildTaskId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Page")
    private Integer page;


    private ListArtifactBuildTaskLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.buildTaskId = builder.buildTaskId;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.page = builder.page;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListArtifactBuildTaskLogRequest create() {
        return builder().build();
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    public static final class Builder extends Request.Builder {
        private String regionId; 
        private String buildTaskId; 
        private String instanceId; 
        private Integer pageSize; 
        private Integer page; 

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the product build task.</p>
         */
        public Builder buildTaskId(String buildTaskId) {
            this.putQueryParameter("BuildTaskId", buildTaskId);
            this.buildTaskId = buildTaskId;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        public ListArtifactBuildTaskLogRequest build() {
            return new ListArtifactBuildTaskLogRequest(this);
        } 

    } 

}
