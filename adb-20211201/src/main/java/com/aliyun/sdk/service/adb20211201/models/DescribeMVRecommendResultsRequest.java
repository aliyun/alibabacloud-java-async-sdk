// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeMVRecommendResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeMVRecommendResultsRequest</p>
 */
public class DescribeMVRecommendResultsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionInner")
    private String actionInner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubQueryId")
    private Long subQueryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubtaskId")
    private Long subtaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    private DescribeMVRecommendResultsRequest(Builder builder) {
        super(builder);
        this.actionInner = builder.actionInner;
        this.DBClusterId = builder.DBClusterId;
        this.from = builder.from;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.subQueryId = builder.subQueryId;
        this.subtaskId = builder.subtaskId;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMVRecommendResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionInner
     */
    public String getActionInner() {
        return this.actionInner;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subQueryId
     */
    public Long getSubQueryId() {
        return this.subQueryId;
    }

    /**
     * @return subtaskId
     */
    public Long getSubtaskId() {
        return this.subtaskId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<DescribeMVRecommendResultsRequest, Builder> {
        private String actionInner; 
        private String DBClusterId; 
        private String from; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long subQueryId; 
        private Long subtaskId; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMVRecommendResultsRequest request) {
            super(request);
            this.actionInner = request.actionInner;
            this.DBClusterId = request.DBClusterId;
            this.from = request.from;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.subQueryId = request.subQueryId;
            this.subtaskId = request.subtaskId;
            this.taskName = request.taskName;
        } 

        /**
         * <p>Fixed system value (non-modifiable).</p>
         */
        public Builder actionInner(String actionInner) {
            this.putQueryParameter("ActionInner", actionInner);
            this.actionInner = actionInner;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1ub9grke1****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Fixed system value (non-modifiable).</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The sorting field.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Type&quot;: &quot;Desc&quot;,&quot;Field&quot;: &quot;AcceleratedQueriesCount&quot;}</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubQueryId.
         */
        public Builder subQueryId(Long subQueryId) {
            this.putQueryParameter("SubQueryId", subQueryId);
            this.subQueryId = subQueryId;
            return this;
        }

        /**
         * <p>The subtask ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder subtaskId(Long subtaskId) {
            this.putQueryParameter("SubtaskId", subtaskId);
            this.subtaskId = subtaskId;
            return this;
        }

        /**
         * <p>The name of the recommendation task.</p>
         * 
         * <strong>example:</strong>
         * <p>task_n1</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public DescribeMVRecommendResultsRequest build() {
            return new DescribeMVRecommendResultsRequest(this);
        } 

    } 

}
