// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ListRayHistoryServersRequest} extends {@link RequestModel}
 *
 * <p>ListRayHistoryServersRequest</p>
 */
public class ListRayHistoryServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdPrefix")
    private String idPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifiedAfter")
    private String modifiedAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowOwn")
    private Boolean showOwn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePath")
    private String storagePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdForFilter")
    private String userIdForFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListRayHistoryServersRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.endTime = builder.endTime;
        this.idPrefix = builder.idPrefix;
        this.modifiedAfter = builder.modifiedAfter;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.resourceId = builder.resourceId;
        this.showOwn = builder.showOwn;
        this.sortBy = builder.sortBy;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.storagePath = builder.storagePath;
        this.userIdForFilter = builder.userIdForFilter;
        this.username = builder.username;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRayHistoryServersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return idPrefix
     */
    public String getIdPrefix() {
        return this.idPrefix;
    }

    /**
     * @return modifiedAfter
     */
    public String getModifiedAfter() {
        return this.modifiedAfter;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return showOwn
     */
    public Boolean getShowOwn() {
        return this.showOwn;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return storagePath
     */
    public String getStoragePath() {
        return this.storagePath;
    }

    /**
     * @return userIdForFilter
     */
    public String getUserIdForFilter() {
        return this.userIdForFilter;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListRayHistoryServersRequest, Builder> {
        private String displayName; 
        private String endTime; 
        private String idPrefix; 
        private String modifiedAfter; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String paymentType; 
        private String resourceId; 
        private Boolean showOwn; 
        private String sortBy; 
        private String startTime; 
        private String status; 
        private String storagePath; 
        private String userIdForFilter; 
        private String username; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListRayHistoryServersRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.endTime = request.endTime;
            this.idPrefix = request.idPrefix;
            this.modifiedAfter = request.modifiedAfter;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.resourceId = request.resourceId;
            this.showOwn = request.showOwn;
            this.sortBy = request.sortBy;
            this.startTime = request.startTime;
            this.status = request.status;
            this.storagePath = request.storagePath;
            this.userIdForFilter = request.userIdForFilter;
            this.username = request.username;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The display name of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The end time of the query range. The job creation time is used for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-09T16:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>按ID前缀过滤</p>
         */
        public Builder idPrefix(String idPrefix) {
            this.putQueryParameter("IdPrefix", idPrefix);
            this.idPrefix = idPrefix;
            return this;
        }

        /**
         * <p>Filters results by the time after which they were modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-09T16:00:00Z</p>
         */
        public Builder modifiedAfter(String modifiedAfter) {
            this.putQueryParameter("ModifiedAfter", modifiedAfter);
            this.modifiedAfter = modifiedAfter;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li>desc: descending order.</li>
         * <li>asc: ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number of the page to return in a paged query. Paging starts from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of RayHistoryServer entries to return on each page in a paged query. Paging is used to return results in batches.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PrePaid</li>
         * <li>PostPaid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The resource group ID. For information about how to query the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/2651299.html">Manage resource quotas</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>quotaxxx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>Specifies whether to return only the RayHistoryServer entries created by the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder showOwn(Boolean showOwn) {
            this.putQueryParameter("ShowOwn", showOwn);
            this.showOwn = showOwn;
            return this;
        }

        /**
         * <p>The field by which to sort the returned results. Valid values:</p>
         * <ul>
         * <li>DisplayName</li>
         * <li>GmtCreateTime</li>
         * <li>UserId</li>
         * <li>ResourceId</li>
         * <li>Status</li>
         * <li>GmtModifyTime.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The RayHistoryServer status. Valid values:</p>
         * <ul>
         * <li>Creating: being created.</li>
         * <li>Queuing: waiting in queue.</li>
         * <li>Running: running.</li>
         * <li>Stopped: stopped.</li>
         * <li>Failed: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The storage path of Ray logs.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket-test-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/tmp</p>
         */
        public Builder storagePath(String storagePath) {
            this.putQueryParameter("StoragePath", storagePath);
            this.storagePath = storagePath;
            return this;
        }

        /**
         * <p>Filters results by user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder userIdForFilter(String userIdForFilter) {
            this.putQueryParameter("UserIdForFilter", userIdForFilter);
            this.userIdForFilter = userIdForFilter;
            return this;
        }

        /**
         * <p>Filters results by username.</p>
         * 
         * <strong>example:</strong>
         * <p>myusername</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The workspace ID. &lt;props=&quot;china&quot;&gt;For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>..</p>
         * 
         * <strong>example:</strong>
         * <p>268</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListRayHistoryServersRequest build() {
            return new ListRayHistoryServersRequest(this);
        } 

    } 

}
