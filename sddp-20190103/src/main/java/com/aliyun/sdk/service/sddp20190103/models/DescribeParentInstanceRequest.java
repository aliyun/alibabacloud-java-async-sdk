// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeParentInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeParentInstanceRequest</p>
 */
public class DescribeParentInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthStatus")
    private Integer authStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckStatus")
    private Integer checkStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterStatus")
    private String clusterStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberAccount")
    private Long memberAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private Long resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    private String serviceRegionId;

    private DescribeParentInstanceRequest(Builder builder) {
        super(builder);
        this.authStatus = builder.authStatus;
        this.checkStatus = builder.checkStatus;
        this.clusterStatus = builder.clusterStatus;
        this.currentPage = builder.currentPage;
        this.dbName = builder.dbName;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.memberAccount = builder.memberAccount;
        this.pageSize = builder.pageSize;
        this.resourceType = builder.resourceType;
        this.serviceRegionId = builder.serviceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParentInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authStatus
     */
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return checkStatus
     */
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    /**
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberAccount
     */
    public Long getMemberAccount() {
        return this.memberAccount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceType
     */
    public Long getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeParentInstanceRequest, Builder> {
        private Integer authStatus; 
        private Integer checkStatus; 
        private String clusterStatus; 
        private Integer currentPage; 
        private String dbName; 
        private String engineType; 
        private String instanceId; 
        private String lang; 
        private Long memberAccount; 
        private Integer pageSize; 
        private Long resourceType; 
        private String serviceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParentInstanceRequest request) {
            super(request);
            this.authStatus = request.authStatus;
            this.checkStatus = request.checkStatus;
            this.clusterStatus = request.clusterStatus;
            this.currentPage = request.currentPage;
            this.dbName = request.dbName;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.memberAccount = request.memberAccount;
            this.pageSize = request.pageSize;
            this.resourceType = request.resourceType;
            this.serviceRegionId = request.serviceRegionId;
        } 

        /**
         * AuthStatus.
         */
        public Builder authStatus(Integer authStatus) {
            this.putQueryParameter("AuthStatus", authStatus);
            this.authStatus = authStatus;
            return this;
        }

        /**
         * CheckStatus.
         */
        public Builder checkStatus(Integer checkStatus) {
            this.putQueryParameter("CheckStatus", checkStatus);
            this.checkStatus = checkStatus;
            return this;
        }

        /**
         * ClusterStatus.
         */
        public Builder clusterStatus(String clusterStatus) {
            this.putQueryParameter("ClusterStatus", clusterStatus);
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MemberAccount.
         */
        public Builder memberAccount(Long memberAccount) {
            this.putQueryParameter("MemberAccount", memberAccount);
            this.memberAccount = memberAccount;
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
         * ResourceType.
         */
        public Builder resourceType(Long resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceRegionId.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        @Override
        public DescribeParentInstanceRequest build() {
            return new DescribeParentInstanceRequest(this);
        } 

    } 

}
