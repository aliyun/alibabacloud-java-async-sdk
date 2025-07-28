// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link ListSystemLogsRequest} extends {@link RequestModel}
 *
 * <p>ListSystemLogsRequest</p>
 */
public class ListSystemLogsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtEndTime")
    private String gmtEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GmtStartTime")
    private String gmtStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogLevel")
    private String logLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProblemCategory")
    private String problemCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRequestId")
    private String sourceRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ListSystemLogsRequest(Builder builder) {
        super(builder);
        this.gmtEndTime = builder.gmtEndTime;
        this.gmtStartTime = builder.gmtStartTime;
        this.instanceId = builder.instanceId;
        this.logLevel = builder.logLevel;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.problemCategory = builder.problemCategory;
        this.sortBy = builder.sortBy;
        this.sourceRequestId = builder.sourceRequestId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtEndTime
     */
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    /**
     * @return gmtStartTime
     */
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logLevel
     */
    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return problemCategory
     */
    public String getProblemCategory() {
        return this.problemCategory;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sourceRequestId
     */
    public String getSourceRequestId() {
        return this.sourceRequestId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListSystemLogsRequest, Builder> {
        private String gmtEndTime; 
        private String gmtStartTime; 
        private String instanceId; 
        private String logLevel; 
        private String order; 
        private Long pageNumber; 
        private Long pageSize; 
        private String problemCategory; 
        private String sortBy; 
        private String sourceRequestId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListSystemLogsRequest request) {
            super(request);
            this.gmtEndTime = request.gmtEndTime;
            this.gmtStartTime = request.gmtStartTime;
            this.instanceId = request.instanceId;
            this.logLevel = request.logLevel;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.problemCategory = request.problemCategory;
            this.sortBy = request.sortBy;
            this.sourceRequestId = request.sourceRequestId;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-08T16:00:00Z</p>
         */
        public Builder gmtEndTime(String gmtEndTime) {
            this.putQueryParameter("GmtEndTime", gmtEndTime);
            this.gmtEndTime = gmtEndTime;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        public Builder gmtStartTime(String gmtStartTime) {
            this.putQueryParameter("GmtStartTime", gmtStartTime);
            this.gmtStartTime = gmtStartTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LogLevel.
         */
        public Builder logLevel(String logLevel) {
            this.putQueryParameter("LogLevel", logLevel);
            this.logLevel = logLevel;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProblemCategory.
         */
        public Builder problemCategory(String problemCategory) {
            this.putQueryParameter("ProblemCategory", problemCategory);
            this.problemCategory = problemCategory;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SourceRequestId.
         */
        public Builder sourceRequestId(String sourceRequestId) {
            this.putQueryParameter("SourceRequestId", sourceRequestId);
            this.sourceRequestId = sourceRequestId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListSystemLogsRequest build() {
            return new ListSystemLogsRequest(this);
        } 

    } 

}
