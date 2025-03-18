// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
    @com.aliyun.core.annotation.NameInMap("EntityUuid")
    private String entityUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventUuid")
    private String eventUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderField")
    private String orderField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

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
    @com.aliyun.core.annotation.NameInMap("TriggerSource")
    private String triggerSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YunCode")
    private String yunCode;

    private DescribeProcessTasksRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.entityName = builder.entityName;
        this.entityType = builder.entityType;
        this.entityUuid = builder.entityUuid;
        this.eventUuid = builder.eventUuid;
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
        this.triggerSource = builder.triggerSource;
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
     * @return entityUuid
     */
    public String getEntityUuid() {
        return this.entityUuid;
    }

    /**
     * @return eventUuid
     */
    public String getEventUuid() {
        return this.eventUuid;
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
    public Long getPageNumber() {
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
     * @return triggerSource
     */
    public String getTriggerSource() {
        return this.triggerSource;
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
        private String entityUuid; 
        private String eventUuid; 
        private String orderField; 
        private Long pageNumber; 
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
        private String triggerSource; 
        private String yunCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProcessTasksRequest request) {
            super(request);
            this.direction = request.direction;
            this.entityName = request.entityName;
            this.entityType = request.entityType;
            this.entityUuid = request.entityUuid;
            this.eventUuid = request.eventUuid;
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
            this.triggerSource = request.triggerSource;
            this.yunCode = request.yunCode;
        } 

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong> (default)</li>
         * <li><strong>asc</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The name of the handling entity.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * <p>The type of the handling entity. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong></li>
         * <li><strong>file</strong></li>
         * <li><strong>process</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * EntityUuid.
         */
        public Builder entityUuid(String entityUuid) {
            this.putQueryParameter("EntityUuid", entityUuid);
            this.entityUuid = entityUuid;
            return this;
        }

        /**
         * EventUuid.
         */
        public Builder eventUuid(String eventUuid) {
            this.putQueryParameter("EventUuid", eventUuid);
            this.eventUuid = eventUuid;
            return this;
        }

        /**
         * <p>The field that you use to sort the result.</p>
         * <blockquote>
         * <p> You can obtain the field from the response result.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gmtCreate</p>
         */
        public Builder orderField(String orderField) {
            this.putQueryParameter("OrderField", orderField);
            this.orderField = orderField;
            return this;
        }

        /**
         * <p>The page number. Default value: 1. Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. If you do not specify the PageSize parameter, 10 entries are returned by default.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
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
         * <p>The handling entity, handling scenario, or handling parameter that is used for fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>12.x.x.x</p>
         */
        public Builder paramContent(String paramContent) {
            this.putQueryParameter("ParamContent", paramContent);
            this.paramContent = paramContent;
            return this;
        }

        /**
         * <p>The end of the time range for a handling task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        public Builder processActionEnd(Long processActionEnd) {
            this.putQueryParameter("ProcessActionEnd", processActionEnd);
            this.processActionEnd = processActionEnd;
            return this;
        }

        /**
         * <p>The beginning of the time range for a handling task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        public Builder processActionStart(Long processActionStart) {
            this.putQueryParameter("ProcessActionStart", processActionStart);
            this.processActionStart = processActionStart;
            return this;
        }

        /**
         * <p>The end of the time range for an unblocking task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        public Builder processRemoveEnd(Long processRemoveEnd) {
            this.putQueryParameter("ProcessRemoveEnd", processRemoveEnd);
            this.processRemoveEnd = processRemoveEnd;
            return this;
        }

        /**
         * <p>The beginning of the time range for an unblocking task. The value is a 13-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1700031183572</p>
         */
        public Builder processRemoveStart(Long processRemoveStart) {
            this.putQueryParameter("ProcessRemoveStart", processRemoveStart);
            this.processRemoveStart = processRemoveStart;
            return this;
        }

        /**
         * <p>The UUID of the handling policy.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2584440.html">ListDisposeStrategy</a> operation to query the UUID of the handling policy.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>92af3c79-1754-4646-9366-9ddbd1e45536_xxxx</p>
         */
        public Builder processStrategyUuid(String processStrategyUuid) {
            this.putQueryParameter("ProcessStrategyUuid", processStrategyUuid);
            this.processStrategyUuid = processStrategyUuid;
            return this;
        }

        /**
         * <p>The scenario code of the handling task.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeEnumItems~~">DescribeEnumItems</a> operation to query the scenario code of the handling task. This parameter is available when you set <strong>EnumType</strong> to <strong>process</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>event_xxx_whole_process</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that is specified in the handling task.</p>
         * 
         * <strong>example:</strong>
         * <p>125xxxxx9870</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The triggering source of the handling task. The value is a string array. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: triggered when you manually handle an event</li>
         * <li><strong>custom</strong>: triggered by an event based on an automatic response rule</li>
         * <li><strong>custom_alert</strong>: triggered by an alert based on an automatic response rule</li>
         * <li><strong>soar-manual</strong>: triggered when you use SOAR to manually run a playbook</li>
         * <li><strong>soar-mdr</strong>: triggered by Managed Security Service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;system&quot;]</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The unique identifier of the handling task.</p>
         * <blockquote>
         * <p> This parameter is used to query a specific task. You can obtain the value from the response result.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>150xxxxxxxxx95066</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The status of the handling task. The value is a string. Valid values:</p>
         * <ul>
         * <li><strong>11</strong>: being handled</li>
         * <li><strong>21</strong>: being blocked</li>
         * <li><strong>22</strong>: being quarantined</li>
         * <li><strong>23</strong>: completed</li>
         * <li><strong>24</strong>: added to the whitelist</li>
         * <li><strong>20</strong>: successful</li>
         * <li><strong>90</strong>: failed</li>
         * <li><strong>91</strong>: unblocking failed</li>
         * <li><strong>92</strong>: restoring quarantined files failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;11&quot;,&quot;21&quot;]</p>
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TriggerSource.
         */
        public Builder triggerSource(String triggerSource) {
            this.putQueryParameter("TriggerSource", triggerSource);
            this.triggerSource = triggerSource;
            return this;
        }

        /**
         * <p>The cloud service that is associated with the handling task. The value is a string. Valid values:</p>
         * <ul>
         * <li><strong>WAF</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>CFW</strong>: Cloud Firewall</li>
         * <li><strong>Aegis</strong>: Security Center</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;WAF&quot;]</p>
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
