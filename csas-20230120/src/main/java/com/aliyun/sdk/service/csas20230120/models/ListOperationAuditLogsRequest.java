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
 * {@link ListOperationAuditLogsRequest} extends {@link RequestModel}
 *
 * <p>ListOperationAuditLogsRequest</p>
 */
public class ListOperationAuditLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationFunc")
    private String operationFunc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationStatus")
    private String operationStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorId")
    private String operatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private ListOperationAuditLogsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.eventType = builder.eventType;
        this.operationFunc = builder.operationFunc;
        this.operationStatus = builder.operationStatus;
        this.operationType = builder.operationType;
        this.operatorId = builder.operatorId;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationAuditLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return operationFunc
     */
    public String getOperationFunc() {
        return this.operationFunc;
    }

    /**
     * @return operationStatus
     */
    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListOperationAuditLogsRequest, Builder> {
        private Integer currentPage; 
        private String endTime; 
        private String eventType; 
        private String operationFunc; 
        private String operationStatus; 
        private String operationType; 
        private String operatorId; 
        private Integer pageSize; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationAuditLogsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.eventType = request.eventType;
            this.operationFunc = request.operationFunc;
            this.operationStatus = request.operationStatus;
            this.operationType = request.operationType;
            this.operatorId = request.operatorId;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The page number of the current page in paging. The value starts from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end time of the query. This value is a UNIX timestamp in seconds. The value must be later than StartTime.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1787550343</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event source type. Valid values:</p>
         * <ul>
         * <li><strong>console</strong>: console call.</li>
         * <li><strong>sdk</strong>: SDK call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The operation function module. The value is the English code of the function module. If other values are specified, no records are returned. Valid values:</p>
         * <ul>
         * <li><strong>PrivateAccess</strong>: private access.</li>
         * <li><strong>OfficeNetworkAccess</strong>: office network access.</li>
         * <li><strong>AppAcceleration</strong>: application acceleration.</li>
         * <li><strong>InternetAccess</strong>: Internet access.</li>
         * <li><strong>OfficeDataProtection</strong>: office data protection.</li>
         * <li><strong>IdentityAccessManagement</strong>: identity and access management.</li>
         * <li><strong>DeviceManagement</strong>: device management.</li>
         * <li><strong>ApprovalCenter</strong>: approval center.</li>
         * <li><strong>SoftwareManagement</strong>: software management.</li>
         * <li><strong>LogAnalysis</strong>: log analysis.</li>
         * <li><strong>Setting</strong>: settings.</li>
         * <li><strong>DigitalWatermark</strong>: digital watermarking.</li>
         * <li><strong>DynamicDecision</strong>: dynamic decision.</li>
         * <li><strong>InternetBehaviorManagement</strong>: Internet behavior management.</li>
         * <li><strong>AgentOfficeSecurity</strong>: Agent office security.</li>
         * <li><strong>NetworkAccess</strong>: network access.</li>
         * <li><strong>RiskManagement</strong>: risk management.</li>
         * <li><strong>EndpointProtection</strong>: endpoint protection.</li>
         * <li><strong>Overview</strong>: overview page.</li>
         * <li><strong>ITManagement</strong>: IT management.</li>
         * <li><strong>InstanceManagement</strong>: instance management.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OfficeDataProtection</p>
         */
        public Builder operationFunc(String operationFunc) {
            this.putQueryParameter("OperationFunc", operationFunc);
            this.operationFunc = operationFunc;
            return this;
        }

        /**
         * <p>The operation status. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The operation succeeded. Equivalent values: true, 成功.</li>
         * <li><strong>failure</strong>: The operation failed. Equivalent values: fail, failed, false, 失败.</li>
         * </ul>
         * <p>If this parameter is not specified, only successful operation records are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder operationStatus(String operationStatus) {
            this.putQueryParameter("OperationStatus", operationStatus);
            this.operationStatus = operationStatus;
            return this;
        }

        /**
         * <p>The operation type. The value must exactly match the original operation type recorded in the log. The OperationType value in the response is localized based on the request language and may differ from this filter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Sync classification rules</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID (AliUid) of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        public Builder operatorId(String operatorId) {
            this.putQueryParameter("OperatorId", operatorId);
            this.operatorId = operatorId;
            return this;
        }

        /**
         * <p>The number of entries per page. Settings: 1 to 100. Used in paging.</p>
         * <p>This parameter is required.</p>
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
         * <p>The start time of the query. This value is a UNIX timestamp in seconds. The value must be earlier than EndTime. The interval between StartTime and EndTime cannot exceed 30 days, and StartTime cannot be more than 31 days before the current time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1786945543</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListOperationAuditLogsRequest build() {
            return new ListOperationAuditLogsRequest(this);
        } 

    } 

}
