// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProcessTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeProcessTasksRequest</p>
 */
public class DescribeProcessTasksRequest extends Request {
    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("EntityName")
    private String entityName;

    @Query
    @NameInMap("EntityType")
    private String entityType;

    @Query
    @NameInMap("OrderField")
    private String orderField;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParamContent")
    private String paramContent;

    @Query
    @NameInMap("ProcessActionEnd")
    private Long processActionEnd;

    @Query
    @NameInMap("ProcessActionStart")
    private Long processActionStart;

    @Query
    @NameInMap("ProcessRemoveEnd")
    private Long processRemoveEnd;

    @Query
    @NameInMap("ProcessRemoveStart")
    private Long processRemoveStart;

    @Query
    @NameInMap("ProcessStrategyUuid")
    private String processStrategyUuid;

    @Query
    @NameInMap("SceneCode")
    private String sceneCode;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TaskStatus")
    private String taskStatus;

    @Query
    @NameInMap("YunCode")
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
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * EntityName.
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * OrderField.
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
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
         * ParamContent.
         */
        public Builder paramContent(String paramContent) {
            this.putQueryParameter("ParamContent", paramContent);
            this.paramContent = paramContent;
            return this;
        }

        /**
         * ProcessActionEnd.
         */
        public Builder processActionEnd(Long processActionEnd) {
            this.putQueryParameter("ProcessActionEnd", processActionEnd);
            this.processActionEnd = processActionEnd;
            return this;
        }

        /**
         * ProcessActionStart.
         */
        public Builder processActionStart(Long processActionStart) {
            this.putQueryParameter("ProcessActionStart", processActionStart);
            this.processActionStart = processActionStart;
            return this;
        }

        /**
         * ProcessRemoveEnd.
         */
        public Builder processRemoveEnd(Long processRemoveEnd) {
            this.putQueryParameter("ProcessRemoveEnd", processRemoveEnd);
            this.processRemoveEnd = processRemoveEnd;
            return this;
        }

        /**
         * ProcessRemoveStart.
         */
        public Builder processRemoveStart(Long processRemoveStart) {
            this.putQueryParameter("ProcessRemoveStart", processRemoveStart);
            this.processRemoveStart = processRemoveStart;
            return this;
        }

        /**
         * ProcessStrategyUuid.
         */
        public Builder processStrategyUuid(String processStrategyUuid) {
            this.putQueryParameter("ProcessStrategyUuid", processStrategyUuid);
            this.processStrategyUuid = processStrategyUuid;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * YunCode.
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
