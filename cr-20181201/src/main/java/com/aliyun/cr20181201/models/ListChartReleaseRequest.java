// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListChartReleaseRequest} extends {@link RequestModel}
 *
 * <p>ListChartReleaseRequest</p>
 */
public class ListChartReleaseRequest extends Request {
    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RepoName")
    private String repoName;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RepoNamespaceName")
    private String repoNamespaceName;

    @Query
    @NameInMap("Chart")
    private String chart;


    private ListChartReleaseRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.repoName = builder.repoName;
        this.pageSize = builder.pageSize;
        this.repoNamespaceName = builder.repoNamespaceName;
        this.chart = builder.chart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartReleaseRequest create() {
        return builder().build();
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    /**
     * @return chart
     */
    public String getChart() {
        return this.chart;
    }

    public static final class Builder extends Request.Builder {
        private Integer pageNo; 
        private String instanceId; 
        private String regionId; 
        private String repoName; 
        private Integer pageSize; 
        private String repoNamespaceName; 
        private String chart; 

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
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>Number of entries per page</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Namespace name</p>
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        /**
         * <p>Version prefix</p>
         */
        public Builder chart(String chart) {
            this.putQueryParameter("Chart", chart);
            this.chart = chart;
            return this;
        }

        public ListChartReleaseRequest build() {
            return new ListChartReleaseRequest(this);
        } 

    } 

}
