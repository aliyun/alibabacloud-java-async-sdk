// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaProfilingSkillJobPageRequest} extends {@link RequestModel}
 *
 * <p>ListMetaProfilingSkillJobPageRequest</p>
 */
public class ListMetaProfilingSkillJobPageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("componentIds")
    private java.util.List<Long> componentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsId")
    private Long dsId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsName")
    private String dsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsType")
    private String dsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private String groupBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isDisplaySystemTask")
    private Boolean isDisplaySystemTask;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobId")
    private Long jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("jobName")
    private String jobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("needTotalCount")
    private Boolean needTotalCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private ListMetaProfilingSkillJobPageRequest(Builder builder) {
        super(builder);
        this.componentIds = builder.componentIds;
        this.dsId = builder.dsId;
        this.dsName = builder.dsName;
        this.dsType = builder.dsType;
        this.groupBy = builder.groupBy;
        this.isDisplaySystemTask = builder.isDisplaySystemTask;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.needTotalCount = builder.needTotalCount;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaProfilingSkillJobPageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentIds
     */
    public java.util.List<Long> getComponentIds() {
        return this.componentIds;
    }

    /**
     * @return dsId
     */
    public Long getDsId() {
        return this.dsId;
    }

    /**
     * @return dsName
     */
    public String getDsName() {
        return this.dsName;
    }

    /**
     * @return dsType
     */
    public String getDsType() {
        return this.dsType;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return isDisplaySystemTask
     */
    public Boolean getIsDisplaySystemTask() {
        return this.isDisplaySystemTask;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return needTotalCount
     */
    public Boolean getNeedTotalCount() {
        return this.needTotalCount;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListMetaProfilingSkillJobPageRequest, Builder> {
        private java.util.List<Long> componentIds; 
        private Long dsId; 
        private String dsName; 
        private String dsType; 
        private String groupBy; 
        private Boolean isDisplaySystemTask; 
        private Long jobId; 
        private String jobName; 
        private Boolean needTotalCount; 
        private String orderBy; 
        private String orderDirection; 
        private Integer pageIndex; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListMetaProfilingSkillJobPageRequest request) {
            super(request);
            this.componentIds = request.componentIds;
            this.dsId = request.dsId;
            this.dsName = request.dsName;
            this.dsType = request.dsType;
            this.groupBy = request.groupBy;
            this.isDisplaySystemTask = request.isDisplaySystemTask;
            this.jobId = request.jobId;
            this.jobName = request.jobName;
            this.needTotalCount = request.needTotalCount;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The list of component IDs used to filter profiling tasks by multiple data source components.</p>
         */
        public Builder componentIds(java.util.List<Long> componentIds) {
            this.putBodyParameter("componentIds", componentIds);
            this.componentIds = componentIds;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        public Builder dsId(Long dsId) {
            this.putBodyParameter("dsId", dsId);
            this.dsId = dsId;
            return this;
        }

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_source_01</p>
         */
        public Builder dsName(String dsName) {
            this.putBodyParameter("dsName", dsName);
            this.dsName = dsName;
            return this;
        }

        /**
         * <p>The data source type identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder dsType(String dsType) {
            this.putBodyParameter("dsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * <p>The name of the grouping field used for aggregation.</p>
         * 
         * <strong>example:</strong>
         * <p>dbName</p>
         */
        public Builder groupBy(String groupBy) {
            this.putBodyParameter("groupBy", groupBy);
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>Specifies whether to display system built-in tasks.</p>
         */
        public Builder isDisplaySystemTask(Boolean isDisplaySystemTask) {
            this.putBodyParameter("isDisplaySystemTask", isDisplaySystemTask);
            this.isDisplaySystemTask = isDisplaySystemTask;
            return this;
        }

        /**
         * <p>The profiling task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100256</p>
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The profiling task name.</p>
         * 
         * <strong>example:</strong>
         * <p>profiling_daily</p>
         */
        public Builder jobName(String jobName) {
            this.putBodyParameter("jobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>Specifies whether to return the total number of records.</p>
         */
        public Builder needTotalCount(Boolean needTotalCount) {
            this.putBodyParameter("needTotalCount", needTotalCount);
            this.needTotalCount = needTotalCount;
            return this;
        }

        /**
         * <p>The name of the sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>gmtCreate</p>
         */
        public Builder orderBy(String orderBy) {
            this.putBodyParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The sort direction, such as ascending (ASC) or descending (DESC).</p>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder orderDirection(String orderDirection) {
            this.putBodyParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * <p>The current page number, starting from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of records to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListMetaProfilingSkillJobPageRequest build() {
            return new ListMetaProfilingSkillJobPageRequest(this);
        } 

    } 

}
