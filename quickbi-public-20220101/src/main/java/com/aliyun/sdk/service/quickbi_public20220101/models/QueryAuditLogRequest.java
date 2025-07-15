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
 * {@link QueryAuditLogRequest} extends {@link RequestModel}
 *
 * <p>QueryAuditLogRequest</p>
 */
public class QueryAuditLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessSourceFlag")
    private String accessSourceFlag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorId")
    private String operatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorTypes")
    private String operatorTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessDevice")
    private String userAccessDevice;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryAuditLogRequest(Builder builder) {
        super(builder);
        this.accessSourceFlag = builder.accessSourceFlag;
        this.endDate = builder.endDate;
        this.logType = builder.logType;
        this.operatorId = builder.operatorId;
        this.operatorTypes = builder.operatorTypes;
        this.resourceType = builder.resourceType;
        this.startDate = builder.startDate;
        this.userAccessDevice = builder.userAccessDevice;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuditLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessSourceFlag
     */
    public String getAccessSourceFlag() {
        return this.accessSourceFlag;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return operatorId
     */
    public String getOperatorId() {
        return this.operatorId;
    }

    /**
     * @return operatorTypes
     */
    public String getOperatorTypes() {
        return this.operatorTypes;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return userAccessDevice
     */
    public String getUserAccessDevice() {
        return this.userAccessDevice;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryAuditLogRequest, Builder> {
        private String accessSourceFlag; 
        private String endDate; 
        private String logType; 
        private String operatorId; 
        private String operatorTypes; 
        private String resourceType; 
        private String startDate; 
        private String userAccessDevice; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuditLogRequest request) {
            super(request);
            this.accessSourceFlag = request.accessSourceFlag;
            this.endDate = request.endDate;
            this.logType = request.logType;
            this.operatorId = request.operatorId;
            this.operatorTypes = request.operatorTypes;
            this.resourceType = request.resourceType;
            this.startDate = request.startDate;
            this.userAccessDevice = request.userAccessDevice;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AccessSourceFlag.
         */
        public Builder accessSourceFlag(String accessSourceFlag) {
            this.putQueryParameter("AccessSourceFlag", accessSourceFlag);
            this.accessSourceFlag = accessSourceFlag;
            return this;
        }

        /**
         * <p>End date of the query, format (&quot;yyyyMMdd&quot;).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20240604</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>Log type:</p>
         * <ul>
         * <li>dataView - Access</li>
         * <li>function - Operation</li>
         * <li>permission - Permission</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>function</p>
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * <p>Operator&quot;s user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0***</p>
         */
        public Builder operatorId(String operatorId) {
            this.putQueryParameter("OperatorId", operatorId);
            this.operatorId = operatorId;
            return this;
        }

        /**
         * <p>Permission/Access/Operation type, empty - default all;</p>
         * <p>Refer to the audit log code values, send multiple values separated by English commas.</p>
         * 
         * <strong>example:</strong>
         * <p>MODIFY</p>
         */
        public Builder operatorTypes(String operatorTypes) {
            this.putQueryParameter("OperatorTypes", operatorTypes);
            this.operatorTypes = operatorTypes;
            return this;
        }

        /**
         * <p>Resource type, refer to the work type.</p>
         * 
         * <strong>example:</strong>
         * <p>cube</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>Start date of the query, format (&quot;yyyyMMdd&quot;), cannot be earlier than 90 days from the current time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20240504</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * UserAccessDevice.
         */
        public Builder userAccessDevice(String userAccessDevice) {
            this.putQueryParameter("UserAccessDevice", userAccessDevice);
            this.userAccessDevice = userAccessDevice;
            return this;
        }

        /**
         * <p>Workspace ID, the ID of the workspace to which the logs to be queried belong.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryAuditLogRequest build() {
            return new QueryAuditLogRequest(this);
        } 

    } 

}
