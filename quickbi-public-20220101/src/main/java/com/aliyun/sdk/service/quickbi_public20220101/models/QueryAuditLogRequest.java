// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuditLogRequest} extends {@link RequestModel}
 *
 * <p>QueryAuditLogRequest</p>
 */
public class QueryAuditLogRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryAuditLogRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.logType = builder.logType;
        this.operatorId = builder.operatorId;
        this.operatorTypes = builder.operatorTypes;
        this.resourceType = builder.resourceType;
        this.startDate = builder.startDate;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryAuditLogRequest, Builder> {
        private String endDate; 
        private String logType; 
        private String operatorId; 
        private String operatorTypes; 
        private String resourceType; 
        private String startDate; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuditLogRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.logType = request.logType;
            this.operatorId = request.operatorId;
            this.operatorTypes = request.operatorTypes;
            this.resourceType = request.resourceType;
            this.startDate = request.startDate;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * OperatorId.
         */
        public Builder operatorId(String operatorId) {
            this.putQueryParameter("OperatorId", operatorId);
            this.operatorId = operatorId;
            return this;
        }

        /**
         * OperatorTypes.
         */
        public Builder operatorTypes(String operatorTypes) {
            this.putQueryParameter("OperatorTypes", operatorTypes);
            this.operatorTypes = operatorTypes;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * WorkspaceId.
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
