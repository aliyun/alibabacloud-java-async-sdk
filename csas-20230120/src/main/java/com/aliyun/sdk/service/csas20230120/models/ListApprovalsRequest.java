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
 * {@link ListApprovalsRequest} extends {@link RequestModel}
 *
 * <p>ListApprovalsRequest</p>
 */
public class ListApprovalsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalIds")
    private java.util.List<String> approvalIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateEndTime")
    private Long createEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateStartTime")
    private Long createStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorDepartment")
    private String creatorDepartment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorDevTag")
    private String creatorDevTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorUserId")
    private String creatorUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorUsername")
    private String creatorUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectStatuses")
    private java.util.List<String> effectStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorUserId")
    private String operatorUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorUsername")
    private String operatorUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    private String processId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessName")
    private String processName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportTypes")
    private java.util.List<String> reportTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaId")
    private String schemaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    private ListApprovalsRequest(Builder builder) {
        super(builder);
        this.approvalIds = builder.approvalIds;
        this.createEndTime = builder.createEndTime;
        this.createStartTime = builder.createStartTime;
        this.creatorDepartment = builder.creatorDepartment;
        this.creatorDevTag = builder.creatorDevTag;
        this.creatorUserId = builder.creatorUserId;
        this.creatorUsername = builder.creatorUsername;
        this.currentPage = builder.currentPage;
        this.effectStatuses = builder.effectStatuses;
        this.operatorUserId = builder.operatorUserId;
        this.operatorUsername = builder.operatorUsername;
        this.pageSize = builder.pageSize;
        this.policyType = builder.policyType;
        this.processId = builder.processId;
        this.processName = builder.processName;
        this.reportTypes = builder.reportTypes;
        this.schemaId = builder.schemaId;
        this.schemaName = builder.schemaName;
        this.statuses = builder.statuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvalIds
     */
    public java.util.List<String> getApprovalIds() {
        return this.approvalIds;
    }

    /**
     * @return createEndTime
     */
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    /**
     * @return createStartTime
     */
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    /**
     * @return creatorDepartment
     */
    public String getCreatorDepartment() {
        return this.creatorDepartment;
    }

    /**
     * @return creatorDevTag
     */
    public String getCreatorDevTag() {
        return this.creatorDevTag;
    }

    /**
     * @return creatorUserId
     */
    public String getCreatorUserId() {
        return this.creatorUserId;
    }

    /**
     * @return creatorUsername
     */
    public String getCreatorUsername() {
        return this.creatorUsername;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return effectStatuses
     */
    public java.util.List<String> getEffectStatuses() {
        return this.effectStatuses;
    }

    /**
     * @return operatorUserId
     */
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    /**
     * @return operatorUsername
     */
    public String getOperatorUsername() {
        return this.operatorUsername;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    /**
     * @return processName
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * @return reportTypes
     */
    public java.util.List<String> getReportTypes() {
        return this.reportTypes;
    }

    /**
     * @return schemaId
     */
    public String getSchemaId() {
        return this.schemaId;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public static final class Builder extends Request.Builder<ListApprovalsRequest, Builder> {
        private java.util.List<String> approvalIds; 
        private Long createEndTime; 
        private Long createStartTime; 
        private String creatorDepartment; 
        private String creatorDevTag; 
        private String creatorUserId; 
        private String creatorUsername; 
        private Long currentPage; 
        private java.util.List<String> effectStatuses; 
        private String operatorUserId; 
        private String operatorUsername; 
        private Long pageSize; 
        private String policyType; 
        private String processId; 
        private String processName; 
        private java.util.List<String> reportTypes; 
        private String schemaId; 
        private String schemaName; 
        private java.util.List<String> statuses; 

        private Builder() {
            super();
        } 

        private Builder(ListApprovalsRequest request) {
            super(request);
            this.approvalIds = request.approvalIds;
            this.createEndTime = request.createEndTime;
            this.createStartTime = request.createStartTime;
            this.creatorDepartment = request.creatorDepartment;
            this.creatorDevTag = request.creatorDevTag;
            this.creatorUserId = request.creatorUserId;
            this.creatorUsername = request.creatorUsername;
            this.currentPage = request.currentPage;
            this.effectStatuses = request.effectStatuses;
            this.operatorUserId = request.operatorUserId;
            this.operatorUsername = request.operatorUsername;
            this.pageSize = request.pageSize;
            this.policyType = request.policyType;
            this.processId = request.processId;
            this.processName = request.processName;
            this.reportTypes = request.reportTypes;
            this.schemaId = request.schemaId;
            this.schemaName = request.schemaName;
            this.statuses = request.statuses;
        } 

        /**
         * <p>The collection of approval instance IDs.</p>
         */
        public Builder approvalIds(java.util.List<String> approvalIds) {
            this.putQueryParameter("ApprovalIds", approvalIds);
            this.approvalIds = approvalIds;
            return this;
        }

        /**
         * <p>The end time for querying approval instance creation, in seconds-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1736750500</p>
         */
        public Builder createEndTime(Long createEndTime) {
            this.putQueryParameter("CreateEndTime", createEndTime);
            this.createEndTime = createEndTime;
            return this;
        }

        /**
         * <p>The start time for querying approval instance creation, in seconds-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1730000000</p>
         */
        public Builder createStartTime(Long createStartTime) {
            this.putQueryParameter("CreateStartTime", createStartTime);
            this.createStartTime = createStartTime;
            return this;
        }

        /**
         * <p>The department of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>QA Department</p>
         */
        public Builder creatorDepartment(String creatorDepartment) {
            this.putQueryParameter("CreatorDepartment", creatorDepartment);
            this.creatorDepartment = creatorDepartment;
            return this;
        }

        /**
         * <p>The terminal device ID of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder creatorDevTag(String creatorDevTag) {
            this.putQueryParameter("CreatorDevTag", creatorDevTag);
            this.creatorDevTag = creatorDevTag;
            return this;
        }

        /**
         * <p>The ID of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        public Builder creatorUserId(String creatorUserId) {
            this.putQueryParameter("CreatorUserId", creatorUserId);
            this.creatorUserId = creatorUserId;
            return this;
        }

        /**
         * <p>The username of the approval instance creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Mr. Wang</p>
         */
        public Builder creatorUsername(String creatorUsername) {
            this.putQueryParameter("CreatorUsername", creatorUsername);
            this.creatorUsername = creatorUsername;
            return this;
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
         * <p>The list of report effective statuses, serialized in Flat format. Duplicate values are not allowed. Only records with an approval status of Approved are matched. Valid values:</p>
         * <ul>
         * <li>Enabled: effective.</li>
         * <li>Expired: expired or invalidated.</li>
         * </ul>
         */
        public Builder effectStatuses(java.util.List<String> effectStatuses) {
            this.putQueryParameter("EffectStatuses", effectStatuses);
            this.effectStatuses = effectStatuses;
            return this;
        }

        /**
         * <p>The ID of the approval instance operator.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        public Builder operatorUserId(String operatorUserId) {
            this.putQueryParameter("OperatorUserId", operatorUserId);
            this.operatorUserId = operatorUserId;
            return this;
        }

        /**
         * <p>The username of the approval instance operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Ms. Li</p>
         */
        public Builder operatorUsername(String operatorUsername) {
            this.putQueryParameter("OperatorUsername", operatorUsername);
            this.operatorUsername = operatorUsername;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query. Valid values: 1 to 500.</p>
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
         * <p>The adaptation policy type. Valid values:</p>
         * <ul>
         * <li><strong>DomainBlacklist</strong>: Domain name blacklist.</li>
         * <li><strong>DomainWhitelist</strong>: Domain name whitelist.</li>
         * <li><strong>SoftwareBlock</strong>: Software blocking.</li>
         * <li><strong>AppUninstall</strong>: Agent uninstallation.</li>
         * <li><strong>DlpSend</strong>: File outbound transfer.</li>
         * <li><strong>PeripheralBlock</strong>: Peripheral control.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The associated approval process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-fcc351b8a95b****</p>
         */
        public Builder processId(String processId) {
            this.putQueryParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        /**
         * <p>The associated approval process name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder processName(String processName) {
            this.putQueryParameter("ProcessName", processName);
            this.processName = processName;
            return this;
        }

        /**
         * <p>The list of report types, serialized in Flat format. Duplicate values are not allowed. Valid values:</p>
         * <ul>
         * <li>ApprovalReport: approval report.</li>
         * <li>BackendReport: backend report.
         * If not specified, only ApprovalReport is queried by default.</li>
         * </ul>
         */
        public Builder reportTypes(java.util.List<String> reportTypes) {
            this.putQueryParameter("ReportTypes", reportTypes);
            this.reportTypes = reportTypes;
            return this;
        }

        /**
         * <p>The associated approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        public Builder schemaId(String schemaId) {
            this.putQueryParameter("SchemaId", schemaId);
            this.schemaId = schemaId;
            return this;
        }

        /**
         * <p>The associated approval template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        /**
         * <p>The collection of approval instance statuses.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            this.putQueryParameter("Statuses", statuses);
            this.statuses = statuses;
            return this;
        }

        @Override
        public ListApprovalsRequest build() {
            return new ListApprovalsRequest(this);
        } 

    } 

}
