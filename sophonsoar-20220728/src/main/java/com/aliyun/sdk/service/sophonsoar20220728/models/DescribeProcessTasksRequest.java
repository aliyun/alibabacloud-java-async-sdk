// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessTasksRequest</p>
 */
public class DescribeProcessTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityName")
    private String entityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamContent")
    private String paramContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessActionEnd")
    private Long processActionEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessActionStart")
    private Long processActionStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessRemoveEnd")
    private Long processRemoveEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessRemoveStart")
    private Long processRemoveStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessStrategyUuid")
    private String processStrategyUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YunCode")
    private String yunCode;

    private DescribeProcessTasksRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.orderField = builder.orderField;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.paramContent = builder.paramContent;
        this.processActionEnd = builder.processActionEnd;
        this.processActionStart = builder.processActionStart;
        this.processRemoveEnd = builder.processRemoveEnd;
        this.processRemoveStart = builder.processRemoveStart;
        this.processStrategyUuid = builder.processStrategyUuid;
        this.sceneCode = builder.sceneCode;
        this.scope = builder.scope;
        this.source = builder.source;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.yunCode = builder.yunCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProcessTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return orderField
     */
    public String getOrderField() {
        return this.orderField;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return paramContent
     */
    public String getParamContent() {
        return this.paramContent;
    }

    /**
     * @return processActionEnd
     */
    public Long getProcessActionEnd() {
        return this.processActionEnd;
    }

    /**
     * @return processActionStart
     */
    public Long getProcessActionStart() {
        return this.processActionStart;
    }

    /**
     * @return processRemoveEnd
     */
    public Long getProcessRemoveEnd() {
        return this.processRemoveEnd;
    }

    /**
     * @return processRemoveStart
     */
    public Long getProcessRemoveStart() {
        return this.processRemoveStart;
    }

    /**
     * @return processStrategyUuid
     */
    public String getProcessStrategyUuid() {
        return this.processStrategyUuid;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return yunCode
     */
    public String getYunCode() {
        return this.yunCode;
    }

    public static final class Builder extends Request.Builder<DescribeProcessTasksRequest, Builder> {
        private String direction; 
        private String entityName; 
        private String entityType; 
        private String orderField; 
        private String pageNumber; 
        private Integer pageSize; 
        private String paramContent; 
        private Long processActionEnd; 
        private Long processActionStart; 
        private Long processRemoveEnd; 
        private Long processRemoveStart; 
        private String processStrategyUuid; 
        private String sceneCode; 
        private String scope; 
        private String source; 
        private String taskId; 
        private String taskStatus; 
        private String yunCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProcessTasksRequest request) {
            super(request);
            this.direction = request.direction;
            this.entityName = request.entityName;
            this.entityType = request.entityType;
            this.orderField = request.orderField;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.paramContent = request.paramContent;
            this.processActionEnd = request.processActionEnd;
            this.processActionStart = request.processActionStart;
            this.processRemoveEnd = request.processRemoveEnd;
            this.processRemoveStart = request.processRemoveStart;
            this.processStrategyUuid = request.processStrategyUuid;
            this.sceneCode = request.sceneCode;
            this.scope = request.scope;
            this.source = request.source;
            this.taskId = request.taskId;
            this.taskStatus = request.taskStatus;
            this.yunCode = request.yunCode;
        } 

        /**
         * The sort order. Valid values:
         * <p>
         * 
         * *   **desc** (default)
         * *   **asc**
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The name of the handling entity.
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * The type of the handling entity. Valid values:
         * <p>
         * 
         * *   **ip**
         * *   **file**
         * *   **process**
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * The field that you use to sort the result.
         * <p>
         * 
         * >  You can obtain the field from the response result.
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * The page number. Default value: 1. Pages start from page 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. If you do not specify the PageSize parameter, 10 entries are returned by default.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The handling entity, handling scenario, or handling parameter that is used for fuzzy match.
         */
        public Builder paramContent(String paramContent) {
            this.putQueryParameter("ParamContent", paramContent);
            this.paramContent = paramContent;
            return this;
        }

        /**
         * The end of the time range for a handling task. The value is a 13-digit timestamp.
         */
        public Builder processActionEnd(Long processActionEnd) {
            this.putQueryParameter("ProcessActionEnd", processActionEnd);
            this.processActionEnd = processActionEnd;
            return this;
        }

        /**
         * The beginning of the time range for a handling task. The value is a 13-digit timestamp.
         */
        public Builder processActionStart(Long processActionStart) {
            this.putQueryParameter("ProcessActionStart", processActionStart);
            this.processActionStart = processActionStart;
            return this;
        }

        /**
         * The end of the time range for an unblocking task. The value is a 13-digit timestamp.
         */
        public Builder processRemoveEnd(Long processRemoveEnd) {
            this.putQueryParameter("ProcessRemoveEnd", processRemoveEnd);
            this.processRemoveEnd = processRemoveEnd;
            return this;
        }

        /**
         * The beginning of the time range for an unblocking task. The value is a 13-digit timestamp.
         */
        public Builder processRemoveStart(Long processRemoveStart) {
            this.putQueryParameter("ProcessRemoveStart", processRemoveStart);
            this.processRemoveStart = processRemoveStart;
            return this;
        }

        /**
         * The UUID of the handling policy.
         * <p>
         * 
         * >  You can call the [ListDisposeStrategy](~~2584440~~) operation to query the UUID of the handling policy.
         */
        public Builder processStrategyUuid(String processStrategyUuid) {
            this.putQueryParameter("ProcessStrategyUuid", processStrategyUuid);
            this.processStrategyUuid = processStrategyUuid;
            return this;
        }

        /**
         * The scenario code of the handling task.
         * <p>
         * 
         * >  You can call the [DescribeEnumItems](~~DescribeEnumItems~~) operation to query the scenario code of the handling task. This parameter is available when you set **EnumType** to **process**.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account that is specified in the handling task.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * The triggering source of the handling task. The value is a string array. Valid values:
         * <p>
         * 
         * *   **system**: triggered when you manually handle an event
         * *   **custom**: triggered by an event based on an automatic response rule
         * *   **custom_alert**: triggered by an alert based on an automatic response rule
         * *   **soar-manual**: triggered when you use SOAR to manually run a playbook
         * *   **soar-mdr**: triggered by Managed Security Service
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The unique identifier of the handling task.
         * <p>
         * 
         * >  This parameter is used to query a specific task. You can obtain the value from the response result.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The status of the handling task. The value is a string. Valid values:
         * <p>
         * 
         * *   **11**: being handled
         * *   **21**: being blocked
         * *   **22**: being quarantined
         * *   **23**: completed
         * *   **24**: added to the whitelist
         * *   **20**: successful
         * *   **90**: failed
         * *   **91**: unblocking failed
         * *   **92**: restoring quarantined files failed
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * The cloud service that is associated with the handling task. The value is a string. Valid values:
         * <p>
         * 
         * *   **WAF**: Web Application Firewall (WAF)
         * *   **CFW**: Cloud Firewall
         * *   **Aegis**: Security Center
         */
        public Builder yunCode(String yunCode) {
            this.putQueryParameter("YunCode", yunCode);
            this.yunCode = yunCode;
            return this;
        }

        @Override
        public DescribeProcessTasksRequest build() {
            return new DescribeProcessTasksRequest(this);
        } 

    } 

}
