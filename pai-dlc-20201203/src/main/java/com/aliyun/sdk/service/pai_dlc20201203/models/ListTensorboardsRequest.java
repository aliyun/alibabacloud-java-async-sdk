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
 * {@link ListTensorboardsRequest} extends {@link RequestModel}
 *
 * <p>ListTensorboardsRequest</p>
 */
public class ListTensorboardsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowOwn")
    private Boolean showOwn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TensorboardId")
    private String tensorboardId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Verbose")
    private Boolean verbose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ListTensorboardsRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.displayName = builder.displayName;
        this.endTime = builder.endTime;
        this.jobId = builder.jobId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paymentType = builder.paymentType;
        this.quotaId = builder.quotaId;
        this.showOwn = builder.showOwn;
        this.sortBy = builder.sortBy;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.tensorboardId = builder.tensorboardId;
        this.userId = builder.userId;
        this.username = builder.username;
        this.verbose = builder.verbose;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTensorboardsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
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
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
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
     * @return tensorboardId
     */
    public String getTensorboardId() {
        return this.tensorboardId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListTensorboardsRequest, Builder> {
        private String accessibility; 
        private String displayName; 
        private String endTime; 
        private String jobId; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String paymentType; 
        private String quotaId; 
        private Boolean showOwn; 
        private String sortBy; 
        private String sourceId; 
        private String sourceType; 
        private String startTime; 
        private String status; 
        private String tensorboardId; 
        private String userId; 
        private String username; 
        private Boolean verbose; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListTensorboardsRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.displayName = request.displayName;
            this.endTime = request.endTime;
            this.jobId = request.jobId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paymentType = request.paymentType;
            this.quotaId = request.quotaId;
            this.showOwn = request.showOwn;
            this.sortBy = request.sortBy;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.startTime = request.startTime;
            this.status = request.status;
            this.tensorboardId = request.tensorboardId;
            this.userId = request.userId;
            this.username = request.username;
            this.verbose = request.verbose;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The instance visibility.</p>
         * <ul>
         * <li>PUBLIC: TensorBoard instances are visible to all members in the workspace.</li>
         * <li>PRIVATE: TensorBoard instances are visible only to you and the administrator of the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The TensorBoard instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTensorboard</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The end time of the query. Use the UTC time when the TensorBoard instance is created to filter data. If you leave this parameter empty, the default value is the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-09T14:45:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The job ID used to filter TensorBoard instances. For more information about how to obtain the ID of a job, see <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-xxx</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The sorting order.</p>
         * <ul>
         * <li>desc</li>
         * <li>asc</li>
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
         * <p>The page number. Minimum value: 1.</p>
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
         * <p>The number of TensorBoard instances per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The billing method of TensorBoard instances.</p>
         * <ul>
         * <li>Free: the TensorBoard instance that uses free resources.</li>
         * <li>Postpaid: the TensorBoard instance that uses pay-as-you-go resources.</li>
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
         * <p>The resource quota ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>Only whitelisted users can use resource quotas to create TensorBoard instances. If you want to use this feature, contact us.</p>
         * </li>
         * <li><p>This parameter takes effect only when TensorBoard instances use resource quotas.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>quota12***</p>
         */
        public Builder quotaId(String quotaId) {
            this.putQueryParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>Specifies whether to return only the TensorBoard instances created by the current logon account.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder showOwn(Boolean showOwn) {
            this.putQueryParameter("ShowOwn", showOwn);
            this.showOwn = showOwn;
            return this;
        }

        /**
         * <p>The returned field used to sort TensorBoard instances.</p>
         * <ul>
         * <li>DisplayName: the name of the TensorBoard instance.</li>
         * <li>GmtCreateTime: the time when the TensorBoard instance is created.</li>
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
         * <p>The data source ID. For more information about how to obtain the ID of a job, see <a href="https://help.aliyun.com/document_detail/459676.html">ListJobs</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-xxxxxx</p>
         */
        public Builder sourceId(String sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The data source associated with the TensorBoard instance. This parameter is no longer used. Only Deep Learning Containers (DLC) training jobs are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>job</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The start time of the query. Use the UTC time when the TensorBoard instance is created to filter data. If you leave this parameter empty, the default value is seven days before the current time.</p>
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
         * <p>The TensorBoard instance status. Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Running</li>
         * <li>Stopped</li>
         * <li>Succeeded</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The TensorBoard instance ID used to filter TensorBoard instances.</p>
         * 
         * <strong>example:</strong>
         * <p>tensorboard-xxx</p>
         */
        public Builder tensorboardId(String tensorboardId) {
            this.putQueryParameter("TensorboardId", tensorboardId);
            this.tensorboardId = tensorboardId;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>161****3000</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>she****mo</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>Specifies whether to return the information about the TensorBoard instance.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * <p>The workspace ID. Obtain a list of TensorBoard instances based on the workspace ID. 
         * &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>380</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListTensorboardsRequest build() {
            return new ListTensorboardsRequest(this);
        } 

    } 

}
