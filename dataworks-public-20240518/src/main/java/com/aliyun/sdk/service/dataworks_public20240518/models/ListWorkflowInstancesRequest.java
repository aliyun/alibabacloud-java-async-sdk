// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListWorkflowInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowInstancesRequest</p>
 */
public class ListWorkflowInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ids")
    private java.util.List<Long> ids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnifiedWorkflowInstanceId")
    private Long unifiedWorkflowInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private Long workflowId;

    private ListWorkflowInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizDate = builder.bizDate;
        this.envType = builder.envType;
        this.filter = builder.filter;
        this.ids = builder.ids;
        this.name = builder.name;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortBy = builder.sortBy;
        this.tags = builder.tags;
        this.type = builder.type;
        this.unifiedWorkflowInstanceId = builder.unifiedWorkflowInstanceId;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizDate
     */
    public Long getBizDate() {
        return this.bizDate;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return unifiedWorkflowInstanceId
     */
    public Long getUnifiedWorkflowInstanceId() {
        return this.unifiedWorkflowInstanceId;
    }

    /**
     * @return workflowId
     */
    public Long getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<ListWorkflowInstancesRequest, Builder> {
        private String regionId; 
        private Long bizDate; 
        private String envType; 
        private String filter; 
        private java.util.List<Long> ids; 
        private String name; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sortBy; 
        private java.util.List<String> tags; 
        private String type; 
        private Long unifiedWorkflowInstanceId; 
        private Long workflowId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizDate = request.bizDate;
            this.envType = request.envType;
            this.filter = request.filter;
            this.ids = request.ids;
            this.name = request.name;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortBy = request.sortBy;
            this.tags = request.tags;
            this.type = request.type;
            this.unifiedWorkflowInstanceId = request.unifiedWorkflowInstanceId;
            this.workflowId = request.workflowId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The business date. This is typically 00:00:00 of the day before the scheduled time of the periodic instance. The value is a millisecond-level timestamp, such as 1743350400000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        public Builder bizDate(Long bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * <p>The project environment. Valid values:</p>
         * <ul>
         * <li>Prod: production</li>
         * <li>Dev: development</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The filter. The value is in JSON format. Multiple filter conditions have an AND relationship. Currently supported fields: <code>status, executionDate</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{<br>    &quot;status&quot;: &quot;Success&quot;,
         *     &quot;executionDate&quot;: &quot;1763481600000&quot;
         * }</p>
         */
        public Builder filter(String filter) {
            this.putBodyParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The list of workflow instance IDs. You can use this parameter to query information about multiple workflow instances in a batch.</p>
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowInstance1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The account ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The list of sort fields. Sorting by scheduled time, start time, and other fields is supported. The format is &quot;sort field + sort order (Desc/Asc)&quot;. Asc is the default if omitted. Valid values for the sort field:</p>
         * <ul>
         * <li>TriggerTime (Desc/Asc)</li>
         * <li>StartedTime (Desc/Asc)</li>
         * <li>FinishedTime (Desc/Asc)</li>
         * <li>CreateTime (Desc/Asc)</li>
         * <li>Id (Desc/Asc)</li>
         * </ul>
         * <p>Default value: Id Desc.</p>
         * 
         * <strong>example:</strong>
         * <p>Id Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The list of tags. Results are returned if any one of the specified tags matches.</p>
         */
        public Builder tags(java.util.List<String> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the workflow instance. Valid values:</p>
         * <ul>
         * <li>Normal: periodic scheduling</li>
         * <li>Manual: manual task</li>
         * <li>SmokeTest: test</li>
         * <li>SupplementData: data backfill</li>
         * <li>ManualWorkflow: manual workflow</li>
         * <li>TriggerWorkflow: trigger-based workflow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The unified workflow instance ID. All workflow instances within the same business date under a specific trigger share the same value for this field.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder unifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
            this.putBodyParameter("UnifiedWorkflowInstanceId", unifiedWorkflowInstanceId);
            this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
            return this;
        }

        /**
         * <p>The ID of the workflow to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workflowId(Long workflowId) {
            this.putBodyParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public ListWorkflowInstancesRequest build() {
            return new ListWorkflowInstancesRequest(this);
        } 

    } 

}
