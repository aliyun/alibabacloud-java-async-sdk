// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommonLogsRequest} extends {@link RequestModel}
 *
 * <p>ListCommonLogsRequest</p>
 */
public class ListCommonLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    private java.util.List < String > actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionStatus")
    private String actionStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReverse")
    private Boolean isReverse;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogRequestId")
    private String logRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorUid")
    private String operatorUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long to;

    private ListCommonLogsRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.actionStatus = builder.actionStatus;
        this.clusterId = builder.clusterId;
        this.from = builder.from;
        this.isReverse = builder.isReverse;
        this.logRequestId = builder.logRequestId;
        this.logType = builder.logType;
        this.operatorUid = builder.operatorUid;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resource = builder.resource;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommonLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public java.util.List < String > getActionName() {
        return this.actionName;
    }

    /**
     * @return actionStatus
     */
    public String getActionStatus() {
        return this.actionStatus;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return from
     */
    public Long getFrom() {
        return this.from;
    }

    /**
     * @return isReverse
     */
    public Boolean getIsReverse() {
        return this.isReverse;
    }

    /**
     * @return logRequestId
     */
    public String getLogRequestId() {
        return this.logRequestId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return operatorUid
     */
    public String getOperatorUid() {
        return this.operatorUid;
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
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return to
     */
    public Long getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<ListCommonLogsRequest, Builder> {
        private java.util.List < String > actionName; 
        private String actionStatus; 
        private String clusterId; 
        private Long from; 
        private Boolean isReverse; 
        private String logRequestId; 
        private String logType; 
        private String operatorUid; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resource; 
        private Long to; 

        private Builder() {
            super();
        } 

        private Builder(ListCommonLogsRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.actionStatus = request.actionStatus;
            this.clusterId = request.clusterId;
            this.from = request.from;
            this.isReverse = request.isReverse;
            this.logRequestId = request.logRequestId;
            this.logType = request.logType;
            this.operatorUid = request.operatorUid;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resource = request.resource;
            this.to = request.to;
        } 

        /**
         * ActionName.
         */
        public Builder actionName(java.util.List < String > actionName) {
            String actionNameShrink = shrink(actionName, "ActionName", "json");
            this.putQueryParameter("ActionName", actionNameShrink);
            this.actionName = actionName;
            return this;
        }

        /**
         * ActionStatus.
         */
        public Builder actionStatus(String actionStatus) {
            this.putQueryParameter("ActionStatus", actionStatus);
            this.actionStatus = actionStatus;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * From.
         */
        public Builder from(Long from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * IsReverse.
         */
        public Builder isReverse(Boolean isReverse) {
            this.putQueryParameter("IsReverse", isReverse);
            this.isReverse = isReverse;
            return this;
        }

        /**
         * LogRequestId.
         */
        public Builder logRequestId(String logRequestId) {
            this.putQueryParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
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
         * OperatorUid.
         */
        public Builder operatorUid(String operatorUid) {
            this.putQueryParameter("OperatorUid", operatorUid);
            this.operatorUid = operatorUid;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * To.
         */
        public Builder to(Long to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public ListCommonLogsRequest build() {
            return new ListCommonLogsRequest(this);
        } 

    } 

}
