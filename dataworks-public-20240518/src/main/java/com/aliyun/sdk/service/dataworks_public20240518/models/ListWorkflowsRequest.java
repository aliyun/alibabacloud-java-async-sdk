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
 * {@link ListWorkflowsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowsRequest</p>
 */
public class ListWorkflowsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

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
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    private String triggerType;

    private ListWorkflowsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.envType = builder.envType;
        this.ids = builder.ids;
        this.name = builder.name;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.sortBy = builder.sortBy;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowsRequest create() {
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
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
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
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder<ListWorkflowsRequest, Builder> {
        private String regionId; 
        private String envType; 
        private java.util.List<Long> ids; 
        private String name; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String sortBy; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.envType = request.envType;
            this.ids = request.ids;
            this.name = request.name;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.sortBy = request.sortBy;
            this.triggerType = request.triggerType;
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
         * <p>The environment of the workspace. Valid values:</p>
         * <ul>
         * <li>Prod: production environment</li>
         * <li>Dev: development environment</li>
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
         * <p>The IDs of the workflows. You can query multiple workflows at a time by workflow ID.</p>
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "Ids", "json");
            this.putBodyParameter("Ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * <p>The name of the workflow. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The account ID of the workflow owner.</p>
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
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The workspace ID.</p>
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
         * <p>The field used for sorting. Fields such as TriggerTime and StartedTime are supported. The value of this parameter is in the Sort field + Sort by (Desc/Asc) format. By default, results are sorted in ascending order. Valid values:</p>
         * <ul>
         * <li>ModifyTime (Desc/Asc)</li>
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
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: scheduling cycle-based trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
        public Builder triggerType(String triggerType) {
            this.putBodyParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public ListWorkflowsRequest build() {
            return new ListWorkflowsRequest(this);
        } 

    } 

}
