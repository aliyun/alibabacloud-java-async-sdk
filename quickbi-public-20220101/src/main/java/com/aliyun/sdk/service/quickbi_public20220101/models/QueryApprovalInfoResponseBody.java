// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryApprovalInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryApprovalInfoResponseBody</p>
 */
public class QueryApprovalInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryApprovalInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryApprovalInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryApprovalInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return the result of the interface execution.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the API call was successful. Possible values are:</p>
         * <ul>
         * <li>true: success</li>
         * <li>false: failure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryApprovalInfoResponseBody build() {
            return new QueryApprovalInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryApprovalInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApprovalInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicantId")
        private String applicantId;

        @com.aliyun.core.annotation.NameInMap("ApplicantName")
        private String applicantName;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplyReason")
        private String applyReason;

        @com.aliyun.core.annotation.NameInMap("ApproverId")
        private String approverId;

        @com.aliyun.core.annotation.NameInMap("ApproverName")
        private String approverName;

        @com.aliyun.core.annotation.NameInMap("DeleteFlag")
        private Boolean deleteFlag;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private Long expireDate;

        @com.aliyun.core.annotation.NameInMap("FlagStatus")
        private Integer flagStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("HandleReason")
        private String handleReason;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private Data(Builder builder) {
            this.applicantId = builder.applicantId;
            this.applicantName = builder.applicantName;
            this.applicationId = builder.applicationId;
            this.applyReason = builder.applyReason;
            this.approverId = builder.approverId;
            this.approverName = builder.approverName;
            this.deleteFlag = builder.deleteFlag;
            this.expireDate = builder.expireDate;
            this.flagStatus = builder.flagStatus;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.handleReason = builder.handleReason;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicantId
         */
        public String getApplicantId() {
            return this.applicantId;
        }

        /**
         * @return applicantName
         */
        public String getApplicantName() {
            return this.applicantName;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applyReason
         */
        public String getApplyReason() {
            return this.applyReason;
        }

        /**
         * @return approverId
         */
        public String getApproverId() {
            return this.approverId;
        }

        /**
         * @return approverName
         */
        public String getApproverName() {
            return this.approverName;
        }

        /**
         * @return deleteFlag
         */
        public Boolean getDeleteFlag() {
            return this.deleteFlag;
        }

        /**
         * @return expireDate
         */
        public Long getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return flagStatus
         */
        public Integer getFlagStatus() {
            return this.flagStatus;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return handleReason
         */
        public String getHandleReason() {
            return this.handleReason;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private String applicantId; 
            private String applicantName; 
            private String applicationId; 
            private String applyReason; 
            private String approverId; 
            private String approverName; 
            private Boolean deleteFlag; 
            private Long expireDate; 
            private Integer flagStatus; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String handleReason; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicantId = model.applicantId;
                this.applicantName = model.applicantName;
                this.applicationId = model.applicationId;
                this.applyReason = model.applyReason;
                this.approverId = model.approverId;
                this.approverName = model.approverName;
                this.deleteFlag = model.deleteFlag;
                this.expireDate = model.expireDate;
                this.flagStatus = model.flagStatus;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.handleReason = model.handleReason;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>Applicant&quot;s user ID, qbi user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1359508</p>
             */
            public Builder applicantId(String applicantId) {
                this.applicantId = applicantId;
                return this;
            }

            /**
             * <p>Applicant&quot;s nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>Li Fei</p>
             */
            public Builder applicantName(String applicantName) {
                this.applicantName = applicantName;
                return this;
            }

            /**
             * <p>Application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>64813ef6da58e80eef8ed2f9</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>Application reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Development needs</p>
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * <p>Approver&quot;s user ID, qbi user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sdasascasxasd</p>
             */
            public Builder approverId(String approverId) {
                this.approverId = approverId;
                return this;
            }

            /**
             * <p>Approver&quot;s nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>data_fusion_002</p>
             */
            public Builder approverName(String approverName) {
                this.approverName = approverName;
                return this;
            }

            /**
             * <p>Whether the resource has been deleted:</p>
             * <ul>
             * <li>true: Deleted</li>
             * <li>false: Not deleted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleteFlag(Boolean deleteFlag) {
                this.deleteFlag = deleteFlag;
                return this;
            }

            /**
             * <p>Permission expiration date, timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1708568097135</p>
             */
            public Builder expireDate(Long expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>Permission approval status:</p>
             * <ul>
             * <li>0: Under review, corresponding to 0 in the request parameters</li>
             * <li>1: Approved, corresponding to 1 in the request parameters</li>
             * <li>2: Rejected, corresponding to 1 in the request parameters</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flagStatus(Integer flagStatus) {
                this.flagStatus = flagStatus;
                return this;
            }

            /**
             * <p>Application creation time, timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1687315758</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Application modification time, timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1640595729000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Handling reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Development needs</p>
             */
            public Builder handleReason(String handleReason) {
                this.handleReason = handleReason;
                return this;
            }

            /**
             * <p>The ID of the resource for which permission is requested.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-ct4t2e4u2x4ej1bzur</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The name of the resource for which permission is requested (e.g., report name, space name...).</p>
             * 
             * <strong>example:</strong>
             * <p>Test Resources</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>DASHBOARD</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The name of the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Workspace</p>
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryApprovalInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryApprovalInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Integer start;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.start = builder.start;
            this.total = builder.total;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return start
         */
        public Integer getStart() {
            return this.start;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer page; 
            private Integer pageSize; 
            private Integer start; 
            private Integer total; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.start = model.start;
                this.total = model.total;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>Array of approval flow information.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * <p>The number of records requested per page.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The starting position of the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder start(Integer start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
