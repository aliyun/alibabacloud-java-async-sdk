// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVulScanScheduledStrategiesRequest} extends {@link RequestModel}
 *
 * <p>ListVulScanScheduledStrategiesRequest</p>
 */
public class ListVulScanScheduledStrategiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyIds")
    private java.util.List<String> strategyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ListVulScanScheduledStrategiesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.matchMode = builder.matchMode;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.strategyIds = builder.strategyIds;
        this.strategyName = builder.strategyName;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVulScanScheduledStrategiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return matchMode
     */
    public String getMatchMode() {
        return this.matchMode;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return strategyIds
     */
    public java.util.List<String> getStrategyIds() {
        return this.strategyIds;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ListVulScanScheduledStrategiesRequest, Builder> {
        private Long currentPage; 
        private String matchMode; 
        private Long pageSize; 
        private String status; 
        private java.util.List<String> strategyIds; 
        private String strategyName; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListVulScanScheduledStrategiesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.matchMode = request.matchMode;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.strategyIds = request.strategyIds;
            this.strategyName = request.strategyName;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Filters by the matching mode of the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Takes effect for all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Takes effect only for users in specified user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.putQueryParameter("MatchMode", matchMode);
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters by enabled status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The IDs of scheduled vulnerability scan policies used for filtering. A maximum of 100 IDs can be specified. Duplicate IDs are not allowed.</p>
         */
        public Builder strategyIds(java.util.List<String> strategyIds) {
            this.putQueryParameter("StrategyIds", strategyIds);
            this.strategyIds = strategyIds;
            return this;
        }

        /**
         * <p>The policy name. Fuzzy match is supported. The name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly vulnerability scanning for R&amp;D department</p>
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The user group ID. Used to filter records whose effective scope includes the specified user group. You can obtain the value from the following operation:</p>
         * <ul>
         * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: lists user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>usergroup-9d4f2a7b3c1e****</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ListVulScanScheduledStrategiesRequest build() {
            return new ListVulScanScheduledStrategiesRequest(this);
        } 

    } 

}
