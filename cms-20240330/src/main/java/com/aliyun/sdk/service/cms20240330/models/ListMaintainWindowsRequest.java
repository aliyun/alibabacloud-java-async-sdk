// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListMaintainWindowsRequest} extends {@link RequestModel}
 *
 * <p>ListMaintainWindowsRequest</p>
 */
public class ListMaintainWindowsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maintainWindowId")
    private String maintainWindowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maintainWindowName")
    private String maintainWindowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private ListMaintainWindowsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.direction = builder.direction;
        this.enable = builder.enable;
        this.maintainWindowId = builder.maintainWindowId;
        this.maintainWindowName = builder.maintainWindowName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMaintainWindowsRequest create() {
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
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return maintainWindowId
     */
    public String getMaintainWindowId() {
        return this.maintainWindowId;
    }

    /**
     * @return maintainWindowName
     */
    public String getMaintainWindowName() {
        return this.maintainWindowName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<ListMaintainWindowsRequest, Builder> {
        private String regionId; 
        private String direction; 
        private Boolean enable; 
        private String maintainWindowId; 
        private String maintainWindowName; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(ListMaintainWindowsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.direction = request.direction;
            this.enable = request.enable;
            this.maintainWindowId = request.maintainWindowId;
            this.maintainWindowName = request.maintainWindowName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.workspace = request.workspace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: Ascending order.</li>
         * <li><strong>desc</strong>: Descending order. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>Filters by enabled status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Returns only enabled silence policies.</li>
         * <li><strong>false</strong>: Returns only paused silence policies.</li>
         * </ul>
         * <p>If you do not specify this parameter, the policies are not filtered by enabled status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The ID of the silence policy. Exact matching is used. If you do not specify this parameter, the policies are not filtered by ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3ff3fbd0-8a0b-4b31-9b1c-8e3f0a2c5d71</p>
         */
        public Builder maintainWindowId(String maintainWindowId) {
            this.putQueryParameter("maintainWindowId", maintainWindowId);
            this.maintainWindowId = maintainWindowId;
            return this;
        }

        /**
         * <p>Policy Name of the silence policy. Fuzzy matching is used, where a match occurs if Policy Name contains the specified value. If you do not specify this parameter, the policies are not filtered by name.</p>
         * 
         * <strong>example:</strong>
         * <p>silence-for-release</p>
         */
        public Builder maintainWindowName(String maintainWindowName) {
            this.putQueryParameter("maintainWindowName", maintainWindowName);
            this.maintainWindowName = maintainWindowName;
            return this;
        }

        /**
         * <p>The maximum number of records to return for this request. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination cursor. You do not need to specify this parameter for the first query. For subsequent queries, you can specify the non-empty nextToken returned in the previous response. This value does not guarantee that the next page contains data.</p>
         * 
         * <strong>example:</strong>
         * <p>Y21zRXZlbnRCYXNlUGFnZT0x</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The field by which to sort. By default, the policies are sorted by creation time. Valid values:</p>
         * <ul>
         * <li><strong>createTime</strong>: Creation time.</li>
         * <li><strong>updateTime</strong>: Update time.</li>
         * <li><strong>enable</strong>: Enabled status.</li>
         * </ul>
         * <p>If you specify other values, the policies are sorted by creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>createTime</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The name of the workspace. This parameter is required by the backend and is used to isolate silence policy resources across different business workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-xxxx-cn-hangzhou</p>
         */
        public Builder workspace(String workspace) {
            this.putQueryParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public ListMaintainWindowsRequest build() {
            return new ListMaintainWindowsRequest(this);
        } 

    } 

}
