// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListChartRepositoryRequest} extends {@link RequestModel}
 *
 * <p>ListChartRepositoryRequest</p>
 */
public class ListChartRepositoryRequest extends Request {
    @Query
    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RepoStatus")
    private String repoStatus;

    @Host
    @NameInMap("RegionId")
    private String regionId;


    private ListChartRepositoryRequest(Builder builder) {
        super(builder);
        this.repoNamespaceName = builder.repoNamespaceName;
        this.repoName = builder.repoName;
        this.pageNo = builder.pageNo;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.repoStatus = builder.repoStatus;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartRepositoryRequest create() {
        return builder().build();
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return repoStatus
     */
    public String getRepoStatus() {
        return this.repoStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder {
        private String repoNamespaceName; 
        private String repoName; 
        private Integer pageNo; 
        private String instanceId; 
        private Integer pageSize; 
        private String repoStatus; 
        private String regionId; 

        /**
         * <p>Namespace</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>Repository name</p>
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * <p>Number of entries per page</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the Chart repository. Valid values:

-"ALL": displays the status of all Chart repositories.

-"NORMAL": displays the normal status of the Chart repository.

-"DELETING": the status of the deleted Chart repository.</p>
         */
        public Builder repoStatus(String repoStatus) {
            this.putQueryParameter("RepoStatus", repoStatus);
            this.repoStatus = repoStatus;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        public ListChartRepositoryRequest build() {
            return new ListChartRepositoryRequest(this);
        } 

    } 

}
