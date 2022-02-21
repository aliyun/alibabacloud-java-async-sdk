// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartReleaseRequest} extends {@link RequestModel}
 *
 * <p>ListChartReleaseRequest</p>
 */
public class ListChartReleaseRequest extends Request {
    @Query
    @NameInMap("Chart")
    private String chart;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RepoName")
    @Validation(required = true)
    private String repoName;

    @Query
    @NameInMap("RepoNamespaceName")
    @Validation(required = true)
    private String repoNamespaceName;

    private ListChartReleaseRequest(Builder builder) {
        super(builder);
        this.chart = builder.chart;
        this.instanceId = builder.instanceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.repoName = builder.repoName;
        this.repoNamespaceName = builder.repoNamespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartReleaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chart
     */
    public String getChart() {
        return this.chart;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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

    /**
     * @return repoName
     */
    public String getRepoName() {
        return this.repoName;
    }

    /**
     * @return repoNamespaceName
     */
    public String getRepoNamespaceName() {
        return this.repoNamespaceName;
    }

    public static final class Builder extends Request.Builder<ListChartReleaseRequest, Builder> {
        private String chart; 
        private String instanceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionId; 
        private String repoName; 
        private String repoNamespaceName; 

        private Builder() {
            super();
        } 

        private Builder(ListChartReleaseRequest response) {
            super(response);
            this.chart = response.chart;
            this.instanceId = response.instanceId;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.repoName = response.repoName;
            this.repoNamespaceName = response.repoNamespaceName;
        } 

        /**
         * Chart.
         */
        public Builder chart(String chart) {
            this.putQueryParameter("Chart", chart);
            this.chart = chart;
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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

        /**
         * RepoName.
         */
        public Builder repoName(String repoName) {
            this.putQueryParameter("RepoName", repoName);
            this.repoName = repoName;
            return this;
        }

        /**
         * RepoNamespaceName.
         */
        public Builder repoNamespaceName(String repoNamespaceName) {
            this.putQueryParameter("RepoNamespaceName", repoNamespaceName);
            this.repoNamespaceName = repoNamespaceName;
            return this;
        }

        @Override
        public ListChartReleaseRequest build() {
            return new ListChartReleaseRequest(this);
        } 

    } 

}
