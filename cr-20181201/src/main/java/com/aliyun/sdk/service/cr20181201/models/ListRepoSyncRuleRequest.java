// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoSyncRuleRequest} extends {@link RequestModel}
 *
 * <p>ListRepoSyncRuleRequest</p>
 */
public class ListRepoSyncRuleRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

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
    private String repoName;

    @Query
    @NameInMap("TargetInstanceId")
    private String targetInstanceId;

    @Query
    @NameInMap("TargetRegionId")
    private String targetRegionId;

    private ListRepoSyncRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.repoName = builder.repoName;
        this.targetInstanceId = builder.targetInstanceId;
        this.targetRegionId = builder.targetRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRepoSyncRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
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
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    /**
     * @return targetRegionId
     */
    public String getTargetRegionId() {
        return this.targetRegionId;
    }

    public static final class Builder extends Request.Builder<ListRepoSyncRuleRequest, Builder> {
        private String instanceId; 
        private String namespaceName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionId; 
        private String repoName; 
        private String targetInstanceId; 
        private String targetRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListRepoSyncRuleRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.namespaceName = response.namespaceName;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.repoName = response.repoName;
            this.targetInstanceId = response.targetInstanceId;
            this.targetRegionId = response.targetRegionId;
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
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
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
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        /**
         * TargetRegionId.
         */
        public Builder targetRegionId(String targetRegionId) {
            this.putQueryParameter("TargetRegionId", targetRegionId);
            this.targetRegionId = targetRegionId;
            return this;
        }

        @Override
        public ListRepoSyncRuleRequest build() {
            return new ListRepoSyncRuleRequest(this);
        } 

    } 

}
